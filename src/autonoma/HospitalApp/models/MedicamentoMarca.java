/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**Se crea clase MedicamentoMarca
 *@Since 01/04/2025
 * @author Alejandra
 */
public class MedicamentoMarca {
    /*
    El atributo fabricante, hace referencia a el fabricante de la Marca del 
    medicamento
    */
    private String fabricante;
    /*
    El atributo precioVenta,se refiere al precio de la venta del medicamento
    */
    private Double precioVenta;
/*
    Se crea el metodo constructor para dichos atributos
    */
    public MedicamentoMarca(String fabricante, Double precioVenta) {
        this.fabricante = fabricante;
        this.precioVenta = precioVenta;
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
