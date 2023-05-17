
package pkg2.v1trifiv;

import java.io.BufferedReader;
import java.io.IOException; //Librería de tratamiento de errores//
import java.io.InputStreamReader;

/**
 *
 * @author et123
 */

// 1a VERSIÓN
public class V1TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //EL TRHOWS EXCEPTION se necesita para esto para el casteo
        //Pedimos datos (librerias con Buffer)
        //ojo se puede usar AND , OR
       
        
        //DEACLARACIÓN DE VARIABLES 
       BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
       int numero;
       float mult3;
       float mult5;
       
       //ENTRADA
       
       
       
       System.out.println("Ingresa el número");
       numero = Integer.parseInt(bufEntrada.readLine()); //Esta leyendo una cadena de caracteres
       //Se "cambia" el tipo de entrada //CASTEAR// 
       
       //PROCESO DE DATOS
       mult3=numero%3; //El módulo 
       mult5=numero%5;
        
       //SALIDA DE DATOS
       if(mult3==0){
           System.out.println("TRI");
       }
       
       if(mult5==0){
           System.out.println("FIV");
       }
       
       if(mult3==0 && mult5==0){
           System.out.println("TRIFIV");
       }
    }
    
}
