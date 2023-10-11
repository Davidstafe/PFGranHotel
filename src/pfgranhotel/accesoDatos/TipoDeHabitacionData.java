/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.accesoDatos;

import java.sql.Connection;

/**
 *
 * @author basti
 */
public class TipoDeHabitacionData {
    
    private TipoDeHabitacionData thd;
    private Connection con=null;
    
    public TipoDeHabitacionData(){
    
        con=Conexion.getConexion();
        
       /// public void TipoDeHabitacionData(){
            
            
        }    
}
    

