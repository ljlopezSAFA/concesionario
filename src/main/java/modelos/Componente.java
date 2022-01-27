package modelos;

import java.util.Objects;

public class Componente {

    private int identificador;
    private String descripcion;
    private double precio;

    public Componente(int identificador, String descripcion, double precio) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Componente() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return identificador == that.identificador && Double.compare(that.precio, precio) == 0 && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, descripcion, precio);
    }

    @Override
    public String toString() {
        return "Componente{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
