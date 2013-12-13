/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package articulo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import usuario.ControlUsuario;

/**
 *
 * @author Eddie
 */
public class VistaCompraArticulos extends javax.swing.JPanel {
    private Long idArticulo = null;
    private String textoBusqueda;
    private Long codigoArticulo;

    /**
     * Creates new form VistaCompraArticulos
     */
    public VistaCompraArticulos() {
        initComponents();
    }
    
    public VistaCompraArticulos(Long codigoArticulo, String textoBusqueda)
    {
        initComponents();
        
        this.textoBusqueda = textoBusqueda;
        this.codigoArticulo = codigoArticulo;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        dateFecha.setDateFormat(formatoFecha);
        //dateFecha.setDateFormat(new DateFormat());
        //Creamos variable para guardar el articulo
        Articulo articulo = null;
        //Creamos controlador articulo
        ControlArticulo ctrArticulo = new ControlArticulo();
        
       articulo = ctrArticulo.buscarUnoPorCodigoArticulo(codigoArticulo);
        
       if(articulo==null)
           JOptionPane.showMessageDialog(this,"Articulo invalido");
       else
       {
           this.idArticulo = articulo.getIdArticulo();
           lbCodigoArticulo.setText(articulo.getCodigoArticulo().toString());
           lbDescripcion.setText(articulo.getDescripcion());
           lbCantidad.setText(articulo.getCantidadExistencia().toString());
           lbPrecioCompraActual.setText(articulo.getPrecioCompra().toString());
           lbPrecioVentaActual.setText(articulo.getPrecioVenta().toString());
           
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

        jLabel1 = new javax.swing.JLabel();
        btAceptar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbCodigoArticulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbCantidad = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbPrecioCompraActual = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbPrecioVentaActual = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txPrecioCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txPrecioVenta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dateFecha = new datechooser.beans.DateChooserCombo();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Compra De Articulos");
        add(jLabel1);
        jLabel1.setBounds(2, 0, 730, 44);

        btAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/aceptar1.png"))); // NOI18N
        btAceptar.setText("Aceptar");
        btAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                realizarCompra(evt);
            }
        });
        add(btAceptar);
        btAceptar.setBounds(0, 384, 363, 43);

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarCompra(evt);
            }
        });
        add(btCancelar);
        btCancelar.setBounds(363, 384, 360, 43);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "Datos Articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Codigo Articulo:");

        lbCodigoArticulo.setBackground(new java.awt.Color(204, 204, 204));
        lbCodigoArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCodigoArticulo.setForeground(new java.awt.Color(0, 0, 255));
        lbCodigoArticulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion:");

        lbDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        lbDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbDescripcion.setForeground(new java.awt.Color(0, 0, 255));
        lbDescripcion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad en Existencia:");

        lbCantidad.setBackground(new java.awt.Color(204, 204, 204));
        lbCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCantidad.setForeground(new java.awt.Color(0, 0, 255));
        lbCantidad.setText(".");
        lbCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Precio Compra Actual:");

        lbPrecioCompraActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPrecioCompraActual.setForeground(new java.awt.Color(0, 0, 255));
        lbPrecioCompraActual.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Precio Venta Actual:");

        lbPrecioVentaActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPrecioVentaActual.setForeground(new java.awt.Color(0, 0, 255));
        lbPrecioVentaActual.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecioCompraActual, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(lbCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(lbPrecioVentaActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbPrecioVentaActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecioCompraActual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(0, 47, 720, 175);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 153), null), "Datos de la compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Precio Compra:");

        txPrecioCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPrecioCompraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Precio Venta:");

        txPrecioVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad a Comprar:");

        txCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        dateFecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateFecha.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
    dateFecha.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 11));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txPrecioCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txCantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addComponent(txPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(43, 43, 43))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(txCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))))
    );

    add(jPanel1);
    jPanel1.setBounds(0, 222, 720, 161);
    }// </editor-fold>//GEN-END:initComponents

    private void txPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPrecioCompraActionPerformed

    private void realizarCompra(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realizarCompra
        // TODO add your handling code here:
        String fecha = dateFecha.getSelectedDate().get(Calendar.YEAR)+"-"+(dateFecha.getSelectedDate().get(Calendar.MONTH)+1)+"-"+dateFecha.getSelectedDate().get(Calendar.DAY_OF_MONTH);
        //JOptionPane.showMessageDialog(this, fecha);
        
        String errorString = "";
        
       ControlArticulo ctrArticulos = new ControlArticulo();
       
       String errors = "";
        
      // ControlUsuario ctrUsuario = new ControlUsuario();
       
    // Long idUsuario = ctrUsuario.obtenerUsuarioActual(this);
       
      // Boolean autorizado = ctrUsuario.autorizarOperacion(idUsuario);
       
      // if(!autorizado)
       //    errors += "No estas autorizado";
    
      
    
       errors += ctrArticulos.validaDatosCompraArticulo(txPrecioCompra.getText(), txPrecioVenta.getText(),txCantidad.getText(),fecha );
    
       
       if(errors.length()>0)
       { JOptionPane.showMessageDialog(this,errors);
        //barraEstado.setText("Alta Articulos: En Espera");
       }
       else
       {
        Integer status = ctrArticulos.realizarCompraArticulo(idArticulo.toString(), txPrecioCompra.getText(), txPrecioVenta.getText(),txCantidad.getText(), fecha  );
    
           if(status==1)
           {JOptionPane.showMessageDialog(this,"Compra Exitosa");
           //barraEstado.setText("Alta Articulos: Completado");
           
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
               JOptionPane.showMessageDialog(this,"Hubo un error en la operacion");
               //barraEstado.setText("Alta Articulos: En Espera");
           }
           
       }
        
        
    }//GEN-LAST:event_realizarCompra

    private void cancelarCompra(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarCompra
        // TODO add your handling code here:
        
        VistaConsultarArticulosGeneral vista = new VistaConsultarArticulosGeneral(textoBusqueda);
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.setLayout(new java.awt.BorderLayout());          
           this.add(vista);
           vista.show();
           this.revalidate();
           this.repaint();
        
    }//GEN-LAST:event_cancelarCompra

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private datechooser.beans.DateChooserCombo dateFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCodigoArticulo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbPrecioCompraActual;
    private javax.swing.JLabel lbPrecioVentaActual;
    private javax.swing.JTextField txCantidad;
    private javax.swing.JTextField txPrecioCompra;
    private javax.swing.JTextField txPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
