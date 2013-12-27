/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes;

import articulo.Articulo;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import venta.ArticuloVenta;
import venta.Venta;

/**
 *
 * @author USUARIO
 */
public class VistaReporteVentasGeneral extends javax.swing.JPanel {

    /**
     * Creates new form VistaReporteVentas
     */
    VistaReporteVentasGeneral() {
        initComponents();
        //Fecha no sea mayor a la actual.
//        Calendar cal = new GregorianCalendar();
//        
//        int month = cal.get(Calendar.MONTH)+1;
//        int year = cal.get(Calendar.YEAR)-1900;
//        int day = cal.get(Calendar.DAY_OF_MONTH)-31;
//                
//        txFechaFinal.setDateFormatString("yyyy-MM-dd");
//        txFechaFinal.setMaxSelectableDate(new Date(year,month,day));
//        
//        txFechaInicio.setDateFormatString("yyyy-MM-dd");
//        txFechaInicio.setMaxSelectableDate(new Date(year,month,day));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAceptarVentas = new javax.swing.JButton();
        btCancelarRepVentas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txNoVenta = new javax.swing.JLabel();
        txNumVenta = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVentas = new javax.swing.JTable();
        txFecHr = new javax.swing.JLabel();
        txTotal = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte de Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1200, 350));
        setMinimumSize(new java.awt.Dimension(1200, 350));
        setPreferredSize(new java.awt.Dimension(1200, 350));

        btAceptarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        btAceptarVentas.setText("Exportar");
        btAceptarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarVentasActionPerformed(evt);
            }
        });

        btCancelarRepVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelarRepVentas.setText("Cancelar");
        btCancelarRepVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRepVentasActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar1.png"))); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txNoVenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txNoVenta.setText("No. de Venta");

        txNumVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txNumVentaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNumVentaKeyTyped(evt);
            }
        });

        jSeparator1.setMaximumSize(new java.awt.Dimension(1150, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(1150, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(1150, 10));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1150, 200));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1150, 200));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1150, 200));

        tbVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código de Artículo", "Descripción", "Cantidad", "Precio de Venta", "IVA", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVentas.setMaximumSize(new java.awt.Dimension(1150, 200));
        tbVentas.setMinimumSize(new java.awt.Dimension(1150, 200));
        tbVentas.setPreferredSize(new java.awt.Dimension(1150, 200));
        jScrollPane1.setViewportView(tbVentas);
        if (tbVentas.getColumnModel().getColumnCount() > 0) {
            tbVentas.getColumnModel().getColumn(0).setResizable(false);
            tbVentas.getColumnModel().getColumn(1).setResizable(false);
            tbVentas.getColumnModel().getColumn(2).setResizable(false);
            tbVentas.getColumnModel().getColumn(3).setResizable(false);
            tbVentas.getColumnModel().getColumn(4).setResizable(false);
            tbVentas.getColumnModel().getColumn(5).setResizable(false);
        }

        txFecHr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txTotal.setMaximumSize(new java.awt.Dimension(200, 30));
        txTotal.setMinimumSize(new java.awt.Dimension(200, 30));
        txTotal.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txNoVenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txNumVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelarRepVentas)
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txFecHr, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAceptarVentas)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txFecHr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txNoVenta)
                        .addComponent(txNumVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(btCancelarRepVentas)
                        .addComponent(btAceptarVentas)))
                .addGap(9, 9, 9)
                .addComponent(txTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarVentasActionPerformed
       
        ModeloCorte reporte = null;
        //Creamos controlador corte
        ControlReporte ctrCorte = new ControlReporte();

        
        int band=0;
        Long nVenta = null;
    
         String numVenta = "";
        if (txNumVenta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese No. de Venta.");
            band =0;
            
        } else {
            
            numVenta = txNumVenta.getText();
            band=1;
        }
        
        
        nVenta = Long.parseLong(numVenta);
        
        
        if(band==1){
        reporte = ctrCorte.realizarReporteVentas(nVenta);

        if (reporte == null) {
            JOptionPane.showMessageDialog(this, " No existen registros para ese No. de Venta.");
        } 
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btAceptarVentasActionPerformed

    private void btCancelarRepVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRepVentasActionPerformed
        // Botón Cancelar Rep Ventas

        this.removeAll();
        //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        this.revalidate();
        this.repaint();
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarRepVentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botón aceptar
        // TODO add your handling code here:
        ArticuloVenta mVentas = new ArticuloVenta(true);
       
        if(txNumVenta.getText().equals("")){
       
            JOptionPane.showMessageDialog(this,"Ingrese No. de Venta.");
        
        }
        else{
        
         //String donde almacenar el texto a buscar
        Long nVenta = Long.parseLong(txNumVenta.getText());
        
        //Iniciamos controlador
        ControlReporte ctrReporte = new ControlReporte();
        //Iniciamos objectos donde guardaremos los resultados de busqueda
        Object[] venta = null;
        
        Object[] ventas = null;
        
        
        Object[][] opciones = new Object[][]{{"idVenta","=",nVenta}};
        ventas = mVentas.buscarBD("all", opciones);
        
           
        if(ventas.length==0)
            JOptionPane.showMessageDialog(this,"No existen registros para ese No. de Venta.");
        else
        {
        //Obtener descripcion
        Object[]dventas = null;
        
        
        Long tmpIdArt = ((ArticuloVenta)ventas[0]).getIdArticulo();
        
        
        Object[][] opciones2 = new Object[][]{{"codigoArticulo","=",tmpIdArt}};
        JOptionPane.showMessageDialog(this, "temp descr id art: "+tmpIdArt);
        
        Articulo dVenta = new Articulo(true);
        dventas = dVenta.buscarBD("all",opciones2);
        
       
      
        
        
          llenarTabla(ventas,dventas);
            
        }
        }//cierre de 1er else
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txNumVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNumVentaKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE) && (caracter != KeyEvent.VK_ENTER)){
        evt.consume();
        JOptionPane.showMessageDialog(this, "Ingrese sólo dígitos: {0,1,2,3,4,5,6,7,8,9}");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txNumVentaKeyTyped

    private void txNumVentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNumVentaKeyPressed

        // TODO add your handling code here:
        
        int key=evt.getKeyCode();
    if(evt.getSource()==txNumVenta)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
           jButton1ActionPerformed(null);
        }
    }
    }//GEN-LAST:event_txNumVentaKeyPressed
private void llenarTabla(Object[] venta, Object[] articulo) {
    
        DecimalFormat decimal = new DecimalFormat("#.##");
        Long nVenta = Long.parseLong(txNumVenta.getText());
        
        
        Object[] fventas = null;
        Object[][] opciones = new Object[][]{{"idVenta","=",nVenta}};
        Venta fVenta = new Venta(true);
        fventas = fVenta.buscarBD("all", opciones);
        
        txFecHr.setText("Fecha y Hora:  " + ((Venta) fventas[0]).getFecha());
        txTotal.setText("Total:  $"+((Venta) fventas[0]).getTotal());
        
        Object [] desc = null;
       
        DefaultTableModel datos = (DefaultTableModel) tbVentas.getModel();
        datos.setRowCount(0);
        
            
        int x=0; 
        for(Object thisVenta: venta)
          {
          
          datos.addRow(new Object[] {
          ((ArticuloVenta)thisVenta).getIdArticulo(),         
         ((Articulo)articulo[x]).getDescripcion(),
          ((ArticuloVenta)thisVenta).getCantidad(),
                   
          decimal.format(((ArticuloVenta)thisVenta).getPrecioVenta()),
           decimal.format(((ArticuloVenta)thisVenta).getIva()),
           decimal.format(((ArticuloVenta)thisVenta).getTotal())
            
          });
           x++;
          }
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbVentas.getModel());
          
        tbVentas.setRowSorter(sorter);}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarVentas;
    private javax.swing.JButton btCancelarRepVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbVentas;
    private javax.swing.JLabel txFecHr;
    private javax.swing.JLabel txNoVenta;
    private javax.swing.JTextField txNumVenta;
    private javax.swing.JLabel txTotal;
    // End of variables declaration//GEN-END:variables
}
