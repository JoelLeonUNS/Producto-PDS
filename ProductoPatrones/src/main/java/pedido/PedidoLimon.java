package pedido;

import extras.Retorna;

public class PedidoLimon extends Pedido {

    public PedidoLimon(String nombrePedido) {
        super(nombrePedido);
    }

    @Override
    public void registrarSedeExportacion() {
        System.out.print("\nElija la sede de exportación: \n1. Olmos\n2. Piura.\nOpción: ");
        opcionMenuSedeExportacion = input.nextInt();

        do {
            switch (opcionMenuSedeExportacion) {
                case 1 ->this.setSedeExportacion("Olmos");
                case 2 ->this.setSedeExportacion("Piura");
                default ->throw new AssertionError();
            }
        } while (!Retorna.validarRango(1,2, opcionMenuSedeExportacion));
    }

    @Override
    public void registrarCantidadCajas() {
        
    }

    @Override
    public void registrarTipoTransporte() {
        System.out.print("\nElija el tipo de transporte: \n1. Marítimo.\nOpción: ");
        opcionMenuTipoTransporte = input.nextInt();

        do {
            switch (opcionMenuTipoTransporte) {
                case 1 ->this.setSedeExportacion("Marítimo");
                default ->throw new AssertionError();
            }
        } while (!Retorna.validarRango(1,1, opcionMenuTipoTransporte));
    }

}
