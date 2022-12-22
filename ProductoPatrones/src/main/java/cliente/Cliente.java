package cliente;

import java.util.ArrayList;
import java.util.List;
import pedido.Pedido;
import pedido.PedidoMango;

public abstract class Cliente {
    
    protected List<Pedido> pedidos = new ArrayList<Pedido>();
    private String ID;
    private String nombre;
    private String apellido;
    private String correo;
   
    public void creaPedido(String tipoPedido) {
        Pedido pedido;
        
        switch (tipoPedido) {
            case "mango" -> {
                pedido = new PedidoMango("Pedido de Mangos");
            }
            case "limon" -> {
                pedido = new PedidoMango("Pedido de Limones");
            }
            default -> throw new AssertionError();
        }
        pedidos.add(pedido);
    }
    
    
}
