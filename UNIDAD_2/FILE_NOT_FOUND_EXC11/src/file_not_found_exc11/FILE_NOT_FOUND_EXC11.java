/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file_not_found_exc11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author et123
 */
public class FILE_NOT_FOUND_EXC11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file); // Genera la excepción FileNotFoundException

            // Leer el contenido del archivo
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            
            System.out.println("El archivo no ha sido encontrado");
            
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            
        }
        
    }
    
}
