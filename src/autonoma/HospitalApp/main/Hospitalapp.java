/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.main;

import autonoma.HospitalApp.models.Gerente;
import autonoma.HospitalApp.models.Hospital;



/**
 *
 * @author solis
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
            5000000, // este es el presupuesto inicial
            10000000, // Meta de ventas anual
            "1990-05-15",
            5.0703, // esta es la Latitud
            75.5138, // esta es Longitud
            gerente
        );

        // Mostrar información inicial del hospital
        System.out.println("Esta es la informacion del hospital");
        hospital.mostrarInformacion();

        // Editar la información del hospital
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

        // Mostrar información actualizada
        System.out.println("\nInformación actualizada del hospital:");
        hospital.mostrarInformacion();
    }
        
    }

  