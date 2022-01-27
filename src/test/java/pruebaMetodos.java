import modelos.Coche;
import modelos.Componente;
import utilidades.Utilidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static utilidades.Utilidades.*;

public class pruebaMetodos {

    public static void main(String[] args) {

        List<Coche> listaCoches = new ArrayList<>();
        Coche c1 = new Coche("1524AAA", LocalDate.of(2015,5,24));
        Coche c2 =  new Coche("1524AAB", LocalDate.of(2012,5,24));

        List<Componente> componenteList = new ArrayList<>();
        Componente componente1 = new Componente();
        componente1.setIdentificador(1);
        componente1.setPrecio(100.00);
        componente1.setDescripcion("Motor");
        Componente componente2 = new Componente();
        componente2.setIdentificador(2);
        componente2.setPrecio(50.00);
        componente2.setDescripcion("Bugia");
        componenteList.addAll(List.of(componente1,componente2));
        c1.setComponentes(componenteList);


        System.out.println( "Total del precio del coche:  " + obtenerPrecioCochePorComponentes(c1).toString());


    }
}
