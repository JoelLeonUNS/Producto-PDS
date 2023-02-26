package constructorCajaJengibreOrganico;

import extras.DatosProductoJengibreOrganico;
import extras.Utilidades;
import flyweightCajaJengibreOrganico.FabricaAtributosBaseCajaJengibreOrganico;

public final class MaritimoCajaJengibreOrganicoConstructor_8kg extends MaritimoCajaJengibreOrganicoConstructor {

    public MaritimoCajaJengibreOrganicoConstructor_8kg() {
    }

    @Override
    public void construirNombreMarca() {
        this.cajaJengibreOrganico.setNombreMarca(DatosProductoJengibreOrganico.getMapNombreMarcaJengibreOrganicoMaritimo_8kg().get(Utilidades.generarNumeroAleatorioConRango(1, 1)));
    }

    @Override
    public void construirAtributosBaseCajaJengibreOrganico() {
        this.cajaJengibreOrganico.setAtributosBaseCajaJengibreOrganico(FabricaAtributosBaseCajaJengibreOrganico.getAtributosBaseCajaJengibreOrganicoMaritimo(8, 120, 2400, "Plástico"));
    }
}