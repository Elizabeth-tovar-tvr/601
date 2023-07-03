/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package class_cast_exc7;

/**
 *
 * @author et123
 */
public class CLASS_CAST_EXC7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
            Object number = 7;
            String text = (String) number; // Genera la excepción ClassCastException

            System.out.println("El texto obtenido es: " + text);
            
        } catch (ClassCastException e) {
            
            System.out.println("No se puede convertir un número en una cadena.");
            
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
        
    }
    
}
