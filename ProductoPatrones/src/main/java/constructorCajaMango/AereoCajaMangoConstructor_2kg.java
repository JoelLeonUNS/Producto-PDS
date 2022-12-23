package constructorCajaMango;


import extras.Utilidades;

public final class AereoCajaMangoConstructor_2kg extends AereoCajaMangoConstructor {
    
    public AereoCajaMangoConstructor_2kg() {
        putNombreMarcaInMap();
        putNumeroCalibreInMap();
    }
    
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
        this.cajaMango.setNombreMarca(mapNombreMarcaCajaMango.get(Utilidades.generarNumeroAleatorioConRango(1, 5)));
    }

    @Override
    public void construirNumeroCalibre() {
        this.cajaMango.setNumeroCalibre(mapNumeroCalibreCajaMango.get(Utilidades.generarNumeroAleatorioConRango(1, 2)));
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
        mapNumeroCalibreCajaMango.put(1, 5);
        mapNumeroCalibreCajaMango.put(2, 6);
    }

}
