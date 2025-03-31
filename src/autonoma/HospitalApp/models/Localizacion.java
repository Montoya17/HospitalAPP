/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 * se crea la clase localizacion
 * @author solis
 * @since 31/03/2025
 */
public class Localizacion {
    /*
    el atributo latitud, hace referencia a la latitud del hospital
    */
    private double latitud;
    /*
    el atributo longitud, hace referencia a la latitud del hospital
    */
    private double longitud;

    
    //se hace el metodo constrcutor para dichos atributos
    public Localizacion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }
    
    /*
    se hacen metodos getter and setters para dichos atributos
    */

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
    
    
}
