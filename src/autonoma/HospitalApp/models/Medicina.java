/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *Se crea la clase medicina
 * @author Alejandra
 * @Since 01/04/2025
 */
public class Medicina {
    /*
    El atributo nombre, hace referencia al nombre de la medicina
    */
    private String nombre;
    /*
    El atributo descripcion, se refiere a la descripcion de la medicina
    */
    private String descripcion;
    /*
    El atributo enfermedadAliviadad, se refiere a la enfermedad que ya se
    alivio
    */
    private String enfermedadAliviada;
    /*
    Se crea metodo constructor para dichos atributos
    */

    public Medicina(String nombre, String descripcion, String enfermedadAliviada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadAliviada = enfermedadAliviada;
        
    }
    /*
    se crea el getter y setter
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEnfermedadAliviada() {
        return enfermedadAliviada;
    }

    public void setEnfermedadAliviada(String enfermedadAliviada) {
        this.enfermedadAliviada = enfermedadAliviada;
    }
    
}
