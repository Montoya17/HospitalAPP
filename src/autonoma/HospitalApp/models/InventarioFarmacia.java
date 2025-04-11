/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.util.ArrayList;
import java.util.Date;

/**Se crea la clase InventarioFarmacia
 *01/04/2025
 * @author Alejandra 
 */
public class InventarioFarmacia {
    /*
    El atributo codigo, se refiere al codigo del inventaria
    */
    private int codigo;
    /*
    El atributo añoActualizacion, se refiere a la fecha en la que se actualiza 
    el inventario
    */
    private Date añoActualizacion;
    /*
    El atributo Medicina hace referencia a las medicinas que tiene la farmacia
    */
    private ArrayList <Medicamento> medicamentos;
    
    /**
     * El atributo hospital hace referencia al hospital, para que podamos aplicar metodos que implica a lhospital como reducir presupuesto
     */
    private Hospital hospital;
    
    /*
    Se crea el metodo constructor
    */

    public InventarioFarmacia(int codigo, Date añoActualizacion, ArrayList<Medicamento> medicamentos) {
        this.codigo = codigo;
        this.añoActualizacion = añoActualizacion;
        this.medicamentos = medicamentos;

    }
    /**
     * 
     * @param medicamento
     * 
     * @return 
     * 
     * se crea el metodo booleano agregar medicamento y si no no se podra comprar el medicamento 
     */ 
     public boolean agregarMedicamento(Medicamento medicamento) {
        double costo = medicamento.getCosto();
        if (hospital.getPresupuesto() >= costo) {
            medicamentos.add(medicamento);
            hospital.reducirPresupuesto(costo);
            return true;
        } else {
            hospital.setEstado("en quiebra");
            System.out.println("No se puede comprar medicamentos. Hospital en quiebra.");
            return false;
        }
    }
       /**
        * creamos el metodo listaMedicamentos para ver los medicamentos del hospital
        */
     public void listarMedicamentos() {
        for (Medicamento m : medicamentos) {
            System.out.println(m);
        }
    }
     /**
      * se crea el metodo booleano venderMedicamento para poder venderlo al cliente, si no se encuentra el medicamento se hace el else 
      * @param nombre
      * @return 
      */
     public boolean venderMedicamento(String nombre) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                medicamentos.remove(m);
                hospital.aumentarPresupuesto(m.getPrecioVenta());
                hospital.registrarVenta(m.getPrecioVenta());
                return true;
            }
        }
        System.out.println("Medicamento no encontrado");
        return false;
    }
     
     


/*
    Se crea el getter y erl setter
    */
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getAñoActualizacion() {
        return añoActualizacion;
    }

    public void setAñoActualizacion(Date añoActualizacion) {
        this.añoActualizacion = añoActualizacion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

   
}
