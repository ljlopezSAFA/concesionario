import modelos.Coche;
import modelos.Color;
import modelos.Marca;

import java.time.LocalDate;

public class pruebaObjetos {

    public static void main(String[] args) {

        //OBJETOS
        Coche c = new Coche();
        Coche c2 = new Coche("1234AAA", LocalDate.now());
        Marca m = new Marca("FERRARI", "logo_inventado","Italia" );

        System.out.println(m.getNombre());



        c.setMatricula("6666LLL");
        c.setColor(Color.VERDE);
        c.setMarca(m);

        System.out.println(c);
        System.out.println(c2);
    }
}
