/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javaapplication1;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Wílmer E. León
 */
public class FXMLDocumentController implements Initializable {
    
    private Main modelo;
    private JavaApplication1 vista;
    private Jugador jugador;
    private Tablero[] tableros;
    private Tablero tableroActual;
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Has clic en este botón");
        label.setText("Que comience el juego");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    //
    // Constructors
    //
    public FXMLDocumentController (){
  
    }
  
    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
    * Set the value of modelo
    * @param newVar the new value of modelo
    */
    public void setModelo (Main newVar) {
        modelo = newVar;
    }

    /**
    * Get the value of modelo
    * @return the value of modelo
    */
    public Main getModelo () {
        return modelo;
    }

    /**
    * Set the value of vista
    * @param newVar the new value of vista
    */
    public void setVista (JavaApplication1 newVar) {
        vista = newVar;
    }

    /**
    * Get the value of vista
    * @return the value of vista
    */
    public JavaApplication1 getVista () {
        return vista;
    }

    /**
    * Set the value of jugador
    * @param jugador the new value of jugador
    */
    public void setJugador (Jugador jugador) {
        jugador = jugador;
    }

    /**
    * Get the value of jugador
    * @return the value of jugador
    */
    public Jugador getJugador () {
        return jugador;
    }

    /**
    * Set the value of tableros
    * @param newVar the new value of tableros
    */
    public void setTableros (Tablero[] tablero) {
        tableros = tablero;
    }

    /**
    * Get the value of tableros
    * @return the value of tableros
    */
    public Tablero[] getTableros () {
        return tableros;
    }

    /**
    * Set the value of tableroActual
    * @param newVar the new value of tableroActual
    */
    public void setTableroActual (Tablero tablero) {
        tableroActual = tablero;
    }

    /**
    * Get the value of tableroActual
    * @return the value of tableroActual
    */
    public Tablero getTableroActual () {
        return tableroActual;
    }

    //
    // Other methods
    //

    /**
    */
    public void FXMLDocumentController () {
    }


    /**
    */
    public void iniciarJuego () {
    }


    /**
    * @param tema
    */
    public void seleccionarTema (int tema){
    }


    /**
    * @param Tarjeta
    */
    public void seleccionarTarjeta (Tarjeta tema){
    }


    /**
    * @param tarjeta1
    * @return boolean
    * @param Tarjeta
    */
    public boolean compararTarjetas (Tarjeta tarjeta1, Tarjeta tarjeta2) {
        
        // Poner lógica del juego
        return false; 
    }


    /**
    * @param puntaje
    */
    public void actualizarPuntaje (boolean puntaje) {
    }


    /**
    * @param puntaje
    */
    public void actualizarVidas (boolean puntaje) {
    }


    /**
    */
    public void cambiarTablero () {
    }


    /**
    */
    public void terminarJuego (){
    } 
    
}
