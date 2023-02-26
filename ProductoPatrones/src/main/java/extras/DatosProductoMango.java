package extras;

import java.util.HashMap;

public class DatosProductoMango {
    // Datos de Mango
    private static final HashMap<Integer, String> mapNombreMarcaCajaMangoAereo_2kg = new HashMap<>();
    private static final HashMap<Integer, String> mapNombreMarcaCajaMangoAereo_4kg = new HashMap<>();
    private static final HashMap<Integer, String> mapNombreMarcaCajaMangoAereo_6kg = new HashMap<>();
    
    private static final HashMap<Integer, String> mapNombreMarcaCajaMangoMaritimo_4kg = new HashMap<>();
    
    
    private static final HashMap<Integer, Integer> mapNumeroCalibreCajaMangoAereo_2kg = new HashMap<>();
    private static final HashMap<Integer, Integer> mapNumeroCalibreCajaMangoAereo_4kg = new HashMap<>();
    private static final HashMap<Integer, Integer> mapNumeroCalibreCajaMangoAereo_6kg = new HashMap<>();
    
    private static final HashMap<Integer, Integer> mapNumeroCalibreCajaMangoMaritimo_4kg = new HashMap<>();
    
    // Datos Precios Mango
    private static final HashMap<String, Double> mapPrecioPaisMango = new HashMap<>();
    private static final HashMap<String, Double> mapPesoCalibreMango = new HashMap<>();
    
    
    
    // Marcas de mango que se envía por aire.
    
        // Marcas para mangos de 2kg
        private static void putNombreMarcaCajaMangoAereo_2kg() {
            mapNombreMarcaCajaMangoAereo_2kg.put(1, "Inkanto");
            mapNombreMarcaCajaMangoAereo_2kg.put(2, "L’exclusive");
            mapNombreMarcaCajaMangoAereo_2kg.put(3, "Kantu");
            mapNombreMarcaCajaMangoAereo_2kg.put(4, "Aroma");
            mapNombreMarcaCajaMangoAereo_2kg.put(5, "Pucara");
        }

        public static HashMap<Integer, String> getMapNombreMarcaCajaMangoAereo_2kg() {
            if (mapNombreMarcaCajaMangoAereo_2kg.isEmpty()) {
                putNombreMarcaCajaMangoAereo_2kg();
            }
            return mapNombreMarcaCajaMangoAereo_2kg;
        }
        
        // Marcas para mangos de 4kg      
        private static void putNombreMarcaCajaMangoAereo_4kg() {
            mapNombreMarcaCajaMangoAereo_4kg.put(1, "Inkanto");
            mapNombreMarcaCajaMangoAereo_4kg.put(2, "L’exclusive");
            mapNombreMarcaCajaMangoAereo_4kg.put(3, "Kantu");
            mapNombreMarcaCajaMangoAereo_4kg.put(4, "Aroma");
            mapNombreMarcaCajaMangoAereo_4kg.put(5, "Pucara");
        }
        
        public static HashMap<Integer, String> getMapNombreMarcaCajaMangoAereo_4kg() {
            if (mapNombreMarcaCajaMangoAereo_4kg.isEmpty()) {
                putNombreMarcaCajaMangoAereo_4kg();
            }
            return mapNombreMarcaCajaMangoAereo_4kg;
        }
        
        // Marcas para mangos de 6kg
        private static void putNombreMarcaCajaMangoAereo_6kg() {
            mapNombreMarcaCajaMangoAereo_6kg.put(1, "Inkanto");
            mapNombreMarcaCajaMangoAereo_6kg.put(2, "L’exclusive");
            mapNombreMarcaCajaMangoAereo_6kg.put(3, "Kantu");
            mapNombreMarcaCajaMangoAereo_6kg.put(4, "Aroma");
            mapNombreMarcaCajaMangoAereo_6kg.put(5, "Pucara");
        }

        public static HashMap<Integer, String> getMapNombreMarcaCajaMangoAereo_6kg() {
            if (mapNombreMarcaCajaMangoAereo_6kg.isEmpty()) {
                putNombreMarcaCajaMangoAereo_6kg();
            }
            return mapNombreMarcaCajaMangoAereo_6kg;
        }
        
    // Marcas de mango que se envían por mar.
        
        // Marcas para mangos de 4kg  
        private static void putNombreMarcaCajaMangoMaritimo_4kg() {
            mapNombreMarcaCajaMangoMaritimo_4kg.put(1, "Inkanto");
        }

        public static HashMap<Integer, String> getMapNombreMarcaCajaMangoMaritimo_4kg() {
            if (mapNombreMarcaCajaMangoMaritimo_4kg.isEmpty()) {
                putNombreMarcaCajaMangoMaritimo_4kg();
            }
            return mapNombreMarcaCajaMangoMaritimo_4kg;
        }
        
    
    
    // Calibre de mango que se envía por aire.
        
        // Calibre para mangos de 2kg
        private static void putNumeroCalibreCajaMangoAereo_2kg() {
            mapNumeroCalibreCajaMangoAereo_2kg.put(1, 5);
            mapNumeroCalibreCajaMangoAereo_2kg.put(2, 6);
        }

        public static HashMap<Integer, Integer> getMapNumeroCalibreCajaMangoAereo_2kg() {
            if (mapNumeroCalibreCajaMangoAereo_2kg.isEmpty()) {
                putNumeroCalibreCajaMangoAereo_2kg();
            }
            return mapNumeroCalibreCajaMangoAereo_2kg;
        }

        // Calibre para mangos de 4kg
        private static void putNumeroCalibreCajaMangoAereo_4kg() {
            mapNumeroCalibreCajaMangoAereo_4kg.put(1, 7);
            mapNumeroCalibreCajaMangoAereo_4kg.put(2, 8);
            mapNumeroCalibreCajaMangoAereo_4kg.put(3, 9);
            mapNumeroCalibreCajaMangoAereo_4kg.put(4, 10);
            mapNumeroCalibreCajaMangoAereo_4kg.put(5, 11);
            mapNumeroCalibreCajaMangoAereo_4kg.put(6, 12);
        }
        
        public static HashMap<Integer, Integer> getMapNumeroCalibreCajaMangoAereo_4kg() {
            if (mapNumeroCalibreCajaMangoAereo_4kg.isEmpty()) {
                putNumeroCalibreCajaMangoAereo_4kg();
            }
            return mapNumeroCalibreCajaMangoAereo_4kg;
        }

        // Calibre para mangos de 6kg
        private static void putNumeroCalibreCajaMangoAereo_6kg() {
            mapNumeroCalibreCajaMangoAereo_6kg.put(1, 7);
            mapNumeroCalibreCajaMangoAereo_6kg.put(2, 8);
            mapNumeroCalibreCajaMangoAereo_6kg.put(3, 9);
            mapNumeroCalibreCajaMangoAereo_6kg.put(4, 10);
            mapNumeroCalibreCajaMangoAereo_6kg.put(5, 12);
            mapNumeroCalibreCajaMangoAereo_6kg.put(6, 14);
            mapNumeroCalibreCajaMangoAereo_6kg.put(7, 16);
        }
        
        public static HashMap<Integer, Integer> getMapNumeroCalibreCajaMangoAereo_6kg() {
            if (mapNumeroCalibreCajaMangoAereo_6kg.isEmpty()) {
                putNumeroCalibreCajaMangoAereo_6kg();
            }
            return mapNumeroCalibreCajaMangoAereo_6kg;
        }
        

    // Calibre de mango que se envía por mar.    
        // Calibre para mangos de 4kg
        private static void putNumeroCalibreCajaMangoMaritimo_4kg() {
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(1, 6);
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(2, 7);
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(3, 8);
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(4, 9);
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(5, 10);
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(6, 11);
            mapNumeroCalibreCajaMangoMaritimo_4kg.put(7, 12);
        }

        public static HashMap<Integer, Integer> getMapNumeroCalibreCajaMangoMaritimo_4kg() {
            if (mapNumeroCalibreCajaMangoMaritimo_4kg.isEmpty()) {
                putNumeroCalibreCajaMangoMaritimo_4kg();
            }
            return mapNumeroCalibreCajaMangoMaritimo_4kg;
        }

        

    // Precio del Mango por País
    private static void putPrecioPaisMango() {
        mapPrecioPaisMango.put("Corea", 4.2);
        mapPrecioPaisMango.put("Holanda", 8.5);
        mapPrecioPaisMango.put("Alemania", 3.0);
        mapPrecioPaisMango.put("Japón", 3.0); // calibre
        mapPrecioPaisMango.put("China", 10.0);
        mapPrecioPaisMango.put("Estados Unidos", 1.0); // calibre
    }

    public static HashMap<String, Double> getMapPrecioPaisMango() {
        if (mapPrecioPaisMango.isEmpty()) {
            putPrecioPaisMango();
        }
        return mapPrecioPaisMango;
    }
    
    // Peso de cada mango según su calibre
    private static void putPesoCalibreMango() {
        mapPesoCalibreMango.put("5", 799.0);
        mapPesoCalibreMango.put("6", 668.0);
        mapPesoCalibreMango.put("7", 570.5);
        mapPesoCalibreMango.put("8", 500.5);
        mapPesoCalibreMango.put("9", 443.0);
        mapPesoCalibreMango.put("10", 395.5);
        mapPesoCalibreMango.put("11", 365.5);
        mapPesoCalibreMango.put("12", 335.5);
        mapPesoCalibreMango.put("14", 255.5);
        mapPesoCalibreMango.put("16", 250.5);
    }

    public static HashMap<String, Double> getMapPesoCalibreMango() {
        if (mapPesoCalibreMango.isEmpty()) {
            putPesoCalibreMango();
        }
        return mapPesoCalibreMango;
    }
}