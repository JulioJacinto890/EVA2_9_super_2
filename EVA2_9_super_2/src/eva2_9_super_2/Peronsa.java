/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super_2;

/**
 *
 * @author hp
 */
public class Peronsa {
    private String nombre;
    private String apellido;
    private int edad;

    public Peronsa() {
        this.nombre = "---";
        this.apellido = "---";
        this.edad = 0;
    }

    public Peronsa(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Datos:");
        System.out.println("Nombre"+this.nombre);
        System.out.println("Apellidos"+this.apellido);
        System.out.println("Edad"+this.edad);
    }
    
}
    
    
