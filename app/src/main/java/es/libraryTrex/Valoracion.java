package es.libraryTrex;

public class Valoracion {

  // campos

  private long idComentario;
  private String tituloComentario;
  private String comentario;
  private float puntuacion;

  // getters

  public long getIdComentario() {
    return idComentario;
  }

  public String getTituloComentario() {
    return tituloComentario;
  }

  public String getComentario() {
    return comentario;
  }

  public float getPuntuacion() {
    return puntuacion;
  }

  // setters

  public void setIdComentario(long idComentario) {
    this.idComentario = idComentario;
  }

  public void setTituloComentario(String tituloComentario) {
    this.tituloComentario = tituloComentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public void setPuntuacion(float puntuacion) {
    this.puntuacion = puntuacion;
  }

  // constructores

  public Valoracion() {}


  public Valoracion(String tituloComentario, String comentario, float puntuacion) {
    this.tituloComentario = tituloComentario;
    this.comentario = comentario;
    this.puntuacion = puntuacion;



  }

}
