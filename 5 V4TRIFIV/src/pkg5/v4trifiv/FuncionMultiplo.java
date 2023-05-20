/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg5.v4trifiv;

/**
 *
 * @author et123
 */
public class FuncionMultiplo {
    //AHORA SE LLAMA METODO
    public String retornaMultiplo(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "TRIFIV";
        }else if (num % 3 == 0) {
            return "TRI";
        }else if (num % 5 == 0) {
            return "FIVE";
        }
            return "Ningún valor";
        }
    
    }
