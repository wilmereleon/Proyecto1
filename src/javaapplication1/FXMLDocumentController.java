/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javaapplication1;
/**
 *
 * @author Wílmer E. León
 */
import com.sun.javafx.logging.PlatformLogger.Level;
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
    private Button btnBotonPlay;
     
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
    * @param modelo the new value of modelo
    */
    public void setModelo (Main modelo) {
        modelo = modelo;
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
    * @param vista the new value of vista
    */
    public void setVista (JavaApplication1 vista) {
        vista = vista;
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
    * @param tablero the new value of tableroActual
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
    */
    public void terminarJuego (){
    } 
    
}
