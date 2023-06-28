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
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Wilmer E. Leon
 */

public class FXMLDocumentController implements Initializable {
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
    * Constructor.
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
    //
    // Otros métodos.
    //

    /**
    * Constructor vacío.
    */
    public void FXMLDocumentController () {
    }


    /**
    * Inicia el juego.
    */
    public void iniciarJuego () {
        /**
        * Insertar instrucción de arranque de eventos del juego desde tablero
        * uno.
        */
    }
    
    /**
     * 
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
