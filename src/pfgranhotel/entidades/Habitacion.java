/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.entidades;

/**
 *
 * @author basti
 */
public class Habitacion {
    private int idHabitacion;
    private TipoDeHabitacion tipo;
    private boolean estado;
    

    public Habitacion() {
    }

    public Habitacion(TipoDeHabitacion tipo, boolean estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public Habitacion(int idHabitacion, TipoDeHabitacion tipo, boolean estado) {
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

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
    
    
}
