package junitTests;

import modelos.Coche;
import modelos.Color;
import org.junit.Before;
import org.junit.Test;
import utilidades.UtilidadesCoche;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class TestUtilidadesCoche {

    List<Coche> listaCochesPrueba;

    @Before
    public void inicializadoDeDatos() throws Exception {
       listaCochesPrueba = UtilidadesCoche.crearListaCoches();
    }

    @Test
    public void testListCochesPorColor() {
        List<Coche> listaEsperada = listaCochesPrueba.stream()
                .filter(c->c.getColor().equals(Color.ROJO)).collect(Collectors.toList());

        List<Coche> listaObtenida = UtilidadesCoche.getCochesPorColor(listaCochesPrueba, Color.VERDE);

        assertEquals(listaEsperada, listaObtenida);
    }


}
