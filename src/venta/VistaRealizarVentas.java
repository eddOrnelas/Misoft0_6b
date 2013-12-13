/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

import articulo.Articulo;
import articulo.ControlArticulo;
import articulo.HistorialAlmacen;
import java.awt.event.KeyEvent;
import java.io.Console;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import misoft.VistaVentanaPrincipal;

/**
 *
 * @author Eddie
 */
public class VistaRealizarVentas extends javax.swing.JPanel {

    public ArrayList carrito;
    
    
    /**
     * Creates new form RealizarVentas
     */
    public VistaRealizarVentas() {
        initComponents();
        
        carrito = new ArrayList();
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
        txBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCarrito = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        RealizarCobro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbSubTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbIva = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Realizar Venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.01;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Codigo Articulo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        gridBagConstraints.insets = new java.awt.Insets(0, 21, 0, 0);
        add(jLabel2, gridBagConstraints);

        txBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txBuscarActionPerformed(evt);
            }
        });
        txBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txBuscarKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(txBuscar, gridBagConstraints);

        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386944512_plus.png"))); // NOI18N
        btBuscar.setText("Agregar [Enter]");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarArticulo(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        add(btBuscar, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386942888_search.png"))); // NOI18N
        jButton2.setText("Consultar Articulo [F2]");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.01;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 0);
        add(jButton2, gridBagConstraints);

        tbCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Articulo", "Descripcion", "Cantidad", "Precio Unitario", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
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
        tbCarrito.getTableHeader().setReorderingAllowed(false);
        tbCarrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbCarritoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbCarrito);
        tbCarrito.getColumnModel().getColumn(0).setResizable(false);
        tbCarrito.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbCarrito.getColumnModel().getColumn(1).setResizable(false);
        tbCarrito.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbCarrito.getColumnModel().getColumn(2).setResizable(false);
        tbCarrito.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbCarrito.getColumnModel().getColumn(3).setResizable(false);
        tbCarrito.getColumnModel().getColumn(3).setPreferredWidth(20);
        tbCarrito.getColumnModel().getColumn(4).setResizable(false);
        tbCarrito.getColumnModel().getColumn(4).setPreferredWidth(20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 19, 0, 0);
        add(jScrollPane1, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        jButton3.setText("Cancelar Venta [F10]");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.weighty = 0.01;
        add(jButton3, gridBagConstraints);

        RealizarCobro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RealizarCobro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386944849_Business.png"))); // NOI18N
        RealizarCobro.setText("Realizar Cobro [F8]");
        RealizarCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCobroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.weighty = 0.01;
        add(RealizarCobro, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Sub Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel1.add(jLabel3, gridBagConstraints);

        lbSubTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSubTotal.setText("$ 0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel1.add(lbSubTotal, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("IVA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel1.add(jLabel5, gridBagConstraints);

        lbIva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbIva.setText("$ 0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel1.add(lbIva, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel1.add(jLabel7, gridBagConstraints);

        lbTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTotal.setText("$ 0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(13, 13, 13, 13);
        jPanel1.add(lbTotal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel1, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NuevasImagenes/1386944250_pencil_add.png"))); // NOI18N
        jButton1.setText("Agregar Articulos [F5]");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAgregarArticulos(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        add(jButton1, gridBagConstraints);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        jButton5.setText("Cancelar Articulos [C]");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.weighty = 0.01;
        add(jButton5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarArticulo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarArticulo

        String codigoArticuloTxt = this.txBuscar.getText();
        Long codigoArticuloLong = null;
        
        if(codigoArticuloTxt.trim().compareTo("")!=0)
        try{
            
            codigoArticuloLong =  Long.parseLong(codigoArticuloTxt);
            
        }catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Codigo Articulo Invalido");
            
        }
        else
             JOptionPane.showMessageDialog(this, "Codigo Articulo Vacio");
            
        Articulo articulo = null;
        if(codigoArticuloLong != null){
           
          ControlArticulo ctrArticulos = new ControlArticulo();
          articulo = ctrArticulos.buscarUnoPorCodigoArticulo(codigoArticuloLong);
          
          if(articulo!=null){
          agregarArticuloCarrito(articulo, 1);
          
          }
          else{
              JOptionPane.showMessageDialog(this, "No existe articulo especificado");
          }
          
        }
        txBuscar.setText("");
        txBuscar.requestFocus();
         calcularCosto();
    }//GEN-LAST:event_agregarArticulo

    
    public void agregarArticulos(Integer cantidad){
        
        String codigoArticuloTxt = this.txBuscar.getText();
        Long codigoArticuloLong = null;
        
        if(codigoArticuloTxt.trim().compareTo("")!=0)
        try{
            
            codigoArticuloLong =  Long.parseLong(codigoArticuloTxt);
            
        }catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(this, "Codigo Articulo Invalido");
            
        }
        else
             JOptionPane.showMessageDialog(this, "Codigo Articulo Vacio");
            
        Articulo articulo = null;
        if(codigoArticuloLong != null){
           
          ControlArticulo ctrArticulos = new ControlArticulo();
          articulo = ctrArticulos.buscarUnoPorCodigoArticulo(codigoArticuloLong);
          
          if(articulo!=null){
          agregarArticuloCarrito(articulo, cantidad);
          
          }
          else{
              JOptionPane.showMessageDialog(this, "No existe articulo especificado");
          }
          
        }
        txBuscar.setText("");
        txBuscar.requestFocus();
        calcularCosto();
        
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Object opciones[] = { "SI", "NO" };
         Integer seleccion = JOptionPane.showOptionDialog(this, "Deseas cancelar la venta?", "Atencion!",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
            
            if(seleccion== JOptionPane.YES_OPTION)//Si seleccionamos que Si
            {
                carrito.clear();
                calcularCosto();
                rellenartabla();
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txBuscarKeyPressed
        // TODO add your handling code here:
        
        int key=evt.getKeyCode();

        
        if(key==KeyEvent.VK_F2)
        { 
          // agregarArticulo(null);
           VistaConsultarArticulo consultarArticulo = new VistaConsultarArticulo(txBuscar, this);
            consultarArticulo.show();
        }
        else
            if(evt.getSource()==txBuscar)
            {
                if(key==KeyEvent.VK_ENTER)
                { 
                   agregarArticulo(null);
                }else
                    if(key==KeyEvent.VK_F5)
                {
                   VistaAgregarArticulos agregarArticulos = new VistaAgregarArticulos(this);
                     agregarArticulos.show();
                }
                    else
                        if(key==KeyEvent.VK_F8){
                            RealizarCobroActionPerformed(null);
                    }
            }
        
    }//GEN-LAST:event_txBuscarKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        VistaConsultarArticulo consultarArticulo = new VistaConsultarArticulo(txBuscar,this);
        consultarArticulo.show();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txBuscarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
         int key=evt.getKeyCode();

        if(key==KeyEvent.VK_F2)
        { 
           agregarArticulo(null);
           VistaConsultarArticulo consultarArticulo = new VistaConsultarArticulo(txBuscar, this);
        consultarArticulo.show();
        }
        
        

    }//GEN-LAST:event_formKeyPressed

    private void RealizarCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCobroActionPerformed
        // TODO add your handling code here:
        
        if(carrito.size()>0){
      VistaRealizarCobro vista = new VistaRealizarCobro(carrito,this);
      vista.setEnabled(true);
      vista.setVisible(true);
        }else
            JOptionPane.showMessageDialog(this, "No cuentas con articulos en la lista");
          
        
    }//GEN-LAST:event_RealizarCobroActionPerformed

    private void VerAgregarArticulos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAgregarArticulos
        // TODO add your handling code here:
        VistaAgregarArticulos agregarArticulos = new VistaAgregarArticulos(this);
        agregarArticulos.show();
    }//GEN-LAST:event_VerAgregarArticulos

    private void tbCarritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbCarritoKeyPressed
        // TODO add your handling code here:
        
         int key=evt.getKeyCode();

        
        if(key==KeyEvent.VK_DELETE)
        {
          //Obtenemos la fila seleccionada
       int selection= tbCarrito.getSelectedRow();
        
       Long codigoArticulo = null;
        try{
        codigoArticulo = (Long)tbCarrito.getValueAt(selection, 0);
        }catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            
        }
        
        
        if(codigoArticulo!=null){
            Object opciones[] = { "SI", "NO" };
                 
            Integer seleccion = JOptionPane.showOptionDialog(this, "Desceas cancelar articulo?", "Atencion!",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
            
            if(seleccion== JOptionPane.YES_OPTION)//Si seleccionamos que Si
            {
                cancelarArticulo(codigoArticulo);
                txBuscar.requestFocus();
            }
        }else{
             JOptionPane.showMessageDialog(this, "Codigo Articulo Invalido");
            txBuscar.requestFocus();
        }
        
        
        
        }else
            if(key==KeyEvent.VK_ESCAPE){
                txBuscar.requestFocus();
            }
            else
                if(key==KeyEvent.VK_TAB){
                //    evt.
                }
        
        
       
        
    }//GEN-LAST:event_tbCarritoKeyPressed

    public void agregarArticuloCarrito(Articulo articulo, Integer cantidad){
        
            int cantidad_articulos =  carrito.size();
            //Bandera de repetido encontrado
            Boolean noRepetido = true;
        //Buscar Anteriormente Agregados y cotejar la cantidad en almacen con los agregados 
        for(int x=0; x<cantidad_articulos; x++)
          {
              
             Object articuloTmp = carrito.get(x);
             Object[] thisArticulo = ((Object[]) articuloTmp);
             
             
             
              
             if(((Articulo)thisArticulo[0]).getCodigoArticulo().intValue() == articulo.getCodigoArticulo().intValue())
             {   noRepetido = false;
                 System.out.println("Coincide");
                 
                 if((((Integer)thisArticulo[1]).intValue()+cantidad)>((Articulo)thisArticulo[0]).getCantidadExistencia())
                 {
                     Object opciones[] = { "SI", "NO" };
                 
            Integer seleccion = JOptionPane.showOptionDialog(this, "La cantidad a comprar excede de la existente en almacen,\n Continuar de todos modos?", "Atencion!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
            
            if(seleccion== JOptionPane.YES_OPTION)//Si seleccionamos que Si
            {
                 Object[] articuloNuevo = new Object[2];
                 articuloNuevo[0] = articulo;
                 articuloNuevo[1] = ((Integer)thisArticulo[1]).intValue()+cantidad;
                 
                 carrito.set(x, articuloNuevo);
                 rellenartabla();
                 
            }
            
                 }
                 else{
                      Object[] articuloNuevo = new Object[2];
                 articuloNuevo[0] = articulo;
                 articuloNuevo[1] = ((Integer)thisArticulo[1]).intValue()+cantidad;
                 
                 carrito.set(x, articuloNuevo);
                 rellenartabla();
                 noRepetido = false;
                 }
             }
          
          
          }
        
        
        //Si no esta repetido pero puede y exceda la cantidad en existencia
        if(noRepetido)
        if(cantidad>(articulo.getCantidadExistencia()))
           {
                     Object opciones[] = { "SI", "NO" };
                 
            Integer seleccion = JOptionPane.showOptionDialog(this, "La cantidad a comprar excede de la existente en almacen,\n Continuar de todos modos?", "Atencion!",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);
            
            if(seleccion== JOptionPane.YES_OPTION)//Si seleccionamos que Si
            {
                 Object[] articuloNuevo = new Object[2];
                    articuloNuevo[0] = articulo;
                    articuloNuevo[1] = cantidad;

                    carrito.add(articuloNuevo);

                    rellenartabla();
                 
            }
            
                 }
        else{
        Object[] articuloNuevo = new Object[2];
        articuloNuevo[0] = articulo;
        articuloNuevo[1] = cantidad;
        
        carrito.add(articuloNuevo);
        
        rellenartabla();
        }
        
    }
    
    public void calcularCosto(){
        
        Integer cantidad_articulos = carrito.size();
        Float subTotal = 0.0f;
        Float subSubTotal = 0.0f;
        Float iva = 0.0f;
        
         for(int x=0; x<cantidad_articulos; x++)
          {
              
             Object articuloTmp = carrito.get(x);
             Object[] thisArticulo = ((Object[]) articuloTmp); 
              
          
          subTotal += ((Articulo)thisArticulo[0]).getPrecioVenta()*((Integer)thisArticulo[1]).intValue();
          
          
          
          
          }
         
         subSubTotal = (subTotal*100)/111;
         iva =subTotal-subSubTotal;
         
         DecimalFormat decimal = new DecimalFormat("#.##");
         
        lbSubTotal.setText("$ "+decimal.format(subSubTotal));
        lbIva.setText("$ "+decimal.format(iva));
        lbTotal.setText("$ "+decimal.format(subTotal));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RealizarCobro;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIva;
    private javax.swing.JLabel lbSubTotal;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tbCarrito;
    public javax.swing.JTextField txBuscar;
    // End of variables declaration//GEN-END:variables

    public void rellenartabla() {
        
         DefaultTableModel datos = (DefaultTableModel) tbCarrito.getModel();
            datos.setRowCount(0);
         
            int cantidad_articulos =  carrito.size();
            
            
        for(int x=0; x<cantidad_articulos; x++)
          {
              
             Object articuloTmp = carrito.get(x);
             Object[] thisArticulo = ((Object[]) articuloTmp); 
              
          datos.addRow(new Object[] {
          ((Articulo)thisArticulo[0]).getCodigoArticulo(),
          ((Articulo)thisArticulo[0]).getDescripcion(),
          ((Integer)thisArticulo[1]).intValue(),
         ((Articulo)thisArticulo[0]).getPrecioVenta(),
          ((Articulo)thisArticulo[0]).getPrecioVenta()});
          }
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbCarrito.getModel());
          
        tbCarrito.setRowSorter(sorter);
        
        
       }

    public void cancelarArticulo(Long codigoArticulo) {
    
    int cantidad_articulos =  carrito.size();
            
            
        for(int x=0; x<cantidad_articulos; x++)
          {
              
             Object articuloTmp = carrito.get(x);
             Object[] thisArticulo = ((Object[]) articuloTmp); 
              
        
          if(((Articulo)thisArticulo[0]).getCodigoArticulo() == codigoArticulo)
          {
              carrito.remove(x);

          }

          }
        rellenartabla();
        calcularCosto();
     }
    
}