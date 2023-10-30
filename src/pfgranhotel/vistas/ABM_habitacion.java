/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.*;

public class ABM_habitacion extends javax.swing.JInternalFrame {

    private HabitacionData hdata;
    private TipoDeHabitacion thab;
    private TipoDeHabitacionData thabdata;
    private ArrayList<Habitacion> h;
    private ArrayList<TipoDeHabitacion> tHabArray;

    public ABM_habitacion() {
        initComponents();
        hdata = new HabitacionData();
        thab = new TipoDeHabitacion();
        thabdata = new TipoDeHabitacionData();
        tHabArray = (ArrayList < TipoDeHabitacion >)thabdata.listhabN();
        cargarHabitaciones();
        limpiar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbbuscar = new javax.swing.JButton();
        jtnum = new javax.swing.JTextField();
        jbCrear = new javax.swing.JButton();
        jrOcupada = new javax.swing.JRadioButton();
        jbmodificar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();
        jcTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ABM HABITACIÓN");

        jLabel2.setText("Num habitacion");

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

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

        jcTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Crear tipo de habitacion ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrOcupada)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbbuscar)
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbsalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbbuscar))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                jtnum.setText(String.valueOf(h.getIdHabitacion()));
                TipoDeHabitacion thab = thabdata.buscarThaHabitacioni(h.getIdHabitacion());
                if (thab != null) {
                   /// jTextField1.setText(thab.getTipoDeHabitacion());
                }
                ////    jTextField1.setText((thab));  ////COMO  TRAIGOO ACA EL TO STRING????????????????     revisar

                jrOcupada.setSelected(h.isEstado());  ////Aca no me lo trae al radio buton
                if (h.isEstado() == true) {
                    jrOcupada.setSelected(true);//boton apretado acliente de alta
                } else {
                    jrOcupada.setSelected(false);//boton no accionado cliente dado de baja
                }
                
                hdata.modificarHabABM(h);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar numeros en los campos");
            jtnum.setText("");
            //jTextField1.setText("");

        }
    }//GEN-LAST:event_jbmodificarActionPerformed

    //////***** ELIMINAR HABITACION *****\\\\\\                                                         REVISAR ELIMINAR
    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed

        try{
            Habitacion h= hdata.BuscarHabitacion(Integer.parseInt(jtnum.getText()));
            
            if(h != null){
                hdata.bajaHabitacion(h.getIdHabitacion());
                JOptionPane.showMessageDialog(null,"Habitacion eliminada" );
            }
        }catch(NumberFormatException e){
            
        }

    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    //////******    CREAR HABITACION   *****\\\\\\\    No me lo crea                                    REVISAR
    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed

////        try {
////            if (jtnum.getText().isEmpty() || jTextField1.getText().isEmpty()) {
////                JOptionPane.showMessageDialog(null, "Complete todos los campos" );
////            } else {
////                    int numHab=Integer.parseInt(jtnum.getText());
////                    TipoDeHabitacion tHab= new TipoDeHabitacion();
////                    Habitacion habi = new Habitacion();
////                    HabitacionData  habData= new HabitacionData();
////                    tHab.setTipoDeHabitacion(toString());
////                    habData.crearHabABM(habi);

try {
    if (jtnum.getText().isEmpty() || jcTipo.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(null, "Complete todos los campos");
    } else {
        int numHab = Integer.parseInt(jtnum.getText());
        TipoDeHabitacion tipoDeHabitacion = (TipoDeHabitacion) jcTipo.getSelectedItem();
        boolean ocupada = jrOcupada.isSelected();

        Habitacion habitacion = new Habitacion();
        habitacion.setIdHabitacion(numHab);
        habitacion.setTipo(tipoDeHabitacion);
        habitacion.setEstado(ocupada);

        hdata.crearHabABM(habitacion);
        
    


//////////PROBANDO ALGO NUEVO/////////////  
//                        
//                      int numHab=Integer.parseInt(jtnum.getText());
//                      String TipoDeHabi= jTextField1.getText();
//                      boolean ocupada= jrOcupada.isSelected();
//                      TipoDeHabitacion thabi= new TipoDeHabitacion();
//                      thabi.setTipoDeHabitacion(TipoDeHabi);
//                      Habitacion nuevaHab= new Habitacion(numHab,TipoDeHabi,ocupada);
//                      hdata.crearHabABM(nuevaHab);
//                      limpiar();

//                //////****** Crear una nueva habitacion   PODRA SER QUE NO ME DEJA POR EL AUTO INCREMENTAL??
//                
//                TipoDeHabitacion ts =new TipoDeHabitacion();
//                ts.setTipoDeHabitacion(jTextField1.getText());
//                Habitacion habi=  new Habitacion();//////(0,ts,jrOcupada.isSelected());
//                habi.setIdHabitacion(Integer.parseInt(jtnum.getText()));
//              ///  habi.setTipo(ts);
//              thab.setIdTipo(habi.getIdHabitacion());
//                habi.setEstado(isSelected());
//                TipoDeHabitacion thab = thabdata.buscarThaHabitacioni(habi.getIdHabitacion());
//                if (thab != null) {
//                    jTextField1.setText(thab.toString());
//                }
//               
//                
//                /// String tipohab = ts.toString();
//             //  Habitacion h = new Habitacion(Integer.parseInt(jtnum.getText()),ts, jrOcupada.isSelected());
//
////                int numHab = Integer.parseInt(jtnum.getText());
////                boolean ocupada = jrOcupada.isSelected();
//
//                hdata.crearHabABM(habi);
//                limpiar();
//              
                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this," Habitacion no creada"+e);
        }


    }//GEN-LAST:event_jbCrearActionPerformed

    private void jrOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOcupadaActionPerformed
        
    }//GEN-LAST:event_jrOcupadaActionPerformed


    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        {
            limpiar();
        }
    }//GEN-LAST:event_jblimpiarActionPerformed

    private void jcTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoActionPerformed

        

    }//GEN-LAST:event_jcTipoActionPerformed

    /////***** BUSCAR HABITACION *****\\\\\\\                                                           ANDANDO
    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed

        try {

            Habitacion h = hdata.BuscarHabABM(Integer.parseInt(jtnum.getText()));

            ////  String thab = thabdata.toString();
            if (h != null) {
                jtnum.setText(String.valueOf(h.getIdHabitacion()));
                TipoDeHabitacion thab = thabdata.buscarThaHabitacioni(h.getIdHabitacion());
                if (thab != null) {
                    ////ESTO ANDABA OJO
                   /// jTextField1.setText(thab.toString());
                    ///*****///
                jcTipo.setSelectedItem(thab);

                }
                ////    jTextField1.setText((thab));  ////COMO  TRAIGOO ACA EL TO STRING????????????????     revisar

                jrOcupada.setSelected(h.isEstado());  ////Aca no me lo trae al radio buton
                if (h.isEstado() == true) {
                    jrOcupada.setSelected(true);//boton apretado acliente de alta
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<TipoDeHabitacion> jcTipo;
    private javax.swing.JRadioButton jrOcupada;
    private javax.swing.JTextField jtnum;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        jtnum.setText("");
        jrOcupada.setSelected(false);
        //1jTextField1.setText("");
    }

//    public void cargar(){
//        for (TipoDeHabitacion tip : tHab) {
//           jTextField1.add(tip);
//        }
//    }
     private void cargarHabitaciones() {

        for (TipoDeHabitacion tip : tHabArray) {
            jcTipo.addItem(tip);
        }

    }
}
