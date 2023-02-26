package extras;

import java.util.HashMap;

public class DatosProductoJengibreOrganico {
    
    // Datos Jengibre
    private static final HashMap<Integer, String> mapNombreMarcaJengibreOrganicoMaritimo_8kg = new HashMap<>();
    private static final HashMap<Integer, String> mapNombreMarcaJengibreOrganicoMaritimo_14kg = new HashMap<>();
    
    // Marcas de jengibre que se envía por mar.
        // Marcas para jengibre de 8kg
        private static void putNombreMarcaJengibreOrganicoMaritimo_8kg() {
            mapNombreMarcaJengibreOrganicoMaritimo_8kg.put(1, "Inkanto");
        }
        
        public static HashMap<Integer, String> getMapNombreMarcaJengibreOrganicoMaritimo_8kg() {
            if (mapNombreMarcaJengibreOrganicoMaritimo_8kg.isEmpty()) {
                putNombreMarcaJengibreOrganicoMaritimo_8kg();
            }
            return mapNombreMarcaJengibreOrganicoMaritimo_8kg;
        }
        
        // Marcas para jengibre de 14kg
        private static void putNombreMarcaJengibreOrganicoMaritimo_14kg() {
            mapNombreMarcaJengibreOrganicoMaritimo_14kg.put(1, "Inkanto");
        }

        public static HashMap<Integer, String> getMapNombreMarcaJengibreOrganicoMaritimo_14kg() {
            if (mapNombreMarcaJengibreOrganicoMaritimo_14kg.isEmpty()) {
                putNombreMarcaJengibreOrganicoMaritimo_14kg();
            }
            return mapNombreMarcaJengibreOrganicoMaritimo_14kg;
        }
}