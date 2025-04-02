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
    private String enfermedad;
   /*
    El atributo descripcion, hace referencia a la descripcion de la enfermedad 
    */
    private String descripcion;
    /* 
    Se crea el getter y setter
    */
    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
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
        this.enfermedad = enfermedad;
        this.descripcion = descripcion;
        
    }


    }
    

