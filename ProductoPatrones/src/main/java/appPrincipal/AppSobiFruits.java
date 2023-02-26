package appPrincipal;

import cliente.Cliente;
import extras.Utilidades;
import gestionBD.consultaBD;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import proxyDocumentoPDF.ReporteDocumentoPDF;
import proxyDocumentoPDF.ProxyReporteDocumentoPDF;

public class AppSobiFruits {

    static Scanner input = new Scanner(System.in);
    static int tipoProducto, tipoAccionInicioSesion, tipoAccionConsultaPedido, numeroPedido, respuestaRetorno;
    static List<Cliente> clientes = new ArrayList<>();
    static boolean accesoCliente = false;
    static String correo, contraseña;
    static ReporteDocumentoPDF pdf = new ProxyReporteDocumentoPDF();

    public static void main(String[] args) {
        cargarDatosClientes();
        menuInicioSesion();
    }

    public static void menuInicioSesion() {
        do {
            System.out.println("\n== Bienvendido a SobiFruits ==");
            System.out.println("1. Iniciar Sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            tipoAccionInicioSesion = input.nextInt();

            switch (tipoAccionInicioSesion) {
                case 1 -> {
                    iniciarSesion();
                    if (accesoCliente) {
                        menuConsultaPedido();
                    }
                }
                case 2 -> {
                    registrarCliente();
                    menuConsultaPedido();
                }
            }

        } while (tipoAccionInicioSesion != 3);
    }

    public static void menuConsultaPedido() {
        do {
            System.out.println("\n== Bienvendido a SobiFruits - Consulta de Pedidos ==");
            System.out.println("1. Realizar pedidos");
            System.out.println("2. Ver detalles de los pedidos");
            System.out.println("3. Generar Reporte de Pedidos");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            tipoAccionConsultaPedido = input.nextInt();

            switch (tipoAccionConsultaPedido) {
                case 1 -> {
                    realizarPedidos();
                }
                case 2 -> {
                    verPedidos();
                }
                case 3 -> {
                    generarReportePedido();
                }

                case 4 ->
                    accesoCliente = false;
            }

        } while (tipoAccionConsultaPedido != 4);
    }

    public static void registrarCliente() {
        String nombre, apellido, paisOrigen;
        Cliente cliente;
        System.out.print("Nombre: ");
        nombre = input.next();
        System.out.print("Apellido: ");
        apellido = input.next();
        System.out.print("Pais: ");
        paisOrigen = input.next();
        System.out.print("Correo: ");
        correo = input.next();
        System.out.print("Contraseña: ");
        contraseña = input.next();

        cliente = new Cliente(nombre, apellido, paisOrigen, correo, contraseña);
        clientes.add(cliente);
        consultaBD.insertarCliente(cliente);
    }

    public static void iniciarSesion() {
        System.out.print("Ingrese su correo: ");
        correo = input.next();
        System.out.print("Ingrese su contraseña: ");
        contraseña = input.next();

        accesoCliente = consultaBD.validarCliente(correo, contraseña);
    }

    public static void generarReportePedido() {
        System.out.println("¿A cual pedido quiere generar el reporte?");
        getClienteActual().mostrarDetallesDePedido();
        System.out.print("\nPedido Nro.: ");
        numeroPedido = input.nextInt();
        pdf.getReporteDocumentoPDF(getClienteActual().getPedidos().get(numeroPedido - 1));
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
                    getClienteActual().crearPedido("Mango");
                }
                case 2 -> {
                    getClienteActual().crearPedido("Jengibre");
                }
            }

            getClienteActual().getPedidoActual().registrarSedeExportacion();
            getClienteActual().getPedidoActual().registrarTipoTransporte();
            getClienteActual().getPedidoActual().registrarCantidadCajas();

            System.out.println("\nDesea adquirir otro producto? (Si:1, No:0)");
            System.out.print("Opción: ");
            respuestaRetorno = input.nextInt();
        } while (!Utilidades.validarRango(1, 2, tipoProducto) || respuestaRetorno != 0);
    }

    public static void verPedidos() {
        System.out.println("\n---- Lista de Pedidos");
        getClienteActual().mostrarDetallesDePedido();
        System.out.println("\n---- Lista de Cajas de su último pedido");
        try {
            getClienteActual().getPedidoActual().mostrarDetallesDeCaja();
        } catch (Exception e) {
            System.out.println("No ha realizado ningún pedido de cajas.");
        }
    }

    public static Cliente getClienteActual() {
        consultaBD.validarCliente(correo, contraseña);
        return clientes.get(consultaBD.getIdClienteValido() - 1);
    }

    public static void cargarDatosClientes() {
        Cliente cliente;
        String[] datoCliente;
        int id = 1;
        do {
            try {
                datoCliente = consultaBD.obtenerDatoCliente(id);
                cliente = new Cliente(datoCliente[0], datoCliente[1], datoCliente[2], datoCliente[3], datoCliente[4]);
                clientes.add(cliente);
                id++;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (consultaBD.getIdExiste());
    }
}