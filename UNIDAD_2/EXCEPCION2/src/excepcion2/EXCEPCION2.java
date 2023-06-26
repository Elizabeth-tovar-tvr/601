/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcion2;

import javax.swing.JOptionPane;

/**
 *
 * @author et123
 */
public class EXCEPCION2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
       
       try{
           x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa número 1:","Solicito datos",3));
           y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa número 2:","Solicito datos",3));
           JOptionPane.showMessageDialog(null,"La división de "+x+" / "+y+" es "+(x/y),"Mostrando resultado",1);
           
       }catch (NumberFormatException n){
           
              System.out.println(n.getMessage()+" No es número entero");
              
       }catch (ArithmeticException a){
           
              System.out.println(a.getMessage()+" No se puede dividir entre 0");   
       }
       
    }
    
}
