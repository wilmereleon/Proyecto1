/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Didier Tabares
 */
public class FXMLTemaEspacioController implements Initializable {
    
    /**
     * Imágenes de tablero uno
     */
    @FXML
    private ImageView c00;
    @FXML
    private ImageView c01;
    @FXML
    private ImageView c10;
    @FXML
    private ImageView c11;
    @FXML
    private ImageView r00;
    @FXML
    private ImageView r11;
    @FXML
    private ImageView r10;
    @FXML
    private ImageView r01;
    
     /**
     * 
     * @param mouseEvent 
     */
    public void reversoA(MouseEvent mouseEvent){
        r00.setVisible(false);
        if (c00.isVisible() && !c11.isVisible() && !c01.isVisible()) {    
            c00.setOnMouseClicked(event -> {
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e ->{
                    r00.setVisible(true);  
                });
                pause.play(); 
            }); 
        }
        else if (c00.isVisible() && c11.isVisible() && r01.isVisible() && r10.isVisible()) {
            c00.setOnMouseClicked(event -> {
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e ->{
                    c00.setVisible(false);
                    c11.setVisible(false);
                });
                pause.play(); 
            }); 
        }
    }
    
    /**
     * 
     * @param mouseEvent 
     */
    public void reversoB(MouseEvent mouseEvent){
        r01.setVisible(false);
        if (c01.isVisible() && !c10.isVisible() && !c00.isVisible()) {
            c01.setOnMouseClicked(event -> {
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e ->{
                    r01.setVisible(true);  
                });
                pause.play(); 
            }); 
        }
        else if (c01.isVisible() && c10.isVisible() && r00.isVisible() && r11.isVisible()) {
           c01.setOnMouseClicked(event -> {
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e ->{
                    c01.setVisible(false);
                    c10.setVisible(false);
                });
                pause.play(); 
            }); 
        }
    }
    
    /**
     * 
     * @param mouseEvent 
     */
    public void reversoC(MouseEvent mouseEvent){
        r10.setVisible(false);
        if (c10.isVisible() && !c01.isVisible()) {    
            c10.setOnMouseClicked(event -> {
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e ->{
                    r10.setVisible(true);  
                });
                pause.play(); 
            }); 
        }
        //else if (c10.isVisible() && c10.isVisible()) {
            
        //}
        
    }
    
    public void reversoD(MouseEvent mouseEvent){
        r11.setVisible(false);
        if (c11.isVisible() && !c00.isVisible()) {    
            c11.setOnMouseClicked(event -> {
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e ->{
                    r11.setVisible(true);  
                });
                pause.play(); 
            }); 
        }
        //else if (c11.isVisible() && c00.isVisible()) {
            
        //}
    }
    
    /**
     * 
     * @param mouseEvent 
     */
    public void planeta(MouseEvent mouseEvent){
        
        
    }
    
    /**
     * 
     * @param mouseEvent 
     */
    public void anillo(MouseEvent mouseEvent){
        
        
    }
    
    
    /**
     * Define el atributo que representa el tablero de juego
     */
    private Tablero tablero;
    
    /**
     * Define las variables para guardar la primera y la segunda tarjeta sele-
     * ccionada.
     */
    private Tarjeta primeraTarjeta;
    private Tarjeta segundaTarjeta;
    
    /**
     * Define la variable para contar el número de aciertos.
     */
    private int aciertos;
    
    /**
     * Define la variable para indicar el nivel actual del juego.
     */
    private int nivel;
    
    /**
     * Define el atributo que representa el escenario principal de la aplicación.
     */
    private Stage primaryStage;
    
    /**
     * Define el atributo que representa el panel donde se colocarán los botones.
     */
    private GridPane cuadricula;
    
    /**
     * 
     */
    @FXML
    private Button btnSnE0;
    
    /**
     * 
     * @throws FileNotFoundException 
     */
    @FXML
    public void initialize() throws FileNotFoundException {
        FileInputStream entrada = new FileInputStream("Img/reversoEspacio.png");
        Image imagen = new Image(entrada);
        ImageView vistaImagen = new ImageView(imagen);
        vistaImagen.setFitWidth(90);
        vistaImagen.setFitHeight(90);
        cuadricula.add(vistaImagen, 0, 0);
    }
    
    private void handleButtonAction (Tarjeta tarjeta) {
        /**
         * Si ya hay dos tarjetas seleccionadas, no hace nada
         */
        if (primeraTarjeta != null && segundaTarjeta != null) {
            return;
        }
        
        /**
         * Si la tarjeta pulsada ya está volteada, no hace nada
         */
        if (tarjeta.isShown()) {
            return;
        }
        
        /**
         * Reproduce sonido de la tarjeta pulsada
         */
        tarjeta.getSonido().play();
        
        /**
         * Si es la primera tarjeta seleccionada, guardarla en la variable
         * primeraTarjeta y cambiar su texto a «✔»
         */
        if (primeraTarjeta == null) {
            primeraTarjeta = tarjeta;
            primeraTarjeta.show();
        }
        
        /**
         * Si es la segunda tarjeta seleccionada, guardarla en la variable
         * segundaTarjeta y cambiar su texto a «✔»
         */
        else if (segundaTarjeta == null) {
            segundaTarjeta = tarjeta;
            segundaTarjeta.show();
        }
        
        /**
         * Comprueba si las dos tarjetas seleccionadas tienen el mismo par
         */
        if (primeraTarjeta.getPareja() == segundaTarjeta.getPareja()) {
            
            /**
             *  Si tienen el mismo par, incrementar el número de aciertos
             */
            aciertos++;
            
            /**
             * Si el número de aciertos es igual al número de pares, mostrar un
             * mensaje de felicitación y pasar al siguiente nivel
             */
            if (aciertos == tablero.getFilas() * tablero.getColumnas() / 2) {
                System.out.println("Felicitaciones. Has ganado el nivel " + nivel + ".");
                nivel++;
                iniciarNuevoJuego(nivel);
            }
        }
        else {
            /**
             * Si no tienen el mismo par, crear un hilo que se encargue de
             * volver a ocultar las tarjetas después de un segundo
             */
            Thread hilo = new Thread (() -> {
                try {
                    /**
                     * Hacer que el hilo duerma durante un segundo
                     */
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                /**
                 * Vuelve a poner el texto «?» a las dos tarjetas seleccionadas
                 */
                primeraTarjeta.hide();
                segundaTarjeta.hide();
                
                /**
                 * Reinicia las variables de las tarjetas seleccionadas a null
                 */
                primeraTarjeta = null;
                segundaTarjeta = null;
            });
            
            /**
             * Inicia el hilo
             */
            hilo.start();
        }
    }
    
    /**
    * Cierra la ventana.
    */

    public void cerrarVentana(){
        
    }
    
    /**
     * Hace el cambio de tablero
     */
    @FXML
    public void cambiarTablero () {
        // Hay que cambiar la ruta de este FXML a la del siguiente tablero (tablero dos).
        FXMLLoader TemaEspacio8Cartas = new FXMLLoader(getClass().getResource("FXMLTemaEspacio8Cartas.fxml"));
        
        try {
            Parent root = TemaEspacio8Cartas.load();
            
            FXMLElegirTemaController controlador = TemaEspacio8Cartas.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            iniciarNuevoJuego(nivel);
            stage.setScene(scene);
            
            stage.show();
            
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage = (Stage) this.btnSnE0.getScene().getWindow();
            stage.setTitle("Maestro de la memoria: une parejas con tarjetas");
            
            myStage.close();
                    
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param nivel 
     */
    @FXML
        private void iniciarNuevoJuego (int nivel) {
     
        try {
            /**
             * Carga el archivo FXML que define la interfaz gráfica del tablero
             * uno.
             * Hay que crear un nuevo .fxml para la creación de Grid.
             */
            FXMLLoader cargador = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            
            /**
             * Obtiene el panel donde se colocarán los botones a partir del archivo FXML.
             */
            cuadricula = (GridPane) cargador.load();
            
            /**
             * Crea un nuevo tablero con el nivel dado
             */
            tablero = new Tablero(nivel);
            
            /**
             * Recorre el tablero y añade cada tarjeta al panel enla posición
             * correspondiente
             */
            for (int i = 0; i < tablero.getFilas(); i++) {
                for (int j = 0; j < tablero.getColumnas(); j++) {
                    
                    /**
                     * Obtiene la tarjeta en la posición correspondiente del
                     * tablero                     
                     */
                    Tarjeta tarjeta = tablero.getTarjeta(i, j);
                    
                    /**
                     * Asigna a la tarjeta un evento que se ejecuta al pulsarla
                     */
                    tarjeta.getBoton().setOnAction(e -> handleButtonAction(tarjeta));
                    
                    /**
                     * Añade la tarjeta al panel en la posición correspondiente
                     */
                    cuadricula.add(tarjeta.getBoton(), j, i);
                }
            }
            /**
             * Inicializa las variables de las tarjetas seleccionadas a null
             */
            primeraTarjeta = null;
            segundaTarjeta = null;
            
            /**
             * Inicializa la variable de los aciertos a 0
             */
            aciertos = 0;
            
            /**
             * Crea una escena con el panel como elemento raíz y un tamaño de
             * 400 x 400 píxeles
             */
            Scene scene = new Scene(cuadricula, 400, 400);
            
            /**
             * Asigna la escena al escenario principal
             */
            primaryStage.setScene(scene);
            
            /**
             * Asigna un título al escenario principal indicando el nivel actual
             */
            primaryStage.setTitle("Maestro de la memoria: une parejas con tarjetas" + nivel);
            
            /**
             * Mostrar el escenario principal
             */
            primaryStage.show ();
        }
        catch (Exception e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
