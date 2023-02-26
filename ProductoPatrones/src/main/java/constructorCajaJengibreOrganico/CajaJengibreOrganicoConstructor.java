    package constructorCajaJengibreOrganico;

import cajas.CajaJengibreOrganico;

public abstract class CajaJengibreOrganicoConstructor {

    protected CajaJengibreOrganico cajaJengibreOrganico;

    public CajaJengibreOrganico getCajaJengibreOrganico() {
        return this.cajaJengibreOrganico;
    }

    public void crearNuevoCajaJengibreOrganico() {
        this.cajaJengibreOrganico = new CajaJengibreOrganico();
    }

    public abstract void construirNombreMarca();

    public abstract void construirAtributosBaseCajaJengibreOrganico();
}
