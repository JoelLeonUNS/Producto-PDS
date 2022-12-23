package cliente;

import java.util.ArrayList;
import java.util.List;
import pedido.Pedido;
import pedido.PedidoJengibreOrganico;
import pedido.PedidoMango;

public class Cliente {
    
    protected List<Pedido> pedidos = new ArrayList<>();
    private String ID;
    private String nombre;
    private String apellido;
    private String correo;
   
    public void crearPedido(String tipoPedido) {
        Pedido pedido;
        
        switch (tipoPedido) {
            case "Mango" -> {
                pedido = new PedidoMango("Pedido de Mangos");
            }
            case "Jengibre" -> {
                pedido = new PedidoJengibreOrganico("Pedido de Jengibres orgánicos");
            }
            default -> throw new AssertionError();
        }
        pedidos.add(pedido);
    }
    
    public Pedido getPedidoActual() {
        return pedidos.get(pedidos.size() - 1);
    }
    
    public void mostrarDetallesDePedido(){
        for (Pedido detallePedido:pedidos) {
            System.out.println(detallePedido.toString());
        }
    }
    
    
}
