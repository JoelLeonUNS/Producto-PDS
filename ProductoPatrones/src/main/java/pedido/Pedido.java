package pedido;

import java.util.Scanner;
import fabrica.Director;
import java.time.LocalDate;

public abstract class Pedido {

    private final String nombrePedido;
    private final LocalDate fechaPedido;
    private String sedeExportacion;
    protected String tipoTransporte;
    protected double precioTotal;
    protected int numeroCajas;

    protected Director transporte;

    protected int opcionMenuSedeExportacion;
    protected int opcionMenuTipoTransporte;
    protected Scanner input;

    public Pedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
        this.fechaPedido = LocalDate.now();
        this.input = new Scanner(System.in);
    }

    public abstract void registrarSedeExportacion();

    public abstract void registrarTipoTransporte();

    public abstract void registrarCantidadCajas();

    public abstract void mostrarDetallesDeCaja();

    public void setSedeExportacion(String sedeExportacion) {
        this.sedeExportacion = sedeExportacion;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public void setNumeroCajas(int numeroCajas) {
        this.numeroCajas = numeroCajas;
    }

    public abstract String[][] getArrayCaja();

    @Override
    public String toString() {
        return "\nFecha: " + fechaPedido
                + "\nTipo: " + nombrePedido
                + "\nSede: " + sedeExportacion
                + "\nTransporte: " + tipoTransporte
                + "\nNro. de Cajas: " + numeroCajas
                + "\nPrecio Total: " + precioTotal;
    }
}