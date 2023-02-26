package pedido;

import cajas.CajaJengibreOrganico;
import constructorCajaJengibreOrganico.CajaJengibreOrganicoConstructor;
import constructorCajaJengibreOrganico.MaritimoCajaJengibreOrganicoConstructor_14kg;
import constructorCajaJengibreOrganico.MaritimoCajaJengibreOrganicoConstructor_8kg;
import director.DirectorCajaJengibreOrganico;
import extras.Utilidades;
import fabrica.Director;
import java.util.ArrayList;
import java.util.List;

public class PedidoJengibreOrganico extends Pedido {

    private CajaJengibreOrganicoConstructor cajaJengibreOrganicoConstructor;
    private DirectorCajaJengibreOrganico directorCajaJengibreOrganico;
    private final List<CajaJengibreOrganico> cajaJengibreOrganico;

    public PedidoJengibreOrganico(String nombrePedido) {
        super(nombrePedido);
        this.cajaJengibreOrganico = new ArrayList<>();
    }

    @Override
    public void registrarSedeExportacion() {
        do {
            System.out.print("\nElija la sede de exportación: \n1. Mazamari.\n2. Pangoa.\nOpción: ");
            opcionMenuSedeExportacion = input.nextInt();

            switch (opcionMenuSedeExportacion) {
                case 1 ->
                    this.setSedeExportacion("Mazamari");
                case 2 ->
                    this.setSedeExportacion("Pangoa");
            }
        } while (!Utilidades.validarRango(1, 2, opcionMenuSedeExportacion));
    }

    @Override
    public void registrarTipoTransporte() {
        do {
            System.out.print("\nElija el tipo de transporte: \n1. Marítimo.\nOpción: ");
            opcionMenuTipoTransporte = input.nextInt();

            switch (opcionMenuTipoTransporte) {
                case 1 ->
                    this.setTipoTransporte("Marítimo");
            }

            directorCajaJengibreOrganico = Director.crearDirectorJengibreOrganico(this.tipoTransporte);
        } while (!Utilidades.validarRango(1, 2, opcionMenuTipoTransporte));
    }

    @Override
    public void registrarCantidadCajas() {
        if (opcionMenuTipoTransporte == 1) {
            System.out.println("\nPara el tipo de Transporte Marítimo,\nse dispone de esta variedad de cajas: ");
            menuCajasTransporteMaritimo();
        } else {

        }
        calcularPrecio();
    }

    private void menuCajasTransporteMaritimo() {
        int tipoCaja;
        do {
            System.out.print("\nMENU:\n1. Caja de 8kg.\n2. Caja de 14kg\nOpción: ");
            tipoCaja = input.nextInt();

            switch (tipoCaja) {
                case 1 -> {
                    cajaJengibreOrganicoConstructor = new MaritimoCajaJengibreOrganicoConstructor_8kg();
                }
                case 2 -> {
                    cajaJengibreOrganicoConstructor = new MaritimoCajaJengibreOrganicoConstructor_14kg();
                }
            }
        } while (!Utilidades.validarRango(1, 2, tipoCaja));
        numeroCajas();
        crearCajas();
    }

    // posible implementación de transporte aereo.
    private void numeroCajas() {
        System.out.println("\n¿Cuántas cajas desea adquirir?");
        numeroCajas = input.nextInt();
    }

    private void crearCajas() {
        for (int i = 0; i < numeroCajas; i++) {
            cajaJengibreOrganicoConstructor.crearNuevoCajaJengibreOrganico();
            directorCajaJengibreOrganico.construir(cajaJengibreOrganicoConstructor);
            cajaJengibreOrganico.add(cajaJengibreOrganicoConstructor.getCajaJengibreOrganico());
        }
    }

    private void calcularPrecio() {
        precioTotal = numeroCajas * Double.parseDouble(cajaJengibreOrganico.get(0).getPesoCaja()) * 2;
    }

    @Override
    public void mostrarDetallesDeCaja() {
        if (cajaJengibreOrganico.isEmpty()) {
            System.out.println("No ha realizado ningún pedido de cajas.");
        } else {
            for (CajaJengibreOrganico detalleCaja : cajaJengibreOrganico) {
                System.out.println(detalleCaja.toString());
            }
        }
    }

    @Override
    public String[][] getArrayCaja() {
        String[][] tablaCajaJengibreOrganico = new String[cajaJengibreOrganico.size() + 1][5];
        tablaCajaJengibreOrganico[0][0] = "Peso";
        tablaCajaJengibreOrganico[0][1] = "Nro. Caja por Palet";
        tablaCajaJengibreOrganico[0][2] = "Nro. Caja por Contenedor";
        tablaCajaJengibreOrganico[0][3] = "Material";
        tablaCajaJengibreOrganico[0][4] = "Marca";

        for (int i = 0; i < cajaJengibreOrganico.size(); i++) {
            tablaCajaJengibreOrganico[i + 1][0] = cajaJengibreOrganico.get(i).getPesoCaja();
            tablaCajaJengibreOrganico[i + 1][1] = cajaJengibreOrganico.get(i).getNumeroCajaPorPalet();
            tablaCajaJengibreOrganico[i + 1][2] = cajaJengibreOrganico.get(i).getNumeroCajaPorContenedor();
            tablaCajaJengibreOrganico[i + 1][3] = cajaJengibreOrganico.get(i).getTipoMaterial();
            tablaCajaJengibreOrganico[i + 1][4] = cajaJengibreOrganico.get(i).getNombreMarca();
        }

        return tablaCajaJengibreOrganico;
    }
}
