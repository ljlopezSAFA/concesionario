import java.util.Arrays;
import java.util.List;

import static utilidades.Utilidades.calcula_nota_media;

public class prueba_notas {

    public static void main(String[] args) {

        List<Double> lista_notas = Arrays.asList(6.0, 8.5, 7.0);

        System.out.println(calcula_nota_media(lista_notas));

    }
}
