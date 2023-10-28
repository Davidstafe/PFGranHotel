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
    private TipoDeHabitacionData tH = new TipoDeHabitacionData();

    private Connection con = null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }
///////////////////////////////**************CREO OTRO METODO PARA NO BORRARLES NADA

    public void crearHabABM(Habitacion habitacion) {


//        PreparedStatement ps;
//        try {
//            ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
//            ps.setInt(1, habitacion.getIdHabitacion());
//            ps.setString(2, tipo.getTipoDeHabitacion());
//            ps.setBoolean(3, habitacion.isEstado());
//            ps.executeUpdate();
//
//            ResultSet rs = ps.getGeneratedKeys();
//
//            if (rs.next()) {
//                habitacion.setIdHabitacion(rs.getInt(1));
//               
//                habitacion.setEstado(rs.getBoolean(3));
//                
//     
    String sql = "INSERT INTO habitacion (idHabitacion,idTipo, estado) VALUES (?,?,?)";
    PreparedStatement ps;
    
    try {
        ps = con.prepareStatement(sql);
        ps.setInt(1, habitacion.getIdHabitacion());
        ps.setInt(2, (habitacion.getTipo().getIdTipo()));
        ps.setBoolean(3, habitacion.isEstado());
        ps.executeUpdate();

//        ResultSet rs = ps.getGeneratedKeys();
//
//        if (rs.next()) {
//            habitacion.setIdHabitacion(rs.getInt(1));
//        }

        JOptionPane.showMessageDialog(null, "Habitación creada");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en la creación de la habitación: " + ex.getMessage());
    }



    }
    public void modificarHabABM(Habitacion habitacion) {
        try {
            String sql = "UPDATE `habitacion` SET `idHabitacion`=?,`idTipo`=?,`estado`=? WHERE idhabitacion= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getIdHabitacion());
            ps.setString(2, habitacion.getTipo().getTipoDeHabitacion());
            ps.setBoolean(3, habitacion.isEstado());

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
                ///ESTO ES NUEVO///*********
                TipoDeHabitacion tp = new TipoDeHabitacion();
                tp.setTipoDeHabitacion(toString());
                /////*******

                hab.setIdHabitacion(idHabitacion);
                hab.setEstado(rs.getBoolean("estado"));
                TipoDeHabitacion a = tH.buscarThaHabitacioni(rs.getInt("idtipo"));;
//                h.setTipo(a);
//                tipo.add(h);

                JOptionPane.showMessageDialog(null, "habitacion encontrada");
            } else {
                JOptionPane.showMessageDialog(null, "habitacion no encontrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }
        return hab;
    }

    public void modificarHabitacion(Habitacion habitacion) {
        try {
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

    public ArrayList<Habitacion> obtenerhabiIdhabi(int idhabitacion) {
        ArrayList<Habitacion> tipo = new ArrayList<>();
        String sql = "SELECT * FROM habitacion WHERE idhabitacion=? and estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idhabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setIdHabitacion(idhabitacion);
                h.setEstado(rs.getBoolean("Estado"));
                TipoDeHabitacion a = tH.buscarThaHabitacioni(rs.getInt("idtipo"));
                h.setTipo(a);
                tipo.add(h);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos" + ex);
        }

        return tipo;

    }

    public ArrayList<Habitacion> obtenerhabiIdhabD(int idHabitacion) {
        ArrayList<Habitacion> tipo = new ArrayList<>();
        String sql = "SELECT * FROM habitacion where idtipo=? and estado=0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Habitacion h = new Habitacion();

                h.setIdHabitacion(rs.getInt("idhabitacion"));
                h.setEstado(rs.getBoolean("Estado"));
                TipoDeHabitacion a = tH.buscarThaHabitacioni(rs.getInt("idtipo"));
                h.setTipo(a);

                tipo.add(h);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de datos" + ex);
        }

        return tipo;

    }

    public ArrayList<Habitacion> lista(int idtipo) {
        ArrayList<Habitacion> tipo = new ArrayList<>();
        String sql = "SELECT*from Habitacion where idtipo=? and estado=1";
        Habitacion h = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idtipo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                h = new Habitacion();
                h.setIdHabitacion(rs.getInt("idhabitacion"));
                h.setEstado(rs.getBoolean("estado"));
                TipoDeHabitacion a = tH.buscarThaHabitacioni(rs.getInt("idtipo"));;
                h.setTipo(a);
                tipo.add(h);

//                JOptionPane.showMessageDialog(null, "habitacion encontrada");
            } else {
//                 JOptionPane.showMessageDialog(null, "huesped no encontrado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }

        return tipo;
    }
}

//OK            

