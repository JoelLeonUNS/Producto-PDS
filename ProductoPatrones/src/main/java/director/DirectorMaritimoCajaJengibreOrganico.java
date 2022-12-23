package director;

import constructorCajaJengibreOrganico.CajaJengibreOrganicoConstructor;

public class DirectorMaritimoCajaJengibreOrganico extends DirectorCajaJengibreOrganico{

    @Override
    public void construir(CajaJengibreOrganicoConstructor cajaJengibreOrganicoConstructor) {
        cajaJengibreOrganicoConstructor.construirTipoMaterial();
        cajaJengibreOrganicoConstructor.construirPesoCaja();
        cajaJengibreOrganicoConstructor.construirNombreMarca();
        cajaJengibreOrganicoConstructor.construirNumeroCajaPorPalet();
        cajaJengibreOrganicoConstructor.construirNumeroCajaPorContenedor();
    }
    
}
