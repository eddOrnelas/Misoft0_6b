/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package misoft;

import articulo.VistaPrincipalArticulos;
import corte.VistaCorte;
import java.awt.Color;
import reportes.VistaReportes;
import usuario.VistaPrincipalUsuario;
import venta.VistaRealizarVenta;



/**
 *
 * @author Eddie
 */
public class VistaVentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaVentanaPrincipal
     */
    
     Long idUsuario;
    
    private void setIdUsuario(Long idUsuario)
    {
        this.idUsuario = idUsuario;
    }
    
    public Long getIdUsuario()
    {
        return idUsuario;
    }
    
    
    
    public VistaVentanaPrincipal() {
        initComponents();
        this.idUsuario = 1L;
    }
    
    public VistaVentanaPrincipal(Long idUsuario) {
        initComponents();
        
        this.setIdUsuario(idUsuario);
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

        btAlmacen = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        btReportes = new javax.swing.JButton();
        btAdministracion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiSoft");
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img50x50/INVENTARIOS.gif"))); // NOI18N
        btAlmacen.setText("Administrar Almacén");
        btAlmacen.setMaximumSize(new java.awt.Dimension(183, 50));
        btAlmacen.setMinimumSize(new java.awt.Dimension(183, 50));
        btAlmacen.setPreferredSize(new java.awt.Dimension(183, 50));
        btAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAlmacen(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.5;
        getContentPane().add(btAlmacen, gridBagConstraints);

        jButton7.setText("Ventas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jButton7, gridBagConstraints);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPrincipal.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(panelPrincipal, gridBagConstraints);

        btReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img50x50/reports_icon.png"))); // NOI18N
        btReportes.setText("Reportes");
        btReportes.setMaximumSize(new java.awt.Dimension(129, 50));
        btReportes.setMinimumSize(new java.awt.Dimension(129, 50));
        btReportes.setPreferredSize(new java.awt.Dimension(129, 50));
        btReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReportes(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(btReportes, gridBagConstraints);

        btAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img50x50/usuario.png"))); // NOI18N
        btAdministracion.setText("Administración");
        btAdministracion.setMaximumSize(new java.awt.Dimension(155, 50));
        btAdministracion.setMinimumSize(new java.awt.Dimension(155, 50));
        btAdministracion.setPreferredSize(new java.awt.Dimension(155, 50));
        btAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAdministracion(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(btAdministracion, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banner1_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jLabel1, gridBagConstraints);

        btVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img50x50/icons_agregar.png"))); // NOI18N
        btVentas.setText("Ventas");
        btVentas.setMaximumSize(new java.awt.Dimension(119, 50));
        btVentas.setMinimumSize(new java.awt.Dimension(119, 50));
        btVentas.setPreferredSize(new java.awt.Dimension(119, 50));
        btVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVentas(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(btVentas, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verAlmacen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAlmacen
        // TODO add your handling code here:
        
        panelPrincipal.removeAll();
        
        VistaPrincipalArticulos vista = new VistaPrincipalArticulos();
        vista.show();
        
        panelPrincipal.add(vista);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setTitle("MiSoft/Administrar Almacén");
        
        
    }//GEN-LAST:event_verAlmacen

    private void verAdministracion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAdministracion
        // TODO add your handling code here:
        
        panelPrincipal.removeAll();
        
        VistaPrincipalUsuario vista = new VistaPrincipalUsuario();
        vista.show();
        
        panelPrincipal.add(vista);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setTitle("MiSoft/Administración");
        
    }//GEN-LAST:event_verAdministracion

    private void verVentas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVentas
        // TODO add your handling code here:
        
            
        panelPrincipal.removeAll();
        
        VistaRealizarVenta vista = new VistaRealizarVenta();
        vista.show();
        
        panelPrincipal.add(vista);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setTitle("MiSoft/Ventas");
        
    }//GEN-LAST:event_verVentas

    private void verReportes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReportes
        // TODO add your handling code here:
        panelPrincipal.removeAll();
        
        VistaReportes vista = new VistaReportes();
        
        vista.show();
        panelPrincipal.add(vista);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        this.setTitle("MiSoft/Reportes");
       
    }//GEN-LAST:event_verReportes

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdministracion;
    private javax.swing.JButton btAlmacen;
    private javax.swing.JButton btReportes;
    private javax.swing.JButton btVentas;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
