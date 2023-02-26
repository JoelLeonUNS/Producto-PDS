package flyweightCajaJengibreOrganico;

import java.util.Objects;

public class AtributosBaseCajaJengibreOrganico {

    private final double pesoCaja;
    private final int numeroCajaPorPalet;
    private final int numeroCajaPorContenedor;
    private final String tipoMaterial;

    public AtributosBaseCajaJengibreOrganico(double pesoCaja, int numeroCajaPorPalet, int numeroCajaPorContenedor, String tipoMaterial) {
        this.pesoCaja = pesoCaja;
        this.numeroCajaPorPalet = numeroCajaPorPalet;
        this.numeroCajaPorContenedor = numeroCajaPorContenedor;
        this.tipoMaterial = tipoMaterial;
    }

    public double getPesoCaja() {
        return pesoCaja;
    }

    public int getNumeroCajaPorPalet() {
        return numeroCajaPorPalet;
    }

    public int getNumeroCajaPorContenedor() {
        return numeroCajaPorContenedor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtributosBaseCajaJengibreOrganico that = (AtributosBaseCajaJengibreOrganico) o;
        return (pesoCaja == that.pesoCaja)
                && (that.numeroCajaPorPalet == that.numeroCajaPorPalet)
                && (numeroCajaPorContenedor == that.numeroCajaPorContenedor)
                && Objects.equals(tipoMaterial, that.tipoMaterial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesoCaja, numeroCajaPorPalet, numeroCajaPorContenedor, tipoMaterial);
    }
}