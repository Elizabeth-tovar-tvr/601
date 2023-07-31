package CHATS;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author et123
 */
public class Cliente implements Runnable{

    //Creando los atriburtos de puerto y mensaje
    private int puerto;  //Es el puerto del servidor
    private String mensaje;
    
    //CONSTRUCTOR
    public Cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        
        //Puerto del servidor
        //El dataOutPut va a enviar
        DataOutputStream salida;
        
        try{
            //Creacion del Socket
            Socket socket = new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            
            //Enviamos el mensaje
            salida.writeUTF(mensaje);
            
        }catch(IOException error){
            System.out.println(error);
        }
    }
    
}
