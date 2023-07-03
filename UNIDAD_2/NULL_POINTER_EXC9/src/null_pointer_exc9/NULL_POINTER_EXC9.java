/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package null_pointer_exc9;

/**
 *
 * @author et123
 */
public class NULL_POINTER_EXC9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            String text = null;
            int length = text.length(); // Genera la excepción NullPointerException

            System.out.println("La longitud del texto es: " + length);
        } catch (NullPointerException e) {
            
            System.out.println("El objeto de referencia es nulo");
            
            System.out.println("Se ha producido una excepción: " + e.getMessage());
            
        }
        
    }
    
}
