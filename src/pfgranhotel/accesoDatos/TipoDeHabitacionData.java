/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.accesoDatos;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.TipoDeHabitacion;

/**
 *
 * @author basti
 */
public class TipoDeHabitacionData {
    
    private TipoDeHabitacionData thd;
    private Connection con=null;
    private HabitacionData ad;
    public TipoDeHabitacionData(){
    
        con=Conexion.getConexion();
        
       ////****quiero hacer un metodo del tipo de habitacion Simple para listarlo
      /// en el menu
    }
    
//    ///llamo a la lista de tipo de hab. Simple para desp mostrar en la tabla
//    public ArrayList<TipoDeHabitacion> listarTipoSimple(){
//            ArrayList<TipoDeHabitacion> tipoHab = new ArrayList<>();
//            String sql="SELECT * FROM habitacion WHERE tipo_habitacion IN ('Simple')";
//            
//            PreparedStatement ps;
//        try {
//            ps = con.prepareStatement(sql);
//             ResultSet rs=ps.executeQuery();
//             
//             while(rs.next()){
//                 TipoDeHabitacion thab = new TipoDeHabitacion();
//                 thab.setIdTipo(rs.getInt("idTipo"));
//                 thab.setCantPers(rs.getInt("cantPers"));
//                 thab.setCantCamas(rs.getInt("cantCamas"));
//                 thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
//                 thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
//                 thab.setPrecio(rs.getInt("precio"));
//                 thab.setEstado(rs.getBoolean("estado"));
//                 tipoHab.add(thab);  ///xq no me lo agrega????    :(
//                 
//                
//             }
//     
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al listar las habitaciones simples"+ ex);
//        }
//        return tipoHab;
//           
//        
//        }  
//    
//    public ArrayList<TipoDeHabitacion> listarTipoDoble(){
//         ArrayList<TipoDeHabitacion> tipoDobl = new ArrayList<>();
//            String sql="SELECT * FROM habitacion WHERE tipo_habitacion IN ('Dobles')";
//            
//            PreparedStatement ps;
//        try {
//            ps = con.prepareStatement(sql);
//             ResultSet rs=ps.executeQuery();
//             
//             while(rs.next()){
//                 TipoDeHabitacion thab = new TipoDeHabitacion();
//                 thab.setIdTipo(rs.getInt("idTipo"));
//                 thab.setCantPers(rs.getInt("cantPers"));
//                 thab.setCantCamas(rs.getInt("cantCamas"));
//                 thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
//                 thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
//                 thab.setPrecio(rs.getInt("precio"));
//                 thab.setEstado(rs.getBoolean("estado"));
//                 tipoDobl.add(thab); 
//                 
//                
//             }
//     
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al listar las habitaciones dobles"+ ex);
//        }
//        return tipoDobl;
//           
//        
//    }
//    
//    public ArrayList<TipoDeHabitacion> listarTipoTriple(){
//        
//         ArrayList<TipoDeHabitacion> tipoTri = new ArrayList<>();
//            String sql="SELECT * FROM habitacion WHERE tipo_habitacion IN ('Triple')";
//            
//            PreparedStatement ps;
//        try {
//            ps = con.prepareStatement(sql);
//             ResultSet rs=ps.executeQuery();
//             
//             while(rs.next()){
//                 TipoDeHabitacion thab = new TipoDeHabitacion();
//                 thab.setIdTipo(rs.getInt("idTipo"));
//                 thab.setCantPers(rs.getInt("cantPers"));
//                 thab.setCantCamas(rs.getInt("cantCamas"));
//                 thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
//                 thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
//                 thab.setPrecio(rs.getInt("precio"));
//                 thab.setEstado(rs.getBoolean("estado"));
//                 tipoTri.add(thab);  
//                 
//                
//             }
//     
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al listar las habitaciones triples"+ ex);
//        }
//        return tipoTri;
//           
//    }
//    
//   public ArrayList<TipoDeHabitacion> listarTipoSuite(){
//        
//         ArrayList<TipoDeHabitacion> tipoSuite = new ArrayList<>();
//            String sql="SELECT * FROM habitacion WHERE tipo_habitacion IN ('Suite')";
//            
//            PreparedStatement ps;
//        try {
//            ps = con.prepareStatement(sql);
//             ResultSet rs=ps.executeQuery();
//             
//             while(rs.next()){
//                 TipoDeHabitacion thab = new TipoDeHabitacion();
//                 thab.setIdTipo(rs.getInt("idTipo"));
//                 thab.setCantPers(rs.getInt("cantPers"));
//                 thab.setCantCamas(rs.getInt("cantCamas"));
//                 thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
//                 thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
//                 thab.setPrecio(rs.getInt("precio"));
//                 thab.setEstado(rs.getBoolean("estado"));
//                 tipoSuite.add(thab);
//                 
//                
//             }
//     
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error al listar las habitaciones simples"+ ex);
//        }
//        return tipoSuite;
//           
//    }
// //SELECT idHabitacion,habitacion.estado,mantenimiento,tipodehabitacion.cantPers,tipodehabitacion.cantCamas,tipodehabitacion.tipoDeCamas,tipodehabitacion.tipoDeHabitacion,tipodehabitacion.precio FROM `habitacion`join tipodehabitacion on tipodehabitacion.idTipo=habitacion.idTipo and tipodehabitacion.tipoDeHabitacion like 'simple';   
//   
  public ArrayList<TipoDeHabitacion> listhab() {

        ArrayList<TipoDeHabitacion> tipoHab = new ArrayList<>();
        String sql = "SELECT * FROM tipoDeHabitacion WHERE TipoDeHabitacion estado=0";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TipoDeHabitacion thab = new TipoDeHabitacion();
                thab.setIdTipo(rs.getInt("idTipo"));
                thab.setCantPers(rs.getInt("cantPers"));
                thab.setCantCamas(rs.getInt("cantCamas"));
                thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
                thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
                thab.setPrecio(rs.getInt("precio"));
                thab.setEstado(rs.getBoolean("estado"));
                tipoHab.add(thab);  ///xq no me lo agrega????    :(

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las habitaciones simples" + ex);
        }
        return tipoHab;
    }

    public TipoDeHabitacion buscarThaHabitacion(String tipoDeHabitacion) {
        String sql = "SELECT*from tipoDeHabitacion where tipoDeHabitacion like ?";
        TipoDeHabitacion tp = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tipoDeHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tp = new TipoDeHabitacion();
                tp.setIdTipo(rs.getInt("idTipo"));
                tp.setCantPers(rs.getInt("cantPers"));
                tp.setCantCamas(rs.getInt("cantCamas"));
                tp.setTipoDeCamas(rs.getString("tipoDeCamas"));
                tp.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
                tp.setPrecio(rs.getInt("precio"));
                tp.setEstado(rs.getBoolean("estado"));

                JOptionPane.showMessageDialog(null, "huesped encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "huesped no encontrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }

        return tp;
    }

    public ArrayList<TipoDeHabitacion> listhabN() {

        ArrayList<TipoDeHabitacion> tipoHab = new ArrayList<>();
        String sql = "SELECT * FROM tipoDeHabitacion ";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TipoDeHabitacion thab = new TipoDeHabitacion();
                thab.setIdTipo(rs.getInt("idTipo"));
                thab.setCantPers(rs.getInt("cantPers"));
                thab.setCantCamas(rs.getInt("cantCamas"));
                thab.setTipoDeCamas(rs.getString("tipoDeCamas"));
                thab.setTipoDeHabitacion(rs.getString("tipoDeHabitacion"));
                thab.setPrecio(rs.getInt("precio"));
                thab.setEstado(rs.getBoolean("estado"));
                tipoHab.add(thab);  ///xq no me lo agrega????    :(

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las habitaciones simples" + ex);
        }
        return tipoHab;
    }
    //busca habitacion por idHabitacion y estado=1

    public ArrayList<TipoDeHabitacion> obtenertipoxhab(int idHabitacion) {
        ArrayList<TipoDeHabitacion> tipo = new ArrayList<>();
        String sql = "SELECT tipodehabitacion.cantPers,tipodehabitacion.cantCamas,tipodehabitacion.tipoDeCamas,tipodehabitacion.precio,tipodehabitacion.idTipo ,tipodehabitacion.estado"
                + " FROM `habitacion`join tipodehabitacion on tipodehabitacion.idTipo=habitacion.idTipo and habitacion.idhabitacion= ? and  habitacion.estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion h = new TipoDeHabitacion();
//                h.setTipoDeHabitacion(rs.getString("TipoDeHabitacion"));
                h.setIdTipo(rs.getInt("idTipo"));
                h.setCantPers(rs.getInt("cantPers"));
                h.setCantCamas(rs.getInt("cantCamas"));
                h.setTipoDeCamas(rs.getString("tipoDeCamas"));
                h.setPrecio(rs.getDouble("precio"));
                h.setEstado(rs.getBoolean("estado"));

                tipo.add(h);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos" + ex);
        }

        return tipo;
    }
    //busca habitacion por idHabitacion y estado =0

    public ArrayList<TipoDeHabitacion> obtenertipoxNhab(int idHabitacion) {
        ArrayList<TipoDeHabitacion> tipo = new ArrayList<>();
        String sql = "SELECT tipodehabitacion.cantPers,tipodehabitacion.cantCamas,tipodehabitacion.tipoDeCamas,tipodehabitacion.precio,tipodehabitacion.idTipo "
                + "FROM `habitacion`join tipodehabitacion on tipodehabitacion.idTipo=habitacion.idTipo and habitacion.idhabitacion= ? and habitacion.estado=0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion h = new TipoDeHabitacion();
//                 Habitacion a=ad.BuscarHabitacion(rs.getInt("idHabitacion"));
//                 h.setTipoDeHabitacion(rs.getString("TipoDeHabitacion"));
                h.setIdTipo(rs.getInt("idTipo"));
                h.setCantPers(rs.getInt("cantPers"));
                h.setCantCamas(rs.getInt("cantCamas"));
                h.setTipoDeCamas(rs.getString("tipoDeCamas"));
                h.setPrecio(rs.getDouble("precio"));
//                 h.setEstado(rs.getBoolean("estado"));

                tipo.add(h);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos" + ex);
        }

        return tipo;
    }
    //busca habitacion por tipo y estado=1

    public ArrayList<TipoDeHabitacion> obtenerHabi(String tipoDeHabitacion) {
        ArrayList<TipoDeHabitacion> tipo = new ArrayList<>();
        String sql = "SELECT tipodehabitacion.cantPers,tipodehabitacion.cantCamas,tipodehabitacion.tipoDeCamas,tipodehabitacion.precio,tipodehabitacion.idTipo ,habitacion.idhabitacion"
                + " FROM `habitacion`join tipodehabitacion on tipodehabitacion.idTipo=habitacion.idTipo and  tipoDeHabitacion.tipoDeHabitacion= ?  and habitacion.estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tipoDeHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion h = new TipoDeHabitacion();

                h.setIdTipo(rs.getInt("idTipo"));
                h.setCantPers(rs.getInt("cantPers"));
                h.setCantCamas(rs.getInt("cantCamas"));
                h.setTipoDeCamas(rs.getString("tipoDeCamas"));
                h.setPrecio(rs.getDouble("precio"));

                tipo.add(h);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos" + ex);
        }

        return tipo;

    }

    //Busca habitacion por tipo y estado =0
    public ArrayList<TipoDeHabitacion> obtenerNoHabi(String tipoDeHabitacion) {
        ArrayList<TipoDeHabitacion> tipo = new ArrayList<>();
        String sql = "SELECT tipodehabitacion.cantPers,tipodehabitacion.cantCamas,tipodehabitacion.tipoDeCamas,tipodehabitacion.precio,tipodehabitacion.idTipo "
                + "FROM `habitacion`join tipodehabitacion on tipodehabitacion.idTipo=habitacion.idTipo and  tipoDeHabitacion.tipoDeHabitacion= ?  and habitacion.estado=0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tipoDeHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoDeHabitacion h = new TipoDeHabitacion();

                h.setIdTipo(rs.getInt("idTipo"));
                h.setCantPers(rs.getInt("cantPers"));
                h.setCantCamas(rs.getInt("cantCamas"));
                h.setTipoDeCamas(rs.getString("tipoDeCamas"));
                h.setPrecio(rs.getDouble("precio"));

                tipo.add(h);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos" + ex);
        }

        return tipo;

    }


/////METODO PARA GUARDAR UNA HABITACION CON DATOS DeTIPO DE HAB. en ABM HABITACION.*/////////        "REVISAR"
    
    public void guardarHab(TipoDeHabitacion tipoDeHabitacion){
        String sql="INSERT INTO `tipodehabitacion`( `cantPers`, `cantCamas`, `tipoDeCamas`, `tipoDeHabitacion`, `precio`) VALUES "
                + "(?,?,?,?,?)";  
        PreparedStatement ps;
        try {
            ps=con.prepareStatement(sql,RETURN_GENERATED_KEYS);
            ps.setInt(1,tipoDeHabitacion.getCantPers());
            ps.setInt(2, tipoDeHabitacion.getCantCamas());
            ps.setString(3,tipoDeHabitacion.getTipoDeCamas());
            ps.setString(4,tipoDeHabitacion.getTipoDeHabitacion());
            ps.setDouble(5, tipoDeHabitacion.getPrecio());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                tipoDeHabitacion.setIdTipo(rs.getInt(4));///lo guarda por tipo de habitacion
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR al guardar habitacion"+ e);
        }
        
    }


}
