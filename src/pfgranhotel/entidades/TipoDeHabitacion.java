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
public class TipoDeHabitacion {
    private int idTipo;
    private int cantPers;
    private int cantCamas;
    private String tipoDeCamas;
    private String tipoDeHabitacion;
    private double precio;
    private boolean estado;

    public TipoDeHabitacion() {
    }

    public TipoDeHabitacion(int cantPers, int cantCamas, String tipoDeCamas, String tipoDeHabitacion, double precio, boolean estado) {
        this.cantPers = cantPers;
        this.cantCamas = cantCamas;
        this.tipoDeCamas = tipoDeCamas;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.estado = estado;
    }

    public TipoDeHabitacion(int idTipo, int cantPers, int cantCamas, String tipoDeCamas, String tipoDeHabitacion, double precio, boolean estado) {
        this.idTipo = idTipo;
        this.cantPers = cantPers;
        this.cantCamas = cantCamas;
        this.tipoDeCamas = tipoDeCamas;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precio = precio;
        this.estado = estado;
    }

     public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getCantPers() {
        return cantPers;
    }

    public void setCantPers(int cantPers) {
        this.cantPers = cantPers;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public String getTipoDeCamas() {
        return tipoDeCamas;
    }

    public void setTipoDeCamas(String tipoDeCamas) {
        this.tipoDeCamas = tipoDeCamas;
    }

    public String getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "tipoDeHabitacion : " + tipoDeHabitacion ;
    }
    
    
    
    
}
