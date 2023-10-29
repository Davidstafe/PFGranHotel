/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author basti
 */
public class Conexion {
     private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="gran_hotel_91";
    private static final String USUARIO="root";
    private static final String PASS="";
    private static Connection   con ;
    
    private Conexion() {}
     
    public static Connection getConexion() {

        if (con == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con= DriverManager.getConnection(URL+DB,USUARIO,PASS);
                
             JOptionPane.showMessageDialog(null, "Conectado");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Driver" + ex.getMessage());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos");
        }
            
        }
        return con;
    
    }
    
}
