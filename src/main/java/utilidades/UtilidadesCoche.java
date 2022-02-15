package utilidades;

import modelos.Coche;
import modelos.Color;
import modelos.Marca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class UtilidadesCoche {


    public static Coche crearCoche() {
        Coche coche1 = new Coche("1234AAA", LocalDate.of(2015, 5, 16));
        return coche1;
    }


    public static List<Coche> crearListaCoches() {
        List<Coche> listaCoches = new ArrayList<>();



        //Creamos los cohces
        Coche coche1 = new Coche("1234AAA", LocalDate.of(2015, 5, 16));
        Coche coche2 = new Coche("1054ALA", LocalDate.of(2017, 5, 16));
        Coche coche3 = new Coche("5555ABA", LocalDate.of(2018, 5, 16));
        Coche coche4 = new Coche("9874APP", LocalDate.of(2019, 5, 16));
        Coche coche5 = new Coche("3542BBA", LocalDate.of(2014, 5, 16));
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(coche4);
        listaCoches.add(coche5);

        //Ponemos a los coches su marca
        List<Marca> marcas = UtilidadesMarca.crearListaMarcas();
        listaCoches.stream().forEach(c -> c.setMarca(marcas.get(listaCoches.indexOf(c))));
        listaCoches.stream().forEach(c -> c.setColor(Color.colorList().get(Utilidades.getRandomNumber(0,Color.colorList().size()-1))));

        return listaCoches;
    }

    public static List<Coche> getCochesPorColor(List<Coche> cocheList, Color color) {

        List<Coche> cochesADevolver = new ArrayList<>();

        for (Coche c : cocheList) {

            if (c.getColor().equals(color)) {

                cochesADevolver.add(c);
            }
        }

        return cochesADevolver;
    }


    public List<Coche> getCochesPorColorJava8(List<Coche> cocheList, Color color) {
        return cocheList.stream().filter(c -> c.getColor().equals(color)).collect(Collectors.toList());

    }


}
