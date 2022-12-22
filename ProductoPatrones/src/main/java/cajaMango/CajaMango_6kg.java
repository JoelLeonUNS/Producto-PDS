package cajaMango;

import extras.Retorna;

public class CajaMango_6kg extends CajaMangoConstructor {

    @Override
    public void construirTipoMaterial() {
        this.cajaMango.setTipoMaterial("Cartón");
    }

    @Override
    public void construirPesoCaja() {
        this.cajaMango.setPesoCaja(6);
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(mapNombreMarcaCajaMango.get(Retorna.generarNumeroAleatorioConRango(1, 5)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(mapNumeroCalibreCajaMango.get(Retorna.generarNumeroAleatorioConRango(1, 7)));
    }

    @Override
    public void construirNumeroCajaPorPalet() {
        this.cajaMango.setNumeroCajaPorPalet(88);
    }
    
    @Override
    public void putNombreMarcaInMap() {
        mapNombreMarcaCajaMango.put(1, "Inkanto");
        mapNombreMarcaCajaMango.put(2, "L’exclusive");
        mapNombreMarcaCajaMango.put(3, "Kantu");
        mapNombreMarcaCajaMango.put(4, "Aroma");
        mapNombreMarcaCajaMango.put(5, "Pucara");
    }

    @Override
    public void putNumeroCalibreInMap() {
        mapNumeroCalibreCajaMango.put(1, 7);
        mapNumeroCalibreCajaMango.put(2, 8);
        mapNumeroCalibreCajaMango.put(3, 9);
        mapNumeroCalibreCajaMango.put(4, 10);
        mapNumeroCalibreCajaMango.put(5, 12);
        mapNumeroCalibreCajaMango.put(6, 14);
        mapNumeroCalibreCajaMango.put(7, 16);
    }
}
