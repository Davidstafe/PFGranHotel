/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

import javax.swing.JOptionPane;
import pfgranhotel.entidades.Huesped;


public class HuespedData {

    private Connection con=null;

    public HuespedData() {
        con =Conexion.getConexion();
         }
    public void guardarHuesped(Huesped huesped){
      String sql="INSERT INTO `huesped`( `DNI`, `Apellido`, `Nombres`, `Domicilio`, `Correo`, `Celular`, Estado)"
              +" VALUES (?,?,?,?,?,?,?) ";
      PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql,RETURN_GENERATED_KEYS);
            ps.setInt(1,huesped.getDni());
            ps.setString(2, huesped.getApellido());
            ps.setString(3,huesped.getNombres());
            ps.setString(4,huesped.getDomicilio());
            ps.setString(5,huesped.getCorreo());
            ps.setInt(6,huesped.getCelular());
            ps.setBoolean(7,huesped.isEstado());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));
                }
                JOptionPane.showMessageDialog(null, "Huesped guardado");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"Error en guardar huesped "+ ex);
        }
      
      
       
       
       
    
}
}