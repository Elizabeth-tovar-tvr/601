/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcion1;

import javax.swing.JOptionPane;
//thread es el hilo, podemos lanzar varios, o es este caso programar multi-hilo
//el hilo principal es el main
/**
 *
 * @author et123
 */
public class EXCEPCION1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
       
       int x,y;
       
       try{
           x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa número 1:","Solicito datos",3));
       }catch (NumberFormatException n){
              System.out.println(n.getMessage()+" No es número entero");
       }
       //Sin el try - catch corre pero aparece error, por eso se agrega el mensaje en el catch
       //x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa número 1:","Solicito datos",3));
    }
    
}
