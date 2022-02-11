package modelos;

import java.util.Objects;

public class Triangulo extends DosDimensiones {

    private double hipotenusa;

    public Triangulo(double base, double altura, double hipotenusa) {
        super(base, altura);
        this.hipotenusa = hipotenusa;
    }

    public Double getArea(){
        return getAltura()* getBase();
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(triangulo.hipotenusa, hipotenusa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hipotenusa);
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "hipotenusa=" + hipotenusa +
                '}';
    }
}
