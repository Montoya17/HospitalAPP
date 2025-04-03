/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *se crea la clase enfermedad
 * @author Alejandra
 * @Since 012/04/2025
 */
public class Enfermedad {
    
            
       
    /*
    El atributo enfermedad, se refiere a la enfermedad del paciente
    */
    private String nombre;
   /*
    El atributo descripcion, hace referencia a la descripcion de la enfermedad 
    */
    private String descripcion;
    
    /*
    se crea el metodo de obtener descripcion de la enfermerdad
    */
    public void obtenerDescripcion() {
        System.out.println("Enfermedad: " + nombre);
        System.out.println("Descripción: " + descripcion);
    }
    
    /* 
    Se crea el getter y setter
    */
    public String getEnfermedad() {
        return nombre;
    }

    public void setEnfermedad(String enfermedad) {
        this.nombre = enfermedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /*
    Se crea el metodo constructor para dichos atributos
    */
    public Enfermedad(String enfermedad, String descripcion) {
        this.nombre = enfermedad;
        this.descripcion = descripcion;
        
    }


    }
    

