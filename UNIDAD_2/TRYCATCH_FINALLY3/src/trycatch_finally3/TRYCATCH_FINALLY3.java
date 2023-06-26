/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch_finally3;

import javax.swing.JOptionPane;

/**
 *
 * @author et123
 */
public class TRYCATCH_FINALLY3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
           float equis = 5/0;
           System.out.println("Equis = 5/0");
           System.out.println("Equis = "+equis);
           
       }catch (ArithmeticException e){
           
              System.out.println("Error: División entre 0");
              
       }finally {
           
              System.out.println("A pesar de todo, c ejecuta el bloque de FINALLY");   
              //EXISTA O NO ERRORES, SE EJECUTA FINALLY
       }
        
    }
    
}
