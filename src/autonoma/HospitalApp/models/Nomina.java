/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.Date;
import java.util.List;

/**
 * se crea la clase  Nomina
 * @author solis
 */
public class Nomina   {
    
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
    private double totalSalarios;
    /*
    se hace la clase estatica presupuestoHospital, hace referenccia al presupuesto inical del hospital
    */
    private static double presupuestoHospital = 1000000;
    /*
    se hace la clase contardor nominas para saber cuantas nominas a pagado el hspital
    */
    private static int contadorNominas = 1;
    
    private static boolean estadoActivo = true;
   
    /*
    se hace el metodo constructor para los atributos mencionados 
    
    */

    public Nomina(int id, Date fecha, double totalSalarios) {
        this.id = contadorNominas++;
        this.fecha = new Date();
        this.totalSalarios = 0;
    }

    private Nomina(Date fecha, double total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    
    /*
    se hace el metodo generar nomina, para generar nomina
    */
    
        public void generarNomina(List<Empleado> empleados) {
        if (!estadoActivo) {
            System.out.println("No se puede generar nómina. El hospital está en quiebra.");
            return;
        }
        
        // aqui calculamos el total de salarios del empleado que solicita nomina
        double total = totalSalarios(empleados);
        /*
        aqui mandamos diferentes mensajes cuand el hospital no tenga prsupuesto o este en quiebra
        */
        if (total > presupuestoHospital){
            System.out.println("El presupuesto del hospital no es !SUFICIENTE¡ para pagar esta nomina");
            System.out.println("Presupuesto actual:"+ presupuestoHospital);
            System.out.println("total de nomina" + total);
            
            /*
           si estadoactivo es false nos dia que el hospital esta en quiebra
            */
            estadoActivo = false ;
                System.out.println("El hospital a entrado en estado de quiebra");
                
        }
        
        /*
        si la nomina se hace correctamente descontamos del presupuesto del hospital 
        */
        
        presupuestoHospital -= total;
        
        /*
        creamos la nomina y la almacenamos con su respectiva fecha
        */
        
        Nomina nuevaNomina = new Nomina(new Date(), total);
          almacenarNomina(nuevaNomina);
          
        System.out.println("Nómina generada exitosamente:");
        System.out.println("ID: " + nuevaNomina.getId());
        System.out.println("Fecha: " + nuevaNomina.getFecha());
        System.out.println("Total: " + nuevaNomina.getTotalsalarios());
        System.out.println("Presupuesto restante: " + presupuestoHospital);
        
        
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
        return totalSalarios;
    }

    public void setTotalsalarios(double totalSalarios) {
        this.totalSalarios = totalSalarios;
    }

    

    public double getTotalSalarios() {
        return totalSalarios;
    }

    public void setTotalSalarios(double totalSalarios) {
        this.totalSalarios = totalSalarios;
    }

    public static double getPresupuestoHospital() {
        return presupuestoHospital;
    }

    public static void setPresupuestoHospital(double presupuestoHospital) {
        Nomina.presupuestoHospital = presupuestoHospital;
    }

    public static int getContadorNominas() {
        return contadorNominas;
    }

    public static void setContadorNominas(int contadorNominas) {
        Nomina.contadorNominas = contadorNominas;
    }

    public static boolean isEstadoActivo() {
        return estadoActivo;
    }

    public static void setEstadoActivo(boolean estadoActivo) {
        Nomina.estadoActivo = estadoActivo;
    }

    private void almacenarNomina(Nomina nuevaNomina) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private double totalSalarios(List<Empleado> empleados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

    
}
