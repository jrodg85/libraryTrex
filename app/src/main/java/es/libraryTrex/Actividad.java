package es.libraryTrex;

public class Actividad extends Entretenimiento implements ActividadInterfaz {

  // atributos

  private Coordinador coordinador;
  private String tipoActividad;
  private String dificultadActividad;

  // getter

  @Override
  public Coordinador getCoordinador() {
    return coordinador;
  }

  @Override
  public String getTipoActividadString() {
    return tipoActividad;
  }

  @Override
  public String getDificultadActividad() {
    return dificultadActividad;
  }


  // setter

  @Override
  public void setCoordinador(Coordinador coordinador) {
    this.coordinador = coordinador;
  }

  @Override
  public void setTipoActividadString(String tipoActividad) {
    this.tipoActividad = tipoActividad;
  }

  @Override
  public void setDificultadActividad(String dificultadActividad) {
    this.dificultadActividad = dificultadActividad;
  }

  // constructores

  public Actividad() {

  }


  public Actividad(String tituloEntretenimiento, Coordinador coordinador, String tipoActividad,
      String dificultadActividad) {
    super(tituloEntretenimiento);
    this.coordinador = coordinador;
    this.tipoActividad = tipoActividad;
    this.dificultadActividad = dificultadActividad;
  }

}
