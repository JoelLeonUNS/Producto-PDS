package flyweightCajaMango;

public class AtributosBaseCajaMango {

    protected final double pesoCaja;
    protected final String tipoMaterial;
    protected final String variedadProducto;
    protected int numeroCajaPorPalet;
    protected int numeroCajaPorContenedor;

    public AtributosBaseCajaMango(double pesoCaja, String tipoMaterial, String variedadProducto) {
        this.pesoCaja = pesoCaja;
        this.tipoMaterial = tipoMaterial;
        this.variedadProducto = variedadProducto;
    }

    public double getPesoCaja() {
        return pesoCaja;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public String getVariedadProducto() {
        return variedadProducto;
    }

    public int getNumeroCajaPorPalet() {
        return numeroCajaPorPalet;
    }

    public int getNumeroCajaPorContenedor() {
        return numeroCajaPorContenedor;
    }

}
