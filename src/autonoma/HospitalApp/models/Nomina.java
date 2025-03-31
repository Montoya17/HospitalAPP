/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.Date;

/**
 * se crea la clase  Nomina
 * @author solis
 */
public class Nomina {
    
    /*
    el atributo id, hace refencia al id de la nomina
    */
    private int id;
    /*
    el atributo fecha, hace refencia a la  fecha de la nomina
    */
    private Date fecha;
    /*
    el atributo totalsalarios, hace refencia al total de salarios que tiene el empleado
    */
    private double totalsalarios;
    
    /*
    se hace el metodo constructor para los atributos mencionados 
    
    */

    public Nomina(int id, Date fecha, double totalsalarios) {
        this.id = id;
        this.fecha = fecha;
        this.totalsalarios = totalsalarios;
    }
    
    /*
    se hacen los getters y setters de los atributos mencionados
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalsalarios() {
        return totalsalarios;
    }

    public void setTotalsalarios(double totalsalarios) {
        this.totalsalarios = totalsalarios;
    }
    
    

    
}
