/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.v4trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author et123
 */
public class V4TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //DECLARACIÓN DE VARIABLES
       BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
       int numero;
       
       //CREAMOS --- OBJETO --- 
       FuncionMultiplo mult = new FuncionMultiplo();
       
       //ENTRADA DE DATOS 
       System.out.println("Ingresa el número: ");
       numero = Integer.parseInt(bufEntrada.readLine());
       
       //Salida de datos
       System.out.println(mult.retornaMultiplo(numero));
    }
    
}
