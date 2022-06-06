package es.libraryTrex;



public interface ActividadInterfaz {

  Coordinador getCoordinador();

  String getTipoActividad();

  String getDificultadActividad();

  void setCoordinador(Coordinador coordinador);

  void setTipoActividad(String tipoActividad);

  void setDificultadActividad(String dificultadActividad);

}
