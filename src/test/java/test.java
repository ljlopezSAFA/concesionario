import modelos.Coche;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        int num = 4;
        boolean afirmacion = true ;
        Integer num2 = 6;
        String palabra = "Grado Superior";
        double decimal = 5.32;
        Double decimal2 = 4.50;
        List<String> nombresAlumnos = new ArrayList<>();
        DayOfWeek diaSemana = DayOfWeek.MONDAY;


        //CONDICIONALES
        if(!(num > num2) ){
            System.out.println("num es mayor que num2");
        }else if(num == num2){
            System.out.println("Son iguales");
        }else{
            System.out.println("num2 es mayor que num");
        }

        //WHILE
        while(num > num2){
            System.out.println("num es mayor que num2");

        }


        //FOR
        for(int contador = 0 ; contador < 9 ; contador++ ){
            System.out.println(contador);
        }

        for(String nombre : nombresAlumnos){
            System.out.println(nombre);
        }

        //SWITCH
        switch(diaSemana){
            case MONDAY:
                System.out.println("Que faena");
                break;
            case TUESDAY:
                System.out.println("Ya queda menos");
                break;
        }



















    }

}
