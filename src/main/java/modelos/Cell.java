package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class Cell {

    private Color color;
    private boolean tactil;
    private LocalDate anyo;
    private boolean funda;
    private String modelo;
    private Marca marca;
    private boolean tecladoFisico;
    private boolean camara;
    private float screen;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public LocalDate getAnyo() {
        return anyo;
    }

    public void setAnyo(LocalDate anyo) {
        this.anyo = anyo;
    }

    public boolean isFunda() {
        return funda;
    }

    public void setFunda(boolean funda) {
        this.funda = funda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean isTecladoFisico() {
        return tecladoFisico;
    }

    public void setTecladoFisico(boolean tecladoFisico) {
        this.tecladoFisico = tecladoFisico;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public float getScreen() {
        return screen;
    }

    public void setScreen(float screen) {
        this.screen = screen;
    }

    public Cell(Cell cell) {
        this.color = cell.getColor() ;
        this.tactil = tactil;
        this.anyo = anyo;
        this.funda = funda;
        this.modelo = modelo;
        this.marca = marca;
        this.tecladoFisico = tecladoFisico;
        this.camara = camara;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "color=" + color +
                ", tactil=" + tactil +
                ", anyo=" + anyo +
                ", funda=" + funda +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", tecladoFisico=" + tecladoFisico +
                ", camara=" + camara +
                ", screen=" + screen +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return tactil == cell.tactil
                && funda == cell.funda
                && tecladoFisico == cell.tecladoFisico
                && camara == cell.camara
                && Float.compare(cell.screen, screen) == 0
                && color == cell.color
                && Objects.equals(anyo, cell.anyo)
                && Objects.equals(modelo, cell.modelo)
                && Objects.equals(marca, cell.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, tactil, anyo, funda, modelo, marca, tecladoFisico, camara, screen);
    }
}
