package constructorCajaJengibreOrganico;

import extras.DatosProductoJengibreOrganico;
import extras.Utilidades;
import flyweightCajaJengibreOrganico.FabricaAtributosBaseCajaJengibreOrganico;

public final class MaritimoCajaJengibreOrganicoConstructor_14kg extends MaritimoCajaJengibreOrganicoConstructor {

    public MaritimoCajaJengibreOrganicoConstructor_14kg() {
    }

    @Override
    public void construirNombreMarca() {
        this.cajaJengibreOrganico.setNombreMarca(DatosProductoJengibreOrganico.getMapNombreMarcaJengibreOrganicoMaritimo_14kg().get(Utilidades.generarNumeroAleatorioConRango(1, 1)));
    }

    @Override
    public void construirAtributosBaseCajaJengibreOrganico() {
        this.cajaJengibreOrganico.setAtributosBaseCajaJengibreOrganico(FabricaAtributosBaseCajaJengibreOrganico.getAtributosBaseCajaJengibreOrganicoMaritimo(14, 72, 1440, "Cartón"));
    }
}