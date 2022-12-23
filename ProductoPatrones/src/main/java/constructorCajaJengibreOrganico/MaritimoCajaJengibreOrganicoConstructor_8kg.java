package constructorCajaJengibreOrganico;

import extras.Utilidades;

public final class MaritimoCajaJengibreOrganicoConstructor_8kg extends MaritimoCajaJengibreOrganicoConstructor {
    
    public MaritimoCajaJengibreOrganicoConstructor_8kg() {
        putNombreMarcaInMap();
    }
    
    @Override
    public void construirTipoMaterial() {
        this.cajaJengibreOrganico.setTipoMaterial("Plástico");
    }

    @Override
    public void construirPesoCaja() {
        this.cajaJengibreOrganico.setPesoCaja(8);
    }

    @Override
    public void construirNombreMarca() {
        this.cajaJengibreOrganico.setNombreMarca(mapNombreMarcaJengibreOrganico.get(Utilidades.generarNumeroAleatorioConRango(1, 1)));
    }

    @Override
    public void construirNumeroCajaPorPalet() {
        this.cajaJengibreOrganico.setNumeroCajaPorPalet(120);
    }

    @Override
    public void construirNumeroCajaPorContenedor() {
        this.cajaJengibreOrganico.setNumeroCajaPorContenedor(2400);
    }

    @Override
    public void putNombreMarcaInMap() {
        mapNombreMarcaJengibreOrganico.put(1, "Inkanto");
    }
}
