package director;

import constructorCajaMango.CajaMangoConstructor;

public class DirectorMaritimoCajaMango extends DirectorCajaMango {

    @Override
    public void construir(CajaMangoConstructor cajaMangoConstructor) {
        cajaMangoConstructor.construirNombreMarca();
        cajaMangoConstructor.construirNumeroCalibre();
        cajaMangoConstructor.construirAtributosBaseCajaMago();
    }
}