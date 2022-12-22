package cajaMango;

import java.util.HashMap;

public abstract class CajaMangoConstructor {

    protected CajaMango cajaMango;
    HashMap<Integer, String> mapNombreMarcaCajaMango = new HashMap<>();
    HashMap<Integer, Integer> mapNumeroCalibreCajaMango = new HashMap<>();

    public CajaMango getCajaMango() {
        return this.cajaMango;
    }

    public void crearNuevoCajaMango() {
        this.cajaMango = new CajaMango();
    }

    public abstract void construirTipoMaterial();

    public abstract void construirPesoCaja();

    public abstract void construirNombreMarca();

    public abstract void construirNumeroCalibre();

    public abstract void construirNumeroCajaPorPalet();
    
    public abstract void putNombreMarcaInMap();
    
    public abstract void putNumeroCalibreInMap();
}
