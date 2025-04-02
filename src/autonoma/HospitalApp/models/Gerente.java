/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 * se crea la clase Gerente
 * @author solis
 * @since 31/03/2025
 */
public class Gerente {
    
    /*
    el atributo nombre, se refiere al nombre del gerente
    */
    private String nombre;
    /*
    el atributo id, se refiere al id del gerente
    */
    private int id;
    /*
    el atributo edad, se refiere ala  edad del gerente
    */
    private int edad;
    /*
    el atributo carrera, se refiere ala profesion del gerente
    */
    private String carrera;
    
    /*
    se crea el metodo constructor con dichos atributos
    */

    public Gerente(String nombre, int id, int edad, String carrera) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.carrera = carrera;
    }
    
    
    /*
    se crea el metodo actualizarDatos para actualizar los datos del gerente
    */
    public void actualizarDatos(String nombre, int id, int edad,String carrera){
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.carrera = carrera;
        System.out.println("Datos actualizados correctamente");}
    
    /*
    se crea el metodo obtenerDatos para obtener los datos ddel gerente
    */
    
    public String obtenerDatos(){
        return "Gerente:" + nombre + "\n Id" +id + "\n edad" + "\nCarrera" + carrera;}
    
    /*
    se crea los getters and setters  con dichos atributos
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    
    
    
    
}
