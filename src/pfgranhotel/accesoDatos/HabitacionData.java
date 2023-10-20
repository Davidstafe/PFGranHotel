
package pfgranhotel.accesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import pfgranhotel.entidades.*;

public class HabitacionData {

//    private HabitacionData habD=new HabitacionData();
    private TipoDeHabitacionData tH;
    private TipoDeHabitacion tp;
    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }

    public void crearHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO habitacion (  idTipo, estado, Mantenimiento)"
                + " VALUES (?,?,?) ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getTipo().getIdTipo());
            ps.setBoolean(2, habitacion.isEstado());
            ps.setBoolean(3, habitacion.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setEstado(rs.getBoolean(1));
            }
            JOptionPane.showMessageDialog(null, "habitacion creada");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error en habitacion creada" + ex);
        }

    }

    public ArrayList<Habitacion> listarHabitaciones() {
        ArrayList<Habitacion> habitat = new ArrayList<>();

        String sql = "Select idHabitacion from habitacion ";///como llamo a todas las habitaciones, tanto libres como ocupadas.

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Habitacion h = new Habitacion(); ///esto era para crear una nueva habitacion??? o para llamar una nueva habitacion.
                h.setIdHabitacion(rs.getInt("idHabitacion"));
//                h.setEstado(rs.getBoolean("idTipo"));
//                h.setMant(rs.getBoolean("mant"));
                habitat.add(h);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al listar habitaciones" + ex);
        }

        return habitat;
    }

    public void bajaHabitacion(int idHabitacion) {

        String sql = "UPDATE Habitacion SET Estado =0 WHERE idHabitacion= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int filas = ps.executeUpdate();
            if (filas > 1) {
                JOptionPane.showMessageDialog(null, "Habitacion dada de baja");
            } else {
                JOptionPane.showMessageDialog(null, "Habitacion en estado de alta");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ");
        }

    }

    public Habitacion BuscarHabitacion(int idHabitacion) {
        String sql = "SELECT * FROM `habitacion` WHERE idHabitacion=? ";
        Habitacion hab = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                hab = new Habitacion();
                hab.setIdHabitacion(idHabitacion);
                hab.setMant(rs.getBoolean("mantenimiento"));
                hab.setEstado(rs.getBoolean("estado"));
//                hab.setTipo(tp.setIdTipo(rs.getInt("tipo")));               
         
                
              JOptionPane.showMessageDialog(null, "habitacion encontrada");
            }else{
                  JOptionPane.showMessageDialog(null, "habitacion no encontrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }
return hab;
    }
   
public void modificarHabitacion(Habitacion habitacion){
    try{     
    String sql = "UPDATE `habitacion` SET `idHabitacion`=?,`idTipo`=?,`estado`=?,`mantenimiento`=? WHERE habitacion.idHabitacion=?"
                    + "correo=? , celular=?,estado=? WHERE huesped.idHuesped = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());
//            ps.setString(2, habitacion.getTipo);
            ps.setBoolean(3, habitacion.isEstado());
            ps.setBoolean(4, habitacion.isMant());
           
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion modificada exitosamente");

            } else {

                JOptionPane.showMessageDialog(null, "habitacoin no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitaciones " + ex);
        }

    }
    
}

                

