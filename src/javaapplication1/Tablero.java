/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
*
* @author Wilmer E Leon
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
   * Obtiene el valor de numero.
   * @param numero , el nuevo valor de numero.
   */
  public void setNumero (int numero) {
    numero = numero;
  }

  /**
  * Establece el valor de numero.
  * @return el valor de numero.
  */
  public int getNumero (int numero) {
    return numero;
  }

  /**
  * Obtiene el valor de tarjetas.
  * @param tarjetas , el nuevo valor de tarjetas.
  */
  public void setTarjetas () {
    
  }

  /**
  * Establece el valor de tarjetas.
  * @return el valor de tarjetas.
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
