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
  
  /**
    * @author Wílmer E. Léon
    * Comentario: implementación sugerida de gridPane (en revisión)
    */
  
  // Elementos de la interfaz gráfica
  //@FXML
  //private GridPane grid; // El contenedor de las tarjetas
  //@FXML
  //private Label puntosLabel; // La etiqueta que muestra los puntos
  //@FXML
  //private Label vidasLabel; // La etiqueta que muestra las vidas

  // Constructor de la clase
  //public TableroControl(int nivel) {
  //  this.nivel = nivel;
  //  this.tablero = new Tablero(nivel); // Crear el modelo del tablero según el nivel
  //  try {
      // Cargar el archivo FXML que define la interfaz gráfica del tablero
      //FXMLLoader loader = new FXMLLoader(getClass().getResource("Tablero.fxml"));
      //loader.setController(this); // Establecer esta clase como el controlador del FXML
      //loader.load(); // Cargar el FXML
    //} catch (Exception e) {
      //e.printStackTrace();
    //}
  //}

  // Métodos de la clase
  //public void mostrar() {
    // Mostrar el tablero en la interfaz gráfica
    //for (int i = 0; i < tablero.getNumTarjetas(); i++) {
      // Crear un controlador para cada tarjeta del modelo
      //TarjetaControl tarjetaControl = new TarjetaControl(tablero.getTarjeta(i));
      // Añadir la tarjeta a la cuadrícula según su posición
      //grid.add(tarjetaControl.getTarjeta(), i % nivel, i / nivel);
    //}
    // Actualizar los puntos y las vidas en la interfaz gráfica
    //actualizarPuntos();
    //actualizarVidas();
  //}

  //public void comprobarPareja() {
    // Comprobar si el jugador ha seleccionado dos tarjetas iguales
    // ...
  //}

  //public void actualizarPuntos() {
    // Actualizar los puntos en el modelo y en la interfaz gráfica
    //puntosLabel.setText("Puntos: " + tablero.getPuntos());
  //}

  //public void actualizarVidas() {
    // Actualizar las vidas en el modelo y en la interfaz gráfica
    //vidasLabel.setText("Vidas: " + tablero.getVidas());
  //}
  // 
    
    
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
