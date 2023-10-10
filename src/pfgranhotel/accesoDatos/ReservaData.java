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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pfgranhotel.entidades.Huesped;
import pfgranhotel.entidades.Reserva;

public class ReservaData {

    private Connection con = null;
    private HuespedData hData=new HuespedData();
    private HabitacionData habData=new HabitacionData();

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
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, reserva.getHuesped().getIdHuesped());
            ps.setInt(2, reserva.getHabitacion().getIdHabitacion());
            ps.setDate(3, Date.valueOf(reserva.getFechaIn()));
            ps.setDate(4, Date.valueOf(reserva.getFechaOut()));
            ps.setDouble(5, reserva.getPrecioTotal());
            ps.setInt(6, reserva.getCantPersonas());
            ps.setBoolean(7, reserva.isEstado());

            ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
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
    
    public List<Reserva> reservar(){
    List<Reserva> reserva =new ArrayList<>();
    String sql="SELECT `idReserva`, `DNI`, `idHabitacion` FROM `reserva`";
    
      try {
            PreparedStatement ps= con.prepareStatement(sql);
          ResultSet rs=ps.executeQuery();
            while (rs.next()) {  
                Reserva res= new Reserva();
                System.out.println("idReserva "+rs.getInt("idReserva") );
                System.out.println("DNI "+rs.getInt("DNI"));
                System.out.println("idHabitacion "+rs.getInt("idHabitacion"));
                }
            ps.close();
              } catch (SQLException ex) {
            Logger.getLogger(ReservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    return reserva;
 }
                
            }

//mmm
