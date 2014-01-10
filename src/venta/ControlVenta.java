/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import articulo.Articulo;
import articulo.ControlArticulo;
import articulo.HistorialAlmacen;
import java.awt.Container;
import javax.swing.JOptionPane;
import misoft.VistaVentanaPrincipal;
import reportes.ControlReporte;

/**
 *
 * @author isa
 */
public class ControlVenta {
   private ArrayList carritoCompra;

    public ControlVenta(){
                 
    }
      


   public Boolean realizarVenta(ArrayList carrito) {
        
        HistorialAlmacen historial = new HistorialAlmacen(true);
        Articulo articulo = new Articulo(true);
        Articulo articuloEditar = new Articulo(true);
        ArticuloVenta artVenta = new ArticuloVenta(true);
        Venta venta = new Venta(true);
        
        Integer cantidad_articulos = carrito.size();
        Float totalVenta = 0.0f;
        
        //obtener totales, iva y subtotal
        for(int x=0; x<cantidad_articulos; x++)
          { 
              Object[] articuloTmp = (Object[])carrito.get(x);
              Articulo thisArticulo = (Articulo)articuloTmp[0];
              Integer cantidad = (Integer)articuloTmp[1];
              
              totalVenta+= (cantidad*thisArticulo.getPrecioVenta());
          }
        
        
        //Realizar Venta //Alta Venta
         venta.setCantidad(cantidad_articulos);
         venta.setIva((totalVenta*11)/100);//Colocar Iva
         venta.setPorcentajeIva(11.0f);//Colocar Iva
         venta.setSubtotal(totalVenta-((totalVenta*11)/100)); //Colocar Iva
         venta.setTotal(totalVenta);
         venta.setCancelado(false);
         
         Integer respuestaVenta = venta.registrarBD();
         
         Long idventa = venta.getIdVenta();
         
         if(respuestaVenta != 1 || idventa<=0){
             return false;
         }
         
          //Agregando a Articulo Ventas 
          for(int x=0; x<cantidad_articulos; x++){
              
                Object[] articuloTmp = (Object[])carrito.get(x);
                Articulo thisArticulo = (Articulo)articuloTmp[0];
                Integer cantidad = (Integer)articuloTmp[1];
                
                articulo.setIdArticulo(thisArticulo.getIdArticulo());
                articulo.buscarBD();
                
                artVenta.setIdVenta(idventa);
                artVenta.setIdArticulo(articulo.getIdArticulo());
                artVenta.setCantidad(cantidad);
                artVenta.setPrecioVenta(articulo.getPrecioVenta());
                artVenta.setDevolucion(false);
                artVenta.setCantidadDevuelto(0);
                //artVenta.setIva((double)(totalVenta*11)/100);
                //artVenta.setSubTotal(totalVenta-((totalVenta*11)/100));
               // artVenta.setTotal(totalVenta);
                artVenta.registrarBD();
          }
        
          //Actualizar Historial y Almacen
         for(int x=0; x<cantidad_articulos; x++)
          {
              
                Object[] articuloTmp = (Object[])carrito.get(x);
                Articulo thisArticulo = (Articulo)articuloTmp[0];
                Integer cantidad = (Integer)articuloTmp[1];
                Integer cantidadHistorial = 0;
                
                articulo.setIdArticulo(thisArticulo.getIdArticulo());
                articulo.buscarBD();
                
                 //Actualizamos el Articulo dando restas
                articuloEditar.setIdArticulo(articulo.getIdArticulo());
                articuloEditar.buscarBD();
                
                //Obtener diferido
                Integer cantidadNueva = articulo.getCantidadExistencia()-cantidad;
                
                articulo.setCantidadExistencia(cantidadNueva);
                articulo.acualizarBD();
                
                
                //Actualizamos el Historial
                historial.setIdArticulo(articulo.getIdArticulo());
                historial.setConcepto("Venta");
                historial.setPrecioCompra(articulo.getPrecioCompra());
                historial.setPrecioVenta(articulo.getPrecioVenta());
                historial.setCantidad(cantidad);
                historial.setCantidadActual(cantidadNueva);
                //historial.setFecha(null);
                historial.setCantidadUnidad(articulo.getCantidadUnidad());
                historial.setUnidad(articulo.getUnidad());
                
                
                historial.registrarBD();
                
                
          }
         
         
      ControlReporte ctrReporte = new ControlReporte();
          ctrReporte.generarTicket(idventa);
         
        //JOptionPane.showMessageDialog(this, "La venta se realizo con exito");
         
         return true;
    }

    public Boolean devolucionArticuloVenta(Long idVenta, Long codigoArticulo, Integer cantidadDevolver) {
       
        //Iniciamos objetos clase
        Venta venta = new Venta(true);
        ArticuloVenta artVenta = new ArticuloVenta(true);
        ArticuloVenta artVentaBusqueda = new ArticuloVenta();
        ArticuloVenta artVentaCancelar = new ArticuloVenta(true);
        HistorialAlmacen historial = new HistorialAlmacen(true);
        Articulo datosArticulo = new Articulo(true);
        Articulo articuloAlmacen = new Articulo(true);
        ControlArticulo ctrArticulo = new ControlArticulo();
        
        Object[] articulos = null;
        
        //Validar la venta
        
        venta.setIdVenta(idVenta);
        Boolean ventaExiste = venta.buscarBD();
        
        if(ventaExiste)
            if(venta.getCancelado())
            {
                ventaExiste = false;
            }
        
        if(ventaExiste){
            
            
            //Buscamos referencias del articulo por su codigo validamos que exista tal articulo
            datosArticulo = ctrArticulo.buscarUnoPorCodigoArticulo(codigoArticulo);
            
            //hacemos un return para salir si falla esta validacion
            if(datosArticulo == null)
                return false;
            
            //Buscamos articulo de la venta y validamos que exista
            Object[][] options = {{"idArticulo", "=", datosArticulo.getIdArticulo()},{"idVenta","=",idVenta}};
            articulos = artVenta.buscarBD("all", options);
            
            //hacemos un return para salir si falla esta validacion
            if(articulos == null)
                return false;
            
            //Si encontramos articulos que coincidan nos traemos el primero
            artVentaBusqueda = ((ArticuloVenta) articulos[0]);
            
            //Inicializamos el articulo con ORM
            artVentaCancelar.setIdArticuloVenta(artVentaBusqueda.getIdArticuloVenta().longValue());
            artVentaCancelar.buscarBD();
            
            //Modificamos los datos del articulo venta
            
            artVentaCancelar.setDevolucion(true);
            artVentaCancelar.setCantidadDevuelto(artVentaCancelar.getCantidad()-cantidadDevolver);
            
            Boolean edicionCorrecta = artVentaCancelar.acualizarBD();
            
            if(edicionCorrecta){
                
                //Reintegramos la cantidad a almacen
                articuloAlmacen.setIdArticulo(datosArticulo.getIdArticulo());
                articuloAlmacen.buscarBD();
                articuloAlmacen.setCantidadExistencia(cantidadDevolver+datosArticulo.getCantidadExistencia());
                Boolean actualizacionAlmacen = articuloAlmacen.acualizarBD();
                
                if(!actualizacionAlmacen){
                    return false;
                }
                
                //Introducimos registro en historial
                historial.setIdArticulo(datosArticulo.getIdArticulo());
                historial.setConcepto("Devolucion");
                historial.setPrecioCompra(datosArticulo.getPrecioCompra());
                historial.setPrecioVenta(datosArticulo.getPrecioVenta());
                historial.setCantidad(cantidadDevolver);
                historial.setCantidadActual(cantidadDevolver+datosArticulo.getCantidadExistencia());
                historial.setUnidad(datosArticulo.getUnidad());
                historial.setCantidadUnidad(datosArticulo.getCantidadUnidad());
                Integer historialCorrecto = historial.registrarBD();
                
                //Validamos se haya hecho el registro en historial
                if(historialCorrecto!=1)
                    return false;
                
                
            }else{
                //Cancelamos operacion y salimos de metodo
                return false;
            }
            
            
        }
        
        
        
        return true;
    }
    
    
    public Boolean cancelarArticuloVenta(Long idArticuloVenta){
    
        
        //Iniciamos objetos clase
        ArticuloVenta artVenta = new ArticuloVenta(true);
        ArticuloVenta artVentaBusqueda = new ArticuloVenta();
        ArticuloVenta artVentaCancelar = new ArticuloVenta(true);
        HistorialAlmacen historial = new HistorialAlmacen(true);
        Articulo datosArticulo = new Articulo(true);
        Articulo articuloAlmacen = new Articulo(true);
        
        Object[] articulos = null;
        
        //Validar el articulo Venta
        
        artVentaCancelar.setIdArticuloVenta(idArticuloVenta);
        Boolean articuloVentaExiste = false;
        articuloVentaExiste = artVentaCancelar.buscarBD();
        
        
        if(articuloVentaExiste){
            
            //Traer informacion del archivo en almacen
            datosArticulo.setIdArticulo(artVentaCancelar.getIdArticulo());
            datosArticulo.buscarBD();
            
            
            Integer cantidadDevolver = 0;
            
            if(artVentaCancelar.getDevolucion()){
                cantidadDevolver = artVentaCancelar.getCantidad()-artVentaCancelar.getCantidadDevuelto();
            }
            else
                cantidadDevolver = artVentaCancelar.getCantidad();
            
            artVentaCancelar.setDevolucion(true);
            artVentaCancelar.setCantidadDevuelto(artVentaCancelar.getCantidad());
            
            Boolean edicionCorrecta = false;
            edicionCorrecta = artVentaCancelar.acualizarBD();
            
            if(edicionCorrecta){
                
                //Reintegramos la cantidad a almacen
                articuloAlmacen.setIdArticulo(datosArticulo.getIdArticulo());
                articuloAlmacen.buscarBD();
                articuloAlmacen.setCantidadExistencia(cantidadDevolver+datosArticulo.getCantidadExistencia());
                Boolean actualizacionAlmacen = articuloAlmacen.acualizarBD();
                
                if(!actualizacionAlmacen){
                    return false;
                }
                
                //Introducimos registro en historial
                historial.setIdArticulo(datosArticulo.getIdArticulo());
                historial.setConcepto("Cancelacion Venta");
                historial.setPrecioCompra(datosArticulo.getPrecioCompra());
                historial.setPrecioVenta(datosArticulo.getPrecioVenta());
                historial.setCantidad(cantidadDevolver);
                historial.setCantidadActual(cantidadDevolver+datosArticulo.getCantidadExistencia());
                historial.setUnidad(datosArticulo.getUnidad());
                historial.setCantidadUnidad(datosArticulo.getCantidadUnidad());
                Integer historialCorrecto = historial.registrarBD();
                
                //Validamos se haya hecho el registro en historial
                if(historialCorrecto!=1)
                    return false;
                
                
            }else{
                //Cancelamos operacion y salimos de metodo
                return false;
            }
            
            
        }
        
        
        
        return true;
    }

    public Boolean cancelarVenta(Long idVenta) {
       
        
        //Iniciamos Objetos
        Venta ventaRealizada = new Venta(true);
        ArticuloVenta articuloVenta = new ArticuloVenta();
        ArticuloVenta buscarArticulosVenta = new ArticuloVenta(true);
        Object[] articulosVenta = null;
        HistorialAlmacen historial = new HistorialAlmacen(true);
        ArticuloVenta articuloVentaCancelar = null;
        
        //Iniciamos controladores
        //ControlVenta ctrVenta = new Con
        
        //Buscamos venta
        ventaRealizada.setIdVenta(idVenta);
        Boolean ventaExiste = false;
        ventaExiste = ventaRealizada.buscarBD();
        
        //Validamos venta
        if(ventaExiste)
        {
            if(ventaRealizada.getCancelado())
                return false;
        }
        else
            return false;
        
        
        //Buscamos Articulos a devolver
        Object[][] opciones = new Object[][] {{"idVenta","=",idVenta}};
        articulosVenta = buscarArticulosVenta.buscarBD("all", opciones);
        
        //Validamos hayan articulos a regresar
        if(articulosVenta==null){
            
            return false;
            
        }
        
        
        //Cancelamos Venta
        ventaRealizada.setCancelado(true);
        Boolean ventaEditada = false;
        
        ventaEditada = ventaRealizada.acualizarBD();
        
        if(!ventaEditada)
            return false;
        
        
        //Cancelamos articulos haciendole devolucion, actualizando stock y registrando en historial
        for(int x=0; x<articulosVenta.length; x++ ){

            this.cancelarArticuloVenta(((ArticuloVenta) articulosVenta[x]).getIdArticuloVenta());
 
        }
        
        
        
        
        return true;
    }

public ArrayList recuperarCarrito(Container padre){
    
    Container estePadre =  obtenerPadre(padre);
        
        return ((VistaVentanaPrincipal)estePadre).getCarrito();
    
    
}

public void guardarCarrito(Container padre, ArrayList carrito){
    
    Container estePadre =  obtenerPadre(padre);
        
        ((VistaVentanaPrincipal)estePadre).setCarrito(carrito);
    
    
}


public Container obtenerPadre(Container padr)
    {
        //System.out.println("pad: "+padr.getClass());
        if(padr.getParent()!=null)
            return obtenerPadre(padr.getParent());
        else
            
       return padr;
        
    }
    
    
}

