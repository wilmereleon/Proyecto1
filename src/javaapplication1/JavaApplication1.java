/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Wilmer E Leon
 */
public class JavaApplication1 extends Application {
    /**
     * Creación de constantes para el juego
     */
    private static final int VENTANA_ANCHO = 800;
    private static final int VENTANA_ALTO = 600;
    private static final int TABLERO_UNO_COLS = 2;
    private static final int TABLERO_UNO_ROWS = 2;
    private static final int TABLERO_DOS_COLS = 4;
    private static final int TABLERO_DOS_ROWS = 4;
    private static final int TABLERO_TRES_COLS = 4;
    private static final int TABLERO_TRES_ROWS = 8;
    private static final int VIDAS_INICIALES = 4;
    private static final int PUNTOS_POR_ACIERTO = 100;
    private static final int PUNTOS_POR_DESACIERTO = -50;
    private static final int TIEMPO_TABLERO_TRES = 300; // en segundos
    
    private int vidas;
    private int puntaje;
    private String jugador;

    private Label vidasLabel;
    private Label puntajeLabel;
    private Label temporizadorLabel;

    private AudioClip audioFondo;

    private Tarjeta tarjetaSeleccionada;
    private Tarjeta[] tarjetasTableroUno;
    private Tarjeta[] tarjetasTableroDos;
    private Tarjeta[] tarjetasTableroTres;

    private Stage ventana;
    private GridPane tableroUno;
    private GridPane tableroDos;
    private GridPane tableroTres;

    private Button btnPlay;
    private Button btnEspacio;
    private Button btnTecnologia;
    
    /**
     * @param args
     * el comando de línea de argumentos.
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * 
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        ventana = primaryStage;
        ventana.setTitle("Juego de Tarjetas");

        // Cargar las imágenes de las tarjetas
        // Asegúrate de tener "image1.png", "image2.png", etc., en la carpeta "resources"
        tarjetasTableroUno = new Tarjeta[TABLERO_UNO_COLS * TABLERO_UNO_ROWS];
        for (int i = 0; i < tarjetasTableroUno.length; i++) {
            tarjetasTableroUno[i] = new Tarjeta("image1.png" + (i+1) + "image1.png");
        }

        // Inicializar el tablero uno
        tableroUno = new GridPane();
        tableroUno.setAlignment(Pos.CENTER);
        tableroUno.setHgap(10);
        tableroUno.setVgap(10);

        // Iniciar el juego con el botón de "play"
        btnPlay = new Button("PLAY");
        btnPlay.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mostrarSeleccionTema();
            }
        });
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Maestro de la memoria: une parejas con tarjetas");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(btnPlay);
        Scene scene = new Scene(root, VENTANA_ANCHO, VENTANA_ALTO);
        ventana.setScene(scene);
        ventana.show();
    }
    /**
     * 
     */
    private void mostrarSeleccionTema() {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        Label titulo = new Label("Seleccione un tema");
        titulo.setFont(Font.font(24));
        titulo.setTextFill(Color.BLACK);

        // Botón para el tema de Espacio
        btnEspacio = new Button("Espacio");
        btnEspacio.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                inicializarJuego("Espacio");
                mostrarTableroUno();
            }
        });
    }
}

