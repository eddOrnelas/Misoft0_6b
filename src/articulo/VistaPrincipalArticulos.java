/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import java.awt.event.KeyEvent;

/**
 *
 * @author Eddie
 */
public class VistaPrincipalArticulos extends javax.swing.JPanel {

    /**
     * Creates new form VistaPrincipalArticulos
     */
    
   
    
    public VistaPrincipalArticulos() {
        initComponents();
        
        VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral();
        jpArticulos.removeAll();
        jpArticulos.add(vista);
        vista.show();
        jpArticulos.revalidate();
        jpArticulos.repaint();
        
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

        btAltaArticulos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jpArticulos = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        btAltaArticulos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAltaArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/addarticle.png"))); // NOI18N
        btAltaArticulos.setText("Registro Nuevo Artículo");
        btAltaArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verVistaAltaArticulos(evt);
            }
        });
        btAltaArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltaArticulosActionPerformed(evt);
            }
        });
        btAltaArticulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btAltaArticulosKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(btAltaArticulos, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386943418_th-list.png"))); // NOI18N
        jButton5.setText("Consulta Artículos");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verVistaConsultaArticulos(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(jButton5, gridBagConstraints);

        jpArticulos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpArticulos.setLayout(new java.awt.BorderLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jpArticulos, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void verVistaAltaArticulos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verVistaAltaArticulos
        // TODO add your handling code here:
//        
//        jpArticulos.removeAll();
//       jpArticulos.revalidate();
//       
//       VistaRegistrarArticulo vistaAltaArticulos = new VistaRegistrarArticulo();
//       
//        jpArticulos.add(vistaAltaArticulos);
//        
//        vistaAltaArticulos.show();
        
    }//GEN-LAST:event_verVistaAltaArticulos

    private void verVistaConsultaArticulos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verVistaConsultaArticulos
        // TODO add your handling code here:
//        
//         VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral();
//        jpArticulos.removeAll();
//        jpArticulos.add(vista);
//        vista.show();
//        jpArticulos.revalidate();
//        jpArticulos.repaint();
        
    }//GEN-LAST:event_verVistaConsultaArticulos

    private void btAltaArticulosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAltaArticulosKeyPressed
        // TODO add your handling code here:
                       int key=evt.getKeyCode();
    if(evt.getSource()==btAltaArticulos)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
          btAltaArticulosActionPerformed(null);                    
        }
    }
        
    }//GEN-LAST:event_btAltaArticulosKeyPressed

    private void btAltaArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltaArticulosActionPerformed
        // TODO add your handling code here:
         
        jpArticulos.removeAll();
       jpArticulos.revalidate();
       
       VistaRegistrarArticulo vistaAltaArticulos = new VistaRegistrarArticulo();
       
        jpArticulos.add(vistaAltaArticulos);
        
        vistaAltaArticulos.show();
    }//GEN-LAST:event_btAltaArticulosActionPerformed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        // TODO add your handling code here:
                           int key=evt.getKeyCode();
    if(evt.getSource()==jButton5)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
         jButton5ActionPerformed(null);                    
        }
    }
        
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           
         VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral();
        jpArticulos.removeAll();
        jpArticulos.add(vista);
        vista.show();
        jpArticulos.revalidate();
        jpArticulos.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltaArticulos;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jpArticulos;
    // End of variables declaration//GEN-END:variables
}
