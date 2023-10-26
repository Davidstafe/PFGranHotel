/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import javax.swing.JOptionPane;
import pfgranhotel.accesoDatos.HabitacionData;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.TipoDeHabitacion;


public class ABM_habitacion extends javax.swing.JInternalFrame {

    private HabitacionData hdat;
    public ABM_habitacion() {
        initComponents();
        hdat=new HabitacionData();
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
        jcTipo = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ABM HABITACIÓN");

        jLabel2.setText("Num habitacion");

        jbbuscar.setText("Buscar");

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

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "simple", "Item 2", "Item 3", "Item 4" }));
        jcTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipoActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(jbbuscar))
                                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jrOcupada))))
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jrOcupada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
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
        try{
            Habitacion h = hdat.BuscarHabitacion(Integer.parseInt(jtnum.getText()));
            if(h!=null){
                hdat.modificarHabitacion(h);
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingresar numeros en los campos");
            jtnum.setText("");
            
        }
    }//GEN-LAST:event_jbmodificarActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        Habitacion h = hdat.BuscarHabitacion(SOMEBITS);
        
        
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbsalirActionPerformed

    private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
        
        try {
            if(jtnum.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Complete todos los campos"+ ui);
            }else{
                
                ///Como traigo al tipo de habitaicon correctamente???
//              Habitacion h= new Habitacion(Integer.parseInt(jtnum.getText()),(Integer.parseInt(jttipo.getText())),jrOcupada.isSelected();
////////////////////////como hago para llamar al tipo ese con error???////////////////////
            ////   Habitacion h = new Habitacion((jtnum.getText()),, jrOcupada.isSelected());
            int numHab= Integer.parseInt(jtnum.getText());
            String tipoHab=(String)jcTipo.getSelectedItem();
            boolean ocupada= jrOcupada.isSelected();
            
            TipoDeHabitacion tipo = new TipoDeHabitacion();
            tipo.setIdTipo(1);
            Habitacion hab= new Habitacion(tipo, ocupada, ocupada);

            if(hdat.BuscarHabitacion(Integer.parseInt(jtnum.getText()))==null){
                hdat.crearHabitacion(h);
                JOptionPane.showMessageDialog(null,"Habitacion creada");
            }
            }
        } catch (NumberFormatException e) {
        }       
   


            
            
      
    }//GEN-LAST:event_jbCrearActionPerformed

    private void jrOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOcupadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrOcupadaActionPerformed

    private void jcTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JButton jbmodificar;
    private javax.swing.JButton jbsalir;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JRadioButton jrOcupada;
    private javax.swing.JTextField jtnum;
    // End of variables declaration//GEN-END:variables

 public void limpiar(){
        jtnum.setText("");
        
        
        
    }

///COMIT PABLO
}
