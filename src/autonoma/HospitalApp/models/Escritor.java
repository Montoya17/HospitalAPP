/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.HospitalApp.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author solis
 */
public interface Escritor {
    
        /**
     * Escribe el archivo de memoria interna por lineas
     * 
     * @param archivo
     * @throws java.io.IOException si el archivo no existe
     */
    public abstract void escribir(ArrayList<String> archivo) throws IOException ;
    
}


