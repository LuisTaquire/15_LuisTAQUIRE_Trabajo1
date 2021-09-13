package Dao;


import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {

    public static Connection cnx = null;

    public static Connection conectar() throws Exception {

        try {
        String user = "edu";
        String pwd = "edu";
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        
            Class.forName(driver).newInstance();
            cnx = DriverManager.getConnection(url, user, pwd);
            
        } catch (Exception e) {
            System.out.println("Hay un error de conexión Oracle");
        }
        return cnx;
    }

    public static void cerrarCnx() throws Exception {
        if (Conexion.cnx != null) {
            cnx.close();
        }
    }
}
