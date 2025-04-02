/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.Date;

/**
 * Se crea la clase cita
 * @author Alejandra 
 * @Since 01/04/2025
 */
public class Cita {
    /*
    El atributo Paciente hace referencia al paciente
    */
    private Paciente paciente;
    /*
    El atributo EmpleadoSalud, hace referencia al medico
    */
    private EmpleadoSalud medico;
    /*
    El atributo Date hace referencia a la fecha de la cita
    */
    private Date fecha;
    /*
    El atributo Double, se refiere al valor de la cita
    */
    private Double valor;
    /*
    */
    /*
    Se crea el metodo constructor de dichos atributos
    */
    public Cita(Paciente paciente, EmpleadoSalud medico, Date fecha, Double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valor = valor;
    }
     /*
    Se crea el getter and setter
    */
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public EmpleadoSalud getMedico() {
        return medico;
    }

    public void setMedico(EmpleadoSalud medico) {
        this.medico = medico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
}
