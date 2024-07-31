/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
abstract class Persona {
    private String nombres, apellidos, telefono, direccion, Fecha_nacimiento;

    public Persona(){}
    public Persona(String nombres, String apellidos, String telefono, String direccion, String Fecha_nacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccipon) {
        this.direccion = direccion;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }
    
    protected void agregar(){}  
    
}
