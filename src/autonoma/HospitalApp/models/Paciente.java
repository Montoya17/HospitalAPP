/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.ArrayList;

/**
 *Se crea la clase paciente
 * @author Alejandra 
 * @@since 01/04/2025
 */
public class Paciente {
    /*
    El atributo nombre, hace referencia al nombre del paciente
    */
   private String nombre;
   /*
   El atributo id,se refiere al documento del paciente
   */
    private int id;
    /*
    El atributo edad,hace referencia a la edad que tiene el paciente
    */
    private int edad;
    /*
    El atributo correo,hace referenci9a a el correo que tiene el paciente
    */
    private String correo;
    /*
    El atributo telefono, corresponde a el telefono que tiene el paciente
    */
    
    private int telefono;
    /*
    El atributo estado, se refiere al estado en el que se encuenta el paciente,
    si es critico o saludable
    */
    
    private String estado;
    /*
    El atributo enfermedades, hace referencdia a las listas de enfermedades que 
    tiene el paciente
    */
    
    private ArrayList <Enfermedad>enfermedades;
    /*
    El atributo medicina, hace referencia a las medicinas que debe tomar el 
    paciente 
    */
    
    private ArrayList <Medicina>medicinas;
    /*
    Se crea el metodo constructor para dichos atributos
    */
    public Paciente(String nombre, int id, int edad, String correo, int telefono, String estado, ArrayList<Enfermedad> enfermedades, ArrayList<Medicina> medicinas) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.enfermedades = enfermedades;
        this.medicinas = medicinas;
 
        
        
    }

    /*
        Se crea el metodo getter and setters
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList<Medicina> getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(ArrayList<Medicina> medicinas) {
        this.medicinas = medicinas;
    }
    
    
}
