package es.libraryTrex;

public abstract class Entretenimiento {

  // atributos

  private long idEntretenimiento;
  private String titulo;
  private String descripcion;



  // getters

  public long getIdEntretenimiento() {
    return idEntretenimiento;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  // setter

  public void setIdEntretenimiento(long idEntretenimiento) {
    this.idEntretenimiento = idEntretenimiento;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  // contructores

  public Entretenimiento() {}


  public Entretenimiento(String titulo, String descripcion) {
    this.titulo = titulo;
    this.descripcion = descripcion;
  }

}
