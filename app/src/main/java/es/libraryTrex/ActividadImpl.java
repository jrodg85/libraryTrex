package es.libraryTrex;

import java.util.Collection;

public class ActividadImpl extends Entretenimiento implements Actividad {

  // CAMPOS O ATRIBUTOS
  private String ciudad;
  private Coordinador coordinador;

  // CONSTRUCTORES
  public ActividadImpl(String titulo, String descripcion, String ciudad, Coordinador coordinador) {
    super(titulo, descripcion);
    this.ciudad = ciudad;
    this.coordinador = coordinador;
  }

  public ActividadImpl(String titulo, String descripcion, Collection<Valoracion> valoraciones,
      String ciudad, Coordinador coordinador) {
    super(titulo, descripcion, valoraciones);
    this.ciudad = ciudad;
    this.coordinador = coordinador;
  }

  // GETTERS de la Interface
  @Override
  public String getCiudad() {
    return ciudad;
  }

  @Override
  public Coordinador getCoordinador() {
    return coordinador;
  }

  // SETTERS de la Interface
  @Override
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  @Override
  public void setCoordinador(Coordinador coordinador) {
    this.coordinador = coordinador;
  }

}
