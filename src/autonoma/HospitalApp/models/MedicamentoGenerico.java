/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**Se crea la clase MedicamentoGenerico
 *@Since 01/04/2025
 * @author Alejandra
 */
public class MedicamentoGenerico {
    /*
    El atributo precioVenta, se refiere al precio del MedicamentoGenerico
    */
    private Double precioVenta;
    /*
    Se crea metodo constructor para el atributo
    */
    public MedicamentoGenerico() {
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
    
}
