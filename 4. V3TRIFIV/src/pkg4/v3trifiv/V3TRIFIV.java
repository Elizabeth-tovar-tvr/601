/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.v3trifiv;

/**
 *
 * @author et123
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {

    /**
     * @param args the command line arguments
     
     */
    
    //PROGRAMACION FUNCIONAL : PEQUEÑO BLOQUE DE CÓDIGO --- 
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in)); 
        int numero;
        System.out.println("Dame el número: ");
         numero = Integer.parseInt(bufEntrada.readLine());
         
        //Salida de datos
        //retornaMultiplo(numero);
        //-- Aun no imprimiria en pantalla --
        
        //Aquí ya lo imprime
        System.out.println(retornaMultiplo(numero));
        
    }
    
    //AFUERA DEL MAIN, PEROOOO, DENTRO DE LA CLASE
    //Firma de la función
    public static String retornaMultiplo (int num) {
        //Declaración de las variables
        int mult3;
        int mult5;
        //Procesar datos
        mult3= num%3;
        mult5= num%5;
        //Salida de datos 
        if(mult3== 0 && mult5==0){
            return "TRIFIV";
        } else if (mult3==0) {
            return "TRI";
        } else if (mult5==0) {
            return "FIV";
        }
        return "Ningún valor";  
    }   
}
