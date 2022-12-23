package appPrincipal;

import cliente.Cliente;
import extras.Utilidades;
import java.util.Scanner;

public class AppSobiFruits {

    static Scanner input = new Scanner(System.in);
    static int tipoProducto, tipoAccion, respuestaRetorno;
    static Cliente cliente = new Cliente();

    public static void main(String[] args) {
        do {
            System.out.println("\n== Bienvendido a la SobiFruits ==");
            System.out.println("1. Realizar pedidos");
            System.out.println("2. Ver detalles de los pedidos");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            tipoAccion = input.nextInt();
            
            switch (tipoAccion) {
                case 1 -> {
                    realizarPedidos();
                }
                case 2 -> {
                    verPedidos();
                }
            }

        } while (tipoProducto != 3);
    }

    public static void realizarPedidos() {
        do {
            System.out.println("\n¿Que tipo de producto desea adquirir?");
            System.out.println("1. Mangos");
            System.out.println("2. Jengibres orgánicos");
            System.out.print("Opcion: ");
            tipoProducto = input.nextInt();

            switch (tipoProducto) {
                case 1 -> {
                    cliente.crearPedido("Mango");
                }
                case 2 -> {
                    cliente.crearPedido("Jengibre");
                }
            }
            
            cliente.getPedidoActual().registrarSedeExportacion();
            cliente.getPedidoActual().registrarTipoTransporte();
            cliente.getPedidoActual().registrarCantidadCajas();
            
            System.out.println("\nDesea adquirir otro producto? (Si:1, No:0)");
            System.out.print("Opción: ");
            respuestaRetorno = input.nextInt();
        } while (!Utilidades.validarRango(1, 2, tipoProducto) || respuestaRetorno != 0);
    }
    
    public static void verPedidos() {
        System.out.println("\n---- Lista de Pedidos");
        cliente.mostrarDetallesDePedido();
        System.out.println("\n---- Lista de Cajas de su último pedido");
        try {
            cliente.getPedidoActual().mostrarDetallesDeCaja();
        } catch (Exception e) {
            System.out.println("No ha realizado ningún pedido de cajas.");
        }
    }
}
