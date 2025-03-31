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
    private boolean estado;
    
    /*
    el atributo localizacion, se refiere a la latitud y localizacion
    */
    private Localizacion localizacion;
    
    /*
    se refiere al gerente que tiene el hospital
    */
    private Gerente gerente;

    /*
    Se crean los metodos constructores de dichos atributos
    */

    public Hospital(String nombre, String direccion, int telefono, String logo, double presupuesto, double metaVentasAnual, Date fechaFundacion, boolean estado, Localizacion localizacion, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = estado;
        this.Localizacion = localizacion;
        this.Gerente = gerente;
    }
    
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
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion Localizacion) {
        this.localizacion = Localizacion;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    


    
    
    
    
    
    
}

 
