/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;


import javax.swing.JOptionPane;

/**
 *
 * @author Eddie
 */
public class VistaConsultarArticuloEspecifico extends javax.swing.JPanel {

    /**
     * Creates new form VistaVerDetallesArticulo
     */
    
    private Long codigoArticulo = null;
    private String textoBusqueda;
    
    
    public VistaConsultarArticuloEspecifico() {
        initComponents();
    }
    
    public VistaConsultarArticuloEspecifico(Long codigoArticulo, String textoBusqueda) {
        initComponents();
        
        this.codigoArticulo = codigoArticulo;
        this.textoBusqueda = textoBusqueda;
        
        //Creamos variable para guardar el articulo
        Articulo articulo = null;
        //Creamos controlador articulo
        ControlArticulo ctrArticulo = new ControlArticulo();
        
       articulo = ctrArticulo.buscarUnoPorCodigoArticulo(codigoArticulo);
        
       if(articulo==null)
           JOptionPane.showMessageDialog(this,"Articulo Invalido");
       else
       {
           lbCodigoArticulo.setText(articulo.getCodigoArticulo().toString());
           lbDescripcion.setText(articulo.getDescripcion());
           lbProveedor.setText(articulo.getProveedor());
           lbPrecioCompra.setText(articulo.getPrecioCompra().toString());
           lbPrecioVenta.setText(articulo.getPrecioVenta().toString());
           lbCantidadExistencia.setText(articulo.getCantidadExistencia().toString());
       }
        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        lbCodigoArticulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbProveedor = new javax.swing.JLabel();
        btEditarArticulo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        lbPrecioVenta = new javax.swing.JLabel();
        lbPrecioCompra = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbCantidadExistencia = new javax.swing.JLabel();

        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        setLayout(layout);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Detalles Articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Codigo Articulo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(jLabel2, gridBagConstraints);

        lbCodigoArticulo.setBackground(new java.awt.Color(255, 255, 255));
        lbCodigoArticulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCodigoArticulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(lbCodigoArticulo, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Descripcion:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(jLabel4, gridBagConstraints);

        lbDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        lbDescripcion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(lbDescripcion, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Proveedor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(jLabel6, gridBagConstraints);

        lbProveedor.setBackground(new java.awt.Color(255, 255, 255));
        lbProveedor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(lbProveedor, gridBagConstraints);

        btEditarArticulo.setText("Editar");
        btEditarArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        add(btEditarArticulo, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Precio Venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(jLabel3, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Precio Compra");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(jLabel5, gridBagConstraints);

        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarConsulta(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btCancelar, gridBagConstraints);

        lbPrecioVenta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbPrecioVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(lbPrecioVenta, gridBagConstraints);

        lbPrecioCompra.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbPrecioCompra.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(lbPrecioCompra, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Cantidad en Existencia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(jLabel7, gridBagConstraints);

        lbCantidadExistencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbCantidadExistencia.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(lbCantidadExistencia, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void editarArticulo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarArticulo
        // TODO add your handling code here:
        
        VistaEditarArticulo vista = new VistaEditarArticulo(codigoArticulo,textoBusqueda);
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.setLayout(new java.awt.BorderLayout());          
           this.add(vista);
           vista.show();
           this.revalidate();
           this.repaint();
        
        
        
    }//GEN-LAST:event_editarArticulo

    private void cancelarConsulta(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarConsulta
        // TODO add your handling code here:
        
        VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral(textoBusqueda);
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.setLayout(new java.awt.BorderLayout());          
           this.add(vista);
           vista.show();
           this.revalidate();
           this.repaint();
        
        
    }//GEN-LAST:event_cancelarConsulta

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditarArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbCantidadExistencia;
    private javax.swing.JLabel lbCodigoArticulo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbPrecioCompra;
    private javax.swing.JLabel lbPrecioVenta;
    private javax.swing.JLabel lbProveedor;
    // End of variables declaration//GEN-END:variables

    
}
