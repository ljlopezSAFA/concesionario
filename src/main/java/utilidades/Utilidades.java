package utilidades;

import modelos.Coche;
import modelos.Componente;
import modelos.Marca;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Utilidades {


    public static void pintarPorConsola(Object object){
        System.out.println(object);
    }


    public static String calcula_nota_media(List<Double> lista_notas){

        Double suma_notas = 0.0;

        for(Double nota : lista_notas){
            suma_notas += nota;
        }

        Double nota_media = suma_notas / lista_notas.size();
        String nota_texto = "";

        if(nota_media < 5.0){
            nota_texto = "Suspenso";
        }
        if(nota_media >= 5.0 && nota_media < 7.0){
            nota_texto = "Aprobado";
        }
        if(nota_media >= 7.0 && nota_media < 9.0){
            nota_texto = "Notable";
        }
        if(nota_media >= 9.0){
            nota_texto = "Sobresaliente";
        }

        return nota_texto;

    }


    public boolean esFechaActual(Coche coche){
        LocalDate fecha = coche.getFechaMatriculacion();
        boolean res = fecha.isAfter(LocalDate.now());
        return res;
    }




    //Metodo que a partir de un objeto de tipo coche que recibe como parámetro devuelva la edad de dicho coche

    public static int calcularAntiguedadCoche(Coche coche1){
        int resultado = 0;
        LocalDate fechainicio = coche1.getFechaMatriculacion();

        // fecha fin - fecha inicio
        Period periodo = Period.between(fechainicio, LocalDate.now());
        resultado = periodo.getYears();

        return resultado;
    }




    //Método para obtener la lista de todos los coche cuya marca es del pais que se pasa como parámetro

    public static List<Coche> obtenerCochesDelPais(List<Coche> listaCoches, String pais){
        List<Coche> listaCochesPais = new ArrayList<>();

        for(Coche coche : listaCoches){

            //Compruebo si el coche que estoy recorriendo es del mismo pais del que me pasan
            if(coche.getMarca().getPais().equals(pais)){

                //Añadimos el coche a la lista que vamos a devolver
                listaCochesPais.add(coche);
            }
        }
        return listaCochesPais;

    }



    public static Double obtenerPrecioCochePorComponentes(Coche coche){

        Double importeTotal = 0.0;

        for(Componente compo : coche.getComponentes()){

            importeTotal += compo.getPrecio();

        }


        return importeTotal;


    }








}
