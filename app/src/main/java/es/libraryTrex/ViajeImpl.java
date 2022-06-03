package es.libraryTrex;

import java.time.LocalDate;
import java.util.Collection;

public class ViajeImpl extends Entretenimiento implements Viaje {

  // CAMPOS O ATRIBUTOS
  private LocalDate fechaSalida;
  private int duracionViaje;
  private float precio;

  // CONSTRUCTORES
  public ViajeImpl(String titulo, String descripcion, LocalDate fechaSalida, int duracionViaje,
      float precio) {
    super(titulo, descripcion);
    this.fechaSalida = fechaSalida;
    this.duracionViaje = duracionViaje;
    this.precio = precio;
  }

  public ViajeImpl(String titulo, String descripcion, Collection<Valoracion> valoraciones,
      LocalDate fechaSalida, int duracionViaje, float precio) {
    super(titulo, descripcion, valoraciones);
    this.fechaSalida = fechaSalida;
    this.duracionViaje = duracionViaje;
    this.precio = precio;
  }

  // GETTERS de la Interface
  @Override
  public LocalDate getFechaSalida() {
    return fechaSalida;
  }

  @Override
  public int getDuracionViaje() {
    return duracionViaje;
  }

  @Override
  public float getPrecio() {
    return precio;
  }

  // SETTERS de la Interface
  @Override
  public void setFechaSalida(LocalDate fechaSalida) {
    this.fechaSalida = fechaSalida;
  }

  @Override
  public void setDuracionViaje(int duracionViaje) {
    this.duracionViaje = duracionViaje;
  }

  @Override
  public void setPrecio(float precio) {
    this.precio = precio;
  }

}
