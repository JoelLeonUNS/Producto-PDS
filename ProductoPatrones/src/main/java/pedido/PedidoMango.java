package pedido;

import cajas.CajaMango;
import constructorCajaMango.AereoCajaMangoConstructor_2kg;
import constructorCajaMango.AereoCajaMangoConstructor_4kg;
import constructorCajaMango.AereoCajaMangoConstructor_6kg;
import constructorCajaMango.CajaMangoConstructor;
import constructorCajaMango.MaritimoCajaMangoConstructor_4kg;
import director.DirectorCajaMango;
import extras.Utilidades;
import fabrica.Director;
import java.util.ArrayList;
import java.util.List;

public class PedidoMango extends Pedido {
    
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
                case 1 ->this.setSedeExportacion("Tambogrande, Piura");
                case 2 ->this.setSedeExportacion("Casma, Ancash");
            }
        } while (!Utilidades.validarRango(1, 2, opcionMenuSedeExportacion));
    }

    @Override
    public void registrarTipoTransporte() {
        do {
            System.out.print("\nElija el tipo de transporte: \n1. Marítimo.\n2. Aereo.\nOpción: ");
            opcionMenuTipoTransporte = input.nextInt();

            switch (opcionMenuTipoTransporte) {
                case 1 ->this.setTipoTransporte("Marítimo");
                case 2 ->this.setTipoTransporte("Aereo");
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
            if (Utilidades.validarRango(1, 1, tipoCaja)) {
                numeroCajas();
                crearCajas();
            }  
        } while (!Utilidades.validarRango(1, 1, tipoCaja));
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
                case 3 ->{
                    cajaMangoConstructor = new AereoCajaMangoConstructor_2kg();
                }
            }
            if (Utilidades.validarRango(1, 3, tipoCaja)) {
                numeroCajas();
                crearCajas();
            }         
        } while (!Utilidades.validarRango(1, 3, tipoCaja));
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
    
    @Override
    public void mostrarDetallesDeCaja(){
        if (cajaMango.isEmpty()) {
            System.out.println("No ha realizado ningún pedido de cajas.");
        } else {
            for (CajaMango detalleCaja:cajaMango) {
                System.out.println(detalleCaja.toString());
            }
        }
    }
}
