package cajas;

import flyweightCajaJengibreOrganico.AtributosBaseCajaJengibreOrganico;

public class CajaJengibreOrganico {

    private String nombreMarca = null;
    private AtributosBaseCajaJengibreOrganico atributosBaseCajaJengibreOrganico = null;

    public CajaJengibreOrganico() {
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

    public void setAtributosBaseCajaJengibreOrganico(AtributosBaseCajaJengibreOrganico atributosBaseCajaJengibreOrganico) {
        this.atributosBaseCajaJengibreOrganico = atributosBaseCajaJengibreOrganico;
    }

    @Override
    public String toString() {
        return "\nPeso: " + atributosBaseCajaJengibreOrganico.getPesoCaja()
                + "\nMaterial: " + atributosBaseCajaJengibreOrganico.getTipoMaterial()
                + "\nMarca: " + nombreMarca
                + "\nCajas por palet: " + atributosBaseCajaJengibreOrganico.getNumeroCajaPorPalet()
                + "\nCajas por Contenedor: " + atributosBaseCajaJengibreOrganico.getNumeroCajaPorContenedor();
    }

    public String getPesoCaja() {
        return Double.toString(atributosBaseCajaJengibreOrganico.getPesoCaja());
    }

    public String getNumeroCajaPorPalet() {
        return Integer.toString(atributosBaseCajaJengibreOrganico.getNumeroCajaPorPalet());
    }

    public String getNumeroCajaPorContenedor() {
        return Integer.toString(atributosBaseCajaJengibreOrganico.getNumeroCajaPorContenedor());
    }

    public String getTipoMaterial() {
        return atributosBaseCajaJengibreOrganico.getTipoMaterial();
    }

    public String getNombreMarca() {
        return nombreMarca;
    }
}