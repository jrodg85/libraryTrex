package es.libraryTrex;

import java.time.LocalDate;

public interface Viaje {

  LocalDate getFechaSalida();

  int getDuracionViaje();

  float getPrecio();

  void setFechaSalida(LocalDate fechaSalida);

  void setDuracionViaje(int duracionViaje);

  void setPrecio(float precio);

}
