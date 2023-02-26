package flyweightCajaMango;

import java.util.Objects;

public class AtributosBaseCajaMangoAereo extends AtributosBaseCajaMango {

    public AtributosBaseCajaMangoAereo(double pesoCaja, int numeroCajaPorPalet, String tipoMaterial, String variedadProducto) {
        super(pesoCaja, tipoMaterial, variedadProducto);
        super.numeroCajaPorPalet = numeroCajaPorPalet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtributosBaseCajaMangoAereo that = (AtributosBaseCajaMangoAereo) o;
        return (pesoCaja == that.pesoCaja)
                && (numeroCajaPorPalet == that.numeroCajaPorPalet)
                && Objects.equals(tipoMaterial, that.tipoMaterial)
                && Objects.equals(variedadProducto, that.variedadProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesoCaja, numeroCajaPorPalet, tipoMaterial, variedadProducto);
    }
}