package cajas;

public class CajaMango {

    private String tipoMaterial = null;
    private double pesoCaja = 0;
    private String nombreMarca = null;
    private int numeroCalibre = 0;
    private int numeroCajaPorPalet = 0;
    private int numeroCajaPorContenedor = 0;
    
    public CajaMango() {
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

    public void setNumeroCalibre(int numeroCalibre) {
        this.numeroCalibre = numeroCalibre;
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
                + "\nCalibre: " + numeroCalibre
                + (numeroCajaPorPalet != 0 ? ("\nCajas por palet: " + numeroCajaPorPalet) : "")
                + (numeroCajaPorContenedor != 0 ? ("\nCajas por Contenedor: " + numeroCajaPorContenedor) : "");
    }
        
}
