/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.Huesped;
import pfgranhotel.entidades.TipoDeHabitacion;

/**
 *
 * @author HP
 */
public class ReservaVista extends javax.swing.JInternalFrame {

    private TipoDeHabitacionData tpd;
    private ArrayList<TipoDeHabitacion> tha;

    ReservaData rdat = new ReservaData();
    HuespedData hdat = new HuespedData();
    HabitacionData habDat = new HabitacionData();
    private ArrayList<Habitacion> hab;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo1;
    private HabitacionData hd;
    //private TipoDeHabitacionData tpd;
    
    
    
    
    public ReservaVista() {
        modelo = new DefaultTableModel();
        modelo1 = new DefaultTableModel();
        tpd = new TipoDeHabitacionData();
        hd = new HabitacionData();
        tha = (ArrayList<TipoDeHabitacion>) tpd.listhabN();
        hab = (ArrayList<Habitacion>) hd.listarHabitaciones();
        initComponents();
        //diferenciaFechas();
        //cantPersonas();
        armarTitulos();
        armarTabla2();
        cargarTipoHabitaciones();
         limpiarCampos();
//         cargarHabitaciones();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateIn = new com.toedter.calendar.JDateChooser();
        jDateOut = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jCBMayores = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jCBMenores = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCBTHab = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jCBDNI = new javax.swing.JComboBox<>();
        jTFDNI = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListado = new javax.swing.JTable();
        jBAlta = new javax.swing.JButton();
        jBBaja = new javax.swing.JButton();
        jBModif = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jBCalcu = new javax.swing.JButton();
        jLCalcRes = new javax.swing.JLabel();
        jhabRes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBLimpiar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Reservas");

        jLabel1.setText("Check In");

        jLabel3.setText("Check Out");

        jDateIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateInMouseClicked(evt);
            }
        });

        jDateOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateOutMouseClicked(evt);
            }
        });

        jLabel4.setText("Mayores");

        jCBMayores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jCBMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMayoresActionPerformed(evt);
            }
        });

        jLabel5.setText("Menores");

        jCBMenores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jCBMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMenoresActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad de Personas");

        jCBTHab.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCBTHabPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCBTHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTHabActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de habitaciòn");

        jLabel9.setText("Reservado por: ");

        jLabel10.setText("Apellido");

        jLabel11.setText("Nombre");

        jCBDNI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doc tipo", "DNI", "PAS" }));
        jCBDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDNIActionPerformed(evt);
            }
        });

        jTFDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDNIActionPerformed(evt);
            }
        });

        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jTApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTApellidoActionPerformed(evt);
            }
        });

        jLabel13.setText("Habitaciòn");

        jLabel14.setText("Habitaciones Disponibles");

        jTListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTListado.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jTListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTListado);

        jBAlta.setText("Alta");
        jBAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAltaMouseClicked(evt);
            }
        });

        jBBaja.setText("Baja");
        jBBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBBajaMouseClicked(evt);
            }
        });

        jBModif.setText("Modificar");
        jBModif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBModifMouseClicked(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Total Estadìa ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Habitaciòn reservada");

        jBCalcu.setText("Calcular");
        jBCalcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcuActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLCalcRes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jhabRes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jCBMayores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel6))
                                        .addGap(160, 160, 160)
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBCalcu)
                                                .addGap(59, 59, 59)
                                                .addComponent(jBAlta)
                                                .addGap(60, 60, 60)
                                                .addComponent(jBBaja)
                                                .addGap(56, 56, 56)
                                                .addComponent(jBModif))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(373, 373, 373)
                                                .addComponent(jLabel17))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jCBMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel3)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(139, 139, 139)
                                                .addComponent(jCBTHab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10)
                                            .addComponent(jCBDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9)
                                            .addComponent(jTApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(jTFNombre)
                                            .addComponent(jTFDNI))
                                        .addGap(11, 11, 11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jBLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addComponent(jBSalir)
                                        .addGap(41, 41, 41))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(42, 42, 42))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jCBDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1)))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCBMayores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jCBMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jCBTHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLCalcRes, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jhabRes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlta)
                    .addComponent(jBBaja)
                    .addComponent(jBModif)
                    .addComponent(jBCalcu)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDateInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateInMouseClicked
        if (jDateIn != null) {
            ZoneId zoneIdDefault = null;
            ZonedDateTime in = jDateIn.getDate().toInstant().atZone(zoneIdDefault);

        }

    }//GEN-LAST:event_jDateInMouseClicked

    private void jDateOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateOutMouseClicked
        if (jDateOut != null) {
            ZoneId zoneIdDefault = null;
            ZonedDateTime out = jDateOut.getDate().toInstant().atZone(zoneIdDefault);

        }
    }//GEN-LAST:event_jDateOutMouseClicked

    private void jCBMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMayoresActionPerformed
        if (jCBMayores != null) {
            int may = (int) jCBMayores.getSelectedItem();
        }
    }//GEN-LAST:event_jCBMayoresActionPerformed

    private void jCBMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMenoresActionPerformed
        if (jCBMayores != null) {
            int men = (int) jCBMenores.getSelectedItem();
        }
    }//GEN-LAST:event_jCBMenoresActionPerformed

    private void jCBDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBDNIActionPerformed

    private void jCBTHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTHabActionPerformed
       borrarFilas1();
        TipoDeHabitacion tiphab= (TipoDeHabitacion)jCBTHab.getSelectedItem();
    List<Habitacion> lh = hd.lista(tiphab.getIdTipo());
    for (Habitacion ha: lh){  
            modelo1.addRow(new Object[] {ha.getIdHabitacion(),ha.isEstado()});
                    }
    }//GEN-LAST:event_jCBTHabActionPerformed

    private void jTListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTListadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTListadoMouseClicked

    private void jTApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTApellidoActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDNIActionPerformed

    private void jBAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAltaMouseClicked
        Huesped h = new Huesped(Integer.parseInt(jTFDNI.getText()), jTApellido.getText(), jTFNombre.getText());

        if (hdat.buscarHuesped(Integer.parseInt(jTFDNI.getText())) == null) {

            hdat.guardarHuesped(h);

            JOptionPane.showMessageDialog(null, "Reserva guardada");

        }
    }//GEN-LAST:event_jBAltaMouseClicked

    private void jBBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBBajaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBajaMouseClicked

    private void jBModifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBModifMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModifMouseClicked

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jBCalcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcuActionPerformed
        calcularEstadia();
    }//GEN-LAST:event_jBCalcuActionPerformed

    private void jCBTHabPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCBTHabPopupMenuWillBecomeInvisible
//     habporTipo();  
//   //Tipox();
//     borrarFilas();
//     borrarFilas1();
    }//GEN-LAST:event_jCBTHabPopupMenuWillBecomeInvisible

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBBaja;
    private javax.swing.JButton jBCalcu;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModif;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBDNI;
    private javax.swing.JComboBox<String> jCBMayores;
    private javax.swing.JComboBox<String> jCBMenores;
    private javax.swing.JComboBox<TipoDeHabitacion> jCBTHab;
    private javax.swing.JColorChooser jColorChooser1;
    private com.toedter.calendar.JDateChooser jDateIn;
    private com.toedter.calendar.JDateChooser jDateOut;
    private javax.swing.JLabel jLCalcRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTFDNI;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTable jTListado;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jhabRes;
    // End of variables declaration//GEN-END:variables

    private void calcularEstadia() {
        TipoDeHabitacion a = (TipoDeHabitacion) jCBTHab.getSelectedItem();
        tha = (ArrayList) tpd.obtenerHabi(a.getTipoDeHabitacion());
        for (TipoDeHabitacion tip : tha) {
            tip.getPrecio();
        }

        LocalDate in = null;
        LocalDate out = null;
        int may = (int) jCBMayores.getSelectedItem();
        int men = (int) jCBMenores.getSelectedItem();
        int difDias = (int) ChronoUnit.DAYS.between(out, in);
        int total = may + men;

        double estadia = a.getPrecio() * difDias * total;/// si no funciona poner jCBTHab.getSelectedItem();
        System.out.println(estadia);
    }

//public void cantPersonas(){
//    int may = 0;
//    int men = 0;
//    
// int total= may+men;
//    System.out.println("total"+total);
//}
///Calcular Estadìa
// public void calcularEstadia(){
// 
// }
    private void armarTitulos() {

        modelo.addColumn("Còdigo");
        //modelo.addColumn("Tipo");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Precio");
        jTable1.setModel(modelo);

    }
    // java.lang.NullPointerException

    private void armarTabla2() {
        ///seteamos cada columna para q aparezcan los sig titulos.
        modelo1.addColumn("Numero de habitacion");
        modelo1.addColumn("Status");
        //modelo1.addColumn("codigo");
        jTListado.setModel(modelo1);
    }

    public void habporTipo() {
        TipoDeHabitacion a =  (TipoDeHabitacion) jCBTHab.getSelectedItem();
        tha = (ArrayList) tpd.obtenerHabi(a.getTipoDeHabitacion());      
        for (TipoDeHabitacion tip : tha) {
            modelo.addRow(new Object[]{tip.getIdTipo(), tip.getCantPers(), tip.getPrecio()});
        }

    }

    private void borrarFilas() {
        int ind = modelo.getRowCount() - 1;
        for (int i = ind; i > -1; i--) {
            modelo.removeRow(i);
        }
    }
 private void borrarFilas1() {
        int ind = modelo1.getRowCount() - 1;
        for (int i = ind; i > -1; i--) {
            modelo1.removeRow(i);
        }
    }
//    public void TipoDeso() {
//
//        Habitacion a =  jRadioButton1.isSelected(true);
//        hab = (ArrayList) hd.listak(a.isEstado());
//        for (Habitacion h : hab) {
//            modelo1.addRow(new Object[]{h.getIdHabitacion(), h.isEstado(), h.getTipo()});
//            
//            
//        }
//
//    }
    
    private void cargarTipoHabitaciones() {

        for (TipoDeHabitacion tip : tha) {
           jCBTHab.addItem(tip);
        }

    }
   
   public void limpiarCampos(){
        jTApellido.setText("");
        jTFNombre.setText("");
        jTFDNI.setText("");
        
    } 
   
//    private void cargarHabitaciones() {
//
//        for (Habitacion tip1 : hab) {
//           jComboBox1.addItem(tip1);
//        }
//    }
//  public void Tipox() {
//
//        Habitacion a = (Habitacion) jCBTHab.getSelectedItem();
//        hab = (ArrayList) hd.obtenerhabiIdhabi(a.getIdHabitacion());
//        for (Habitacion h : hab) {
//            modelo1.addRow(new Object[]{h.getIdHabitacion(), h.isEstado(), h.getTipo()});
//            
//            System.out.println("hola");
//        }
//
//    }  
    
}
