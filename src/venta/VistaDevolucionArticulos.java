/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import articulo.Articulo;
import articulo.ControlArticulo;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Eddie
 */
public class VistaDevolucionArticulos extends javax.swing.JFrame {

    public JTextField txBuscarArticulo= null;
    public JPanel formulario = null;
    
    /**
     * Creates new form VistaConsultarArticulo
     */
    public VistaDevolucionArticulos() {
        initComponents();
    }
    
    public VistaDevolucionArticulos(JTextField txBuscar, JPanel formulario) {
        initComponents();
        this.txBuscarArticulo= txBuscar;
        this.formulario = formulario;
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
        txBusqueda = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDevolucionArticulos = new javax.swing.JTable();
        btRealizarVenta = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Devolucion Articulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 8, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Numero de Venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        txBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        getContentPane().add(txBusqueda, gridBagConstraints);

        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386942888_search.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        getContentPane().add(btBuscar, gridBagConstraints);

        tablaDevolucionArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Articulo", "Descripcion", "Cantidad", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDevolucionArticulos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 437;
        gridBagConstraints.ipady = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 20, 0, 16);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        btRealizarVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRealizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386943729_edit-clear.png"))); // NOI18N
        btRealizarVenta.setText("Realizar Devolucion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 58, 13, 0);
        getContentPane().add(btRealizarVenta, gridBagConstraints);

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(btCancelar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked

        if(txBusqueda.getText().compareTo("")==0){

        }

    }//GEN-LAST:event_btBuscarMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
      
        //String donde almacenar el texto a buscar y variables aux
        Long idVenta = null;
        String numeroVenta = txBusqueda.getText();
        
        
        //Validaciones de caja texto y de la venta exista
        if(numeroVenta.length()<=0){
             JOptionPane.showMessageDialog(this,"Hubo un error en la operacion");
        }
        
        
         try{
           idVenta = Long.parseLong(numeroVenta); 
           
    }catch(NumberFormatException e)
        {
            //errorLog+="- El codigo de articulo tiene un formato incorrecto \n";
        }
        
         
         if(idVenta == null){
              JOptionPane.showMessageDialog(this,"El numero de venta es erroneo, solo se permiten numeros");
             return;
         }else
             if(idVenta<0 || numeroVenta.contains("+") || numeroVenta.contains("-")){
            //errorLog += "- Codigo de Articulo no es valido, solo son permitidos numeros \n";
                 JOptionPane.showMessageDialog(this,"El numero de venta es erroneo, solo se permiten numeros");
                 return;
        }
         
        //Iniciamos controlador
        ControlArticulo ctrArticulo = new ControlArticulo();
        //Iniciamos objectos donde guardaremos los resultados de busqueda
        Object[] articulos = null;
        
        //Iniciamos objetos clase
        Venta ventaBuscar = new Venta(true);
        
        
       // this.textoBusqueda = descripcion;
        
        //Buscamos primero venta
        ventaBuscar.setIdVenta(idVenta);
        
        //Buscamos articulos venta
       articulos = ctrArticulo.buscarArticulo(descripcion);
        
        //Long donde almacenamos el codigo de articulo
        
            
        
        if(articulos.length<=0)
            JOptionPane.showMessageDialog(this,"no se encontro articulo");
        else
        {

            //llenarTabla(articulos);
            DefaultTableModel datos = (DefaultTableModel) tablaDevolucionArticulos.getModel();
            datos.setRowCount(0);
            Venta thisVenta = ((VentabuscarArticulos);
          /*  for(Object thisArticulo: articulos){
                ctrArticulo.buscarPorCodigoArticulo(((Articulo)thisArticulo).getCodigoArticulo());
                datos.addRow(new Object[] {
                    ((Articulo)thisArticulo).getCodigoArticulo(),
                    ((Articulo)thisArticulo).getDescripcion(),
                    ((Venta)thisArticulo).getCantidad(),
                    ((Venta)thisArticulo).getSubtotal()});
            }*/

            
        }
    }//GEN-LAST:event_btBuscarActionPerformed
/*
    private void llenarTabla(Object[] articulos) {
        DefaultTableModel datos = (DefaultTableModel) tablaDevolucionArticulos.getModel();
        datos.setRowCount(0);
         
        for(Object thisArticulo: articulos)
          {
          datos.addRow(new Object[] {
          ((Articulo)thisArticulo).getCodigoArticulo(),
          ((Articulo)thisArticulo).getDescripcion(),
          ((Venta)thisArticulo).getCantidad(),
          ((Venta)thisArticulo).getSubtotal()});
          }
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tablaDevolucionArticulos.getModel());
          
        tablaDevolucionArticulos.setRowSorter(sorter);
    }*/
    
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaDevolucionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDevolucionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDevolucionArticulos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btRealizarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDevolucionArticulos;
    private javax.swing.JTextField txBusqueda;
    // End of variables declaration//GEN-END:variables

}