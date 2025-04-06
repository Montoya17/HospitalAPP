/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.main;

import autonoma.HospitalApp.models.Gerente;
import autonoma.HospitalApp.models.Hospital;



/**
 *@since 31/02/2025
 * @author solis
 * se hace el main para el hospital
 */

public class HospitalApp{
    
    public static void main(String[] args) {
        // aqui creamos el gerente del hospital 
        Gerente gerente = new Gerente("Juan Pérez", 2345242, 45, "Administración");

        // estos son los datos inicalesa del gerente
        Hospital hospital = new Hospital(
            "Hospital San José St. Bonaventure",
            "calle 33, Manizales",
            "313242355",
            "logo.png",
            /*
              Presupuesto inical
                */
            5000000, 
            /*
                meta de ventas
                */
            10000000, 
            "1990-05-15",
                /*
                esta es la latitud
                */
            5.0703, 
            /*
                esta es la longitud
                */
            75.5138, 
            gerente
        );

        // se hace el system para mostrar información inicial del hospital
        System.out.println("Esta es la informacion del hospital");
        hospital.mostrarInformacion();

        // se hace el metodo de  editar la información del hospital
        hospital.editarInformacion(
            "Hospital San José Renovado",
            "Avenida Principal, Manizales",
            "3209876543",
            "nuevo_logo.png",
            7500000, // Nuevo presupuesto
            15000000, // Nueva meta de ventas
            "1990-05-15",
            false, // Sigue activo
            5.0708, // Nueva latitud
            -75.5140, // Nueva longitud
            gerente
        );

        // se hace el system para mostrar información actualizada
        System.out.println("\nInformación actualizada del hospital:");
        hospital.mostrarInformacion();
    }
        
    }

  