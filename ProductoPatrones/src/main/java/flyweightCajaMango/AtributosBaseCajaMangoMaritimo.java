package flyweightCajaMango;

import java.util.Objects;

public class AtributosBaseCajaMangoMaritimo extends AtributosBaseCajaMango {

    public AtributosBaseCajaMangoMaritimo(double pesoCaja, int numeroCajaPorContenedor, String tipoMaterial, String variedadProducto) {
        super(pesoCaja, tipoMaterial, variedadProducto);
        super.numeroCajaPorContenedor = numeroCajaPorContenedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtributosBaseCajaMangoMaritimo that = (AtributosBaseCajaMangoMaritimo) o;
        return (pesoCaja == that.pesoCaja)
                && (numeroCajaPorContenedor == that.numeroCajaPorContenedor)
                && Objects.equals(tipoMaterial, that.tipoMaterial)
                && Objects.equals(variedadProducto, that.variedadProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesoCaja, numeroCajaPorContenedor, tipoMaterial, variedadProducto);
    }
}