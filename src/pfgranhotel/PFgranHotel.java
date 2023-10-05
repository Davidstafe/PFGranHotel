/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel;

import jdk.nashorn.internal.runtime.Debug;
import pfgranhotel.accesoDatos.HuespedData;
import pfgranhotel.entidades.Huesped;


public class PFgranHotel {

   
    public static void main(String[] args) {
        // TODO code application logic her
        
        ///creamos un huesped
        Huesped h = new Huesped(2,3036555, "Cordoba", "Marcelo", "avellaneda 253", "aCor@gmail.com", 1564563, false);
        HuespedData hd = new HuespedData();
 /////////////////+++++++++++++++++++++++++++++++++++++++++++++++++++++++--------------------------------------------------       
        ///GUARDAR HUESPED
//       hd.guardarHuesped(h);
        
//++++++++++++++++++++++++++++++++++-----------------------------------------------+++++++++++++++++++++++++++++++++++++++        
        
        ///BAJAMOS UN HUESPED
        ///hd.bajaHuesped(12345);
    //------------------------------------------+++++++++++++++++++++++++++++++++++++++++--------------------------------------    
        ///MODIFICAMOS UN HUESPED
//      hd.modificarHuesped(h);
//+++++++++++++++++++++++++++++++++++++++++++++++--------------------------------------------*****************************************

//trae el listado de los huespedes
//hd.listarHuesped();



hd.buscarHuesped(3036555);
      
    }
   
}
