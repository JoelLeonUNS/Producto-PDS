package pedido;

import static appPrincipal.AppSobiFruits.getClienteActual;
import cajas.CajaMango;
import constructorCajaMango.AereoCajaMangoConstructor_2kg;
import constructorCajaMango.AereoCajaMangoConstructor_4kg;
import constructorCajaMango.AereoCajaMangoConstructor_6kg;
import constructorCajaMango.CajaMangoConstructor;
import constructorCajaMango.MaritimoCajaMangoConstructor_4kg;
import director.DirectorCajaMango;
import extras.DatosProductoMango;
import extras.Utilidades;
import fabrica.Director;
import java.util.ArrayList;
import java.util.List;

public class PedidoMango extends Pedido {

    private int sumaMango = 0;
    private double sumaPeso = 0;

    private CajaMangoConstructor cajaMangoConstructor;
    private DirectorCajaMango directorCajaMango;
    private final List<CajaMango> cajaMango;

    public PedidoMango(String nombrePedido) {
        super(nombrePedido);
        this.cajaMango = new ArrayList<>();
    }

    @Override
    public void registrarSedeExportacion() {
        do {
            System.out.print("\nElija la sede de exportación: \n1. Tambogrande, Piura\n2. Casma, Ancash.\nOpción: ");
            opcionMenuSedeExportacion = input.nextInt();

            switch (opcionMenuSedeExportacion) {
                case 1 ->
                    this.setSedeExportacion("Tambogrande, Piura");
                case 2 ->
                    this.setSedeExportacion("Casma, Ancash");
            }
        } while (!Utilidades.validarRango(1, 2, opcionMenuSedeExportacion));
    }

    @Override
    public void registrarTipoTransporte() {
        do {
            System.out.print("\nElija el tipo de transporte: \n1. Marítimo.\n2. Aereo.\nOpción: ");
            opcionMenuTipoTransporte = input.nextInt();

            switch (opcionMenuTipoTransporte) {
                case 1 ->
                    this.setTipoTransporte("Marítimo");
                case 2 ->
                    this.setTipoTransporte("Aereo");
            }

            directorCajaMango = Director.crearDirectorMango(this.tipoTransporte);
        } while (!Utilidades.validarRango(1, 2, opcionMenuTipoTransporte));
    }

    @Override
    public void registrarCantidadCajas() {
        if (opcionMenuTipoTransporte == 1) {
            System.out.println("\nPara el tipo de Transporte Marítimo,\nse dispone de esta variedad de cajas: ");
            menuCajasTransporteMaritimo();
        } else {
            System.out.println("\nPara el tipo de Transporte Aereo,\nse dispone de esta variedad de cajas: ");
            menuCajasTransporteAereo();
        }
        calcularPrecio();
    }

    private void menuCajasTransporteMaritimo() {
        int tipoCaja;
        do {
            System.out.print("\nMENU:\n1. Caja de 4kg.\nOpción: ");
            tipoCaja = input.nextInt();

            switch (tipoCaja) {
                case 1 -> {
                    cajaMangoConstructor = new MaritimoCajaMangoConstructor_4kg();
                }
            }
        } while (!Utilidades.validarRango(1, 1, tipoCaja));
        numeroCajas();
        crearCajas();
    }

    private void menuCajasTransporteAereo() {
        int tipoCaja;
        do {
            System.out.print("\nMENU:\n1. Caja de 6kg.\n2. Caja de 4kg.\n3. Caja de 2kg\nOpción: ");
            tipoCaja = input.nextInt();

            switch (tipoCaja) {
                case 1 -> {
                    cajaMangoConstructor = new AereoCajaMangoConstructor_6kg();
                }
                case 2 -> {
                    cajaMangoConstructor = new AereoCajaMangoConstructor_4kg();
                }
                case 3 -> {
                    cajaMangoConstructor = new AereoCajaMangoConstructor_2kg();
                }
            }
        } while (!Utilidades.validarRango(1, 3, tipoCaja));
        numeroCajas();
        crearCajas();
    }

    private void numeroCajas() {
        System.out.println("\n¿Cuántas cajas desea adquirir?");
        numeroCajas = input.nextInt();
    }

    private void crearCajas() {
        for (int i = 0; i < numeroCajas; i++) {
            cajaMangoConstructor.crearNuevoCajaMango();
            directorCajaMango.construir(cajaMangoConstructor);
            cajaMango.add(cajaMangoConstructor.getCajaMango());
        }
    }

    private void calcularPrecio() {
        String paisOrigen = getClienteActual().getPaisOrigen();
        try {
            if (paisOrigen.equals("Japón") || paisOrigen.equals("Estados Unidos")) {
                precioTotal = sumarCantidadMango() * DatosProductoMango.getMapPrecioPaisMango().get(paisOrigen);
            } else {
                precioTotal = sumarPesoMango() * DatosProductoMango.getMapPrecioPaisMango().get(paisOrigen);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private int sumarCantidadMango() {
        double pesoCajaMango = Double.parseDouble(cajaMango.get(0).getPesoCaja());
        if (sumaMango == 0) {
            for (CajaMango detalleCaja : cajaMango) {
                sumaMango += (pesoCajaMango * 1000) / DatosProductoMango.getMapPesoCalibreMango().get(detalleCaja.getNumeroCalibre());
            }
        }

        return sumaMango;
    }

    private double sumarPesoMango() {
        if (sumaPeso == 0) {
            for (CajaMango detalleCaja : cajaMango) {
                sumaPeso += Double.parseDouble(detalleCaja.getPesoCaja());
            }
        }

        return sumaPeso;
    }

    @Override
    public void mostrarDetallesDeCaja() {
        if (cajaMango.isEmpty()) {
            System.out.println("No ha realizado ningún pedido de cajas.");
        } else {
            for (CajaMango detalleCaja : cajaMango) {
                System.out.println(detalleCaja);
            }
        }
    }

    @Override
    public String[][] getArrayCaja() {
        String[][] tablaCajaMango = new String[cajaMango.size() + 1][7];
        tablaCajaMango[0][0] = "Peso";
        tablaCajaMango[0][1] = "Nro. Caja por Palet";
        tablaCajaMango[0][2] = "Nro. Caja por Contenedor";
        tablaCajaMango[0][3] = "Material";
        tablaCajaMango[0][4] = "Marca";
        tablaCajaMango[0][5] = "Calibre";
        tablaCajaMango[0][6] = "Variedad";

        for (int i = 0; i < cajaMango.size(); i++) {
            tablaCajaMango[i + 1][0] = cajaMango.get(i).getPesoCaja();
            tablaCajaMango[i + 1][1] = cajaMango.get(i).getNumeroCajaPorPalet().equals("0") ? "---" : cajaMango.get(0).getNumeroCajaPorPalet();
            tablaCajaMango[i + 1][2] = cajaMango.get(i).getNumeroCajaPorContenedor().equals("0") ? "---" : cajaMango.get(0).getNumeroCajaPorContenedor();
            tablaCajaMango[i + 1][3] = cajaMango.get(i).getTipoMaterial();
            tablaCajaMango[i + 1][4] = cajaMango.get(i).getNombreMarca();
            tablaCajaMango[i + 1][5] = cajaMango.get(i).getNumeroCalibre();
            tablaCajaMango[i + 1][6] = cajaMango.get(i).getVariedadProducto();
        }

        return tablaCajaMango;
    }
}