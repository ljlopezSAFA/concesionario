import modelos.Coche;
import java.util.Scanner;
import static utilidades.Utilidades.*;


public class pruebas {

    public static void main(String[] args) {

        //VARIABLES
        int num = 5;
        String palabra= "Hola";
        double decimal = 3.5;
        boolean afirmacion = false;
        Coche coche = new Coche();

        pintarPorConsola(coche);

        //SALUDO
        System.out.print("Por favor, dime tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String textoPorConsola = sc.nextLine();
        System.out.println("Hola " + textoPorConsola + "!");







    }




}
