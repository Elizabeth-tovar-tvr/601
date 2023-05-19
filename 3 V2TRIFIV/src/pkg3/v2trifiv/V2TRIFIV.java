/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author et123
 */
public class V2TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
      //DECLARACIÓN DE VARIABLES
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        //Buffered es más amplio, en scanner no cabe un archivo de texto--- 
        int numero;
        int mult3;
        int mult5;
        
      //Entrada de datos
         System.out.println("Dame el número: ");
         numero = Integer.parseInt(bufEntrada.readLine());
        
         
      //Procesar datos
        mult3= numero%3;
        mult5= numero%5;
        
        
      //Salida de datos 
        if(mult3 == 0 && mult5==0){
            System.out.println("TRIFIV");
        } else if (mult3==0) {
            System.out.println("TRI");
        } else if (mult5==0) {
            System.out.println("FIV");
        }

    }
    
}
