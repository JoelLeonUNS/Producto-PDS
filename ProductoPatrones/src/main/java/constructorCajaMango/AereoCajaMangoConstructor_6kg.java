package constructorCajaMango;

import extras.DatosProductoMango;
import extras.Utilidades;
import flyweightCajaMango.FabricaAtributosBaseCajaMango;

public final class AereoCajaMangoConstructor_6kg extends AereoCajaMangoConstructor {

    public AereoCajaMangoConstructor_6kg() {
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(DatosProductoMango.getMapNombreMarcaCajaMangoAereo_6kg().get(Utilidades.generarNumeroAleatorioConRango(1, 5)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(DatosProductoMango.getMapNumeroCalibreCajaMangoAereo_6kg().get(Utilidades.generarNumeroAleatorioConRango(1, 7)));
    }

    @Override
    public void construirAtributosBaseCajaMago() {
        this.cajaMango.setAtributosBaseCajaMango(FabricaAtributosBaseCajaMango.getAtributosBaseCajaMangoAereo(6, 88, "Cartón", "Kent"));
    }
}
