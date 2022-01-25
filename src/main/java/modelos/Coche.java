package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Coche {

    private String matricula;
    private LocalDate fechaMatriculacion;
    private Color color;
    private Marca marca;
    private List<Marca> ruedas;



    public Coche() {
    }

    public Coche(String matricula, LocalDate fechaMatriculacion) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Coche(String matricula, LocalDate fechaMatriculacion, Color color, Marca marca) {
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.marca = marca;
    }

    public Coche(Coche c){
        this.matricula = c.getMatricula();
        this.fechaMatriculacion = c.getFechaMatriculacion();
        this.color = c.getColor();
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Marca> getRuedas() {
        return ruedas;
    }

    public void setRuedas(List<Marca> ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        String resultado = "Coche{" +
                "matricula='" + matricula + '\'' +
                ", fechaMatriculacion=" + fechaMatriculacion +
                ", color='" + color + '\'';
        if(this.marca != null) {
            resultado += ", marca='" + marca.toString() + '\'';
        }
        resultado += '}';

        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula)
                && Objects.equals(fechaMatriculacion, coche.fechaMatriculacion)
                && Objects.equals(color, coche.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, fechaMatriculacion, color);
    }

    public Coche crearCoche(){
        Coche c1 = new Coche();
        c1.setColor(Color.AMARILLO);
        Marca m1 = new Marca("Ferrari", "url_logo_ferrari", "Italia");
        c1.setMarca(m1);

        return c1;
    }


}
