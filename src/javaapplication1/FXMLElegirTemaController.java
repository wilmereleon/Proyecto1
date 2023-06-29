/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javaapplication1;

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
public class FXMLElegirTemaController implements Initializable {
    
     @FXML
    private Button btnEsp;
     @FXML
    private Button btnTec;

    /**
     * Inicializa la clase controlador.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    public void cambioEspacio () {
        
        FXMLLoader temaEspacio = new FXMLLoader(getClass().getResource("FXMLTemaEspacio.fxml"));
        
        try {
            Parent root = temaEspacio.load();
            
            FXMLTemaEspacioController controlador = temaEspacio.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage = (Stage) this.btnEsp.getScene().getWindow();
            stage.setTitle("Maestro de la memoria: une parejas con tarjetas");
            
            myStage.close();
                    
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @FXML
    public void cambioTecnologia () {
        
        FXMLLoader temaTecnologia = new FXMLLoader(getClass().getResource("FXMLTemaTecnologia.fxml"));
        
        try {
            Parent root = temaTecnologia.load();
            
            FXMLTemaTecnologiaController controlador = temaTecnologia.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            stage.setScene(scene);
            stage.show();
            
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage = (Stage) this.btnTec.getScene().getWindow();
            stage.setTitle("Maestro de la memoria: une parejas con tarjetas");
            
            myStage.close();
                    
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void cerrarVentana(){
        
    }
}
