package fabrica;

import director.DirectorAereoCajaMango;
import director.DirectorCajaJengibreOrganico;
import director.DirectorCajaMango;
import director.DirectorMaritimoCajaJengibreOrganico;
import director.DirectorMaritimoCajaMango;


public class Director {

    public static DirectorCajaMango crearDirectorMango(String tipoDirector) {
        switch (tipoDirector) {
            case "Marítimo" -> {
                return new DirectorMaritimoCajaMango();
            }
            case "Aereo" -> {
                return new DirectorAereoCajaMango();
            }
            default -> {
                return null;
            }
        }

    }
    
    public static DirectorCajaJengibreOrganico crearDirectorJengibreOrganico(String tipoDirector) {
        switch (tipoDirector) {
            case "Marítimo" -> {
                return new DirectorMaritimoCajaJengibreOrganico();
            }
            default -> {
                return null;
            }
        }

    }
}
