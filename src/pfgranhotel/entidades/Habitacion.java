
package pfgranhotel.entidades;


public class Habitacion {
    private int idHabitacion;
    private TipoDeHabitacion tipo;
    private boolean estado;
    private boolean mant;
    

    public Habitacion() {
    }

    public Habitacion(TipoDeHabitacion tipo, boolean estado,boolean mant) {
        this.tipo = tipo;
        this.estado = estado;
        this.mant  =mant;
    }

    public Habitacion(int idHabitacion, TipoDeHabitacion tipo, boolean estado, boolean mant) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.estado = estado;
        this.mant = mant;
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
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", tipo=" + tipo + ", estado=" + estado + ", mant " + mant+'}';
    }
    
    
}
