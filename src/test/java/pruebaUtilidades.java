import modelos.Coche;
import utilidades.Utilidades;
import utilidades.UtilidadesCoche;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class pruebaUtilidades {

    public static void main(String[] args) {

       //Utilidades.pintarPorConsola(Utilidades.obtenerCochesDelPais(UtilidadesCoche.crearListaCoches(), "Japón"));


        Map<String, List<Coche>> mapaCoches = UtilidadesCoche.crearListaCoches()
                .stream().collect(Collectors.groupingBy(c-> c.getMarca().getPais()));

        Utilidades.pintarPorConsola(mapaCoches);


    }
}
