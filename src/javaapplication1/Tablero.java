/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javafx.scene.media.AudioClip;

/**
*
* @author Wilmer E Leon
*/
public class Tablero {
  //
  // Fields
  //
   
  //private Tablero tablero; // El modelo del tablero
  //private int nivel; // El nivel del tablero
  //private int numero = 1;
  private Tarjeta[][] tarjetas;
  private int filas;
  private int columnas;
  
    
  //
  // Constructors
  //
  /**
   * 
   * @author Wilmer E Leon
   * @param nivel 
   * COmentario: recibe el nivel para determinar la cantidad de filas y columnas.
   */
  public Tablero (int nivel) {
      /**
       * Comentario: Calcula el número de filas y columnas del tablero, según el
       * nivel.
       */
      filas = nivel + 3;
      columnas = nivel + 3;
      
      /**
       * Comentario: Inicializa el arreglo de tarjetas con el tamaño adecuado.
       */
      tarjetas = new Tarjeta [filas][columnas];
      
      /**
       * Comentario: Inicializa el arreglo de pares con los números del 0 al 
       * (filas * columnas / 2) - 1 repetidos dos veces.
       */
      int [] parejas = new int [filas * columnas];
      for (int i = 0; i < parejas.length / 2; i++) {
          parejas [i] = i;
          parejas [i + parejas.length / 2] = i;
      }
      
      /**
       * Mezcla el arreglo de pares para que queden en orden aleatorio.
       * Revisar el error en la documentación de la librería.
       */
      //Collections.suffle(new ArrayList<Integer>(parejas));
      
      /**
       * Recorre el arreglo de tarjetas y crear cada una con sus propiedades.
       */
      for (int i = 0; i < filas; i++) {
          for (int j = 0; j < columnas; j++) {
              
              /**
               * Comentario: crea un nuevo sonido a partir de una archivo wav y 
               * lo asigna al arreglo de sonidos en la posición correspondiente.
               */
              AudioClip sonido = new AudioClip(getClass().getResource("sonido" + parejas [i * columnas + j] + "TheReturn.mp3").toString());
              
              /**
               * Crear una nueva tarjeta con el sonido y el par correspondiente
               * y asignarla al array de tarjetas en la posición correspondiente.
               */
              tarjetas [i][j] = new Tarjeta (sonido, parejas [i * columnas + j]);
          }
      }
  }
  
  //
  // Methods
  //
  /**
   * 
   * @return filas
   */
  public int getFilas () {
      return filas;
  }
  
  /**
   * 
   * @return columnas
   */
  public int getColumnas () {
      return columnas;
  }

  //
  // Accessor methods
  //
  /**
   * 
   * @param fila
   * @param columna
   * @return tarjetas con fila y columna
   */
  public Tarjeta getTarjeta (int fila, int columna) {
      return tarjetas [fila][columna];
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
