package appPrincipal;

import cliente.Cliente;

public class AppSobiFruits {

    public static void main(String[] args) {
        Cliente Joel = new Cliente();

        Joel.crearPedido("mango");
        Joel.getPedidoActual().registrarSedeExportacion();
        Joel.getPedidoActual().registrarTipoTransporte();
        Joel.getPedidoActual().registrarCantidadCajas();
        
        Joel.crearPedido("mango");
        Joel.getPedidoActual().registrarSedeExportacion();
        Joel.getPedidoActual().registrarTipoTransporte();
        Joel.getPedidoActual().registrarCantidadCajas();

        Joel.mostrarDetallesDePedido();
        Joel.getPedidoActual().mostrarDetallesDeCaja();
    }
}
