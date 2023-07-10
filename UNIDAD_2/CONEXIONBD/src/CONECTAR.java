
/**
 *
 * @author et123
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class CONECTAR {

 private Connection cn;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/based", "root", "");
            System.out.println("CONECTADO");
        } catch (Exception e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return cn;
    }

    public static void main(String[] args) {
        CONECTAR conectar = new CONECTAR();
        Connection connection = conectar.conexion();

        if (connection != null) {
            System.out.println(" ");
            System.out.println("SI QUEDÓ :3 SIU, Si no se agrega el JDBC a las librerías queda la EXC ");
            
            // Aquí puedes realizar otras operaciones con la conexión establecida

        }
    }
}