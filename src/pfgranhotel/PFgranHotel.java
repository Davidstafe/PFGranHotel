/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import jdk.nashorn.internal.runtime.Debug;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.*;


public class PFgranHotel {
    
    public static void main(String[] args) throws SQLException {
//        HuespedData hd = new HuespedData();
        HabitacionData w = new HabitacionData();
//        ReservaData r = new ReservaData();
//        Huesped h = new Huesped(2, 987654321, "Caba", "Josefa", "9 de julio 253", "asd@gmail.com", 911542254, true);
//        hd.guardarHuesped(h);
       TipoDeHabitacion d = new TipoDeHabitacion(2,4, 4, "King", "simple", 20000, true);
        
        Habitacion a = new Habitacion(d, true, true);
        
        w.crearHabitacion(a);
//        w.crearHabitacion(a);
//        Reserva res = new Reserva(h, a, LocalDate.of(2020, Month.MARCH, 25), LocalDate.of(2021, Month.MARCH, 25), 40000, 4, true);
//        r.guardarReserva(res);

        ///creamos un huesped
//        Huesped h = new Huesped(2,987654321, "Caba", "Josefa", "9 de julio 253", "asd@gmail.com", 911542254, true);
//        HuespedData hd = new HuespedData();
 /////////////////+++++++++++++++++++++++++++++++++++++++++++++++++++++++--------------------------------------------------       
        ///GUARDAR HUESPED
//      hd.guardarHuesped(h);
      
        
//++++++++++++++++++++++++++++++++++-----------------------------------------------+++++++++++++++++++++++++++++++++++++++        
        
        ///BAJAMOS UN HUESPED
        ///hd.bajaHuesped(12345);
    //------------------------------------------+++++++++++++++++++++++++++++++++++++++++--------------------------------------    
        ///MODIFICAMOS UN HUESPED
//      hd.modificarHuesped(h);
//+++++++++++++++++++++++++++++++++++++++++++++++--------------------------------------------*****************************************

//trae el listado de los huespedes
//hd.listarHuesped();



///hd.buscarHuesped(3036555);
      

///
    }
   
}
