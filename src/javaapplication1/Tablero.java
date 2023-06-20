/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Wílmer E. Léon
 */
public class Tablero {
  //
  // Fields
  //
   
  private Tablero tablero; // El modelo del tablero
  private int nivel; // El nivel del tablero
  private int numero = 1;
  private Tarjeta[] tarjetas;
  
  
    
  //
  // Constructors
  //
  public Tablero () {
  
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of numero
   * @param numero the new value of numero
   */
  public void setNumero (int numero) {
    numero = numero;
  }

  /**
   * Get the value of numero
   * @return the value of numero
   */
  public int getNumero (int numero) {
    return numero;
  }

  /**
   * Set the value of tarjetas
   * @param newVar the new value of tarjetas
   */
  public void setTarjetas () {
    
  }

  /**
   * Get the value of tarjetas
   * @return the value of tarjetas
   */
  public Tarjeta[] getTarjetas (Tarjeta [] tarjetas) {
    return tarjetas;
  }

  //
  // Other methods
  //

  /**
   * @param numero
   */
  public void Tablero (int numero) {
    
  }
}
