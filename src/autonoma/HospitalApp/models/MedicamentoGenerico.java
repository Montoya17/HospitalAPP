/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**Se crea la clase MedicamentoGenerico
 *@Since 01/04/2025
 * @author Alejandra
 */
public class MedicamentoGenerico extends Medicamento {
    /*
    El atributo precioVenta, se refiere al precio del MedicamentoGenerico
    */
    private Double precioVenta;
    /*
    Se crea metodo constructor para el atributo
    */

    public MedicamentoGenerico(String nombre, String descripcion, Double costo, double precioVenta) {
        super(nombre, descripcion, costo, precioVenta);
        this.precioVenta = precioVenta;
        calcularPrecioVenta();
    }
    
    @Override
    public void calcularPrecioVenta() {
        this.precioVenta = this.costo + (this.costo * 0.10);
    }
    
/*
    Se crea el getter y setter 
    */

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
}
