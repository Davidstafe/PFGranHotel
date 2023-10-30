
package pfgranhotel.entidades;


public class Habitacion {
    private int idHabitacion;
    private TipoDeHabitacion tipo;
    private boolean estado;
    private boolean mant;
    private String crearTipo;

    public String getCrearTipo() {
        return crearTipo;
    }

    public void setCrearTipo(String crearTipo) {
        this.crearTipo = crearTipo;
    }

    public Habitacion(int idHabitacion, boolean estado, String crearTipo) {
        this.idHabitacion = idHabitacion;
        this.estado = estado;
        this.crearTipo = crearTipo;
    }
    

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, TipoDeHabitacion tipo, boolean estado) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.estado = estado;
    }

    
    public Habitacion(TipoDeHabitacion tipo, boolean estado,boolean mant) {
        this.tipo = tipo;
        this.estado = estado;
        this.mant  =mant;
    }

    public Habitacion(TipoDeHabitacion tipo, boolean estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    

  public Habitacion(int idHabitacion,boolean estado,TipoDeHabitacion tipo) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.estado = estado;
      
    }   
    
    
    
    
    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public TipoDeHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeHabitacion tipo) {
        this.tipo = tipo;
    
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isMant() {
        return mant;
    }

    public void setMant(boolean mant) {
        this.mant = mant;
    }
    

    @Override
    public String toString() {
      
       return ""+idHabitacion;
    }

    
    
    
}
