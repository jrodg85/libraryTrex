package es.libraryTrex;

public abstract class Entretenimiento {

  // atributos

  private long idEntretenimiento;
  private String titulo;

  // getters

  public long getIdEntretenimiento() {
    return idEntretenimiento;
  }

  public String getTitulo() {
    return titulo;
  }

  // setter

  public void setIdEntretenimiento(long idEntretenimiento) {
    this.idEntretenimiento = idEntretenimiento;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  // contructores

  public Entretenimiento() {}


  public Entretenimiento(String titulo) {
    this.titulo = titulo;
  }

}
