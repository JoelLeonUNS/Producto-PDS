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
                case 1 ->this.setSedeExportacion("Mazamari");
                case 2 ->this.setSedeExportacion("Pangoa");
            }
        } while (!Utilidades.validarRango(1, 2, opcionMenuSedeExportacion));
    }

    @Override
    public void registrarTipoTransporte() {
        do {
            System.out.print("\nElija el tipo de transporte: \n1. Marítimo.\nOpción: ");
            opcionMenuTipoTransporte = input.nextInt();

            switch (opcionMenuTipoTransporte) {
                case 1 ->this.setTipoTransporte("Marítimo");
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
            if (Utilidades.validarRango(1, 2, tipoCaja)) {
                numeroCajas();
                crearCajas();
            }  
        } while (!Utilidades.validarRango(1, 2, tipoCaja));
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
        
    @Override
    public void mostrarDetallesDeCaja(){
        if (cajaJengibreOrganico.isEmpty()) {
            System.out.println("No ha realizado ningún pedido de cajas.");
        } else {
            for (CajaJengibreOrganico detalleCaja:cajaJengibreOrganico) {
                System.out.println(detalleCaja.toString());
            }
        }
    }
    


}
