/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Wílmer E. León
 */
public class Tarjeta {
  //
  // Fields
  //

  private int tema;
  private String imagen;
  private int oculta = 0;
  private int visible = 1;
  private int acertada = 2;
  private int estadoDeTarjeta;
  
  //
  // Constructors
  //
  public Tarjeta () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of tema
   * @param newVar the new value of tema
   */
  public void setTema (int newVar) {
    tema = newVar;
  }

  /**
   * Get the value of tema
   * @return the value of tema
   */
  public int getTema () {
    return tema;
  }

  /**
   * Set the value of imagen
   * @param newVar the new value of imagen
   */
  public void setImagen (String newVar) {
    imagen = newVar;
  }

  /**
   * Get the value of imagen
   * @return the value of imagen
   */
  public String getImagen () {
    return imagen;
  }

  /**
   * Set the value of estadoDeTarjeta
   * @param newVar the new value of estadoDeTarjeta
   */
  public void setEstadoDeTarjeta (int oculta, int visible, int acertada) {
    estadoDeTarjeta = visible;
  }

  /**
   * Get the value of estadoDeTarjeta
   * @return the value of estadoDeTarjeta
   */
  public int getEstadoDeTarjeta () {
    return estadoDeTarjeta;
  }

  //
  // Other methods
  //

  /**
   * @param estadoDeTarjeta
   * @param imagen
   */
  public void Tarjeta (int estadoDeTarjeta, String imagen) {
  }


  /**
   * @return int
   */
  public int getTema (int tema) {
      return tema;
  }


  /**
   * @return       String
   */
  public String getImagen (String imagen) {
      return imagen;
  }


  /**
   * @return       int
   */
  public int getEstadoDeTarjeta (int tema) {
      return tema;
  }


  /**
   * @param tema
   */
  public void setEstadoDeTarjeta (int tema) {
  } 
}
