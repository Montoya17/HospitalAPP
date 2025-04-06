/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**Se crea clase MedicamentoMarca
 *@Since 01/04/2025
 * @author Alejandra
 */
public final class MedicamentoMarca extends Medicamento  {
    /*
    El atributo fabricante, hace referencia a el fabricante de la Marca del 
    medicamento
    */
    private String fabricante;
    

/*
    Se crea el metodo constructor para dichos atributos
    */

    public MedicamentoMarca(String fabricante, String nombre, String descripcion, Double costo, double precioVenta) {
        super(nombre, descripcion, costo, precioVenta);
        this.fabricante = fabricante;
        calcularPrecioVenta();
    }
    
     @Override
    public void calcularPrecioVenta() {
        this.precioVenta = this.costo + (this.costo * 0.25);
    }
    

  

    
    /*
    Se crea el getter y el setter 
    */
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
