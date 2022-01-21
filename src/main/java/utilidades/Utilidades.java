package utilidades;

import java.util.List;

public class Utilidades {


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


}
