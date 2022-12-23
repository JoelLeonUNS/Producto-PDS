package constructorCajaJengibreOrganico;

import cajas.CajaJengibreOrganico;
import java.util.HashMap;

public abstract class CajaJengibreOrganicoConstructor {
    
    protected CajaJengibreOrganico cajaJengibreOrganico;
    protected HashMap<Integer, String> mapNombreMarcaJengibreOrganico = new HashMap<>();
    
    public CajaJengibreOrganico getCajaJengibreOrganico() {
        return this.cajaJengibreOrganico;
    }

    public void crearNuevoCajaJengibreOrganico() {
        this.cajaJengibreOrganico = new CajaJengibreOrganico();
    }

    public abstract void construirTipoMaterial();

    public abstract void construirPesoCaja();

    public abstract void construirNombreMarca();

    public abstract void construirNumeroCajaPorPalet();

    public abstract void construirNumeroCajaPorContenedor();

    public abstract void putNombreMarcaInMap();
}
