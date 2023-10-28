/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pfgranhotel.accesoDatos.HabitacionData;
import pfgranhotel.accesoDatos.TipoDeHabitacionData;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.TipoDeHabitacion;

public class ABM_habitacion extends javax.swing.JInternalFrame {

    private HabitacionData hdata;
    private TipoDeHabitacion thab;
    private TipoDeHabitacionData thabdata;
    private ArrayList<Habitacion> h;
    private ArrayList<TipoDeHabitacion> tHab;

    public ABM_habitacion() {
        initComponents();
        hdata = new HabitacionData();
        thab = new TipoDeHabitacion();
        thabdata = new TipoDeHabitacionData();
        limpiar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbbuscar = new javax.swing.JButton();
        jtnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbCrear = new javax.swing.JButton();
        jrOcupada = new javax.swing.JRadioButton();
        jbmodificar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ABM HABITACIÓN");

        jLabel2.setText("Num habitacion");

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("tipo de habitacion");

        jbCrear.setText("CREAR");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jrOcupada.setText("activar ocupada");
        jrOcupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOcupadaActionPerformed(evt);
            }
        });

        jbmodificar.setText("MODIFICAR");
        jbmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmodificarActionPerformed(evt);
            }
        });

        jbeliminar.setText("ELIMINAR");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbsalir.setText("SALIR");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jblimpiar.setText("LIMPIAR");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbsalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(jbeliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbbuscar))
                            .addComponent(jrOcupada)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbbuscar)
                    .addComponent(jtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jrOcupada)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbmodificar)
                    .addComponent(jbeliminar)
                    .addComponent(jblimpiar))
                .addGap(39, 39, 39)
                .addComponent(jbsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmodificarActionPerformed
        // TODO add your handling code here:
        try {
            Habitacion h = hdata.BuscarHabitacion(Integer.parseInt(jtnum.getText()));
            if (h != null) {
                hdata.modificarHabitacion(h);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar numeros en los campos");
            jtnum.setText("");

        }
    }//GEN-LAST:event_jbmodificarActionPerformed

    //////***** ELIMINAR HABITACION *****\\\\\\                                                         REVISAR ELIMINAR
    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        ////      Habitacion elim = hdat.bajaHabitacion(Integer.parseInt(jtnum.getText()));


    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    //////******    CREAR HABITACION   *****\\\\\\\    No me lo crea                                      REVISAR
    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed

        try {
            if (jtnum.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos" + ui);
            } else {

                ///Como traigo al tipo de habitaicon correctamente???
///Habitacion h= new Habitacion(Integer.parseInt(jtnum.getText()),(Integer.parseInt(jttipo.getText())),jrOcupada.isSelected();
/////////////como hago para llamar al tipo ese con error???////////////////////
                ////   Habitacion h = new Habitacion((jtnum.getText()),, jrOcupada.isSelected());
                ////Con un try catch podria solo dejar escribir los tipos de haitacion: simple,doble,etc
                ///String ts =jTextField1.getText();
                /////REVISARRRRR
                
                TipoDeHabitacion ts =new TipoDeHabitacion();
             ts.setIdTipo(Integer.parseInt(jTextField1.getText()));
                /// String tipohab = ts.toString();
                Habitacion h = new Habitacion(Integer.parseInt(jtnum.getText()),ts, jrOcupada.isSelected());

                int numHab = Integer.parseInt(jtnum.getText());

                //ESTOY¡ ME Suena raro
                //  String tipoHab = (String) jcTipo.getSelectedItem();
                boolean ocupada = jrOcupada.isSelected();

                TipoDeHabitacion tipo = new TipoDeHabitacion();
                tipo.setIdTipo(1);

                if (hdata.BuscarHabitacion(Integer.parseInt(jtnum.getText())) == null) {
                    /// hdat.crearHabitacion(h);
                    JOptionPane.showMessageDialog(null, "Habitacion creada");
                }
            }
        } catch (NumberFormatException e) {
        }


    }//GEN-LAST:event_jbCrearActionPerformed

    private void jrOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOcupadaActionPerformed
        
    }//GEN-LAST:event_jrOcupadaActionPerformed


    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        {
            limpiar();
        }
    }//GEN-LAST:event_jblimpiarActionPerformed

    /////***** BUSCAR HABITACION *****\\\\\\\
    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed

        try {

            Habitacion h = hdata.BuscarHabitacion(Integer.parseInt(jtnum.getText()));

            ////  String thab = thabdata.toString();
            if (h != null) {
                jtnum.setText(String.valueOf(h.getIdHabitacion()));
                TipoDeHabitacion thab = thabdata.buscarThaHabitacioni(h.getIdHabitacion());
                if (thab != null) {
                    jTextField1.setText(thab.toString());
                }
                ////    jTextField1.setText((thab));  ////COMO  TRAIGOO ACA EL TO STRING????????????????     revisar

                jrOcupada.setSelected(h.isEstado());  ////Aca no me lo trae al radio buton
                if (h.isEstado() == true) {
                    jrOcupada.setSelected(true);//boton apretado cliente de alta
                } else {
                    jrOcupada.setSelected(false);//boton no accionado cliente dado de baja
                }

            } else {
                JOptionPane.showMessageDialog(this, "Habitacion no encontrada");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar numero de habitacion" + e);
        }

    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed


    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JRadioButton jrOcupada;
    private javax.swing.JTextField jtnum;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        jtnum.setText("");
        jrOcupada.setSelected(false);
        jTextField1.setText("");
    }

//    public void cargar(){
//        for (TipoDeHabitacion tip : tHab) {
//           jTextField1.add(tip);
//        }
//    }
}
