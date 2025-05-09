/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**
 * se crea la clase EmpleadoSalud
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
   public EmpleadoSalud(String nombre, int id, int edad, double salario, String especialidad, int horasTrabajadas) {
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = (int) horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.012 * horasTrabajadas);
    }

    public String getCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    


}
