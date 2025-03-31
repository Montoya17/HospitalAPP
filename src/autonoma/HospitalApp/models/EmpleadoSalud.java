/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 *
 * @author solis
 */
public class EmpleadoSalud extends Empleado {
    
    /*
    el atributo especialidad se refiere a la especialidad del trabajador de salud
    */
    private String especialidad;
    
    /*
    el atributo horasTrabajadas, se refiere al total de horas que trabajo el empleado
    */
    private int horasTrabajadas;
    
     /*
    se obtienen los atributos de empleado y se hace el metodo constructor  
    */
    
    public EmpleadoSalud(String nombre, int id, int edad, double salario) {
        super(nombre, id, edad, salario);
    }

    public EmpleadoSalud(String especialidad, int horasTrabajadas, String nombre, int id, int edad, double salario) {
        super(nombre, id, edad, salario);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    /*
    se hacen los getters and setters de los atributos mencionados
    
    */

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    
}
