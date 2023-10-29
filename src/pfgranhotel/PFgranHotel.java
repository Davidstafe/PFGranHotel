/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import jdk.nashorn.internal.runtime.Debug;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.*;


public class PFgranHotel {

    public static void main(String[] args) throws SQLException {
        Connection con = Conexion.getConexion();
        HuespedData hd = new HuespedData();
        HabitacionData w = new HabitacionData();
        TipoDeHabitacionData t=new TipoDeHabitacionData();
                
        ReservaData r = new ReservaData();
        Habitacion a = new Habitacion();
//        Huesped c = new Huesped();
        
//        Huesped h = new Huesped(25, 987654321, "Caba", "Josefa", "9 de julio 253", "asd@gmail.com", 911542254, true);
//        hd.guardarHuesped(h);
//        TipoDeHabitacion d = new TipoDeHabitacion(1,4, 4, "King", "simple", 20000, true);
//        
////        Habitacion a = new Habitacion(d, true, true);
//       w.BuscarHabitacion(6);
//        Reserva res = new Reserva(h, a, LocalDate.of(2020, Month.MARCH, 25), LocalDate.of(2021, Month.MARCH, 25), 40000, 4, true);
//        r.guardarReserva(res);

//////        //creamos un huesped
////        Huesped h = new Huesped(2,9654321, "Caba", "Josefa", "9 de julio 253", "asd@gmail.com", 911542254, false);
////        HuespedData hd = new HuespedData();
// /////////////+++++++++++++++++++++++++++++++++++++++++++++++++++++++--------------------------------------------------       
        ///GUARDAR HUESPED
//      hd.guardarHuesped(h);
      
        
/////////////////++++++++++++++++++++++++++++++++++-----------------------------------------------+++++++++++++++++++++++++++++++++++++++        
        
       // /BAJAMOS UN HUESPED
//        hd.bajaHuesped(12345);
////////    ------------------------------------------+++++++++++++++++++++++++++++++++++++++++--------------------------------------    
        ////MODIFICAMOS UN HUESPED
//  hd.modificarHuesped(h);
//////+++++++++++++++++++++++++++++++++++++++++++++++--------------------------------------------*****************************************

/////////trae el listado de los huespedes
////hd.listarHuesped();
////
////        
////for (Huesped hues : hd.listarHuesped()) {
////            System.out.println(hues);
////        }


///hd.buscarHuesped(3036555);
 ///////////////////////////////////////////////////********************************////////////////////////////////     

    ////////////////////////////////////////////////////////////////////////////////////////////Habitacion///////////////////////////////////
//    
//// //   Listar Habitaciones
//        for (Habitacion has:w.listarHabitaciones()) {
//            System.out.println(has);
//        }
//  ///////////////////////////////+++++++++++++++++++++++++++++++++++++----------------------------  
////crear Habitacion+++++++++++    
TipoDeHabitacion z=new TipoDeHabitacion();
  z=   t.buscarThaHabitacioni(4);

Habitacion s=new Habitacion(z,true);
//w.crearHabitacion(s);
//w.bajaHabitacion(13);
w.BuscarHabitacion(50);
        System.out.println("");
    }
   
   
}
