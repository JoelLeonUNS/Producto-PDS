package flyweightCajaJengibreOrganico;

import java.util.HashMap;
import java.util.Map;

public class FabricaAtributosBaseCajaJengibreOrganico {

    private static final Map<AtributosBaseCajaJengibreOrganico, AtributosBaseCajaJengibreOrganico> atributosBaseCajaJengibreOrganicoMaritimo = new HashMap<>();

    public static AtributosBaseCajaJengibreOrganico getAtributosBaseCajaJengibreOrganicoMaritimo(double pesoCaja, int numeroCajaPorPalet, int numeroCajaPorContenedor, String tipoMaterial) {
        AtributosBaseCajaJengibreOrganico llaveAtributos = new AtributosBaseCajaJengibreOrganico(pesoCaja, numeroCajaPorPalet, numeroCajaPorContenedor, tipoMaterial);
        if (atributosBaseCajaJengibreOrganicoMaritimo.get(llaveAtributos) == null) {
            atributosBaseCajaJengibreOrganicoMaritimo.put(llaveAtributos, new AtributosBaseCajaJengibreOrganico(pesoCaja, numeroCajaPorPalet, numeroCajaPorContenedor, tipoMaterial));
        }
        return atributosBaseCajaJengibreOrganicoMaritimo.get(llaveAtributos);
    }

}