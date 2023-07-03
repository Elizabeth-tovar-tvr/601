/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayindex_o_o_bound6;

/**
 *
 * @author et123
 */
public class ARRAYINDEX_O_O_BOUND6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            int[] numbers = {1, 2, 3};
            int index = 7; // Índice fuera de los límites del arreglo

            int value = numbers[index]; // Genera la excepción

            System.out.println("El valor obtenido es: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice se encuentra fuera de los límites del arreglo");
            System.out.println("Efectivamente c ha producido una excepción: " + e.getMessage());
           
        }
        
    }
    
}
