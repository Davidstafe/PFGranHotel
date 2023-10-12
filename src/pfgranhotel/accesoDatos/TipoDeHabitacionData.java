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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pfgranhotel.entidades.TipoDeHabitacion;

/**
 *
 * @author basti
 */
public class TipoDeHabitacionData {
    
    private TipoDeHabitacionData thd;
    private Connection con=null;
    
    public TipoDeHabitacionData(){
    
        con=Conexion.getConexion();
        
       ////****quiero hacer un metodo del tipo de habitacion Simple para listarlo
      /// en el menu
        /*public  Arraylist<TipoDeHabitacion> listarTipoSimple(){
            ArrayList<TipoDeHabitacion> tipoHab = new ArrayList<>();
            String sql="SELECT * FROM habitacion WHERE tipo_habitacion IN ('Simple')";
            
            PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             
             while(rs.next()){
                 TipoDeHabitacion thab = new TipoDeHabitacion();
                 thab.setIdTipo(rs.getInt("idTipo"));
                 thab.setCantPers(rs.getInt("cantPers"));
                 thab.setCantCamas(rs.getInt("cantCamas"));
                 thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
                 thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
                 thab.setPrecio(rs.getInt("precio"));
                 thab.setEstado(rs.getBoolean("estado"));
                 TipoDeHabitacion.add(thab);  ///xq no me lo agrega????    :(
             }
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al listar las habitaciones simples"+ ex);
        }
           
        
        }  */
}
}    

