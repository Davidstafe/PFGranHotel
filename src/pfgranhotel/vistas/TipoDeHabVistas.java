
package pfgranhotel.vistas;

import javax.swing.JOptionPane;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.accesoDatos.TipoDeHabitacionData;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.TipoDeHabitacion;


public class TipoDeHabVistas extends javax.swing.JInternalFrame {

    private TipoDeHabitacionData thab;
    private HabitacionData hdat;
    public TipoDeHabVistas() {
        thab=new TipoDeHabitacionData();
        hdat=new HabitacionData();
        initComponents();
        limpiar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
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
        jbCrear = new javax.swing.JButton();
        jbElim = new javax.swing.JButton();
        jbsalir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbMod = new javax.swing.JButton();

        jLabel1.setText("ABM  TIPO DE HABITACION");

        jLabel3.setText("Cantidad de personas");

        jLabel4.setText("Cantidad de camas");

        jLabel5.setText("Tipos de camas");

        jLabel6.setText("Tipo de habitacion");

        jLabel7.setText("Precio");

        jtCantpers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantpersActionPerformed(evt);
            }
        });

        jrLibre.setText("Activar ocupada");
        jrLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrLibreActionPerformed(evt);
            }
        });

        jbCrear.setText("Crear");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });

        jbElim.setText("Eliminar");

        jbsalir.setText("Salir");
        jbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalirActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbMod.setText("Modificar");
        jbMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCrear)
                        .addGap(18, 18, 18)
                        .addComponent(jbMod)
                        .addGap(18, 18, 18)
                        .addComponent(jbElim, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtCantpers)
                            .addComponent(jtCantCamas)
                            .addComponent(jtTiposCamas)
                            .addComponent(jtTipoHab)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrLibre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbsalir)
                        .addGap(0, 23, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtCantpers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtCantCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtTiposCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jrLibre)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtTipoHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCrear)
                    .addComponent(jbMod)
                    .addComponent(jbElim)
                    .addComponent(jButton2)
                    .addComponent(jbsalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // ANDA  
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ///ANDA
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        // TODO add your handling code here:
        
        //////**********CREAMOS UN TIPO DE HAB, QUEREMOS CREAR LA HABITACION CON EL ID HABITACION******/////
        
        if(jtCantpers.getText().isEmpty() || jtCantpers.getText().isEmpty() || jtCantCamas.getText().isEmpty()
               || jtTiposCamas.getText().isEmpty() || jtTipoHab.getText().isEmpty() || jtPrecio.getText().isEmpty()  ){
            JOptionPane.showMessageDialog(null, "Complete todos los campos"); 
        } else{
            
            TipoDeHabitacion thabi= new TipoDeHabitacion(Integer.parseInt(jtCantpers.getText()),Integer.parseInt(jtCantCamas.getText()), jtTiposCamas.getText(), jtTipoHab.getText(), Double.parseDouble(jtPrecio.getText()),jrLibre.isSelected());
           thab.guardarHab(thabi);
           
           JOptionPane.showMessageDialog(null,"Habitacion creada");
        }
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jbModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModActionPerformed
        // TODO add your handling code here:
         try{
            TipoDeHabitacion thabi= new TipoDeHabitacion(Integer.parseInt(jtCantpers.getText()),Integer.parseInt(jtCantCamas.getText()), jtTiposCamas.getText(), jtTipoHab.getText(), Double.parseDouble(jtPrecio.getText()),jrLibre.isSelected());
      
        if (jtCantpers.getText().isEmpty() || jtCantCamas.getText().isEmpty()
                || jtTiposCamas.getText().isEmpty() || jtTipoHab.getText().isEmpty() || jtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            // Asumiendo que los campos sean numéricos, usa Integer.parseInt o Double.parseDouble
            int cantidadPersonas = Integer.parseInt(jtCantpers.getText());
            int cantidadCamas = Integer.parseInt(jtCantCamas.getText());
            double precio = Double.parseDouble(jtPrecio.getText());
            
            JOptionPane.showMessageDialog(null,"habitacion modificada");
        
        
        }} catch (NumberFormatException e){     //////////****** COMO HAGO PARA HACER LO MISMO PIDIENDO SOLO LETRAS EN LOS STRING???
            /// para  asegurarme q solo ingrese numeros en los int
               JOptionPane.showMessageDialog(null, "Ingresar numeros en los campos" );
            jtCantCamas.setText("");
            jtCantpers.setText("");
            jtPrecio.setText("");
                }
    }//GEN-LAST:event_jbModActionPerformed

    private void jrLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrLibreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrLibreActionPerformed

    private void jtCantpersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantpersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCantpersActionPerformed
    
        
        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbElim;
    private javax.swing.JButton jbMod;
    private javax.swing.JButton jbsalir;
    private javax.swing.JRadioButton jrLibre;
    private javax.swing.JTextField jtCantCamas;
    private javax.swing.JTextField jtCantpers;
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
