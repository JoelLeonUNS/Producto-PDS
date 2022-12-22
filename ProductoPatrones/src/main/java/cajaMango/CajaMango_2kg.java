package cajaMango;

import extras.Retorna;

public class CajaMango_2kg extends CajaMangoConstructor {

    @Override
    public void construirTipoMaterial() {
        this.cajaMango.setTipoMaterial("Cartón");
    }

    @Override
    public void construirPesoCaja() {
        this.cajaMango.setPesoCaja(2);
    }

    @Override
    public void construirNombreMarca() {
        this.cajaMango.setNombreMarca(mapNombreMarcaCajaMango.get(Retorna.generarNumeroAleatorioConRango(1,5)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(mapNumeroCalibreCajaMango.get(Retorna.generarNumeroAleatorioConRango(1,2)));
    }

    @Override
    public void construirNumeroCajaPorPalet() {
        this.cajaMango.setNumeroCajaPorPalet(192);
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
        mapNumeroCalibreCajaMango.put(1,5);
        mapNumeroCalibreCajaMango.put(2,6);
    }

}
