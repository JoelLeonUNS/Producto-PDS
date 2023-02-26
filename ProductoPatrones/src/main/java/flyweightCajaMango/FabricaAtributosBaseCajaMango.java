package flyweightCajaMango;

import java.util.HashMap;
import java.util.Map;

public class FabricaAtributosBaseCajaMango {

    private static final Map<AtributosBaseCajaMangoAereo, AtributosBaseCajaMangoAereo> atributosBaseCajaMangoAereo = new HashMap<>();
    private static final Map<AtributosBaseCajaMangoMaritimo, AtributosBaseCajaMangoMaritimo> atributosBaseCajaMangoMaritimo = new HashMap<>();

    public static AtributosBaseCajaMango getAtributosBaseCajaMangoAereo(double pesoCaja, int numeroCajaPorPalet, String tipoMaterial, String variedadProducto) {
        AtributosBaseCajaMangoAereo llaveAtributos = new AtributosBaseCajaMangoAereo(pesoCaja, numeroCajaPorPalet, tipoMaterial, variedadProducto);
        if (atributosBaseCajaMangoAereo.get(llaveAtributos) == null) {
            atributosBaseCajaMangoAereo.put(llaveAtributos, new AtributosBaseCajaMangoAereo(pesoCaja, numeroCajaPorPalet, tipoMaterial, variedadProducto));
        }
        return atributosBaseCajaMangoAereo.get(llaveAtributos);
    }

    public static AtributosBaseCajaMango getAtributosBaseCajaMangoMaritimo(double pesoCaja, int numeroCajaPorContenedor, String tipoMaterial, String variedadProducto) {
        AtributosBaseCajaMangoMaritimo llaveAtributos = new AtributosBaseCajaMangoMaritimo(pesoCaja, numeroCajaPorContenedor, tipoMaterial, variedadProducto);
        if (atributosBaseCajaMangoMaritimo.get(llaveAtributos) == null) {
            atributosBaseCajaMangoMaritimo.put(llaveAtributos, new AtributosBaseCajaMangoMaritimo(pesoCaja, numeroCajaPorContenedor, tipoMaterial, variedadProducto));
        }
        return atributosBaseCajaMangoMaritimo.get(llaveAtributos);
    }
}