/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.awt.GridBagLayout;
import reportes.ControlReporte;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import reportes.ModeloArticulo;

/**
 *
 * @author Administrator
 */
public class VistaReportes extends javax.swing.JPanel {

    /**
     * Creates new form VistaReportes
     */
    public VistaReportes() {
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

        btReporteVentas = new javax.swing.JButton();
        btCorte = new javax.swing.JButton();
        btArticulos = new javax.swing.JButton();
        btMovimientos = new javax.swing.JButton();
        jpRangos = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();

        setAlignmentX(20.0F);
        setMaximumSize(new java.awt.Dimension(740, 300));
        setMinimumSize(new java.awt.Dimension(740, 300));
        setName("panelReportes"); // NOI18N
        setPreferredSize(new java.awt.Dimension(740, 300));
        setLayout(new java.awt.GridBagLayout());

        btReporteVentas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporteVenta.png"))); // NOI18N
        btReporteVentas.setText("Reporte de Ventas");
        btReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporteVentasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 10, 0, 0);
        add(btReporteVentas, gridBagConstraints);

        btCorte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporteCorteCaja.png"))); // NOI18N
        btCorte.setText("Reporte Corte de Caja");
        btCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verCorteCaja(evt);
            }
        });
        btCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 10, 0, 0);
        add(btCorte, gridBagConstraints);

        btArticulos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporteAlmacen.png"))); // NOI18N
        btArticulos.setText("Reporte Almacén");
        btArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btArticulosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 0, 0);
        add(btArticulos, gridBagConstraints);

        btMovimientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/movimientosAlmacen.png"))); // NOI18N
        btMovimientos.setText("Reporte Movimientos");
        btMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMovimientosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 14, 0, 0);
        add(btMovimientos, gridBagConstraints);

        jpRangos.setMaximumSize(new java.awt.Dimension(760, 180));
        jpRangos.setMinimumSize(new java.awt.Dimension(760, 180));
        jpRangos.setPreferredSize(new java.awt.Dimension(760, 180));
        jpRangos.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(jpRangos, gridBagConstraints);

        jSeparator2.setMaximumSize(new java.awt.Dimension(550, 10));
        jSeparator2.setMinimumSize(new java.awt.Dimension(550, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(550, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 210;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(jSeparator2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorteActionPerformed

        jpRangos.removeAll();
        this.repaint();
        
    }//GEN-LAST:event_btCorteActionPerformed
    
    
    private void btArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btArticulosActionPerformed
        // TODO add your handling code here:
        jpRangos.removeAll();
        this.repaint();
        ModeloArticulo reporte = null;
        ControlReporte ctrArticulos = new ControlReporte();
        reporte = ctrArticulos.realizarReporteArticulo();
        
        if (reporte == null) {
            JOptionPane.showMessageDialog(null, "No existen Articulos en el almacén");
        } else {
            

        }
    }//GEN-LAST:event_btArticulosActionPerformed

    private void btReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporteVentasActionPerformed
        // TODO add your handling code here:
        jpRangos.removeAll();
        jpRangos.revalidate();
        VistaReporteVentasGeneral vista = new VistaReporteVentasGeneral();
        jpRangos.add(vista);
        vista.show();
        this.repaint();
          
        
    

    }//GEN-LAST:event_btReporteVentasActionPerformed

    private void verCorteCaja(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCorteCaja
        // TODO add your handling code here:
        
             
        jpRangos.removeAll();
        jpRangos.revalidate();
        VistaReporteCorte vista = new VistaReporteCorte();
        jpRangos.add(vista);
        vista.show();
        //vista.setVisible(true);
        //jpRangos.revalidate();
        
    }//GEN-LAST:event_verCorteCaja

    private void btMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMovimientosActionPerformed

        jpRangos.removeAll();
        jpRangos.revalidate();
        VistaReporteMovimientos vista = new VistaReporteMovimientos();
        jpRangos.add(vista);
        vista.show();
        this.repaint();
    }//GEN-LAST:event_btMovimientosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btArticulos;
    private javax.swing.JButton btCorte;
    private javax.swing.JButton btMovimientos;
    private javax.swing.JButton btReporteVentas;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpRangos;
    // End of variables declaration//GEN-END:variables
}
