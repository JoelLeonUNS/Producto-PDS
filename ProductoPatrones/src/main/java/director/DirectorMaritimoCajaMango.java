package director;

import constructorCajaMango.CajaMangoConstructor;

public class DirectorMaritimoCajaMango extends DirectorCajaMango{

    @Override
    public void construir(CajaMangoConstructor cajaMangoConstructor) {
        cajaMangoConstructor.construirTipoMaterial();
        cajaMangoConstructor.construirPesoCaja();
        cajaMangoConstructor.construirNombreMarca();
        cajaMangoConstructor.construirNumeroCalibre();
        cajaMangoConstructor.construirNumeroCajaPorContenedor();
    }

}
