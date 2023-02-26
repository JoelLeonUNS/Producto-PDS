package cajas;

import flyweightCajaMango.AtributosBaseCajaMango;

public class CajaMango {

    private String nombreMarca = null;
    private int numeroCalibre = 0;
    private AtributosBaseCajaMango atributosBaseCajaMango = null;

    public CajaMango() {
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public void setNumeroCalibre(int numeroCalibre) {
        this.numeroCalibre = numeroCalibre;
    }

    public void setAtributosBaseCajaMango(AtributosBaseCajaMango atributosBaseCajaMango) {
        this.atributosBaseCajaMango = atributosBaseCajaMango;
    }

    @Override
    public String toString() {
        return "\nPeso: " + atributosBaseCajaMango.getPesoCaja()
                + (atributosBaseCajaMango.getNumeroCajaPorPalet() != 0 ? ("\nCajas por palet: " + atributosBaseCajaMango.getNumeroCajaPorPalet()) : "")
                + (atributosBaseCajaMango.getNumeroCajaPorContenedor() != 0 ? ("\nCajas por Contenedor: " + atributosBaseCajaMango.getNumeroCajaPorContenedor()) : "")
                + "\nMaterial: " + atributosBaseCajaMango.getTipoMaterial()
                + "\nMarca: " + nombreMarca
                + "\nCalibre: " + numeroCalibre
                + "\nVariedad: " + atributosBaseCajaMango.getVariedadProducto();
    }

    public String getPesoCaja() {
        return Double.toString(atributosBaseCajaMango.getPesoCaja());
    }

    public String getNumeroCajaPorPalet() {
        return Integer.toString(atributosBaseCajaMango.getNumeroCajaPorPalet());
    }

    public String getNumeroCajaPorContenedor() {
        return Integer.toString(atributosBaseCajaMango.getNumeroCajaPorContenedor());
    }

    public String getTipoMaterial() {
        return atributosBaseCajaMango.getTipoMaterial();
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public String getNumeroCalibre() {
        return Integer.toString(numeroCalibre);
    }

    public String getVariedadProducto() {
        return atributosBaseCajaMango.getVariedadProducto();
    }
}