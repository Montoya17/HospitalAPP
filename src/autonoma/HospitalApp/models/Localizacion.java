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
    Se hace el metodo actualizarCoordenadas para actualizar latitud y longitud
    */
    
    public void actualizarCoordenadas(double latitud,double longitud){
         this.latitud = latitud;
         this.longitud = longitud;
        System.out.println("Coordenadas actualizadas: Latitud = " + latitud + ", Longitud = " + longitud);
    }
    
    /*
    se hace el metodo obtener ubicacion en metodo string
    */
    
    public String obtenerUbicacion(){
       return "Ubicación: Latitud = " + latitud + ", Longitud = " + longitud;}
    
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
