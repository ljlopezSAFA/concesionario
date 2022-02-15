package testUnitarios;

import modelos.Coche;
import modelos.Marca;
import org.junit.Test;
import utilidades.Utilidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestUnitarios {


    @Test
    public void testCalcularNotasMedias(){
        List<Double> listaNotas = new ArrayList<>();
        listaNotas.add(6.0);
        listaNotas.add(10.0);
        listaNotas.add(6.0);
        listaNotas.add(10.0);
        String miNotaMedia = Utilidades.calcula_nota_media(listaNotas);
        assertEquals("Notable", miNotaMedia);
    }

    @Test
    public void testCalcularNotasMediasListaVacia(){
        List<Double> listaNotas = new ArrayList<>();
        String miNotaMedia = Utilidades.calcula_nota_media(listaNotas);

        assertEquals("Suspenso", miNotaMedia);
    }

    @Test(expected = NullPointerException.class)
    public void testCalcularNotasMediasNull(){

        String miNotaMedia = Utilidades.calcula_nota_media(null);

    }

    @Test
    public void testDevuelveCochesPaisIndicado(){

        List<Coche> cochesPrueba = new ArrayList<>();
        Coche c = new Coche("1241GGG", LocalDate.of(2005,4,4));
        Coche c1 = new Coche("1241BBB", LocalDate.of(2015,4,4));
        Coche c2 = new Coche("1241DDD", LocalDate.of(2020,4,4));
        Marca m = new Marca("Ferrari", "url_ferrari", "Italia");
        Marca m2 = new Marca("Renault", "url_renault", "Francia");
        c.setMarca(m);
        c1.setMarca(m2);
        c2.setMarca(m2);
        cochesPrueba.add(c);
        cochesPrueba.add(c1);
        cochesPrueba.add(c2);


        List<Coche> cochesDevueltos = Utilidades.obtenerCochesDelPais(cochesPrueba,"Italia");

        List<Coche> cochesEsperadosFrancia = new ArrayList<>();
        cochesEsperadosFrancia.add(c1);
        cochesEsperadosFrancia.add(c2);

        assertEquals(cochesEsperadosFrancia, cochesDevueltos);




    }






}
