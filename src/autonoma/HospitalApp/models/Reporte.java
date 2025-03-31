/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 * se crea la clase reporte 
 * @author solis
 * @since 31/03/2025
 */
public class Reporte {
    
    /*
    el atributo tipo hace refencia lat ipo de reporte
    */
    private String tipo;
    /*
    el atributo contenido hace refencia al contenido del reporte
    */
    private String contenido;
    
    /*
    se hace el metodo constructor para dicho atributos
    */

    public Reporte(String tipo, String contenido) {
        this.tipo = tipo;
        this.contenido = contenido;
    }
    /*
    se hacen os getters and setters para dichos atributos 
    */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    
    
    
}
