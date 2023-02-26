package director;

import constructorCajaJengibreOrganico.CajaJengibreOrganicoConstructor;

public class DirectorMaritimoCajaJengibreOrganico extends DirectorCajaJengibreOrganico {

    @Override
    public void construir(CajaJengibreOrganicoConstructor cajaJengibreOrganicoConstructor) {
        cajaJengibreOrganicoConstructor.construirNombreMarca();
        cajaJengibreOrganicoConstructor.construirAtributosBaseCajaJengibreOrganico();
    }
}