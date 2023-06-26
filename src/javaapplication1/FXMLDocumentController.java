/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javaapplication1;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Wilmer E. Leon
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
    private Button btnBotonPlay;
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("Has clic en este botón");
        label.setText("Que comience el juego");
        
    }
    

    /**
     * Inicializa el controlador de las clases
     * @param url
     * Comentario: recibe el URL de la inicialización.
     * @param rb
     * Comentario: recibe el rb de la incialización.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
   
    
    /**
    * Constructores.
    * 
    /

    /**
    * @author Wilmer E. Leon
    * Comentario: constructor.
    */
    public FXMLDocumentController (){
  
    }
  
    /**
    * @Métodos
    * Comentarios: en esta sección están los métodos de la clase controlador.
    */

    /**
    * Establece el valor de la variable «modelo». El modelo representa el nombre la
    * descripción de la tarjeta.
    * @param modelo , el nuevo valor de modelo.
    */
    public void setModelo (Main modelo) {
        modelo = modelo;
    }

    /**
    * Obtiene el valor de la variable modelo.
    * @return el valor de modelo del Main.
    */
    public Main getModelo () {
        return modelo;
    }

    /**
    * Establece el valor de la variable vista. «Vista» representa la imagen de la
    * tarjeta.
    * @param vista , el nuevo valor de vista.
    */
    public void setVista (JavaApplication1 vista) {
        vista = vista;
    }

    /**
    * Obtiene el valor de vista.
    * @return el valor de vista.
    */
    public JavaApplication1 getVista () {
        return vista;
    }

    /**
    * Establece el valor de jugador.
    * @param jugador , el nuevo valor de jugador. recibe un nombre de tres
    * letras y un puntaje (String).
    */
    public void setJugador (Jugador jugador) {
        jugador = jugador;
    }

    /**
    * Obtiene el valor de jugador.
    * @return el valor de jugador. Retorna el valor obtenido.
    */
    public Jugador getJugador () {
        return jugador;
    }

    /**
    * Obtiene el valor de tableros.
    * @param tablero
    */
    public void setTableros (Tablero[] tablero) {
        tableros = tablero;
    }

    /**
    * Establece el valor de tableros.
    * @return el valor de tableros.
    */
    public Tablero[] getTableros () {
        return tableros;
    }

    /**
    * Obtiene el valor de tableroActual
    * @param tablero , el nuevo valor de tableroActual
    */
    public void setTableroActual (Tablero tablero) {
        tableroActual = tablero;
    }

    /**
    * Establece the value of tableroActual
    * @return the value of tableroActual
    */
    public Tablero getTableroActual () {
        return tableroActual;
    }

    //
    // Otros métodos.
    //

    /**
    * @author Wilmer E Leon
    * Comentario: constructor vacío.
    */
    public void FXMLDocumentController () {
    }


    /**
    * @author Wilmer E Leon
    * Comentario: inicia el juego.
    */
    public void iniciarJuego () {
        /**
        * Insertar instrucción de arranque de eventos del juego desde tablero
        * uno.
        */
    }


    /**
    * @param tema ingresa a la selección del tema que asigna hacia que temática
    * iniciar el juego o partida.
    */
    public void seleccionarTema (int tema){
        /**
        * Insertar eventos de la selección de tema.
        */
    }


    /**
    * @param tema selecciona la tarjeta del tema.
    */
    public void seleccionarTarjeta (Tarjeta tema){
    }


    /**
    * @param tarjeta1
    * @param tarjeta2
    * @return boolean
    * Comentario: comapra las tarjetas para iniciar el cotejo y decidir si es
    * un acierto o un desacierto.
    */
    public boolean compararTarjetas (Tarjeta tarjeta1, Tarjeta tarjeta2) {
        /**
        * Insertar lógica del juego.
        */
        
        return false; 
    }


    /**
    * @param puntaje
    * Comentario: evalúa los valores de los puntajes para ingresarlos en el
    * marcador.
    */
    public void actualizarPuntaje (boolean puntaje) {
        /**
        * Insertar lógica del juego.
        */
    }


    /**
    * @param vidas
    * Comentario: De acuerdo con demás eventos (desacierto de tarjeta o avance a
    * último tablero, se cambia el valor de las vidas).
    */
    public void actualizarVidas (boolean vidas) {
    }


    /**
    */
    @FXML
    public void cambiarTablero () {
        
        FXMLLoader elegirTema = new FXMLLoader(getClass().getResource("FXMLElegirTema.fxml"));
        
        try {
            Parent root = elegirTema.load();
            
            FXMLElegirTemaController controlador = elegirTema.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage = (Stage) this.btnBotonPlay.getScene().getWindow();
            stage.setTitle("Maestro de la memoria: une parejas con tarjetas");
            
            myStage.close();
                    
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    /**
    * Comentario: termina la ejecución del juego. 
    */
    public void terminarJuego (){
        /**
        * Insertar instrucción de juego finalizado.
        */
    } 
}
