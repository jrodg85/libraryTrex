package es.libraryTrex;



public interface ActividadInterfaz {

  Coordinador getCoordinador();

  String getTipoActividadString();

  String getDificultadActividad();

  void setCoordinador(Coordinador coordinador);

  void setTipoActividadString(String tipoActividad);

  void setDificultadActividad(String dificultadActividad);

}
