/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import java.sql.Date;
import misoft.CustomORM;


/**
 *
 * @author chabe
 */
public class ArticuloVenta extends CustomORM{
   
    private Long idArticuloVenta;
    private Long idVenta;
    private Long    idArticulo;
    private Integer cantidad;
    private Float   precioVenta;
    private Boolean devolucion;
    private Integer cantidadDevuelto;
    ////////////////////////////
    
        //////////////////////////////
    //private String idUsuario;
   // private Double iva;
    //private Float total;

  
   // private Float subtotal;
   // private Float pagocon;
    //private Float cambio;
    //private String fecha;
   // private String hora;
    
    
     //private String descripcion;

    public Boolean getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Boolean devolucion) {
        this.devolucion = devolucion;
    }

    public Integer getCantidadDevuelto() {
        return cantidadDevuelto;
    }

    public void setCantidadDevuelto(Integer cantidadDevuelto) {
        this.cantidadDevuelto = cantidadDevuelto;
    }
    
  
    
public ArticuloVenta(){
    //constructor vacio
    }
//
//    public String getHora() {
//        return hora;
//    }
//
//    public void setHora(String hora) {
//        this.hora = hora;
//    }
public ArticuloVenta(Boolean init)
    {
        super();
        useTable = "articuloventa";
        keyField = "idArticuloVenta";
        this.init(this);
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }


    /*
    public Double getIva() {
        return iva;
    }

    public void setIva( Double iva) {
        this.iva = iva;
    }
     public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subtotal = subTotal;
    }

    */

     public Long getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Long idArticulo) {
        this.idArticulo = idArticulo;
    }

//    public String getDescripcion() {
//        return descripcion;
//    }
//
//    public void setDescripcion(String descripcion) {
//        this.descripcion = descripcion;
//    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float PrecioVenta) {
        this.precioVenta = PrecioVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
 public Long getIdArticuloVenta() {
        return idArticuloVenta;
    }
//   public String getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(String fecha) {
//        this.fecha = fecha;
//    }

    public void setIdArticuloVenta(Long idArticuloVenta) {
        this.idArticuloVenta = idArticuloVenta;
    }
    
   

 
    
    
  
    
    
   
    
}
