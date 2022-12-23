package cajas;

public class CajaJengibreOrganico {

    private String tipoMaterial = null;
    private double pesoCaja = 0;
    private String nombreMarca = null;
    private int numeroCajaPorPalet = 0;
    private int numeroCajaPorContenedor = 0;

    public CajaJengibreOrganico() {
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public void setPesoCaja(double pesoCaja) {
        this.pesoCaja = pesoCaja;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public void setNumeroCajaPorPalet(int numeroCajaPorPalet) {
        this.numeroCajaPorPalet = numeroCajaPorPalet;
    }

    public void setNumeroCajaPorContenedor(int numeroCajaPorContenedor) {
        this.numeroCajaPorContenedor = numeroCajaPorContenedor;
    }

    @Override
    public String toString() {
        return "\nMaterial: " + tipoMaterial
                + "\nPeso: " + pesoCaja
                + "\nMarca: " + nombreMarca
                + "\nCajas por palet: " + numeroCajaPorPalet
                + "\nCajas por Contenedor: " + numeroCajaPorContenedor;
    }
}
