/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_not_found_exc8;

/**
 *
 * @author et123
 */
public class CLASS_NOT_FOUND_EXC8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Class.forName("com.example.NonExistentClass"); // Genera la excepción ClassNotFoundException

            System.out.println("La clase ha sido encontrada");
            
        } catch (ClassNotFoundException e) {
            
            System.out.println("La clase especificada no ha sido encontrada");
            
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            
        }
        
    }
    
}
