/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import usuario.ControlUsuario;

/**
 *
 * @author Eddie
 */
public class VistaConsultarArticulosGeneral extends javax.swing.JPanel {
    private int selection;
    private Container padre;
    private String textoBusqueda;

    /**
     * Creates new form VistaListaGeneralArticulos
     */
    public VistaConsultarArticulosGeneral() {
        initComponents();
        //initGrid();
        
    }
    
    public VistaConsultarArticulosGeneral(String textoBusqueda) {
        initComponents();
        
        ControlArticulo ctrArticulo = new ControlArticulo();
        Object[][] options;
        Object[] articulos;
        
        this.textoBusqueda = textoBusqueda;
        if(this.textoBusqueda!=null)
        {
        txBusqueda.setText(textoBusqueda);
        articulos = ctrArticulo.buscarArticulo(textoBusqueda);
        llenarTabla(articulos);
        
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbArticulos = new javax.swing.JTable();
        txBusqueda = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btVerDetallesAriculo = new javax.swing.JButton();
        btEditarArticulo = new javax.swing.JButton();
        btEliminarArticulo = new javax.swing.JButton();
        btRealizarCompra = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        tbArticulos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Artículo", "Descripción", "Proveedor", "Cantidad Existencia", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbArticulos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbArticulos);
        tbArticulos.getColumnModel().getColumn(0).setResizable(false);
        tbArticulos.getColumnModel().getColumn(1).setResizable(false);
        tbArticulos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tbArticulos.getColumnModel().getColumn(2).setResizable(false);
        tbArticulos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tbArticulos.getColumnModel().getColumn(3).setResizable(false);
        tbArticulos.getColumnModel().getColumn(4).setResizable(false);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 3.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        add(jScrollPane1, gridBagConstraints);

        txBusqueda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBusquedaActionPerformed(evt);
            }
        });
        txBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyBusqueda(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(txBusqueda, gridBagConstraints);

        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386942888_search.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarArticulos(evt);
            }
        });
        btBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyConsultarArticulos(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(btBuscar, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre Artículo o Código:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.ABOVE_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        add(jLabel2, gridBagConstraints);

        btVerDetallesAriculo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btVerDetallesAriculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386942729_eye-24.png"))); // NOI18N
        btVerDetallesAriculo.setText("Ver Detalles");
        btVerDetallesAriculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDetallesArticulo(evt);
            }
        });
        btVerDetallesAriculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyVerDetallesArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        add(btVerDetallesAriculo, gridBagConstraints);

        btEditarArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/editar-icono.png"))); // NOI18N
        btEditarArticulo.setText("Editar Articulo");
        btEditarArticulo.setActionCommand("Editar Artículo");
        btEditarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarArticulo(evt);
            }
        });
        btEditarArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyEditarArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        add(btEditarArticulo, gridBagConstraints);

        btEliminarArticulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEliminarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386942378_Black_Trash.png"))); // NOI18N
        btEliminarArticulo.setText("Eliminar Artículo");
        btEliminarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArticulo(evt);
            }
        });
        btEliminarArticulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyEliminarArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        add(btEliminarArticulo, gridBagConstraints);

        btRealizarCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRealizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386942614_meanicons_58.png"))); // NOI18N
        btRealizarCompra.setText("Realizar Compra");
        btRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarArticulo(evt);
            }
        });
        btRealizarCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keyComprarArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        add(btRealizarCompra, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    
    

    
    
    private void keyEditarArticulo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyEditarArticulo
        // TODO add your handling code here:
        int key=evt.getKeyCode();
    if(evt.getSource()==btVerDetallesAriculo)
    {
        if(key==KeyEvent.VK_ENTER || key==KeyEvent.VK_SPACE)
        { 
            editarArticulo(null);                   
        }
    }
        
        
    }//GEN-LAST:event_keyEditarArticulo

    private void keyConsultarArticulos(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyConsultarArticulos
        // TODO add your handling code here:
        consultarArticulos(null);
        
    }//GEN-LAST:event_keyConsultarArticulos

    private void keyBusqueda(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyBusqueda
        // TODO add your handling code here:
        
        int key=evt.getKeyCode();
    if(evt.getSource()==txBusqueda)
    {
        if(key==KeyEvent.VK_ENTER)
        { 
            consultarArticulos(null);                    
        }
    }
        
    }//GEN-LAST:event_keyBusqueda

    private void keyVerDetallesArticulo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyVerDetallesArticulo
        // TODO add your handling code here:
        
        int key=evt.getKeyCode();
    if(evt.getSource()==btVerDetallesAriculo)
    {
        if(key==KeyEvent.VK_ENTER || key==KeyEvent.VK_SPACE)
        { 
            verDetallesArticulo(null);                   
        }
    }
        
        
    }//GEN-LAST:event_keyVerDetallesArticulo

    private void keyComprarArticulo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyComprarArticulo
        // TODO add your handling code here:
        int key=evt.getKeyCode();
    if(evt.getSource()==btVerDetallesAriculo)
    {
        if(key==KeyEvent.VK_ENTER || key==KeyEvent.VK_SPACE)
        { 
            comprarArticulo(null);                   
        }
    }
        
    }//GEN-LAST:event_keyComprarArticulo

    private void keyEliminarArticulo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyEliminarArticulo
        // TODO add your handling code here:
        
        int key=evt.getKeyCode();
    if(evt.getSource()==btVerDetallesAriculo)
    {
        if(key==KeyEvent.VK_ENTER || key==KeyEvent.VK_SPACE)
        { 
            eliminarArticulo(null);
        }
    }
        
    }//GEN-LAST:event_keyEliminarArticulo

    private void eliminarArticulo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArticulo
        // TODO add your handling code here:
        
         //Iniciamos controlador articulo
        ControlArticulo ctrArticulo = new ControlArticulo();
        
        //Obtenemos la fila seleccionada
        selection= tbArticulos.getSelectedRow();
        //Optenemos el id de esa fila
        Long codigoArticulo = null;
        try{
        codigoArticulo = (Long) tbArticulos.getValueAt(selection, 0);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            
        }
              
        
        if(codigoArticulo!=null)
             {
                 //Establecemos un si y un no en espanol
                 Object opciones[] = { "SI", "NO" };
                 
            Integer seleccion = JOptionPane.showOptionDialog(this, "Deceas eliminar el articulo seleccionado?", "Atencion!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
    
            
            
            if(seleccion == JOptionPane.YES_OPTION)
            {
                ControlUsuario ctrUsuario = new ControlUsuario();
       
     Long idUsuario = ctrUsuario.obtenerUsuarioActual(this);
       
       Boolean autorizado = ctrUsuario.autorizarOperacion(idUsuario);
       
       if(!autorizado)
       {
           JOptionPane.showMessageDialog(this, "No estas autorizado");
           return;
       }
            
                Boolean resultado = ctrArticulo.elimiarArticuloPorCodigo(codigoArticulo);
             if(resultado)
             {
                 ((DefaultTableModel)tbArticulos.getModel()).setValueAt("Eliminado", seleccion, 4);
                 JOptionPane.showMessageDialog(this, "Se elimino el articulo de forma correcta del sistema");
             }
             else
                 JOptionPane.showMessageDialog(this, "Ocurrio un error en la operacion, favor de intentar mas tarde");
             }
            
            
             }
             else
             {
                JOptionPane.showMessageDialog(this, "No has seleccionado articulo "); 
             }
             
           
           
    }//GEN-LAST:event_eliminarArticulo

    private void txBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBusquedaActionPerformed

    private void verDetallesArticulo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDetallesArticulo
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        //Obtenemos la fila seleccionada
        selection= tbArticulos.getSelectedRow();
        //Optenemos el id de esa fila
        Long codigoArticulo = null;
        try{
        codigoArticulo = (Long) tbArticulos.getValueAt(selection, 0);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            
        }
                
             if(codigoArticulo!=null)
             {
           VistaConsultarArticuloEspecifico vista = new VistaConsultarArticuloEspecifico(codigoArticulo, textoBusqueda);
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
                 JOptionPane.showMessageDialog(this, "No has seleccionado articulo");
             }
    }//GEN-LAST:event_verDetallesArticulo

    private void editarArticulo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarArticulo
        // TODO add your handling code here:
        //Obtenemos la fila seleccionada
        selection= tbArticulos.getSelectedRow();
        //Optenemos el id de esa fila
        Long codigoArticulo = null;
        try{
        codigoArticulo = (Long) tbArticulos.getValueAt(selection, 0);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            
        }
                
             if(codigoArticulo!=null)
             {
           VistaEditarArticulo vista = new VistaEditarArticulo(codigoArticulo, textoBusqueda);
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
                 JOptionPane.showMessageDialog(this, "No has seleccionado articulo");
             }
    }//GEN-LAST:event_editarArticulo

    private void comprarArticulo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarArticulo
        // TODO add your handling code here:
        //Obtenemos la fila seleccionada
        selection= tbArticulos.getSelectedRow();
        //Optenemos el id de esa fila
        Long idArticulo = null;
        try{
        idArticulo = (Long) tbArticulos.getValueAt(selection, 0);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            
        }
                
             if(idArticulo!=null)
             {
           VistaCompraArticulos vista = new VistaCompraArticulos(idArticulo, textoBusqueda);
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
                 JOptionPane.showMessageDialog(this, "No has seleccionado articulo");
             }
    }//GEN-LAST:event_comprarArticulo

    private void consultarArticulos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarArticulos
        // TODO add your handling code here:
         //String donde almacenar el texto a buscar
        String descripcion = txBusqueda.getText();
        
        //Iniciamos controlador
        ControlArticulo ctrArticulo = new ControlArticulo();
        //Iniciamos objectos donde guardaremos los resultados de busqueda
        Object[] articulos = null;
        
        this.textoBusqueda = descripcion;
       articulos = ctrArticulo.buscarArticulo(descripcion);
        
        //Long donde almacenamos el codigo de articulo
        
            
        
        if(articulos.length<=0)
            JOptionPane.showMessageDialog(this,"no se encontro articulo");
        else
        {
          llenarTabla(articulos);
            
        }
    }//GEN-LAST:event_consultarArticulos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditarArticulo;
    private javax.swing.JButton btEliminarArticulo;
    private javax.swing.JButton btRealizarCompra;
    private javax.swing.JButton btVerDetallesAriculo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbArticulos;
    public javax.swing.JTextField txBusqueda;
    // End of variables declaration//GEN-END:variables

    private void initGrid() {
        
          Object[] articulos = null;
          ControlArticulo ctrArticulos = new ControlArticulo();
          articulos = ctrArticulos.obtenerListaCompletaArticulos();
          
          
          llenarTabla(articulos);
        
        
          
 
    }
    
    
    private void llenarTabla(Object[] articulos)
    {
         DefaultTableModel datos = (DefaultTableModel) tbArticulos.getModel();
        datos.setRowCount(0);
         
        for(Object thisArticulo: articulos)
          {
              String articuloEstado = "Activo";
              
              if(!((Articulo)thisArticulo).getActivo()){
                  articuloEstado = "Eliminado";
              }
              
          datos.addRow(new Object[] {
          ((Articulo)thisArticulo).getCodigoArticulo(),
          ((Articulo)thisArticulo).getDescripcion()+" -- "+((Articulo)thisArticulo).getCantidadUnidad()+" "+((Articulo)thisArticulo).getUnidad(),
          ((Articulo)thisArticulo).getProveedor(),
          ((Articulo)thisArticulo).getCantidadExistencia(),
           articuloEstado}
          );
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbArticulos.getModel());
          
        tbArticulos.setRowSorter(sorter);
        
        
    }
    
    }
    
}
