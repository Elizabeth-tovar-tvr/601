/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package io_exception10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author et123
 */
public class IO_EXCEPTION10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String line = reader.readLine(); // Genera la excepción IOException

            System.out.println("El contenido del archivo es: " + line);
        } catch (IOException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            System.out.println("Error al leer el archivo.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
        
    }
    
}
