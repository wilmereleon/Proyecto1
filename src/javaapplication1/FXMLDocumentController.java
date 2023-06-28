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
import javafx.scene.layout.GridPane;
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
    
    @FXML
    private Label label;
    
    @FXML
    private Button btnBotonPlay;
     
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("Has clic en este botón");
        label.setText("Que comience el juego");
        
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
    * @param tema ingresa a la selección del tema que asigna hacia que temática
    * iniciar el juego o partida.
    */
    public void seleccionarTema (int tema){
        /**
        * Insertar eventos de la selección de tema.
        */
    }


    /**
    * @param tema
    * selecciona la tarjeta del tema.
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
            
            /**
             * Crea e inicia un juego con el nivel actual (revisar ruta .fxml)
             */
            iniciarNuevoJuego(nivel);
            
            stage.show();
            
            stage.setOnCloseRequest(e -> controlador.cerrarVentana());
            
            Stage myStage = (Stage) this.btnBotonPlay.getScene().getWindow();
            stage.setTitle("Maestro de la memoria: une parejas con tarjetas");
            
            myStage.close();
                    
        } catch (IOException ex) {
            //Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
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


    /**
    * Comentario: termina la ejecución del juego. 
    */
    public void terminarJuego (){
        /**
        * Insertar instrucción de juego finalizado.
        */
    } 
}
