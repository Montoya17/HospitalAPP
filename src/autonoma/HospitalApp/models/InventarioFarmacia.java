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
    private ArrayList <Medicina> medicinas;
    
    /*
    Se crea el metodo constructor
    */

    public InventarioFarmacia(int codigo, Date añoActualizacion, ArrayList<Medicina> medicinas) {
        this.codigo = codigo;
        this.añoActualizacion = añoActualizacion;
        this.medicinas = medicinas;
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

    public ArrayList<Medicina> getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(ArrayList<Medicina> medicinas) {
        this.medicinas = medicinas;
    }
}
