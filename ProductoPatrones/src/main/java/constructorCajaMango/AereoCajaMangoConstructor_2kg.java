package constructorCajaMango;

import extras.DatosProductoMango;
import extras.Utilidades;
import flyweightCajaMango.FabricaAtributosBaseCajaMango;

public final class AereoCajaMangoConstructor_2kg extends AereoCajaMangoConstructor {

    public AereoCajaMangoConstructor_2kg() {
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(DatosProductoMango.getMapNombreMarcaCajaMangoAereo_2kg().get(Utilidades.generarNumeroAleatorioConRango(1, 5)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(DatosProductoMango.getMapNumeroCalibreCajaMangoAereo_2kg().get(Utilidades.generarNumeroAleatorioConRango(1, 2)));
    }

    @Override
    public void construirAtributosBaseCajaMago() {
        this.cajaMango.setAtributosBaseCajaMango(FabricaAtributosBaseCajaMango.getAtributosBaseCajaMangoAereo(2, 192, "Cartón", "Kent"));
    }
}