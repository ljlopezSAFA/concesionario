package modelos;

import java.util.List;

public enum Color {
    AZUL, ROJO, VERDE, AMARILLO, GRIS, NEGRO, BLANCO;



    public static List<Color> colorList(){
        return List.of(Color.values());
    }

}
