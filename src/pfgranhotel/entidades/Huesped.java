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
public class Huesped {
    private int idHuesped;
    private int dni;
    private String apellido;
    private String nombres;
    private String domicilio;
    private String correo;
    private int celular;
    private boolean estado;

    public Huesped() {
    }

    public Huesped (int dni, String apellido,String nombres){
         this.dni = dni;
        this.apellido = apellido;
        this.nombres = nombres;
    }
    public Huesped(int idHuesped, int dni, String apellido, String nombres, String domicilio, String correo, int celular,boolean estado) {
        this.idHuesped = idHuesped;
        this.dni = dni;
        this.apellido = apellido;
        this.nombres = nombres;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
        
    }

    public Huesped(int dni, String apellido, String nombres, String domicilio, String correo, int celular,boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombres = nombres;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Huesped{" + "idHuesped=" + idHuesped + ", dni=" + dni + ", apellido=" + apellido + ", nombres=" + nombres + ", domicilio=" + domicilio + ", correo=" + correo + ", celular=" + celular + ", estado=" + estado + '}';
    }
    

    
    
    
}
