/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes;

import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VistaReporteMovimientos extends javax.swing.JPanel {

    /**
     * Creates new form VistaReporteMovimientos
     */
    public VistaReporteMovimientos() throws ParseException {
        initComponents();
        
        //Fecha no sea mayor a la actual.
        Calendar cal = new GregorianCalendar();
        
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR)-1900;
        int day = cal.get(Calendar.DAY_OF_MONTH)-31;
                
        txFechaFinal.setDateFormatString("yyyy-MM-dd");
        txFechaFinal.setMaxSelectableDate(new Date(year,month,day));
        
        txFechaInicio.setDateFormatString("yyyy-MM-dd");
        txFechaInicio.setMaxSelectableDate(new Date(year,month,day));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etCodigoArticulo = new javax.swing.JLabel();
        txNumArt = new javax.swing.JTextField();
        etFechaInicio = new javax.swing.JLabel();
        txFechaFinal = new com.toedter.calendar.JDateChooser();
        btExportarMovimientos = new javax.swing.JButton();
        btCancelarRepMovimientos = new javax.swing.JButton();
        etFechaFinal = new javax.swing.JLabel();
        txFechaInicio = new com.toedter.calendar.JDateChooser();
        btAceptarRepMovimientos = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte de Movimientos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1150, 250));
        setMinimumSize(new java.awt.Dimension(1150, 250));
        setPreferredSize(new java.awt.Dimension(1150, 250));

        etCodigoArticulo.setText("Código de Árticulo:");

        txNumArt.setMaximumSize(new java.awt.Dimension(6, 25));
        txNumArt.setMinimumSize(new java.awt.Dimension(6, 25));
        txNumArt.setPreferredSize(new java.awt.Dimension(6, 25));
        txNumArt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNumArtKeyTyped(evt);
            }
        });

        etFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etFechaInicio.setText("Fecha Termino");

        txFechaFinal.setDateFormatString("yyyy-MM-dd");
        txFechaFinal.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setPreferredSize(new java.awt.Dimension(85, 25));

        btExportarMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        btExportarMovimientos.setText("Aceptar");
        btExportarMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarMovimientosActionPerformed(evt);
            }
        });

        btCancelarRepMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelarRepMovimientos.setText("Cancelar");
        btCancelarRepMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRepMovimientosActionPerformed(evt);
            }
        });

        etFechaFinal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etFechaFinal.setText("Fecha Inicio");

        txFechaInicio.setDateFormatString("yyyy-MM-dd");
        txFechaInicio.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaInicio.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaInicio.setPreferredSize(new java.awt.Dimension(85, 25));

        btAceptarRepMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/aceptar1.png"))); // NOI18N
        btAceptarRepMovimientos.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txNumArt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etFechaFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etFechaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btAceptarRepMovimientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelarRepMovimientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btExportarMovimientos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAceptarRepMovimientos)
                        .addComponent(btCancelarRepMovimientos))
                    .addComponent(txNumArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etCodigoArticulo)
                    .addComponent(txFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etFechaInicio)
                    .addComponent(txFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExportarMovimientos))
                .addGap(223, 223, 223))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btExportarMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarMovimientosActionPerformed
        
        
        //Validación de campos
        ModeloCorte reporte = null;
        //Creamos controlador corte
        ControlReporte ctrlMov = new ControlReporte();
        txFechaInicio.setDateFormatString("yyy-MM-dd");
        txFechaFinal.setDateFormatString("yyy-MM-dd");
        String fecha1 = "";
        String fecha2 = "";
        
        int band=0;
        int band2=0;
        int band3=0;
        int band4=0;
        
        
         String idArt = "";
        if (txNumArt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese código de artículo");
            band =0;
            
        } else {
            
            idArt = txNumArt.getText();
            band2=2;
        }
        
        
        if (txFechaInicio.getCalendar() != null) {
            fecha1 = txFechaInicio.getCalendar().get(Calendar.YEAR) + "-" + (txFechaInicio.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            band3=3;
                       
            
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha de Inicio");
            band =0;
        }     
        
        if (txFechaFinal.getCalendar() != null) {
            fecha2 = txFechaFinal.getCalendar().get(Calendar.YEAR) + "-" + (txFechaFinal.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            band=1;
                       
            
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Termino");
            band =0;
        }
        
        //Validar fecha inicio <= fecha termino
        if (txFechaFinal.getCalendar() != null && txFechaInicio.getCalendar() != null) {
            int a1 = txFechaInicio.getCalendar().get(Calendar.YEAR);
            int a2 = txFechaFinal.getCalendar().get(Calendar.YEAR);
            
            int mes1 = txFechaInicio.getCalendar().get(Calendar.MONTH);
            int mes2 = txFechaFinal.getCalendar().get(Calendar.MONTH);
            
            int dia1 = txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            int dia2 = txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            
            
            if(a1>a2){
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
            band4 = 4;
            }
            
            if(a1==a2){
                if(mes1>mes2){
                JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
                band4 = 4;
                }else{
                    if(mes1==mes2){
                        if(dia1>dia2){
                            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
                            band4 = 4;
                        }
                    }
                
                }
            }else{
            band4=0;
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino. ultimo else");
            band =0;
        }
        
       
        Long idArticulo = null;
        idArticulo = Long.parseLong(idArt);
        
      
 
        
        if(band==1&&band2==2&&band3==3&&band4==0){
        reporte = ctrlMov.realizarReporteMovimientos(idArticulo, fecha1, fecha2);

        if (reporte == null) {
            JOptionPane.showMessageDialog(this, " No existen registros de movimientos para "+idArticulo+" para este rango.");
        } 
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btExportarMovimientosActionPerformed

    private void btCancelarRepMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRepMovimientosActionPerformed
        // Boton Cancelar Rep Corte Caja

        this.removeAll();
        //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        this.revalidate();
        this.repaint();
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarRepMovimientosActionPerformed

    private void txNumArtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNumArtKeyTyped
        char caracter = evt.getKeyChar();
        if(((caracter < '0') || (caracter > '9')) &&(caracter != KeyEvent.VK_BACK_SPACE)){
        evt.consume();
        JOptionPane.showMessageDialog(this, "Ingrese sólo dígitos: {0,1,2,3,4,5,6,7,8,9}");
        }

// TODO add your handling code here:
    }//GEN-LAST:event_txNumArtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarRepMovimientos;
    private javax.swing.JButton btCancelarRepMovimientos;
    private javax.swing.JButton btExportarMovimientos;
    private javax.swing.JLabel etCodigoArticulo;
    private javax.swing.JLabel etFechaFinal;
    private javax.swing.JLabel etFechaInicio;
    private com.toedter.calendar.JDateChooser txFechaFinal;
    private com.toedter.calendar.JDateChooser txFechaInicio;
    private javax.swing.JTextField txNumArt;
    // End of variables declaration//GEN-END:variables
}
