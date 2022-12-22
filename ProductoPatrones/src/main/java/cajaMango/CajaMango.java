package cajaMango;

public class CajaMango {

    private String tipoMaterial;
    private double pesoCaja;
    private String nombreMarca;
    private int numeroCalibre;
    private int numeroCajaPorPalet;
    
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
    
}
