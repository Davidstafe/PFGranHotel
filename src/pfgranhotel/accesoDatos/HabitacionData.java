
package pfgranhotel.accesoDatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import pfgranhotel.entidades.Habitacion;
import pfgranhotel.entidades.Huesped;


public class HabitacionData {
    
    private HabitacionData habD=new HabitacionData();
    private TipoDeHabitacionData tH;
    private Connection con=null;

    public HabitacionData() {
        con = Conexion.getConexion();
    }
    
    public void crearHabitacion(Habitacion habitacion){
        
        
        String sql = "INSERT INTO `habitacion `(  `idTipo`, `estado`, `Mantenimiento`)"
                + " VALUES (?,?,?) ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql, RETURN_GENERATED_KEYS);
            ps.setInt(1,habitacion.getTipo().getIdTipo());
            ps.setBoolean(2, habitacion.isEstado());
            ps.setBoolean(3, habitacion.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitacion.setEstado(rs.getBoolean(1));
            }
           JOptionPane.showMessageDialog(null, "habitacion creada");
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error en habitacion creada" + ex);
        }

    }
    }
    /*public List<Habitacion> listarHabitaciones(){
        
        try {
            List<Habitacion> habitaciones = new ArrayList<>();
            
            String sql="Select * from habitacion where";///como llamo a todas las habitaciones, tanto libres como ocupadas.
            
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
            
            Habitacion habitacion = new Habitacion(); ///esto era para crear una nueva habitacion??? o para llamar una nueva habitacion.
            habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
            habitacion.setEstado(rs.getBoolean("idTipo"));
            habitacion.setMant(rs.getBoolean("mant"));
            habitaciones.add(habitacion);
                    }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al listar habitaciones"+ ex);
        }*/
    
     
    
   


                

