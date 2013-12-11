/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes;

import static java.lang.Integer.parseInt;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        /*Calendar cal = new GregorianCalendar();
        
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String fechaActual =  year+"-"+month+"-"+day;
       
        txFechaFinal.setDateFormatString("yyy-MM-dd");
        txFechaFinal.setMaxSelectableDate(new Date());
        */
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel3 = new javax.swing.JLabel();
        txNumArt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txFechaFinal = new com.toedter.calendar.JDateChooser();
        btAceptarVentas = new javax.swing.JButton();
        btCancelarRepVentas = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte de Movimientos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setMaximumSize(new java.awt.Dimension(600, 140));
        setMinimumSize(new java.awt.Dimension(600, 140));
        setPreferredSize(new java.awt.Dimension(600, 140));
        setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("Código de Árticulo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(74, 30, 0, 0);
        add(jLabel3, gridBagConstraints);

        txNumArt.setMaximumSize(new java.awt.Dimension(6, 25));
        txNumArt.setMinimumSize(new java.awt.Dimension(6, 25));
        txNumArt.setPreferredSize(new java.awt.Dimension(6, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 91;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 4, 0, 0);
        add(txNumArt, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Hasta la fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(73, 114, 0, 0);
        add(jLabel2, gridBagConstraints);

        txFechaFinal.setDateFormatString("yyyy-MM-dd");
        txFechaFinal.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setPreferredSize(new java.awt.Dimension(85, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 4, 0, 29);
        add(txFechaFinal, gridBagConstraints);

        btAceptarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/aceptar1.png"))); // NOI18N
        btAceptarVentas.setText("Aceptar");
        btAceptarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 5, 0);
        add(btAceptarVentas, gridBagConstraints);

        btCancelarRepVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelarRepVentas.setText("Cancelar");
        btCancelarRepVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRepVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 114, 5, 0);
        add(btCancelarRepVentas, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarVentasActionPerformed
        
        
        //Validación de campos
        ModeloCorte reporte = null;
        //Creamos controlador corte
        ControlReporte ctrlMov = new ControlReporte();
        
        txFechaFinal.setDateFormatString("yyy-MM-dd");
        String fecha2 = "";
        
        int band=0;
        int band2=0;
        
             
        
        if (txFechaFinal.getCalendar() != null) {
            fecha2 = txFechaFinal.getCalendar().get(Calendar.YEAR) + "-" + (txFechaFinal.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            band=1;
                       
            
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Hasta la Fecha");
            band =0;
        }
        
        String idArt = "";
        if (txNumArt.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese código de artículo");
            band =0;
            
        } else {
            
            idArt = txNumArt.getText();
            band2=2;
        }
        Long idArticulo = null;
        idArticulo = Long.parseLong(idArt);
        
        
 
        
        if(band==1&&band2==2){
        reporte = ctrlMov.realizarReporteMovimientos(idArticulo, fecha2);

        if (reporte == null) {
            JOptionPane.showMessageDialog(this, " No existen registros de movimientos para "+idArticulo+" hasta esa fecha.");
        } 
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btAceptarVentasActionPerformed

    private void btCancelarRepVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRepVentasActionPerformed
        // Boton Cancelar Rep Corte Caja

        this.removeAll();
        //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        this.revalidate();
        this.repaint();
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarRepVentasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarVentas;
    private javax.swing.JButton btCancelarRepVentas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JDateChooser txFechaFinal;
    private javax.swing.JTextField txNumArt;
    // End of variables declaration//GEN-END:variables
}
