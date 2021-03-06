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

        bRegistroArticulos = new javax.swing.JButton();
        btConsultaArticulos = new javax.swing.JButton();
        jpArticulos = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        bRegistroArticulos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bRegistroArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/addarticle.png"))); // NOI18N
        bRegistroArticulos.setText("Registro Nuevo Artículo");
        bRegistroArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVistaAltaArticulos(evt);
            }
        });
        bRegistroArticulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bRegistroArticulosKeyPressed(evt);
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
        add(bRegistroArticulos, gridBagConstraints);

        btConsultaArticulos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btConsultaArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386943418_th-list.png"))); // NOI18N
        btConsultaArticulos.setText("Consulta Artículos");
        btConsultaArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVistaConsultaArticulos(evt);
            }
        });
        btConsultaArticulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btConsultaArticulosKeyPressed(evt);
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
        add(btConsultaArticulos, gridBagConstraints);

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

    private void bRegistroArticulosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bRegistroArticulosKeyPressed
        // TODO add your handling code here:
                       int key=evt.getKeyCode();
    if(evt.getSource()==bRegistroArticulos)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
         verVistaAltaArticulos(null);                    
        }
    }
        
    }//GEN-LAST:event_bRegistroArticulosKeyPressed

    private void verVistaAltaArticulos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVistaAltaArticulos
        // TODO add your handling code here:
         
        jpArticulos.removeAll();
       jpArticulos.revalidate();
       
       VistaRegistrarArticulo vistaAltaArticulos = new VistaRegistrarArticulo();
       
        jpArticulos.add(vistaAltaArticulos);
        
        vistaAltaArticulos.show();
    }//GEN-LAST:event_verVistaAltaArticulos

    private void btConsultaArticulosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btConsultaArticulosKeyPressed
        // TODO add your handling code here:
                           int key=evt.getKeyCode();
    if(evt.getSource()==btConsultaArticulos)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
         verVistaConsultaArticulos(null);                    
        }
    }
        
    }//GEN-LAST:event_btConsultaArticulosKeyPressed

    private void verVistaConsultaArticulos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVistaConsultaArticulos
        // TODO add your handling code here:
           
         VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral();
        jpArticulos.removeAll();
        jpArticulos.add(vista);
        vista.show();
        jpArticulos.revalidate();
        jpArticulos.repaint();
    }//GEN-LAST:event_verVistaConsultaArticulos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bRegistroArticulos;
    private javax.swing.JButton btConsultaArticulos;
    private javax.swing.JPanel jpArticulos;
    // End of variables declaration//GEN-END:variables
}
