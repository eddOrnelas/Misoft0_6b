/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import java.awt.LayoutManager;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import usuario.ControlUsuario;

/**
 *
 * @author Eddie
 */
public class VistaRegistrarArticulo extends javax.swing.JPanel {

    /**
     * Creates new form VistaAltaArticulos
     */
    
    private String textoBusqueda;
    
    
    
    public VistaRegistrarArticulo() {
        initComponents();
        this.textoBusqueda ="";
          
    }
    
    public VistaRegistrarArticulo(String textoBusqueda) {
        initComponents();
        this.textoBusqueda = "";
         this.textoBusqueda = textoBusqueda;
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
        txCodigoArticulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txProveedor = new javax.swing.JTextField();
        btAceptarAlta = new javax.swing.JButton();
        btCancelarAlta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Código Artículo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel1, gridBagConstraints);

        txCodigoArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(txCodigoArticulo, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Descripción:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel2, gridBagConstraints);

        txDescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDescripcionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(txDescripcion, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Proveedor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel5, gridBagConstraints);

        txProveedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(txProveedor, gridBagConstraints);

        btAceptarAlta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAceptarAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/aceptar1.png"))); // NOI18N
        btAceptarAlta.setText("Aceptar");
        btAceptarAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realizarRegistroArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(btAceptarAlta, gridBagConstraints);

        btCancelarAlta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCancelarAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelarAlta.setText("Cancelar");
        btCancelarAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarRegistro(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(btCancelarAlta, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alta Artículos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jLabel6, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDescripcionActionPerformed

    private void realizarRegistroArticulo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realizarRegistroArticulo
        // TODO add your handling code here:
        
        //barraEstado.setText("Alta Articulos: Guardando");
        
        String errorString = "";
        
       ControlArticulo ctrArticulos = new ControlArticulo();
       String errors = "";
       
       //ControlUsuario ctrUsuario =new ControlUsuario();
       
       //Long idUsuario = ctrUsuario.obtenerUsuarioActual(this);
       
       //Boolean autorizado = ctrUsuario.autorizarOperacion(idUsuario);
       
       //if(!autorizado)
         //  errors += "No estas autorizado";
    
    
       errors += ctrArticulos.validaDatosArticulo(txCodigoArticulo.getText(), txDescripcion.getText(),txProveedor.getText() );
    
       
       if(errors.length()>0)
       { JOptionPane.showMessageDialog(this,errors);
        //barraEstado.setText("Alta Articulos: En Espera");
       }
       else
       {
        Integer status = ctrArticulos.realizarRegistroArticulo(txCodigoArticulo.getText(), txDescripcion.getText(), txProveedor.getText() );
    
           if(status==1)
           {
           
            Object opciones[] = { "SI", "NO" };    
         Integer seleccion = JOptionPane.showOptionDialog(this, "El articulo se registro con exito, deceas registrar otro mas?", "Atencion!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
    
            
            
            if(seleccion == JOptionPane.YES_OPTION)
            {
                txCodigoArticulo.setText("");
                txDescripcion.setText("");
                txProveedor.setText("");
            
            }
            else{
                VistaConsultarArticuloEspecifico vista = new VistaConsultarArticuloEspecifico(Long.parseLong(txCodigoArticulo.getText()),textoBusqueda);
                this.removeAll();
                txCodigoArticulo.setText("");
                txDescripcion.setText("");
                txProveedor.setText("");
                this.setLayout(new java.awt.BorderLayout());
                this.add(vista);
                vista.show();
                this.revalidate();
                this.repaint();
            }
            
           }
           else
           {
               JOptionPane.showMessageDialog(this,"Hubo un error en la operacion");
               //barraEstado.setText("Alta Articulos: En Espera");
           }
           
       }
        
        
    }//GEN-LAST:event_realizarRegistroArticulo

    private void cancelarRegistro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarRegistro
        // TODO add your handling code here:
        
         VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral(textoBusqueda);
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.setLayout(new java.awt.BorderLayout());          
           this.add(vista);
           vista.show();
           this.revalidate();
           this.repaint();
        
        
    }//GEN-LAST:event_cancelarRegistro

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptarAlta;
    private javax.swing.JButton btCancelarAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txCodigoArticulo;
    private javax.swing.JTextField txDescripcion;
    private javax.swing.JTextField txProveedor;
    // End of variables declaration//GEN-END:variables
}
