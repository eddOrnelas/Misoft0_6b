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
        Object[][] opciones = new Object[][]{{"fecha", ">=", fecha1}, {"fecha", "<=", fecha2}};

        ventas = mVentas.buscarBD("all", opciones);

        Integer tmpNoVentas = 0;
        // String tmpUsuario = " ";
        Float tmpVentas = 0F;
        Float tmpDev = 0F;
        Float tmpEntradas = 0F;
        Float tmpRetiros = 0F;
        Float tmpTotal = 0F;
        Float tmpCorte = 0F;

        int x = 0;

        if (ventas.length <= 0) {
            return null;
        } else {
            for (x = 0; x < ventas.length; x++) {

                
                tmpVentas += ((Venta) ventas[x]).getTotal();
                tmpNoVentas++;
                

            }
                tmpCorte = tmpVentas + tmpEntradas - tmpRetiros;
        }

        try {
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
            table.addCell(new Phrase("Dinero de Ventas",FontFactory.getFont(FontFactory.HELVETICA,10)));
            table.addCell(new Phrase("$"+tmpVentas.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
            table.addCell(new Phrase("Entradas de Dinero",FontFactory.getFont(FontFactory.HELVETICA, 10)));
            table.addCell(new Phrase(tmpEntradas.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
            table.addCell(new Phrase("Retiros",FontFactory.getFont(FontFactory.HELVETICA, 10)));
            table.addCell(new Phrase(tmpRetiros.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
            table.addCell(new Phrase("Total",FontFactory.getFont(FontFactory.HELVETICA, 10)));
            table.addCell(new Phrase("$"+tmpCorte.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));

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

    public ModeloCorte realizarReporteVentas(String fecha1, String fecha2) {



        //Iniciamos objetos necesarios para la busqueda.
        
        Venta mVentas = new Venta(true);
        
        Object[] ventas = null;
        
        ModeloCorte reporteVentas = new ModeloCorte();
        //Parametros de busqueda.
        Boolean activo = true;
        Object[][] opciones = new Object[][]{{"fecha", ">=", fecha1}, {"fecha", "<=", fecha2}};

        ventas = mVentas.buscarBD("all", opciones);
        
        //Datos de Venta
        Long tmpIdVenta;
        String tmpFecha;
        Integer tmpCantidad;
        Float tmpTotal;
        
       
        
        
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
                PdfPTable table = new PdfPTable(4);
                PdfPCell cell = new PdfPCell(new Paragraph("Ventas del " + fecha1 + " al " + fecha2,FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8)));
                cell.setColspan(4);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
               
                
                
                
                
                               
                
                table.addCell(new Phrase("ID venta",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));   
                table.addCell(new Phrase("Fecha",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Cantidad",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                table.addCell(new Phrase("Total",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                
                for(int x=0;x<ventas.length;x++){
                tmpIdVenta = ((Venta) ventas[x]).getIdVenta();
                table.addCell(new Phrase(tmpIdVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                
                tmpFecha = ((Venta)ventas[x]).getFecha();
                table.addCell(new Phrase(tmpFecha.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                   
                tmpCantidad = ((Venta) ventas[x]).getCantidad();
                table.addCell(new Phrase(tmpCantidad.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
               
                
                tmpTotal = ((Venta) ventas[x]).getTotal();
                table.addCell(new Phrase(tmpTotal.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                
                } 
                    
                

                document.add(table);
                
           
                //Cerramos PDF.
                document.close();
                try {
                    String ruta = "Reporte de Ventas.pdf";
                    Desktop.getDesktop().open(new File(ruta));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
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
    
    public ModeloCorte realizarReporteMovimientos(Long idArticulo, String fecha2) {
        System.out.println("Entro a realizar R.Mov.");
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
        
        Object[][] opciones = new Object[][]{{"fecha", "<=", fecha2},{"idArticulo","=",idArticulo}};

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
                PdfPCell cell = new PdfPCell(new Paragraph("Artículo: " +tmpIdArticulo,FontFactory.getFont(FontFactory.HELVETICA_BOLD, 8)));
                cell.setColspan(5);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
               
                
                
                
                
                               
                
                table.addCell(new Phrase("Concepto",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));   
                table.addCell(new Phrase("Fecha",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
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
                
           
                //Cerramos PDF.
                document.close();
                try {
                    String ruta = "Reporte de Movimientos.pdf";
                    Desktop.getDesktop().open(new File(ruta));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en reporte de Movimientos.");
            }
        }
        return reporteMovimientos;
    }
    
    public ModeloCorte realizarReporteVentaDetalles(Long idVenta) {

       
        //Iniciamos objetos necesarios para la busqueda.
        ArticuloVenta rArticulo = new ArticuloVenta(true);
        Object[] articulosDetalles = null;
        ModeloCorte repVentasDet = new ModeloCorte();
        //Parametros de busqueda.
        Boolean activo = true;
        Object[][] opciones = new Object[][]{{"idVenta", "=", idVenta}};

        articulosDetalles = rArticulo.buscarBD("all", opciones);
        //Agrego una fuente general
      
        Long tmpIdVenta;
        Long tmpIdArticulo;
        String tmpDescripcion;
        Float tmpPrecioVenta;
        Integer tmpCantidad;
        Float tmpTotal;
        float tmpTotalFinal=0;
        
        int x = 0;

        if (articulosDetalles.length <= 0) {
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
                PdfWriter.getInstance(document, new FileOutputStream("Reporte de Venta Especifico.pdf"));
                document.open();
                Image logo = Image.getInstance("logo200.png");   
               //Modificacion posicion de img Dann
                logo.setAlignment(MIDDLE);               
                document.add(logo);

                //Creamos el documento y le damos formato con una tabla
                //Modificacion de Fuente, Tamaño y Color Dann
                document.add(new Paragraph("              Reporte de Venta" + "                                                                                  " + fechaDia, FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD, BaseColor.BLACK)));
                Image linea = Image.getInstance("linea.png");   
               //Modificacion posicion de img Dann
                linea.scaleAbsolute(550,30);
                linea.setAlignment(MIDDLE);     
                document.add(linea);
                document.add(new Paragraph(" "));
               
                //Modifico las celdas de las tablas Dann
                PdfPTable table = new PdfPTable(5);
                //Dar formato al contenido de la celda DANN
                PdfPCell cell = new PdfPCell();
                //Cambiar Forma a las celdas Dann
                //cell.setBorder(5);
                
                cell.setColspan(5);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(cell);
                //table.addCell("Id de Articulo");
                
                table.addCell(new Phrase("Código de Artículo",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                table.addCell(new Phrase("Descripción",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
                
                table.addCell(new Phrase("Precio de Venta",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10,BaseColor.BLACK)));
                
                
                table.addCell(new Phrase("Cantidad",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));
                
               
                table.addCell(new Phrase("Total",FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10, BaseColor.BLACK)));



                for (x = 0; x < articulosDetalles.length; x++) {
                    //tmpIdArticulo = ((Articulo) articulos[x]).getIdArticulo();
                    tmpIdArticulo = ((Articulo) articulosDetalles[x]).getCodigoArticulo();
                    tmpDescripcion = ((Articulo) articulosDetalles[x]).getDescripcion();
                    tmpPrecioVenta = ((Articulo) articulosDetalles[x]).getPrecioVenta();
                    tmpCantidad = ((Articulo) articulosDetalles[x]).getCantidadExistencia();
                    tmpTotal = tmpPrecioVenta*tmpCantidad;
                    tmpTotalFinal = tmpTotalFinal+tmpTotal;
                    //tmpActivo = ((Articulo) articulos[x]).getActivo();

                    //table.addCell(tmpIdArticulo.toString());
                   
                    table.addCell(new Phrase(tmpIdArticulo.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpDescripcion,FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpPrecioVenta.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpCantidad.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                    table.addCell(new Phrase(tmpTotal.toString(),FontFactory.getFont(FontFactory.HELVETICA, 8)));
                }
                
                document.add(new Paragraph(" "+tmpTotalFinal));
                    
                document.add(table);
                //Mensaje PDF generado
                JOptionPane.showMessageDialog(null, "Reporte Guardado con Éxito.");
                //Cerramos PDF.
                document.close();
                try {
                    //Modifico el nombre del reporte.
                    String ruta = "Reporte de Venta Especifico.pdf";
                    Desktop.getDesktop().open(new File(ruta));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Archivo no disponible: Cerrar Reporte de Venta Especifico.pdf");
            }
        }


        return repVentasDet;

    }
}

    