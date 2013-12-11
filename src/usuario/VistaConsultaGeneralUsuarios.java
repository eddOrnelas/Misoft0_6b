package usuario;


import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NOE
 */
public class VistaConsultaGeneralUsuarios extends javax.swing.JPanel {
    private int selection;
     

    /**
     * Creates new form VistaConsultaespecificaUsuario
     */
    public VistaConsultaGeneralUsuarios() {
        initComponents();
    }
    
 
    VistaConsultaGeneralUsuarios(String txBuscar) {
         //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.txBuscar.setText(txBuscar);
        ConsultarUsuariosGeneral(null);
        
        
        
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

        ConsultarUsuariosGeneral = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txBuscar = new javax.swing.JTextField();
        EditarUsuario = new javax.swing.JButton();
        EliminarUsuario = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        ConsultarUsuariosGeneral.setText("Buscar Usuarios");
        ConsultarUsuariosGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarUsuariosGeneral(evt);
            }
        });
        ConsultarUsuariosGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarUsuariosGeneralActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(ConsultarUsuariosGeneral, gridBagConstraints);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Usuario", "Activo", "Permisos"
            }
        ));
        jScrollPane1.setViewportView(tbUsuarios);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.05;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jScrollPane1, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar_1.jpg"))); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jButton5, gridBagConstraints);

        jLabel1.setText("Nombre del usuario a buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel1, gridBagConstraints);

        txBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txBuscar, gridBagConstraints);

        EditarUsuario.setText("Editar Usuario");
        EditarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarUsuarioMouseClicked(evt);
            }
        });
        EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(EditarUsuario, gridBagConstraints);

        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarUsuario(evt);
            }
        });
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(EliminarUsuario, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        this.revalidate();
        this.repaint();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void ConsultarUsuariosGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarUsuariosGeneralActionPerformed
        // TODO add your handling code here:
            
         
        

        
    
    }//GEN-LAST:event_ConsultarUsuariosGeneralActionPerformed

    private void txBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBuscarActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void ConsultarUsuariosGeneral(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarUsuariosGeneral
        // TODO add your handling code here:

     // TODO add your handling code here:
            
        //String donde almacenar el texto a buscar
        String usuario    = txBuscar.getText();
        //Long donde almacenamos el codigo de usuario
        //Iniciamos controlador
        ControlUsuario ctrUsuario = new ControlUsuario();
        //Iniciamos objectos donde guardaremos los resultados de busqueda
        Object[] usuarios = null;

           usuarios = ctrUsuario.buscarPorNombreUsuario(usuario);
            
           if(usuarios.length<=0)
           
               JOptionPane.showMessageDialog(this,"no se encontro usuario");
        else
        {
            
          llenarTabla(usuarios);
            
}

    }//GEN-LAST:event_ConsultarUsuariosGeneral

    private void EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EditarUsuarioActionPerformed

    private void EditarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarUsuarioMouseClicked
    
         
        //Obtenemos la fila seleccionada
        selection= tbUsuarios.getSelectedRow();
        
        String usuario = null;
        try{
        usuario = (String) tbUsuarios.getValueAt(selection, 3);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            
        }
                
             if(usuario!=null)
             {
           VistaEdicionUsuario vista = new VistaEdicionUsuario(usuario,this.txBuscar.getText());
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.setLayout(new java.awt.BorderLayout());          
           this.add(vista);
           vista.show();
           this.revalidate();
           this.repaint();
             }
             else
             {
                 JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun usuario");
             }
        
        
        
        
        
    }//GEN-LAST:event_EditarUsuarioMouseClicked

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

    private void EliminarUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarUsuario
        // TODO add your handling code here
        
        
        
        
             ControlUsuario ctrUsuario = new ControlUsuario();
        
        //Obtenemos la fila seleccionada
        selection= tbUsuarios.getSelectedRow();
        String usuario = null;
        usuario = tbUsuarios.getValueAt(selection, 3).toString();    
        
        if(usuario!=null)
             {
                 //Establecemos un si y un no en espanol
                 Object opciones[] = { "SI", "NO" };
                 
            Integer seleccion = JOptionPane.showOptionDialog(this, "Desea eliminar el usuario seleccionado?", "Atencion!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
    
            if(seleccion == JOptionPane.YES_OPTION)
            {
            
                Boolean resultado = ctrUsuario.realizarEliminacionUsuario(usuario);
                
             if(resultado!=null)
             {
                 ((DefaultTableModel)tbUsuarios.getModel()).removeRow(selection);
                 JOptionPane.showMessageDialog(this, "Se elimino el usuario exitosamente");
             }
             else
                 JOptionPane.showMessageDialog(this, "error en la operacion, favor de intentar mas tarde");
             
             }
            
            
             }
             else
             {
                JOptionPane.showMessageDialog(this, "No se ha seleccionado ningun usuario "); 
             }
                 
    }//GEN-LAST:event_EliminarUsuario

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarUsuariosGeneral;
    private javax.swing.JButton EditarUsuario;
    private javax.swing.JButton EliminarUsuario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txBuscar;
    // End of variables declaration//GEN-END:variables

    private void iniciarTabla() {
        
          Object[] usuarios = null;
          ControlUsuario ctrUsuarios= new ControlUsuario();
          usuarios = ctrUsuarios.obtenerListaCompletaUsuarios();
         
          llenarTabla(usuarios);
         }
    
    
    private void llenarTabla(Object[] usuarios)
    {
         DefaultTableModel datos = (DefaultTableModel) tbUsuarios.getModel();
        datos.setRowCount(0);
         
        for(Object thisUsuario: usuarios)
          {
              
              String activo ="";
              if(((Usuario)thisUsuario).getActivo())
                  activo = "Activo";
              else activo = "Inactivo";
              
          datos.addRow(new Object[] {
          ((Usuario)thisUsuario).getNombre(),
          ((Usuario)thisUsuario).getApPaterno(),
          ((Usuario)thisUsuario).getApMaterno(),
          ((Usuario)thisUsuario).getUsuario(),
          activo,
          ((Usuario)thisUsuario).getTipoPermiso()});
          }
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbUsuarios.getModel());
          
        tbUsuarios.setRowSorter(sorter);
        
        
}
    
}

