/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author emanu
 */
public class Cliente extends Persona {
    private String nit;
    public Cliente(){}
    public Cliente(String nit, String nombres, String apellidos, String telefono, String direccion, String Fecha_nacimiento) {
        super(nombres, apellidos, telefono, direccion, Fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar(){
    System.out.println("Nit: " + getNit());
    System.out.println("Nombre: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Telefono: " + getTelefono());
    System.out.println("Dirección: " + getDireccion());
    System.out.println("Fecha Nacieminto: " + getFecha_nacimiento());  
    System.out.println("---------------------");
    }

}
    

