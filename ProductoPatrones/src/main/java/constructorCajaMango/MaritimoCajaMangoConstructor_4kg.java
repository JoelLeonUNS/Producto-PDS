package constructorCajaMango;

import extras.DatosProductoMango;
import extras.Utilidades;
import flyweightCajaMango.FabricaAtributosBaseCajaMango;

public final class MaritimoCajaMangoConstructor_4kg extends MaritimoCajaMangoConstructor {

    public MaritimoCajaMangoConstructor_4kg() {
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(DatosProductoMango.getMapNombreMarcaCajaMangoMaritimo_4kg().get(Utilidades.generarNumeroAleatorioConRango(1, 1)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(DatosProductoMango.getMapNumeroCalibreCajaMangoMaritimo_4kg().get(Utilidades.generarNumeroAleatorioConRango(1, 7)));
    }

    @Override
    public void construirAtributosBaseCajaMago() {
        this.cajaMango.setAtributosBaseCajaMango(FabricaAtributosBaseCajaMango.getAtributosBaseCajaMangoMaritimo(4, 5524, "Cartón", "Kent"));
    }
}