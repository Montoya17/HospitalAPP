/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**Se hace la clase Medicamento
 *@Since 01/04/2025
 * @author Alejandra
 */
public abstract class Medicamento {
    /*
    El atributo nombre, hace referencia al nombre del medicamento
    */
    private String nombre;
    /*
    El atributo descripcion,se refiere a la descripcion del medicamento
    */
    private String descripcion;
    /*
    El atributo costo, se refiere al costo del medicamento
    */
    private Double costo; 
    /*
    El atributo precioVenta, se refiere al Precio de la venta del medicamento
    */
    private Double precioVenta;
    
    /*
    Se crea metodo constructor para dichos atributos
    */

    public Medicamento(String nombre, String descripcion, Double costo, Double precioVenta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.precioVenta = precioVenta;
        
    }
/*
    Se crea el getter y el setter 
    */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
}
