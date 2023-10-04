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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import pfgranhotel.entidades.Huesped;


public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
    }

    ///guardar huesped
    public void guardarHuesped(Huesped huesped) {
        String sql = "INSERT INTO `huesped`( `DNI`, `Apellido`, `Nombres`, `Domicilio`, `Correo`, `Celular`, Estado)"
                + " VALUES (?,?,?,?,?,?,?) ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1, huesped.getDni());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getNombres());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                huesped.setIdHuesped(rs.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "Huesped guardado");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error en guardar huesped " + ex);
        }

    }

    ///cambio de estado
    public void bajaHuesped(int dni) {

        String sql = "  UPDATE Huesped SET Estado =0 WHERE DNI= ? ";

        PreparedStatement ps;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, dni);
            ps.executeUpdate();

            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Huesped dado de baja exitosamente");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Huesped no encontrado " + ex);
        }
    }

    public void modificarHuesped(Huesped huesped) {
        ///////////////******CHEQUEAR MAÑANA XQ NO FUNCION**********//////////////////////
        try {
            String sql = "UPDATE huesped SET dni = ?, Apellido = ?,Nombres=?,domicilio=?,"
                    + "correo=? , celular=?,estado=? WHERE huesped.idHuesped = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, huesped.getDni());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getNombres());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getCorreo());
            ps.setInt(6, huesped.getCelular());
            ps.setBoolean(7, huesped.isEstado());
            ps.setInt(8, huesped.getIdHuesped());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "huesped modificada exitosamente");

            } else {

                JOptionPane.showMessageDialog(null, "huesped no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped " + ex);
        }

    }

    public ArrayList<Huesped> listarHuesped() {
        ArrayList<Huesped> huesped = new ArrayList<>();
        String sql = "SELECT * FROM `huesped` WHERE estado=1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Huesped h = new Huesped();
                h.setIdHuesped(rs.getInt("idHuesped"));
                h.setDni(rs.getInt("dni"));
                h.setApellido(rs.getString("Apellido"));
                h.setNombres(rs.getString("Nombres"));
                h.setDomicilio(rs.getString("Domicilio"));
                h.setCorreo(rs.getString("Correo"));
                h.setCelular(rs.getInt("Celular"));
                h.setEstado(rs.getBoolean("Estado"));
                huesped.add(h);
                JOptionPane.showMessageDialog(null, huesped);//trae el huesped y lo muestra por ventana
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error del sistema" + ex);
        }

        return huesped;
    }

    public void buscarHuesped(int dni) {
        String sql = "SELECT * FROM `huesped` WHERE dni=? ";
        Huesped huesped = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setDni(dni);
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setApellido(rs.getString("Apellido"));
                huesped.setNombres(rs.getString("Nombres"));
                huesped.setDomicilio(rs.getString("Domicilio"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getInt("Celular"));
                huesped.setEstado(rs.getBoolean("Estado"));
                
                JOptionPane.showMessageDialog(null, "huesped encontrado"+huesped);
            }else{
                  JOptionPane.showMessageDialog(null, "huesped no encontrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }

    }

    public void eliminarHuesped(int dni){
        String sql="DELETE FROM `huesped` WHERE dni=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            int filas=ps.executeUpdate();
            if (filas>1) {
                JOptionPane.showMessageDialog(null, "Huesped borrado");
            }else{
                 JOptionPane.showMessageDialog(null, "Huesped  no borrado"); 
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error del sistema");
        }
        
        
    }
    
}
