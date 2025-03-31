/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *se crea la clase empleado 
 * @author solis
 * @since 31/03/2025
 */
public abstract  class Empleado {
    
    /*
    el atributo nombre, hace refencial al nombre del empleado
    */
    private String nombre;
    /*
    el atributo id, hace refencial al id del empleado
    */
    private int id;
    /*
    el atributo edad, hace refencial ala edad del empleado
    */
    private int edad;
    /*
    el atributo salario, hace refencial al salario del empleado
    */
    private double salario;

    /* 
    se crea el metodo constructor con los respectivos atributos
    */
    public Empleado(String nombre, int id, int edad, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.salario = salario;
    }
    
    /*
    se crean los metodos getters and setters co los dichos atributos
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
}
