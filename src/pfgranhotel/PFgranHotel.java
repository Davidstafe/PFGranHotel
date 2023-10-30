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
import java.util.ArrayList;
import jdk.nashorn.internal.runtime.Debug;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.*;


public class PFgranHotel {

    public static void main(String[] args) throws SQLException {
        Connection con = Conexion.getConexion();
        HuespedData hd = new HuespedData();
        HabitacionData w = new HabitacionData();
        TipoDeHabitacionData t=new TipoDeHabitacionData();
             ArrayList<Reserva>rec=new ArrayList<>();   
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
      
        
/////////////////++++++++++++++++++++++++++++++++++-----------------------------------------------+++++++++++++++++++++++++++++++++++++++        s
        
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
//TipoDeHabitacion z=new TipoDeHabitacion(1, 2, 25.1);

//  z=   t.buscarThaHabitacioni(4);


//w.crearHabitacion(s);
//w.bajaHabitacion(13);
//w.BuscarHabitacion(12);
//   Habitacion s=new Habitacion(12,z,true);    
//    w.modificarHabABM(s);//// no sale ver
       
  ////////////////////////////////////*********************************************TIPODDEHABITACION+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  
    ////////guardar
//      TipoDeHabitacion j=new TipoDeHabitacion(2,4,"king","simple",200.1, true);
//        t.guardarHab(j);
////buscar
//       t.buscarThaHabitacion("suite");
////listar
//        for (TipoDeHabitacion tr : t.listhabN()) {
//            System.out.println(tr);
//        }
/////////////////////////////////+++++++++++++RESERVA----------------------------------
Huesped h = new Huesped(2,9654321, "Caba", "Josefa", "9 de julio 253", "asd@gmail.com", 911542254, false);
TipoDeHabitacion z=new TipoDeHabitacion(1, 2, 25.1);
  Habitacion s=new Habitacion(12,z,true);  

Reserva g=new Reserva(h, s,LocalDate.of(2023, Month.MARCH, 25) , LocalDate.of(2023, Month.MARCH, 30), 25.6, 4, true);
//    r.guardarReserva(g);
//    r.bajaReserva(7);
//r.Buscar(2);
//r.habitacionxHuesped(2);
r.listarR();
        for ( Reserva de : r.listarR()) {
            System.out.println("dfewf"+de);
        }
    }
   
   
}
