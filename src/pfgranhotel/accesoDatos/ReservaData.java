/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.accesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.Huesped;
import pfgranhotel.entidades.Reserva;

public class ReservaData {

    private Connection con = null;
    private HuespedData hData = new HuespedData();
    private HabitacionData habData = new HabitacionData();

    public ReservaData() {
        con = Conexion.getConexion();

    }

    public ReservaData(HuespedData hData, HabitacionData habData) {
        this.hData = hData;
        this.habData = habData;
    }

    public void guardarReserva(Reserva reserva) throws SQLException {

        String sql = "INSERT INTO reserva( idHuesped, idHabitacion, fechaIn,fechaOut, precioTotal, cantPersonas, estado)"
                + " VALUES (?,?,?,?,?,?,?)";

        
        /// Marce, verificà que no me haya mandado alguna cagada
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getHuesped().getIdHuesped());
            ps.setInt(2, reserva.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getFechaIn()));
            ps.setDate(4, Date.valueOf(reserva.getFechaOut()));
            ps.setDouble(5, reserva.getPrecioTotal());
            ps.setInt(6, reserva.getCantPersonas());
            ps.setBoolean(7, reserva.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Reserva  realizada");
            } else {
                JOptionPane.showMessageDialog(null, "Reserva no realizada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al realizar reserva");
        }

    }

    public List<Reserva> reservar() {
        List<Reserva> reserva = new ArrayList<>();
        String sql = "SELECT `idReserva`, `DNI`, `idHabitacion` FROM `reserva`";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                System.out.println("idReserva " + rs.getInt("idReserva"));
                System.out.println("DNI " + rs.getInt("DNI"));
                System.out.println("idHabitacion " + rs.getInt("idHabitacion"));
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return reserva;
    }
    //dAR DE BAJA RESERVA

    public void bajaReserva(Reserva reserva) throws SQLException {

        String sql = " UPDATE `reserva` SET `estado`= 0 WHERE 'DNI'=? ";

        PreparedStatement ps = con.prepareStatement(sql);
        int fila = ps.executeUpdate();

        if (fila > 0) {
            JOptionPane.showMessageDialog(null, "Reserva dada de baja exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "Reserva no dada de baja");

        }
    }

    //HUESPED POR HABITACIÒN 
    public List<Reserva> huespedxHabitacion (int idHabitacion)throws SQLException {
         ArrayList<Reserva> reservas = new ArrayList<>();
      String sql= "SELECT DNI, Apellido FROM 'huesped' JOIN 'reserva' ON huesped.idHuesped=reserva.idHuesped AND reserva.idHabitacion =?";  
    try{  
PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idHabitacion);  
        ResultSet rs= ps.executeQuery();
   
        while(rs.next()) {
              Reserva r = new Reserva();  
              Huesped h= hData.buscarHuesped(rs.getInt("DNI"));
               h.setApellido(rs.getString("Apellido"));
          
            reservas.add(r);
            
            
        }   ps.close();    
}catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al obtener el huesped"+ex.getMessage());
    }  return reservas;  
    }
    // habitaciònxHuesped
     
    public List<Reserva> habitacionxHuesped(int idHuesped){
        List<Reserva> reser = new ArrayList<>();
          Reserva res=null;
        String sql ="SELECT * FROM Reserva where idHuesped=?";
      
        try{
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                
                Huesped h = hData.buscarHuespedes(rs.getInt("idHuesped"));
                Habitacion a = habData.BuscarHabitacion(rs.getInt("idHabitacion"));
//                JOptionPane.showMessageDialog(null," huesped encontrada");
                res.setHuesped(h);
                res.setHabitacion(a);
             
                res.setFechaIn(rs.getDate("fechaIn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate());
                res.setPrecioTotal(rs.getDouble("precio total"));
                
                res.setEstado(rs.getBoolean("estado"));
               
                reser.add(res);
//                JOptionPane.showMessageDialog(null, "holiiiiiiiiiiiiiiiis");
            }
            ps.close();
        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "huesped encontradomal"+ex);
     }
   JOptionPane.showMessageDialog(null, "holeeeeeeeeeeeis");
  return reser;  
    }



public ArrayList<Reserva>listarR() {
       ArrayList<Reserva> reserv = new ArrayList<>();
        String sql = "SELECT * FROM reserva where estado=1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                res.setCantPersonas(rs.getInt("cant camas"));
                res.setFechaIn(rs.getDate("fechaIn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate());
                res.setPrecioTotal(rs.getDouble("precio total"));
                res.setEstado(rs.getBoolean("estado"));
                Huesped h = hData.buscarHuespedes(rs.getInt("idHuesped"));
                Habitacion a = habData.BuscarHabitacion(rs.getInt("idHabitacion"));
                res.setHuesped(h);
                res.setHabitacion(a);
                reserv.add(res);
            }
           
        } catch (SQLException ex) {
         
        }
 
        return reserv;
    }
     public Reserva Buscar(int idHuesped){
          Reserva res=null;
        String sql ="SELECT * FROM Reserva where idHuesped=?";
      
        try{
        PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                res = new Reserva();
                res.setIdReserva(rs.getInt("idReserva"));
                
                Huesped h = hData.buscarHuespedes(rs.getInt("idHuesped"));
                Habitacion a = habData.BuscarHabitacion(rs.getInt("idHabitacion"));
//                JOptionPane.showMessageDialog(null," huesped encontrada");
                res.setHuesped(h);
                res.setHabitacion(a);
             
                res.setFechaIn(rs.getDate("fechaIn").toLocalDate());
                res.setFechaOut(rs.getDate("fechaOut").toLocalDate());
                res.setPrecioTotal(rs.getDouble("precio total"));
                
                res.setEstado(rs.getBoolean("estado"));
               
                
//                JOptionPane.showMessageDialog(null, "holiiiiiiiiiiiiiiiis");
            }
            ps.close();
        } catch (SQLException ex) {
//           JOptionPane.showMessageDialog(null, "huesped encontradomal"+ex);
     }
   JOptionPane.showMessageDialog(null, "holeeeeeeeeeeeis");
  return res;   
         
     }
}
//mmm//
