package cliente;

import java.util.ArrayList;
import pedido.Pedido;
import pedido.PedidoJengibreOrganico;
import pedido.PedidoMango;

public class Cliente {

    protected ArrayList<Pedido> pedidos = new ArrayList<>();
    private final String nombre;
    private final String apellido;
    private final String paisOrigen;
    private final String correo;
    private final String contraseña;

    public Cliente(String nombre, String apellido, String paisOrigen, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisOrigen = paisOrigen;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public void crearPedido(String tipoPedido) {
        Pedido pedido;

        switch (tipoPedido) {
            case "Mango" -> {
                pedido = new PedidoMango("Pedido de Mangos");
            }
            case "Jengibre" -> {
                pedido = new PedidoJengibreOrganico("Pedido de Jengibres orgánicos");
            }
            default ->
                throw new AssertionError();
        }
        pedidos.add(pedido);
    }

    public Pedido getPedidoActual() {
        return pedidos.get(pedidos.size() - 1);
    }

    public void mostrarDetallesDePedido() {
        int numeroPedido = 1;
        if (pedidos.isEmpty()) {
            System.out.println("No ha realizado ningún pedido.");
        } else {
            for (Pedido detallePedido : pedidos) {
                System.out.println("\nNro.: " + numeroPedido);
                System.out.println(detallePedido);
                numeroPedido++;
            }
        }

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}