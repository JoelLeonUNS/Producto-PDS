package pedido;

import extras.Retorna;

public class PedidoMango extends Pedido{

    public PedidoMango(String nombrePedido) {
        super(nombrePedido);
    }

    @Override
    public void registrarSedeExportacion() {
        System.out.print("\nElija la sede de exportación: \n1. Tambogrande, Piura\n2. Casma, Ancash.\nOpción: ");
        opcionMenuSedeExportacion = input.nextInt();

        do {
            switch (opcionMenuSedeExportacion) {
                case 1 ->this.setSedeExportacion("Tambogrande, Piura");
                case 2 ->this.setSedeExportacion("Casma, Ancash");
                default ->throw new AssertionError();
            }
        } while (!Retorna.validarRango(1,2, opcionMenuSedeExportacion));
    }
    
    @Override
    public void registrarCantidadCajas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registrarTipoTransporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
