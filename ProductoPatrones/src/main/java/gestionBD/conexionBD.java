package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {

    private static final String NOMBRE_BASEDATO = "bd_sobifruits";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://";
    private static final String NOMBRE_SERVIDOR = "localhost";
    private static final String NUMERO_PUERTO = "3306";
    private static final String CONEXION = URL
            + NOMBRE_SERVIDOR + ":"
            + NUMERO_PUERTO + "/"
            + NOMBRE_BASEDATO;
    private static final String USUARIO = "root";
    private static final String CLAVE = "02122002";
    static private Connection conectorBD;

    public static void conectar() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage() + "\n");
        }

        try {
            conectorBD = DriverManager.getConnection(CONEXION, USUARIO, CLAVE);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "\n");
        }
    }

    public static void desconectar() {
        try {
            conectorBD.close();
            conectorBD = null;
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "\n");
        }
    }

    public static Connection getConector() {
        if (conectorBD == null) {
            conectar();
        }

        return conectorBD;
    }
}