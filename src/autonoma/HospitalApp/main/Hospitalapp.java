/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.main;

import autonoma.HospitalApp.models.Gerente;
import autonoma.HospitalApp.models.Hospital;
import autonoma.HospitalApp.views.VentanaPrincipal;



/**
 *@since 31/02/2025
 * @author solis
 * se hace el main para el hospital
 */

public class HospitalApp{
    
  public static void main(String[] args) {
        // Aquí creamos el hospital (puede ser cargado desde archivo si ya lo tienes así)
        Hospital hospital = new Hospital("San Jose St. Bonaventure");
            

        // Pasamos el hospital a la ventana
        VentanaPrincipal ventana = new VentanaPrincipal(hospital);
        ventana.setVisible(true);
    }
}


  