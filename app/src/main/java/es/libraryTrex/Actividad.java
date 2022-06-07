package es.libraryTrex;

public class Actividad extends Entretenimiento implements ActividadInterfaz {

  // atributos

  private String coordinador;
  private String tipoActividad;
  private String dificultadActividad;

  // getter

  @Override
  public String getCoordinador() {
    return coordinador;
  }

  @Override
  public String getTipoActividad() {
    return tipoActividad;
  }

  @Override
  public String getDificultadActividad() {
    return dificultadActividad;
  }


  // setter

  @Override
  public void setCoordinador(String coordinador) {
    this.coordinador = coordinador;
  }

  @Override
  public void setTipoActividad(String tipoActividad) {
    this.tipoActividad = tipoActividad;
  }

  @Override
  public void setDificultadActividad(String dificultadActividad) {
    this.dificultadActividad = dificultadActividad;
  }

  // constructores

  public Actividad() {

  }


  public Actividad(String tituloEntretenimiento, String descripcion, String coordinador,
      String tipoActividad, String dificultadActividad) {
    super(tituloEntretenimiento, descripcion);
    this.coordinador = coordinador;
    this.tipoActividad = tipoActividad;
    this.dificultadActividad = dificultadActividad;
  }



}
