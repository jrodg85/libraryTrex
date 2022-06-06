package es.libraryTrex;

public class Viaje extends Entretenimiento implements ViajeInterfaz {

  // atributos

  private String ciudad;
  private int diasDuracionViaje;
  private float precio;


  // getters

  @Override
  public String getCiudad() {
    return ciudad;
  }

  @Override
  public int getDiasDuracionViaje() {
    return diasDuracionViaje;
  }

  @Override
  public float getPrecio() {
    return precio;
  }

  // setter

  @Override
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  @Override
  public void setDiasDuracionViaje(int diasDuracionViaje) {
    this.diasDuracionViaje = diasDuracionViaje;
  }

  @Override
  public void setPrecio(float precio) {
    this.precio = precio;
  }

  // constructores

  public Viaje() {}

  public Viaje(String tituloEntretenimiento, String ciudad, int diasDuracionViaje, float precio) {
    super(tituloEntretenimiento);
    this.ciudad = ciudad;
    this.diasDuracionViaje = diasDuracionViaje;
  }



}
