/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel;

import pfgranhotel.accesoDatos.HuespedData;
import pfgranhotel.entidades.Huesped;


public class PFgranHotel {

   
    public static void main(String[] args) {
        // TODO code application logic her
        
        ///creamos un huesped
        Huesped h = new Huesped(12345, "Cordoba", "Julian", "avellaneda 223", "aCor@gmail.com", 123123, true);
        HuespedData hd = new HuespedData();
        
        ///GUARDAR HUESPED
        ///hd.guardarHuesped(h);
        
        
        
        ///BAJAMOS UN HUESPED
        ///hd.bajaHuesped(12345);
        
        ///MODIFICAMOS UN HUESPED
        hd.modificacionHuesped(h);
    }
   
}
