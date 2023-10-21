/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import javax.swing.JOptionPane;
import pfgranhotel.accesoDatos.TipoDeHabitacionData;
import pfgranhotel.entidades.TipoDeHabitacion;

/**
 *
 * @author david
 */
public class TipoDeHabVistas extends javax.swing.JInternalFrame {

    private TipoDeHabitacionData thab;
    public TipoDeHabVistas() {
        thab=new TipoDeHabitacionData();
        initComponents();
        limpiar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtIdHab = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtCantpers = new javax.swing.JTextField();
        jtCantCamas = new javax.swing.JTextField();
        jtTiposCamas = new javax.swing.JTextField();
        jtTipoHab = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jrLibre = new javax.swing.JRadioButton();
        jrOcupada = new javax.swing.JRadioButton();
        jbCrear = new javax.swing.JButton();
        jbMod = new javax.swing.JButton();
        jbElim = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("ABM HABITACION");

        jLabel2.setText("ID habitacion");

        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad de personas");

        jLabel4.setText("Cantidad de camas");

        jLabel5.setText("Tipos de camas");

        jLabel6.setText("Tipo de habitacion");

        jLabel7.setText("Precio");

        jrLibre.setText("Libre");

        jrOcupada.setText("Ocupada");

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbMod.setText("Modificar");

        jbElim.setText("Eliminar");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtIdHab))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCantpers, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                    .addComponent(jtCantCamas)
                                    .addComponent(jtTiposCamas)
                                    .addComponent(jtTipoHab)
                                    .addComponent(jtPrecio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrLibre)
                                    .addComponent(jrOcupada)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscar)
                                .addGap(22, 22, 22)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbElim, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtIdHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCantpers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrLibre)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtTiposCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jrOcupada)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbMod)
                    .addComponent(jbElim)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        
        ///Habitacion h= thab
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        
        if(jtCantpers.getText().isEmpty() || jtCantpers.getText().isEmpty() || jtCantCamas.getText().isEmpty()
               || jtTiposCamas.getText().isEmpty() || jtTipoHab.getText().isEmpty() || jtPrecio.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(null, "Complete todos los campos"); 
        } else{
            TipoDeHabitacion thabi= new TipoDeHabitacion((jtCantpers.getText()),jtCantCamas.getText(), jtTiposCamas.getText(), jtTipoHab.getText(), jtPrecio.getText(),jbCrear.isSelected());
           thab.guardarHab(thabi);
        }
    }//GEN-LAST:event_jbCrearActionPerformed
     private void jbModActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        try{
        //   TipoDeHabitacion thabMod= new TipoDeHabitacion((Integer.parseInt(jtCantpers.getText())),(Integer.parseInt(jtCantpers.getText())), jtTiposCamas.getText(),jtTipoHab.getText(),(Integer.parseInt(jtCantpers.getText()),(Integer.parseInt(jtPrecio.getText()));
        if (jtCantpers.getText().isEmpty() || jtCantCamas.getText().isEmpty()
                || jtTiposCamas.getText().isEmpty() || jtTipoHab.getText().isEmpty() || jtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            // Asumiendo que los campos sean numéricos, usa Integer.parseInt o Double.parseDouble
            int cantidadPersonas = Integer.parseInt(jtCantpers.getText());
            int cantidadCamas = Integer.parseInt(jtCantCamas.getText());
            double precio = Double.parseDouble(jtPrecio.getText());

            TipoDeHabitacion thabi = new TipoDeHabitacion(cantidadPersonas, cantidadCamas, jtTiposCamas.getText(), jtTipoHab.getText(), precio, true);
            // Luego, haz lo que necesites con thabi, como guardar en una lista o base de datos.
        
            JOptionPane.showMessageDialog(null,"habitacion modificada");
        
        
        }} catch (NumberFormatException e){     //////////****** COMO HAGO PARA HACER LO MISMO PIDIENDO SOLO LETRAS EN LOS STRING???
            /// para  asegurarme q solo ingrese numeros en los int
               JOptionPane.showMessageDialog(null, "Ingresar numeros en los campos" );
            jtCantCamas.setText("");
            jtCantpers.setText("");
            jtPrecio.setText("");
                }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbElim;
    private javax.swing.JButton jbMod;
    private javax.swing.JRadioButton jrLibre;
    private javax.swing.JRadioButton jrOcupada;
    private javax.swing.JTextField jtCantCamas;
    private javax.swing.JTextField jtCantpers;
    private javax.swing.JTextField jtIdHab;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtTipoHab;
    private javax.swing.JTextField jtTiposCamas;
    // End of variables declaration//GEN-END:variables

    public void limpiar(){
        jtCantpers.setText("");
        jtCantCamas.setText("");
        jtTiposCamas.setText("");
        jtTipoHab.setText("");
        jtPrecio.setText("");
        
        
    }




}
