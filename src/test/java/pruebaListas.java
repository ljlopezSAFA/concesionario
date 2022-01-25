import modelos.Coche;

import java.util.ArrayList;
import java.util.List;

public class pruebaListas {

    public static void main(String[] args) {


        //Inicializado
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        //Añadir elementos
        lista1.add("Verde");
        lista1.add("Rojo");
        lista1.add("Azul");
        lista1.addAll(List.of("Amarillo", "Morado", "Rosa"));
        lista2.addAll(lista1);

        //QuitarElementos
        lista1.remove("Verde");
        lista1.remove(4);


        //Obtener elementos de la lista
        String color = lista1.get(0);

        //Tamaño de una lista
        int tamanyo = lista1.size();
        int tamanyo2 = lista2.size();

        //Comprobar si una lista esta vacia
        boolean estaVacia1 = lista1.isEmpty();
        boolean estaVacia2 = lista2.isEmpty();

        //Comprobar indice de elemento
        int indice1 = lista1.indexOf("Amarillo");



        List<Coche> listaCoches = new ArrayList<>();
        Coche coche = new Coche();
        listaCoches.add(coche);



        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(color);
        System.out.println(tamanyo);
        System.out.println(tamanyo2);
        System.out.println(estaVacia1);
        System.out.println(estaVacia2);
        System.out.println(indice1);






    }


}
