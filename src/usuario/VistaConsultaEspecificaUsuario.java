package usuario;

import articulo.Articulo;
import articulo.ControlArticulo;
import articulo.VistaConsultarArticulosGeneral;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOE
 */
public class VistaConsultaEspecificaUsuario extends javax.swing.JPanel {
    public String usuario;
    public String nombre;
 private String txBuscar;

    /**
     * Creates new form VistaConsultaGenerlaUsuario
     */
 public VistaConsultaEspecificaUsuario() {
        initComponents();
    }
    public VistaConsultaEspecificaUsuario(String nombre, String txBuscar) {
        initComponents();
        this.nombre = nombre;
        this.txBuscar = txBuscar;
         //Creamos variable para guardar el articulo
        Usuario usuario = null;
        //Creamos controlador articulo
        ControlUsuario ctrUsuario = new ControlUsuario();
        
       usuario = ctrUsuario.buscarPorNombreUsuario(nombre);
        
       if(usuario==null)
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre de Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellido Materno");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Apellido Materno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Permisos");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar_1.jpg"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/aceptar1.png"))); // NOI18N
        jButton4.setText("Aceptar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4realizarAltaUsuario(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VistaConsultaGeneralUsuarios vista = new VistaConsultaGeneralUsuarios(this.txBuscar);
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.setLayout(new java.awt.BorderLayout());          
           this.add(vista);
           vista.show();
           this.revalidate();
           this.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4realizarAltaUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4realizarAltaUsuario
        // TODO add your handling code here:
        //        ControlUsuario ctrusuario = new ControlUsuario();
        //        String errores="";
        //
        //        errores = ctrusuario.validarDatosAltaUsuario(txnombre.getText(),txapPaterno.getText(), txapMaterno.getText(),txusuario.getText(),txcontraseña.getText(),txpermisos.getSelectedItem().toString());
        //        if(errores.length()>0)
        //       {
            //           JOptionPane.showMessageDialog(this,errores);
            //
            //        }
        //
        //        else{
            //
            //          Integer exito = ctrusuario.realizarAltaUsuario(txnombre.getText(),txapPaterno.getText(), txapMaterno.getText(),txusuario.getText(),txcontraseña.getText(),txpermisos.getSelectedItem().toString());
            //
            //
            //        if(exito==1)
            //        {
                //            JOptionPane.showMessageDialog(this, "Alta Exitosa");
                //        txnombre.setText("");
                //        txapPaterno.setText("");
                //        txapMaterno.setText("");
                //        txusuario.setText("");
                //        txcontraseña.setText("");
                //
                //
                //        }
            //
            //       else
            //        {
                //            JOptionPane.showMessageDialog(this, "Alta Incorrecta");
                //        }
            //       }
    }//GEN-LAST:event_jButton4realizarAltaUsuario

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ControlUsuario ctrusuario = new ControlUsuario();
        String errores="";

        errores = ctrusuario.validarDatosAltaUsuario(txnombre.getText(),txapPaterno.getText(), txapMaterno.getText(),txusuario.getText(),txcontraseña.getText(),txpermisos.getSelectedItem().toString());
        if(errores.length()>0)
        {
            JOptionPane.showMessageDialog(this,errores);

        }

        else{

            Integer exito = ctrusuario.realizarAltaUsuario(txnombre.getText(),txapPaterno.getText(), txapMaterno.getText(),txusuario.getText(),txcontraseña.getText(),txpermisos.getSelectedItem().toString());

            if(exito==1)
            {
                Object opciones[] = { "SI", "NO" };
                Integer seleccion = JOptionPane.showOptionDialog(this, "El usuario se registro con exito, deceas registrar otro mas?", "Atencion!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                if(seleccion == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(this, "Alta Exitosa");
                    txnombre.setText("");
                    txapPaterno.setText("");
                    txapMaterno.setText("");
                    txusuario.setText("");
                    txcontraseña.setText("");}
                else{

                    VistaConsultaGeneralUsuarios vista = new VistaConsultaGeneralUsuarios(this.txBuscar);
                    this.removeAll();

                    //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                    this.setLayout(new java.awt.BorderLayout());

                    this.add(vista);
                    vista.show();
                    this.revalidate();
                    this.repaint();

                }}

                else
                {
                    JOptionPane.showMessageDialog(this, "Alta Incorrecta");
                }
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        int key=evt.getKeyCode();
        if(evt.getSource()==jButton4)
        {
            if(key==KeyEvent.VK_ENTER)
            {
                jButton4ActionPerformed(null);
            }
        }
    }//GEN-LAST:event_jButton4KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
