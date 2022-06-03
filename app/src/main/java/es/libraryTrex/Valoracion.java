package es.libraryTrex;

import java.time.LocalDateTime;

public class Valoracion {

  // CAMPOS O ATRIBUTOS
  private String comentario;
  private int puntuacion;
  private LocalDateTime fechaPublicacion;

  // GETTERS
  public String getComentario() {
    return comentario;
  }

  public int getPuntuacion() {
    return puntuacion;
  }

  public LocalDateTime getFechaPublicacion() {
    return fechaPublicacion;
  }

  // SETTERS
  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
  }

  public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
    this.fechaPublicacion = fechaPublicacion;
  }

  // CONSTRUCTORES
  public Valoracion() {}

  public Valoracion(String comentario, int puntuacion) {
    super();
    this.comentario = comentario;
    this.puntuacion = puntuacion;
    this.fechaPublicacion = LocalDateTime.now();
  }

}
