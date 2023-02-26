package constructorCajaMango;

import cajas.CajaMango;

public abstract class CajaMangoConstructor {

    protected CajaMango cajaMango;

    public CajaMango getCajaMango() {
        return this.cajaMango;
    }

    public void crearNuevoCajaMango() {
        this.cajaMango = new CajaMango();
    }

    public abstract void construirNombreMarca();

    public abstract void construirNumeroCalibre();

    public abstract void construirAtributosBaseCajaMago();
}