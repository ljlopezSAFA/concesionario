package modelos;

import java.util.Objects;

public class Marca {

     private String nombre;
     private String urlLogo;
     private String pais;



     public Marca(String nombre, String urlLogo, String pais) {
          this.nombre = nombre;
          this.urlLogo = urlLogo;
          this.pais = pais;
     }

     public Marca() {
     }


     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public String getUrlLogo() {
          return urlLogo;
     }

     public void setUrlLogo(String urlLogo) {
          this.urlLogo = urlLogo;
     }

     public String getPais() {
          return pais;
     }

     public void setPais(String pais) {
          this.pais = pais;
     }

     @Override
     public String toString() {
          return "Marca{" +
                  "nombre='" + nombre + '\'' +
                  ", urlLogo='" + urlLogo + '\'' +
                  ", pais='" + pais + '\'' +
                  '}';
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Marca marca = (Marca) o;
          return Objects.equals(nombre, marca.nombre) && Objects.equals(urlLogo, marca.urlLogo) && Objects.equals(pais, marca.pais);
     }

     @Override
     public int hashCode() {
          return Objects.hash(nombre, urlLogo, pais);
     }

}
