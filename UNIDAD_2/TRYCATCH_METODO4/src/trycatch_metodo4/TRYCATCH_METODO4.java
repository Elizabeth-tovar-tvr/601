/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch_metodo4;

import javax.swing.JOptionPane;

/**
 *
 * @author et123
 */
public class TRYCATCH_METODO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           
           int division = miMetodo(10,0);
           System.out.println(division);
           
       }catch (ArithmeticException e){
           
              System.out.println("Excepción aritmetica arrojada ");
              
       }
    }
    
    public static int miMetodo(int a , int b) throws ArithmeticException{
        int c = a/b;
        return c;
    
    }
    
}
