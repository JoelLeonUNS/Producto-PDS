package appPrincipal;

import cliente.Cliente;
import extras.Utilidades;
import java.util.Scanner;

public class AppSobiFruits {
    static Scanner input = new Scanner(System.in);
    static int tipoProducto, respuestaRetorno;
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        
        do {
            System.out.println("\n== Bienvendido a la SobiFruits ==");
            System.out.println("¿Que tipo de producto desea adquirir?");
            System.out.println("1. Mangos");
            System.out.println("2. Jengibres orgánicos");
            System.out.print("Opcion: ");
            tipoProducto = input.nextInt();

            switch (tipoProducto) {
                case 1 -> {
                    c1.crearPedido("Mango");
                }
                case 2 -> {
                    c1.crearPedido("Jengibre");
                }
            }

            System.out.println("\nDesea adquirir otro producto? (Si:1, No:0)");
            System.out.print("Opción: ");
            respuestaRetorno = input.nextInt();

        } while (!Utilidades.validarRango(1, 2, tipoProducto)|| respuestaRetorno != 0);

        c1.mostrarDetallesDePedido();
        c1.getPedidoActual().mostrarDetallesDeCaja();
    }
}
