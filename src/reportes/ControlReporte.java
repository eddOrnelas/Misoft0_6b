/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import articulo.Articulo;
import articulo.HistorialAlmacen;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import static com.itextpdf.text.FontFactory.HELVETICA_BOLD;
import com.itextpdf.text.Image;
import static com.itextpdf.text.Image.MIDDLE;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Float.parseFloat;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import venta.ArticuloVenta;
import venta.Venta;

/**
 *
 * @author Administrator
 */
public class ControlReporte {
   
    
    public ModeloCorte realizarReporteCorte(String fecha1, String fecha2) {
        //Iniciamos objetos necesarios para la busqueda.
        Venta mVentas = new Venta(true);
        Object[] ventas = null;
        ModeloCorte corteCaja = new ModeloCorte();
        //Parametros de busqueda.
        Object[][] opciones = new Object[][]{{"fecha", ">=", fecha1+" 00:00:00"}, {"fecha", "<=", fecha2+" 23:59:00"}};

        ventas = mVentas.buscarBD("all", opciones);

        Integer tmpNoVentas = 0;
        // String tmpUsuario = " ";
        Float tmpVentas = 0F;
        Float tmpDev = 0F;
        Float tmpSubtotal = 0F;
        Float tmpIVA = 0F;
        Float tmpTotal = 0F;
        Float tmpCorte = 0F;
        

        int x = 0;

        if (ventas.length <= 0) {
            return null;
        } else {
            for (x = 0; x < ventas.length; x++) {

                
                tmpVentas += ((Venta) ventas[x]).getTotal();
                tmpNoVentas++;
                tmpSubtotal += ((((Venta)ventas[x]).getTotal())*100)/111;
                tmpIVA +=((((Venta)ventas[x]).getTotal())*11)/111;
                

            }
            
            
            
            
        }

        try {
            DecimalFormat decimal = new DecimalFormat("#.##"); 
            
            
            //Obtenemos la fecha del reporte y la separamos en mes dia y año.
            Calendar cal = new GregorianCalendar();
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            String fechaDia = ((month+1) + "/" + day + "/" + year);

            //Creamos la variable docmuent de tipo Document
            Document document = new Document();
            //Abrimos el flujo para escribir en el PDF.
            PdfWriter.getInstance(document, new FileOutputStream("Reporte de Corte de Caja.pdf"));
            document.open();
            
            Image logo = Image.getInstance("logo200.png");
            logo.setAlignment(MIDDLE);   
            document.add(logo);

            //Creamos el documento y le damos formato con una tabla
            document.add(new Paragraph("              Reporte Corte de Caja" + "                                                                                  " + (fechaDia), FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, BaseColor.BLACK)));
           //Agrego Linea
            Image linea = Image.getInstance("linea.png");   
               //Modificacion posicion de img Dann
                linea.scaleAbsolute(550,30);
                linea.setAlignment(MIDDLE);     
                document.add(linea);
            
            PdfPTable table = new PdfPTable(2);
            PdfPCell cell = new PdfPCell(new Paragraph("Corte del día " + fecha1 + " al " + fecha2,FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8)));
            cell.setColspan(4);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
            table.addCell(cell);
            //table.addCell("Encargado de Caja");
            //table.addCell(tmpUsuario);
            
            table.addCell(new Phrase("Número de Ventas",FontFactory.getFont(FontFactory.HELVETICA, 10)));
            table.addCell(new Phrase(tmpNoVentas.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
            table.addCell(new Phrase("Subtotal",FontFactory.getFont(FontFactory.HELVETICA,10)));
            table.addCell(new Phrase("$"+decimal.format(tmpSubtotal),FontFactory.getFont(FontFactory.HELVETICA, 8)));
            table.addCell(new Phrase("I.V.A.",FontFactory.getFont(FontFactory.HELVETICA, 10)));
            table.addCell(new Phrase(decimal.format(tmpIVA),FontFactory.getFont(FontFactory.HELVETICA, 8)));
            table.addCell(new Phrase("Total",FontFactory.getFont(FontFactory.HELVETICA, 10)));
            table.addCell(new Phrase("$"+tmpVentas.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));

            document.add(table);

            //Cerramos PDF.

            document.close();
            JOptionPane.showMessageDialog(null, "Reporte guardado con éxito.");

            try {
                String ruta = "Reporte de Corte de Caja.pdf";
                Desktop.getDesktop().open(new File(ruta));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo no disponible: Cerrar Reporte de Corte.pdf");
        }
        return corteCaja;
        
    }

    public ModeloCorte realizarReporteVentas(Long nVenta) {



        //Iniciamos objetos necesarios para la busqueda.
        
        ArticuloVenta mVentas = new ArticuloVenta(true);
        Venta fVenta = new Venta(true);
        
        Object[] ventas = null;
        Object[] fventas = null;
        
        ModeloCorte reporteVentas = new ModeloCorte();
        //Parametros de busqueda.
        Boolean activo = true;
        Object[][] opciones = new Object[][]{{"idVenta","=",nVenta}};
        ventas = mVentas.buscarBD("all", opciones);
        
        Object[][] fechaVenta = new Object[][]{{"idVenta","=",nVenta}};
        fventas = fVenta.buscarBD("all", opciones);
        
        
        
        //Datos de Venta
        Long tmpIdVenta;
        Double tmpIVA;
        Integer tmpCantidad;
        Float tmpPrecioVenta;
        Float tmpTotal;
        Float totalVentas= 0F;
        String tmpFecha;
    
        
       
        
        
        if (ventas.length <= 0) {
            return null;
        } else {

            try {
                //Obtenemos la fecha del reporte y la separamos en mes dia y año.
                Calendar cal = new GregorianCalendar();
                
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String fechaDia = ((1+ month)+ "/" + day + "/" + year);

                //Creamos la variable docmuent de tipo Document
                Document document = new Document();
                //Abrimos el flujo para escribir en el PDF.
                PdfWriter.getInstance(document, new FileOutputStream("Reporte de Ventas.pdf"));
                document.open();
                Image logo = Image.getInstance("logo200.png");   
               //Modificacion posicion de img Dann
                logo.setAlignment(MIDDLE);               
                document.add(logo);

                //Creamos el documento y le damos formato con una tabla
                //Modificacion de Fuente, Tamaño y Color Dann
                document.add(new Paragraph("              Reporte de Ventas" + "                                                                                  " + fechaDia, FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, BaseColor.BLACK)));
                Image linea = Image.getInstance("linea.png");   
               //Modificacion posicion de img Dann
                linea.scaleAbsolute(550,30);
                linea.setAlignment(MIDDLE);     
                document.add(linea);
                
                //Crear y llenar Tabla PDF
                PdfPTable table = new PdfPTable(5);
                
                tmpFecha = ((Venta) fventas[0]).getFecha();
                PdfPCell cell = new PdfPCell(new Paragraph("No. Venta " + nVenta +"                  Fecha y Hora: " +tmpFecha,FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8)));
                cell.setColspan(5);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
                     
                
                table.addCell(new Phrase("Código de Artículo",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));   
                table.addCell(new Phrase("Cantidad",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Precio de Venta",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("IVA",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Total",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                
                for(int x=0;x<ventas.length;x++){
                tmpIdVenta = ((ArticuloVenta) ventas[x]).getIdArticulo();
                table.addCell(new Phrase(tmpIdVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpCantidad = ((ArticuloVenta) ventas[x]).getCantidad();
                table.addCell(new Phrase(tmpCantidad.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                
                tmpPrecioVenta = ((ArticuloVenta) ventas[x]).getPrecioVenta();
                table.addCell(new Phrase(tmpPrecioVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpIVA = ((ArticuloVenta) ventas[x]).getIva();
                table.addCell(new Phrase(tmpPrecioVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpTotal = ((ArticuloVenta) ventas[x]).getTotal();
                table.addCell(new Phrase(tmpTotal.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                totalVentas += tmpTotal;
                } 
                    
                

                document.add(table);
                document.add(new Phrase("Total: $"+totalVentas+"",FontFactory.getFont(FontFactory.HELVETICA, 10)));
           
                
                JOptionPane.showMessageDialog(null, "Reporte Guardado con Éxito.");
                //Cerramos PDF.
                document.close();
                try {
                    String ruta = "Reporte de Ventas.pdf";
                    Desktop.getDesktop().open(new File(ruta));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, "Archivo no disponible: Cerrar Reporte de Ventas.pdf");
            }
        }
        return reporteVentas;
    }

    public ModeloArticulo realizarReporteArticulo() {

       
        //Iniciamos objetos necesarios para la busqueda.
        Articulo mArticulo = new Articulo(true);
        Object[] articulos = null;
        ModeloArticulo reporteArticulos = new ModeloArticulo();
        //Parametros de busqueda.
        Boolean activo = true;
        Object[][] opciones = new Object[][]{{"idArticulo", ">=", activo}};

        articulos = mArticulo.buscarBD("all", opciones);
        //Agrego una fuente general
      
        Long tmpIdArticulo;
        Long tmpCodigoArticulo;
        String tmpDescripcion = " ";
        Float tmpPrecioCompra = 0F;
        Float tmpPrecioVenta = 0F;
        Integer tmpCantidadExistencia;
        String tmpProveedor = " ";
        Boolean tmpActivo;
        int x = 0;

        if (articulos.length <= 0) {
            return null;
        } else {

            try {
                //Obtenemos la fecha del reporte y la separamos en mes dia y año.
                Calendar cal = new GregorianCalendar();
                
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String fechaDia = ((1+ month)+ "/" + day + "/" + year);

                //Creamos la variable docmuent de tipo Document
                Document document = new Document();
                //Abrimos el flujo para escribir en el PDF.
                PdfWriter.getInstance(document, new FileOutputStream("Reporte de Almacén.pdf"));
                document.open();
                Image logo = Image.getInstance("logo200.png");   
               //Modificacion posicion de img Dann
                logo.setAlignment(MIDDLE);               
                document.add(logo);

                //Creamos el documento y le damos formato con una tabla
                //Modificacion de Fuente, Tamaño y Color Dann
                document.add(new Paragraph("              Reporte Almacén" + "                                                                                  " + fechaDia, FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, BaseColor.BLACK)));
                Image linea = Image.getInstance("linea.png");   
               //Modificacion posicion de img Dann
                linea.scaleAbsolute(550,30);
                linea.setAlignment(MIDDLE);     
                document.add(linea);
                document.add(new Paragraph(" "));
               
                //Modifico las celdas de las tablas Dann
                PdfPTable table = new PdfPTable(6);
                //Dar formato al contenido de la celda DANN
                PdfPCell cell = new PdfPCell();
                //Cambiar Forma a las celdas Dann
                //cell.setBorder(5);
                
                cell.setColspan(6);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
                //table.addCell("Id de Articulo");
                
                table.addCell(new Phrase("Código de Artículo",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                table.addCell(new Phrase("Descripción",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                table.addCell(new Phrase("Precio de Compra",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                table.addCell(new Phrase("Precio de Venta",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10,BaseColor.BLACK)));
                
                
                table.addCell(new Phrase("Cantidad en extistencia",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
               
                table.addCell(new Phrase("Proveedor",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));



                for (x = 0; x < articulos.length; x++) {
                    //tmpIdArticulo = ((Articulo) articulos[x]).getIdArticulo();
                    tmpCodigoArticulo = ((Articulo) articulos[x]).getCodigoArticulo();
                    tmpDescripcion = ((Articulo) articulos[x]).getDescripcion();
                    tmpPrecioCompra = ((Articulo) articulos[x]).getPrecioCompra();
                    tmpPrecioVenta = ((Articulo) articulos[x]).getPrecioVenta();
                    tmpCantidadExistencia = ((Articulo) articulos[x]).getCantidadExistencia();
                    tmpProveedor = ((Articulo) articulos[x]).getProveedor();
                    //tmpActivo = ((Articulo) articulos[x]).getActivo();

                    //table.addCell(tmpIdArticulo.toString());
                   
                    table.addCell(new Phrase(tmpCodigoArticulo.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpDescripcion,FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpPrecioCompra.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpPrecioVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpCantidadExistencia.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpProveedor,FontFactory.getFont(FontFactory.HELVETICA, 8)));
                }

                document.add(table);
                //Mensaje PDF generado
                JOptionPane.showMessageDialog(null, "Reporte Guardado con Éxito.");
                //Cerramos PDF.
                document.close();
                try {
                    //Modifico el nombre del reporte.
                    String ruta = "Reporte de Almacén.pdf";
                    Desktop.getDesktop().open(new File(ruta));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Archivo no disponible: Cerrar Reporte de Almacén.pdf");
            }
        }


        return reporteArticulos;

    }
    
    public ModeloCorte realizarReporteMovimientos(Long idArticulo, String fecha1, String fecha2) {
        
        //Datos de Historial
        Long tmpIdArticulo=idArticulo;
        String tmpFecha;
        String tmpConcepto;
        Integer tmpCantidad;
        Float tmpPrecioVenta;
        Float tmpPrecioCompra;
        

        //Iniciamos objetos necesarios para la busqueda.
        
        HistorialAlmacen rMovimientos = new HistorialAlmacen(true);
        
        Object[] mov = null;
        
        ModeloCorte reporteMovimientos = new ModeloCorte();
        //Parametros de busqueda.
        Boolean activo = true;
        
        Object[][] opciones = new Object[][]{{"fecha", ">=", fecha1+" 00:00:00"},{"fecha", "<=", fecha2+" 23:59:00"},{"idArticulo","=",idArticulo}};

        mov = rMovimientos.buscarBD("all", opciones);
        
              
       
        
        
        if (mov.length <= 0) {
            return null;
        } else {

            try {
                //Obtenemos la fecha del reporte y la separamos en mes dia y año.
                Calendar cal = new GregorianCalendar();
                
                int month = cal.get(Calendar.MONTH);
                int year = cal.get(Calendar.YEAR);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String fechaDia = ((1+ month)+ "/" + day + "/" + year);

                //Creamos la variable docmuent de tipo Document
                Document document = new Document();
                //Abrimos el flujo para escribir en el PDF.
                PdfWriter.getInstance(document, new FileOutputStream("Reporte de Movimientos.pdf"));
                document.open();
                Image logo = Image.getInstance("logo200.png");   
               //Modificacion posicion de img Dann
                logo.setAlignment(MIDDLE);               
                document.add(logo);

                //Creamos el documento y le damos formato con una tabla
                //Modificacion de Fuente, Tamaño y Color Dann
                document.add(new Paragraph("              Reporte de Movimientos" + "                                                                                  " + fechaDia, FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, BaseColor.BLACK)));
                Image linea = Image.getInstance("linea.png");   
               //Modificacion posicion de img Dann
                linea.scaleAbsolute(550,30);
                linea.setAlignment(MIDDLE);     
                document.add(linea);
                
                //Crear y llenar Tabla PDF
                PdfPTable table = new PdfPTable(5);
                PdfPCell cell = new PdfPCell(new Paragraph("Código de artículo: " +tmpIdArticulo,FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8)));
                cell.setColspan(5);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
               
                
                
                
                
                               
                
                table.addCell(new Phrase("Concepto",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));   
                table.addCell(new Phrase("Fecha y Hora",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Cantidad",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Precio Compra",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Precio Venta",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                
                for(int x=0;x<mov.length;x++){
                tmpConcepto = ((HistorialAlmacen) mov[x]).getConcepto();
                table.addCell(new Phrase(tmpConcepto.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpFecha = ((HistorialAlmacen) mov[x]).getFecha();
                table.addCell(new Phrase(tmpFecha.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpCantidad = ((HistorialAlmacen) mov[x]).getCantidad();
                table.addCell(new Phrase(tmpCantidad.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpPrecioCompra = ((HistorialAlmacen)mov[x]).getPrecioCompra();
                table.addCell(new Phrase(tmpPrecioCompra.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                tmpPrecioVenta = ((HistorialAlmacen) mov[x]).getPrecioVenta();
                table.addCell(new Phrase(tmpPrecioVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                
               
                
                } 
                    
                

                document.add(table);
                
                JOptionPane.showMessageDialog(null, "Reporte Guardado con Éxito.");
                //Cerramos PDF.
                document.close();
                try {
                    String ruta = "Reporte de Movimientos.pdf";
                    Desktop.getDesktop().open(new File(ruta));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Archivo no disponible: Cerrar Reporte de Movimientos.pdf");
            }
        }
        return reporteMovimientos;
    }
    }

    