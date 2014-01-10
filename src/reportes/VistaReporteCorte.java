/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import articulo.Articulo;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import venta.Venta;

/**
 *
 * @author Administrator
 */
public class VistaReporteCorte extends javax.swing.JPanel {

    /**
     * Creates new form VistaReporteCorte
     */
    int tipoCorte = 0;
    public VistaReporteCorte() {
        initComponents();
        //Fecha no sea mayor a la actual.
        Calendar cal = new GregorianCalendar();
        
        int month = cal.get(Calendar.MONTH)+1;
        int year = cal.get(Calendar.YEAR)-1900;
        int day = cal.get(Calendar.DAY_OF_MONTH)-31;
                
        txFechaFinal.setDateFormatString("yyyy-MM-dd");
        txFechaFinal.setMaxSelectableDate(new Date(year,month,day));
        
        txFechaInicio.setDateFormatString("yyyy-MM-dd");
        txFechaInicio.setMaxSelectableDate(new Date(year,month,day));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRangos = new javax.swing.JPanel();
        txFecIni = new javax.swing.JLabel();
        txFechaInicio = new com.toedter.calendar.JDateChooser();
        btAceptarCC = new javax.swing.JToggleButton();
        btCancelarReporteC = new javax.swing.JButton();
        txFechaFinal = new com.toedter.calendar.JDateChooser();
        txFecTer = new javax.swing.JLabel();
        btExportarCorteCaja = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCorteCaja = new javax.swing.JTable();
        panelRangos1 = new javax.swing.JPanel();
        btExportarCorteDia = new javax.swing.JButton();
        btCorteDia = new javax.swing.JButton();
        txRango = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte Corte de Caja", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1200, 350));
        setMinimumSize(new java.awt.Dimension(1200, 350));
        setPreferredSize(new java.awt.Dimension(1200, 350));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panelRangos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Por Periodo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        panelRangos.setMaximumSize(new java.awt.Dimension(815, 70));
        panelRangos.setMinimumSize(new java.awt.Dimension(815, 70));
        panelRangos.setPreferredSize(new java.awt.Dimension(815, 70));

        txFecIni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txFecIni.setText("Fecha Inicio:");

        txFechaInicio.setDateFormatString("yyyy-MM-dd");
        txFechaInicio.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaInicio.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaInicio.setPreferredSize(new java.awt.Dimension(85, 25));

        btAceptarCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/aceptar1.png"))); // NOI18N
        btAceptarCC.setText("Aceptar");
        btAceptarCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarCCActionPerformed(evt);
            }
        });
        btAceptarCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btAceptarCCKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btAceptarCCKeyTyped(evt);
            }
        });

        btCancelarReporteC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/cancelar_1.jpg"))); // NOI18N
        btCancelarReporteC.setText("Cancelar");
        btCancelarReporteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarReporteCActionPerformed(evt);
            }
        });

        txFechaFinal.setDateFormatString("yyyy-MM-dd");
        txFechaFinal.setMaximumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setMinimumSize(new java.awt.Dimension(85, 25));
        txFechaFinal.setPreferredSize(new java.awt.Dimension(85, 25));

        txFecTer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txFecTer.setText("Fecha Termino:");

        btExportarCorteCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        btExportarCorteCaja.setText("Exportar");
        btExportarCorteCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarCorteCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRangosLayout = new javax.swing.GroupLayout(panelRangos);
        panelRangos.setLayout(panelRangosLayout);
        panelRangosLayout.setHorizontalGroup(
            panelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRangosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txFecIni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txFecTer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btAceptarCC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelarReporteC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExportarCorteCaja)
                .addContainerGap())
        );
        panelRangosLayout.setVerticalGroup(
            panelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRangosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txFecTer)
                    .addComponent(txFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txFecIni)
                    .addGroup(panelRangosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAceptarCC)
                        .addComponent(btCancelarReporteC)
                        .addComponent(btExportarCorteCaja)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(1150, 210));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1150, 210));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1150, 210));

        tbCorteCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad de Ventas", "SubTotal", "IVA", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCorteCaja.setMaximumSize(new java.awt.Dimension(1150, 150));
        tbCorteCaja.setMinimumSize(new java.awt.Dimension(1150, 150));
        tbCorteCaja.setPreferredSize(new java.awt.Dimension(1150, 150));
        jScrollPane1.setViewportView(tbCorteCaja);

        panelRangos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Corte del Día", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        panelRangos1.setMaximumSize(new java.awt.Dimension(300, 70));
        panelRangos1.setMinimumSize(new java.awt.Dimension(300, 70));
        panelRangos1.setPreferredSize(new java.awt.Dimension(300, 70));

        btExportarCorteDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N
        btExportarCorteDia.setText("Exportar");
        btExportarCorteDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportarCorteDiaActionPerformed(evt);
            }
        });

        btCorteDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img20x20/corte.png"))); // NOI18N
        btCorteDia.setText("Corte del Día");
        btCorteDia.setMaximumSize(new java.awt.Dimension(127, 29));
        btCorteDia.setMinimumSize(new java.awt.Dimension(127, 29));
        btCorteDia.setPreferredSize(new java.awt.Dimension(127, 29));
        btCorteDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorteDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRangos1Layout = new javax.swing.GroupLayout(panelRangos1);
        panelRangos1.setLayout(panelRangos1Layout);
        panelRangos1Layout.setHorizontalGroup(
            panelRangos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRangos1Layout.createSequentialGroup()
                .addComponent(btCorteDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btExportarCorteDia))
        );
        panelRangos1Layout.setVerticalGroup(
            panelRangos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRangos1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRangos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCorteDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExportarCorteDia))
                .addContainerGap())
        );

        txRango.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txRango.setMaximumSize(new java.awt.Dimension(300, 50));
        txRango.setMinimumSize(new java.awt.Dimension(300, 50));
        txRango.setPreferredSize(new java.awt.Dimension(300, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRangos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRangos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txRango, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRangos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRangos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(txRango, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btExportarCorteCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarCorteCajaActionPerformed
        
        limpiarTabla();
        // Ejecuto corte de caja
        tipoCorte=1;
        exportarCorteRangos();
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btExportarCorteCajaActionPerformed
    private void exportarCorteRangos(){
    ModeloCorte reporte = null;
        //Creamos controlador corte
        ControlReporte ctrCorte = new ControlReporte();

        //Le damos formato a la fecha para que mySQL la reconozca
        txFechaInicio.setDateFormatString("yyy-MM-dd");
        txFechaFinal.setDateFormatString("yyy-MM-dd");
        int band = 0;
        int band2 = 0;
        int band3 = 0;
        int band4 =0;

        String fecha1 = "";
        String fecha2 = "";

        //Obtenemos los valores de la texto de la fecha del calendario
        if (txFechaInicio.getCalendar() != null) {
            fecha1 = txFechaInicio.getCalendar().get(Calendar.YEAR) + "-" + (txFechaInicio.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            band=1;
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio");
            band=0;
        }

        if (txFechaFinal.getCalendar() != null) {
            fecha2 = txFechaFinal.getCalendar().get(Calendar.YEAR) + "-" + (txFechaFinal.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            band2=2;
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Termino");
            band =0;
        }

        //Validar fecha inicio <= fecha termino
        if (txFechaFinal.getCalendar() != null && txFechaInicio.getCalendar() != null) {
            int a1 = txFechaInicio.getCalendar().get(Calendar.YEAR);
            int a2 = txFechaFinal.getCalendar().get(Calendar.YEAR);
            
            int mes1 = txFechaInicio.getCalendar().get(Calendar.MONTH);
            int mes2 = txFechaFinal.getCalendar().get(Calendar.MONTH);
            
            int dia1 = txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            int dia2 = txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            
            
            if(a1>a2){
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
            band4 = 4;
            }
            else
            if(a1==a2){
                if(mes1>mes2){
                JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
                band4 = 4;
                }else{
                    if(mes1==mes2){
                        if(dia1>dia2){
                            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
                            band4 = 4;
                        }
                    }
                
                }
            }else{
            band4=0;
            }
        }
        if(band==1&&band2==2&&band4==0){
        reporte = ctrCorte.realizarReporteCorte(fecha1, fecha2,tipoCorte);

        if (reporte == null) {
            JOptionPane.showMessageDialog(this, " No existen registros de corte de caja para ese rango de fechas.");

        }
        }
    
    }
    private void exportarCorteDia(){
        
        ModeloCorte reporte = null;
        //Creamos controlador corte
        ControlReporte ctrCorte = new ControlReporte();

       
        
        Calendar cal = new GregorianCalendar();
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            String fechaDia = (year + "-" + (month+1) + "-" + day); 
        String fecha1 = fechaDia;
        String fecha2 = fechaDia;

        
        reporte = ctrCorte.realizarReporteCorte(fecha1, fecha2,tipoCorte);

        if (reporte == null) {
            JOptionPane.showMessageDialog(this, " No existen registros de corte de caja para el día de hoy.");

        
        }
    }
    private void btCancelarReporteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarReporteCActionPerformed
        // Boton Cancelar Rep Corte Caja
           
           this.removeAll();
           //this.setBorder(javax.swing.BorderFactory.createEtchedBorder());
           this.revalidate();
           this.repaint();
           this.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarReporteCActionPerformed

    private void btAceptarCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarCCActionPerformed
        // TODO add your handling code here:
        //Aceptar Repote Corte de Caja
        tipoCorte=1;
        limpiarTabla();
       //Iniciamos objetos necesarios para la busqueda.
        Venta mVentas = new Venta(true);
        Object[] ventas = null;
        
        
        txFechaInicio.setDateFormatString("yyy-MM-dd");
        txFechaFinal.setDateFormatString("yyy-MM-dd");
        
        
        String fecha1 = "";
        String fecha2 = "";
        int band=0,band2=0,band3;
        //Obtenemos los valores de la texto de la fecha del calendario
        if (txFechaInicio.getCalendar() != null) {
            fecha1 = txFechaInicio.getCalendar().get(Calendar.YEAR) + "-" + (txFechaInicio.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            band=1;
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio");
            band=0;
        }

        if (txFechaFinal.getCalendar() != null) {
            fecha2 = txFechaFinal.getCalendar().get(Calendar.YEAR) + "-" + (txFechaFinal.getCalendar().get(Calendar.MONTH) + 1) + "-" + txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            band2=2;
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Termino");
            band =0;
        }
        //Validar campos
        band3=validaciones();
        //Parametros de busqueda.
        if(band==1&&band2==2&&band3==0){
        Object[][] opciones = new Object[][]{{"fecha", ">=", fecha1+" 00:00:00"}, {"fecha", "<=", fecha2+" 23:59:00"}};

        ventas = mVentas.buscarBD("all", opciones);
        if(ventas.length>0){
            
        DecimalFormat decimal = new DecimalFormat("#.##");
        
     
        Integer tmpNoVentas = 0;
        Float tmpVentas = 0F;
        Float tmpSubtotal = 0F;
        Float tmpIVA = 0F;
        Float tmpTotal = 0F;
        int x=0;
        DefaultTableModel datos = (DefaultTableModel) tbCorteCaja.getModel();
        datos.setRowCount(0);
        
        txRango.setText("Corte del día "+fecha1+" al "+fecha2);
     
       
            for (x = 0; x <ventas.length; x++) {

                
                tmpVentas = tmpVentas +((Venta) ventas[x]).getTotal();
                
                tmpSubtotal += ((((Venta)ventas[x]).getTotal())*100)/111;
               
                tmpIVA +=((((Venta)ventas[x]).getTotal())*11)/111;
               
                tmpNoVentas++;
               
                
               }
            
        
         
            
            
          
          datos.addRow(new Object[] {
          tmpNoVentas, decimal.format(tmpSubtotal),decimal.format(tmpIVA),decimal.format(tmpSubtotal+tmpIVA)
          });
          
          
          
        
        
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbCorteCaja.getModel());
          
        tbCorteCaja.setRowSorter(sorter);
        }else{
        JOptionPane.showMessageDialog(this, " No existen registros de corte de caja para ese rango de fechas.");
        }
        }
    }//GEN-LAST:event_btAceptarCCActionPerformed

    private void btAceptarCCKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAceptarCCKeyPressed
        // TODO add your handling code here:
        
    
        int key=evt.getKeyCode();
   
        if(key==KeyEvent.VK_ENTER)
        { 
        
            btAceptarCCActionPerformed(null);
         
        }
    
    }//GEN-LAST:event_btAceptarCCKeyPressed

    private void btAceptarCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btAceptarCCKeyTyped
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        { 
           limpiarTabla();
           btAceptarCCActionPerformed(null);
        }
    }//GEN-LAST:event_btAceptarCCKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        { 
           limpiarTabla();
           btAceptarCCActionPerformed(null);
        }
    }//GEN-LAST:event_formKeyPressed

    private void btCorteDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorteDiaActionPerformed
        // TODO add your handling code here:
        //Reporte por Corte de día
        tipoCorte=2;
        Venta mVentas = new Venta(true);
        Object[] ventas = null;
        
            Calendar cal = new GregorianCalendar();
            int month = cal.get(Calendar.MONTH);
            int year = cal.get(Calendar.YEAR);
            int day = cal.get(Calendar.DAY_OF_MONTH);
            String fechaDia = (year + "-" + (month+1) + "-" + day); 
       
        Object[][] opciones = new Object[][]{{"fecha", ">=", fechaDia+" 00:00:00"}, {"fecha", "<=", fechaDia+" 23:59:00"}};

        ventas = mVentas.buscarBD("all", opciones);
        
        if(ventas.length>0){
            
        DecimalFormat decimal = new DecimalFormat("#.##");
        
     
        Integer tmpNoVentas = 0;
        Float tmpVentas = 0F;
        Float tmpSubtotal = 0F;
        Float tmpIVA = 0F;
        Float tmpTotal = 0F;
        int x=0;
        DefaultTableModel datos = (DefaultTableModel) tbCorteCaja.getModel();
        datos.setRowCount(0);
        
        txRango.setText("Corte del día "+fechaDia+".");
     
       
            for (x = 0; x <ventas.length; x++) {

                
                tmpVentas = tmpVentas +((Venta) ventas[x]).getTotal();
                
                tmpSubtotal += ((((Venta)ventas[x]).getTotal())*100)/111;
               
                tmpIVA +=((((Venta)ventas[x]).getTotal())*11)/111;
               
                tmpNoVentas++;
               
                
               }
            
        
         
            
            
          
          datos.addRow(new Object[] {
          tmpNoVentas, decimal.format(tmpSubtotal),decimal.format(tmpIVA),decimal.format(tmpSubtotal+tmpIVA)
          });
          RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbCorteCaja.getModel());
          
        tbCorteCaja.setRowSorter(sorter);
        }else{
        JOptionPane.showMessageDialog(this, " No existen registros para el día de hoy.");
        }
     
        
    }//GEN-LAST:event_btCorteDiaActionPerformed

    private void btExportarCorteDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportarCorteDiaActionPerformed
        // TODO add your handling code here:
        //Exportar a PDF corte del dia
        tipoCorte=2;
        exportarCorteDia();
        
    }//GEN-LAST:event_btExportarCorteDiaActionPerformed

    private int validaciones (){
        txFechaInicio.setDateFormatString("yyy-MM-dd");
        txFechaFinal.setDateFormatString("yyy-MM-dd");
      

        String fecha1 = "";
        String fecha2 = "";

        int band3=0,band4=0;

        //Validar fecha inicio <= fecha termino
        if (txFechaFinal.getCalendar() != null && txFechaInicio.getCalendar() != null) {
            int a1 = txFechaInicio.getCalendar().get(Calendar.YEAR);
            int a2 = txFechaFinal.getCalendar().get(Calendar.YEAR);
            
            int mes1 = txFechaInicio.getCalendar().get(Calendar.MONTH);
            int mes2 = txFechaFinal.getCalendar().get(Calendar.MONTH);
            
            int dia1 = txFechaInicio.getCalendar().get(Calendar.DAY_OF_MONTH);
            int dia2 = txFechaFinal.getCalendar().get(Calendar.DAY_OF_MONTH);
            
            
            if(a1>a2){
            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
            band3=3;
            }
            else
            if(a1==a2){
                if(mes1>mes2){
                JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
                band3=3;
                }else{
                    if(mes1==mes2){
                        if(dia1>dia2){
                            JOptionPane.showMessageDialog(this, "Ingrese Fecha Inicio menor o igual a Fecha Termino.");
                         band3=3;
                        }
                    }
                
                }
            }
      }
        
    return band3;
    }
    private void limpiarTabla(){
        DefaultTableModel datos = (DefaultTableModel) tbCorteCaja.getModel();
        datos.setRowCount(0);
        datos.addRow(new Object[] {
          "","","",""
          });
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tbCorteCaja.getModel());
          
        tbCorteCaja.setRowSorter(sorter);
        txRango.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAceptarCC;
    private javax.swing.JButton btCancelarReporteC;
    private javax.swing.JButton btCorteDia;
    private javax.swing.JButton btExportarCorteCaja;
    private javax.swing.JButton btExportarCorteDia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelRangos;
    private javax.swing.JPanel panelRangos1;
    private javax.swing.JTable tbCorteCaja;
    private javax.swing.JLabel txFecIni;
    private javax.swing.JLabel txFecTer;
    private com.toedter.calendar.JDateChooser txFechaFinal;
    private com.toedter.calendar.JDateChooser txFechaInicio;
    private javax.swing.JLabel txRango;
    // End of variables declaration//GEN-END:variables
}
