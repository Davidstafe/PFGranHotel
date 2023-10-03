/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.entidades;

import java.time.LocalDate;

/**
 *
 * @author basti
 */
public class Reserva {
    private int idReserva;
    private Huesped huesped;
    private Habitacion habitacion;
    private LocalDate fechaIn;
    private LocalDate fechaOut;
    private double precioTotal;
    private int cantPersonas;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(Huesped huesped, Habitacion habitacion, LocalDate fechaIn, LocalDate fechaOut, double precioTotal, int cantPersonas, boolean estado) {
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.precioTotal = precioTotal;
        this.cantPersonas = cantPersonas;
        this.estado = estado;
    }

    public Reserva(int idReserva, Huesped huesped, Habitacion habitacion, LocalDate fechaIn, LocalDate fechaOut, double precioTotal, int cantPersonas, boolean estado) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.precioTotal = precioTotal;
        this.cantPersonas = cantPersonas;
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(LocalDate fechaOut) {
        this.fechaOut = fechaOut;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", huesped=" + huesped + ", habitacion=" + habitacion + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut + ", precioTotal=" + precioTotal + ", cantPersonas=" + cantPersonas + ", estado=" + estado + '}';
    }
    
    
}
