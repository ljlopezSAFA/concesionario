package testFicheros;

import ficheros.UtilidadesFicheros;
import utilidades.Utilidades;

import java.io.IOException;

public class testFicheros {

    public static void main(String[] args) throws IOException {

        Utilidades.pintarPorConsola(UtilidadesFicheros.leerFicheroCoches());

    }
}
