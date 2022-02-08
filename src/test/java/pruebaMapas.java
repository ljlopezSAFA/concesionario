import modelos.Coche;
import modelos.Marca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pruebaMapas {

    public static void main(String[] args) {

        //Inicializado
        Map<Marca, List<Coche>> cochesAgrupadosPorMarca = new HashMap<>();

        Marca ma = new Marca("Ferrari", "url_ferrari", "Italia");
        Marca ma2 = new Marca("Seat", "url_seat", "España");

        List<Coche> lista1 = new ArrayList<>();
        List<Coche> lista2 = new ArrayList<>();

        Coche coche1 = new Coche("1234AAA", LocalDate.of(2015,5,16));
        Coche coche2 = new Coche("1054ALA", LocalDate.of(2017,5,16));
        Coche coche3 = new Coche("5555ABA", LocalDate.of(2018,5,16));
        Coche coche4 = new Coche("9874APP", LocalDate.of(2019,5,16));
        Coche coche5 = new Coche("3542BBA", LocalDate.of(2014,5,16));

        lista1.add(coche1);
        lista1.add(coche2);
        lista1.add(coche3);
        lista2.add(coche4);
        lista2.add(coche5);



        //Añadir elementos
        cochesAgrupadosPorMarca.put(ma, lista1);
        cochesAgrupadosPorMarca.put(ma2, lista2);


        //QuitarElementos
        cochesAgrupadosPorMarca.remove(ma);
        cochesAgrupadosPorMarca.remove(ma,lista1);


        //Obtener elementos del mapa
        List<Coche>  obtencionValoresPorClave = cochesAgrupadosPorMarca.get(ma);
        cochesAgrupadosPorMarca.values();
        cochesAgrupadosPorMarca.keySet();

        //Tamaño de un map
        obtencionValoresPorClave.size();


        //Comprobar si un mapa esta vacia
        obtencionValoresPorClave.isEmpty();


        System.out.println(cochesAgrupadosPorMarca);
        System.out.println(obtencionValoresPorClave);


    }

}
