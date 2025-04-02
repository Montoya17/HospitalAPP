/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.Date;

/**
 *  se crea la clase hospital 
 * @author solis
 * @since 31/03/2025
 */

//////Atributos
public class Hospital  {
      /**
     * se crean los atributos
     * atributo nombre del hospital
     */
    private String nombre;
    /**
     * atributo dreccion, se refiere a la direccion  del hospital
     */
    private String direccion;
    /**
     * atributo telefono, se refiere al numero del telefono del hospital
     */
    private int telefono;
    /**
     * atributo logo, se refiere al logo del hospital
     */
    private String logo;
    
    /**
     *  el atributo presuspuesto, se refiere al presupuesto del hospital
     */
    private double presupuesto;
    
    /*
    el atributo metaVentasAnual, se refiere al as metas que tiene el hopital anualmente
    */
    private double metaVentasAnual;
    
    /*
    el atributo fechaFundacion, se refiere a la fechadefundacion
    */
    private Date fechaFundacion;
    
    /*
    el atributo estado se refiere al estado de lhospital(si esta en quiebra o no)
    */
    private boolean enQuiebra;
    
    /*
    el atributo latitud, se refiere a la latitud del hospital
    */
    private double latitud;
    
    private double longitud;
 
   
    /*se refiere al gerente que tiene el hospital
    */
    private Gerente gerente;
    private final Gerente Gerente;

    /*
    Se crean los metodos constructores de dichos atributos
    */

    public Hospital(String nombre, String direccion, int telefono, String logo, double presupuesto, double metaVentasAnual, Date fechaFundacion, boolean enQuiebra, double latitud, double longitud, Gerente gerente, Gerente Gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.enQuiebra = enQuiebra;
        this.latitud = latitud;
        this.longitud = longitud;
        this.gerente = gerente;
        this.Gerente = Gerente;
    }
      /*
    se hace el metodo de editar la informacion del hospital
    */

    public Hospital(String hospital_San_José_St_Bonaventure, String calle_123_Manizales, String e2r3, String logopng, int i, int i0, String string, double d, double d0, Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void editarInformacion(String nombre, String direccion, int telefono, String logo, double presupuesto,double metaVentasAnual,
        Date fechaFundacion, boolean estado, double latitud, double longitud, Gerente gerente){
      this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.enQuiebra = estado;
        this.latitud = latitud;
        this.longitud = longitud;
        this.gerente = gerente;
        System.out.println("La informacion del hospital fue cambiada correctamente.");}
    
    
    /*
    se hace el metodo para mostrar la inofrmacion de los atributos 
    */
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Meta de ventas anual: " + metaVentasAnual);
        System.out.println("Fecha de fundación: " + fechaFundacion);
        System.out.println("Estado: " + (enQuiebra ? "En quiebra" : "Activo"));
        System.out.println("Localización: Latitud " + latitud + ", Longitud " + longitud);
        System.out.println("Gerente: " + gerente.getNombre());}
    

   

    
    
/*
    se hacen metodos getter and setters para dichos atributos
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public boolean isEstado() {
        return enQuiebra;
    }

    public void setEstado(boolean enQuiebra) {
        this.enQuiebra = enQuiebra;
    }

    public boolean isEnQuiebra() {
        return enQuiebra;
    }

    public void setEnQuiebra(boolean enQuiebra) {
        this.enQuiebra = enQuiebra;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }



    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void editarInformacion(String hospital_San_José_Renovado, String avenida_Principal_Manizales, String string, String nuevo_logopng, int i, int i0, String string0, boolean b, double d, double d0, Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 

    
    
    
    
    
    
}

 
