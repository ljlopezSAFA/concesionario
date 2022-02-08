package utilidades;

import modelos.Coche;
import modelos.Marca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilidadesMarca {

    public UtilidadesMarca() {
    }

    public static Marca crearMarca(){
        Marca ma = new Marca("Ferrari", "url_ferrari", "Italia");
        return ma;

    }

    public static List<Marca> crearListaMarcas(){
        List<Marca> listMarca = new ArrayList<>();

        Marca ma = new Marca("Ferrari", "url_ferrari", "Italia");
        Marca ma1 = new Marca("Seat", "url_ferrari", "España");
        Marca ma2 = new Marca("Peugeot", "url_ferrari", "Francia");
        Marca ma3 = new Marca("Porsche", "url_ferrari", "Alemania");
        Marca ma4 = new Marca("Toyota", "url_ferrari", "Japón");


        listMarca.addAll(Arrays.asList(ma, ma1, ma2, ma3, ma4));


        return listMarca;



    }



}
