package pedido;

import java.util.Scanner;
import fabrica.Director;

public abstract class Pedido {

    private final String nombrePedido;
    private String sedeExportacion;
    protected String tipoTransporte;
    protected int numeroCajas;
    
    protected Director transporte;
    
    protected int opcionMenuSedeExportacion;
    protected int opcionMenuTipoTransporte;
    protected Scanner input;

    public Pedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
        this.input = new Scanner(System.in);
    }

    public abstract void registrarSedeExportacion();

    public abstract void registrarTipoTransporte();

    public abstract void registrarCantidadCajas();
    
    public abstract void mostrarDetallesDeCaja();

    public void setSedeExportacion(String sedeExportacion) {
        this.sedeExportacion = sedeExportacion;
    }

    public void setNumeroCajas(int numeroCajas) {
        this.numeroCajas = numeroCajas;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    
    
    @Override
    public String toString() {
        return "\nTipo: " + nombrePedido
                + "\nSede: " + sedeExportacion
                + "\nTransporte: " + tipoTransporte
                + "\nNro. de Cajas: " + numeroCajas;
    }
    
}
