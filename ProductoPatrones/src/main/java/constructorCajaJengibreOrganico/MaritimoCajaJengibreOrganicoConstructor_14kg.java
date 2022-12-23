package constructorCajaJengibreOrganico;

import extras.Utilidades;

public final class MaritimoCajaJengibreOrganicoConstructor_14kg extends MaritimoCajaJengibreOrganicoConstructor {
    public MaritimoCajaJengibreOrganicoConstructor_14kg() {
        putNombreMarcaInMap();
    }
    
    @Override
    public void construirTipoMaterial() {
        this.cajaJengibreOrganico.setTipoMaterial("Cartón");
    }

    @Override
    public void construirPesoCaja() {
        this.cajaJengibreOrganico.setPesoCaja(14);
    }

    @Override
    public void construirNombreMarca() {
        this.cajaJengibreOrganico.setNombreMarca(mapNombreMarcaJengibreOrganico.get(Utilidades.generarNumeroAleatorioConRango(1, 1)));
    }

    @Override
    public void construirNumeroCajaPorPalet() {
        this.cajaJengibreOrganico.setNumeroCajaPorPalet(72);
    }

    @Override
    public void construirNumeroCajaPorContenedor() {
        this.cajaJengibreOrganico.setNumeroCajaPorContenedor(1440);
    }

    @Override
    public void putNombreMarcaInMap() {
        mapNombreMarcaJengibreOrganico.put(1, "Inkanto");
    }
}
