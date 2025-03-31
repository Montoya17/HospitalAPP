/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 * se crea la clase EmpleadoOperativo
 * @author solis
 */
public class EmpleadoOperativo extends Empleado {
    
    
    /*
    atrubto se refiere al area a la que se le asigno al empleado
    */
    private String areaTrabajada;
    
    /*
    se obtienen los atributos de empleado y se hace l metodod constructor  
    */
    public EmpleadoOperativo(String areaTrabajada, String nombre, int id, int edad, double salario) {
        super(nombre, id, edad, salario);
        this.areaTrabajada = areaTrabajada;
    }

    public String getAreaTrabajada() {
        return areaTrabajada;
    }

    public void setAreaTrabajada(String areaTrabajada) {
        this.areaTrabajada = areaTrabajada;
    }
    
    


    
    
    
}
