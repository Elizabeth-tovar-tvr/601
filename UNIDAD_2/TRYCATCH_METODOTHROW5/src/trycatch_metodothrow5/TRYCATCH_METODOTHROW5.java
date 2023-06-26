/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatch_metodothrow5;

/**
 *
 * @author et123
 */
public class TRYCATCH_METODOTHROW5 {

    /**
     * @param args the command line arguments
     */
    
    public static int miMetodo(int a , int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        int c = a/b;
        return c;
    
    }
    
    //C lanza la excepcion con el throw de manera más EXPLÍCITA
    
    public static void main(String[] args) {
        try{
           
           int division = miMetodo(10,0);
           System.out.println(division);
           
       }catch (ArithmeticException e){
           
              System.out.println("Excepción aritmetica arrojada ");
              //e.printStackTrace();
       }
        
        //SE MANEJA CON EL CATCH
    }
    
}
