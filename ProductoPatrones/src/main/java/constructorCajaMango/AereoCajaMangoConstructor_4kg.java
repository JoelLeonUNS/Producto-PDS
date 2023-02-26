package constructorCajaMango;

import extras.DatosProductoMango;
import extras.Utilidades;
import flyweightCajaMango.FabricaAtributosBaseCajaMango;

public final class AereoCajaMangoConstructor_4kg extends AereoCajaMangoConstructor {

    public AereoCajaMangoConstructor_4kg() {
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(DatosProductoMango.getMapNombreMarcaCajaMangoAereo_4kg().get(Utilidades.generarNumeroAleatorioConRango(1, 5)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(DatosProductoMango.getMapNumeroCalibreCajaMangoAereo_4kg().get(Utilidades.generarNumeroAleatorioConRango(1, 6)));
    }

    @Override
    public void construirAtributosBaseCajaMago() {
        this.cajaMango.setAtributosBaseCajaMango(FabricaAtributosBaseCajaMango.getAtributosBaseCajaMangoAereo(4, 132, "Cartón", "Kent"));
    }
}