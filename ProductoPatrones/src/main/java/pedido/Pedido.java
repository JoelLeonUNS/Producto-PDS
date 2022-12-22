package pedido;

import java.util.Scanner;

public abstract class Pedido {
    
    private String nombrePedido;
    private String sedeExportacion;
    private int numeroCajas;
    private String tipoTransporte;
    
    protected int opcionMenuSedeExportacion;
    protected int opcionMenuTipoTransporte;
    protected Scanner input;

    public Pedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
        this.input = new Scanner(System.in);
    }

    public abstract void registrarSedeExportacion();

    public abstract void registrarCantidadCajas();

    public abstract void registrarTipoTransporte();

    public void setSedeExportacion(String sedeExportacion) {
        this.sedeExportacion = sedeExportacion;
    }

    public void setNumeroCajas(int numeroCajas) {
        this.numeroCajas = numeroCajas;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    
    
}
