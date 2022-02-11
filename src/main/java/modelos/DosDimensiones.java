package modelos;

import java.util.Objects;

public class DosDimensiones {

    private double base;
    private double altura;


    public DosDimensiones(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DosDimensiones that = (DosDimensiones) o;
        return Double.compare(that.base, base) == 0 && Double.compare(that.altura, altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    @Override
    public String toString() {
        return "DosDimensiones{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
