package gestionBD;

import cliente.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultaBD {

    private static PreparedStatement declaracion;
    private static boolean idExiste = false;
    private static int idClienteValido;

    public static void insertarCliente(Cliente cliente) {
        try {
            declaracion = conexionBD.getConector().prepareStatement("insert into clientes values(?,?,?,?,?,?)");

            declaracion.setString(1, "0");
            declaracion.setString(2, cliente.getNombre().trim());
            declaracion.setString(3, cliente.getApellido().trim());
            declaracion.setString(4, cliente.getPaisOrigen().trim());
            declaracion.setString(5, cliente.getCorreo().trim());
            declaracion.setString(6, cliente.getContraseña().trim());
            declaracion.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validarCliente(String correo, String contraseña) {
        boolean accesoCliente = false;
        try {
            declaracion = conexionBD.getConector().prepareStatement("select * from clientes where correo = ? and contraseña = ?");
            declaracion.setString(1, correo);
            declaracion.setString(2, contraseña);

            ResultSet resultadoValido = declaracion.executeQuery();

            if (resultadoValido.next()) {
                accesoCliente = true;
                idClienteValido = Integer.parseInt(resultadoValido.getString("id_cliente"));
            } else {
                System.out.println("Correo o contraseña incorrecta.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return accesoCliente;
    }

    public static String[] obtenerDatoCliente(int id_cliente) {
        String[] datoCliente = new String[5];
        try {
            declaracion = conexionBD.getConector().prepareStatement("select * from clientes where id_cliente = ?");
            declaracion.setString(1, Integer.toString(id_cliente));

            ResultSet resultadoCliente = declaracion.executeQuery();

            if (resultadoCliente.next()) {
                datoCliente[0] = resultadoCliente.getString("nombre_cliente");
                datoCliente[1] = resultadoCliente.getString("apellido_cliente");
                datoCliente[2] = resultadoCliente.getString("pais_origen");
                datoCliente[3] = resultadoCliente.getString("correo");
                datoCliente[4] = resultadoCliente.getString("contraseña");
                idExiste = true;
            } else {
                idExiste = false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return datoCliente;
    }

    public static int getIdClienteValido() {
        return idClienteValido;
    }

    public static boolean getIdExiste() {
        return idExiste;
    }
}