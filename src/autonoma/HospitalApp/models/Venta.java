/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

/**Se crea clase venta
 *@Since 01/04/2025
 * @author Alejandra
 */
public class Venta {
    /*
    El atributo id, se refiere a el codigo de barras de la venta
    */
    private int id;
    /*
    El atributo valorTotal, se refiere al valor total de la venta
    */
    private Double valorTotal;
/*
    se crea metodo constructor para dichos atributos
    */
    public Venta(int id, Double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
           
    }
    /**
     * se crea el metodo registrarVenta, apra registarla 
     * @param medicamento
     * @param cantidad 
     */
     public void registrarVenta(Medicamento medicamento, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de productos no pueden ser 0.");
            return;
        }

        this.valorTotal = medicamento.getPrecioVenta() * cantidad;
        System.out.println("Venta registrada exitosamente. Valor total: $" + valorTotal);
    }
     /*
     se crea el metodo obtenerDetalles para obtener los detalles de la venta 
     */
     public String obtenerDetalles() {
        return "ID Venta: " + id + ", Valor Total: $" + valorTotal;
    }
/*
    Se crea el getter y el setter
    */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
