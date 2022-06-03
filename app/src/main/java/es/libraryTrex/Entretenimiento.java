package es.libraryTrex;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Entretenimiento {

  // CAMPOS O ATRIBUTOS
  private String titulo;
  private String descripcion;
  private Collection<Valoracion> valoraciones = new ArrayList<>();

  // GETTERS
  public String getTitulo() {
    return titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public Collection<Valoracion> getValoraciones() {
    return valoraciones;
  }

  // SETTERS
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setValoraciones(Collection<Valoracion> valoraciones) {
    this.valoraciones = valoraciones;
  }

  // CONSTRUCTORES
  public Entretenimiento() {}

  public Entretenimiento(String titulo, String descripcion) {
    super();
    this.titulo = titulo;
    this.descripcion = descripcion;
  }

  public Entretenimiento(String titulo, String descripcion, Collection<Valoracion> valoraciones) {
    super();
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.valoraciones = valoraciones;
  }

  // METODOS
  public void addValoracion(Valoracion valoracion) {
    getValoraciones().add(valoracion);
  }

}
