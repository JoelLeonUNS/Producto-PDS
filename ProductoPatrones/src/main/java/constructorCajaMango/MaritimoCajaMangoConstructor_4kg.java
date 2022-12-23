package constructorCajaMango;

import extras.Utilidades;

public final class MaritimoCajaMangoConstructor_4kg extends MaritimoCajaMangoConstructor{
    public MaritimoCajaMangoConstructor_4kg() {
        putNombreMarcaInMap();
        putNumeroCalibreInMap();
    }
    
    @Override
    public void construirTipoMaterial() {
        this.cajaMango.setTipoMaterial("Cartón");
    }

    @Override
    public void construirPesoCaja() {
        this.cajaMango.setPesoCaja(4);
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(mapNombreMarcaCajaMango.get(Utilidades.generarNumeroAleatorioConRango(1, 1)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(mapNumeroCalibreCajaMango.get(Utilidades.generarNumeroAleatorioConRango(1, 7)));
    }

    @Override
    public void construirNumeroCajaPorContenedor() {
        this.cajaMango.setNumeroCajaPorContenedor(5524);
    }

    @Override
    public void putNombreMarcaInMap() {
        mapNombreMarcaCajaMango.put(1, "Inkanto");
    }

    @Override
    public void putNumeroCalibreInMap() {
        mapNumeroCalibreCajaMango.put(1, 6);
        mapNumeroCalibreCajaMango.put(2, 7);
        mapNumeroCalibreCajaMango.put(3, 8);
        mapNumeroCalibreCajaMango.put(4, 9);
        mapNumeroCalibreCajaMango.put(5, 10);
        mapNumeroCalibreCajaMango.put(6, 11);
        mapNumeroCalibreCajaMango.put(7, 12);
    }
}
