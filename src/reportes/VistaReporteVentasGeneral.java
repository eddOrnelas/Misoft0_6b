/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes;

import java.util.Calendar;
import javax.swing.JOptionPane;

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

        jLabel1 = new javax.swing.JLabel();
        btAceptarVentas = new javax.swing.JButton();
        txFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txFechaInicio = new com.toedter.calendar.JDateChooser();
        btCancelarRepVentas = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rango de Fechas Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setMaximumSize(new java.awt.Dimension(600, 140));
        setMinimumSize(new java.awt.Dimension(600, 140));
        setPreferredSize(new java.awt.Dimension(600, 140));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Fecha Inicio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(72, 6, 0, 0);
        add(jLabel1, gridBagConstraints);

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 123, 7, 0);
        add(btAceptarVentas, gridBagConstraints);

        txFechaFinal.setDateFormatString("yyyy-MM-dd");
        txFechaFinal.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setPreferredSize(new java.awt.Dimension(85, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(62, 4, 0, 6);
        add(txFechaFinal, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Fecha Termino:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(72, 68, 0, 0);
        add(jLabel2, gridBagConstraints);

        txFechaInicio.setDateFormatString("yyyy-MM-dd");
        txFechaInicio.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaInicio.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaInicio.setPreferredSize(new java.awt.Dimension(85, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(62, 4, 0, 0);
        add(txFechaInicio, gridBagConstraints);

        btCancelarRepVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelarRepVentas.setText("Cancelar");
        btCancelarRepVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarRepVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 7, 0);
        add(btCancelarRepVentas, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarVentasActionPerformed
        
        ModeloCorte reporte = null;
        //Creamos controlador corte
        ControlReporte ctrCorte = new ControlReporte();

        //Le damos formato a la fecha para que mySQL la reconozca
        txFechaInicio.setDateFormatString("yyy-MM-dd");
        txFechaFinal.setDateFormatString("yyy-MM-dd");
        String fecha1 = "";
        String fecha2 = "";
        int band=0;
        int band2=0;

        //Obtenemos los valores de la texto de la fecha del calendario
        if (txFechaInicio.getCalendar() != null) {
            fecha1 = txFechaInicio.getCalendar().get(Calendar.YEAR) + "-" + (txFechaInicio.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            band=1;
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio.");
            band = 0;
        }

        if (txFechaFinal.getCalendar() != null) {
            fecha2 = txFechaFinal.getCalendar().get(Calendar.YEAR) + "-" + (txFechaFinal.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            band2 =2;
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Termino.");
            band =0;
        }
        if(band==1&band2==2){
        reporte = ctrCorte.realizarReporteVentas(fecha1, fecha2);

        if (reporte == null) {
            JOptionPane.showMessageDialog(this, " No existen registros de ventas para ese rango de fechas  ");
        } 
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btAceptarVentasActionPerformed

    private void btCancelarRepVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarRepVentasActionPerformed
        // Boton Cancelar Rep Ventas

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JDateChooser txFechaFinal;
    private com.toedter.calendar.JDateChooser txFechaInicio;
    // End of variables declaration//GEN-END:variables
}
