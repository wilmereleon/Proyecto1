/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
/**
 *
 * @author Wílmer E. León
 */
public class Tarjeta {
    //
    // Fields
    //
    private Button boton;
    private AudioClip sonido;
    private int pareja;
    private int tema;
    private String imagen;
    private int oculta = 0;
    private int visible = 1;
    private int acertada = 2;
    private int estadoDeTarjeta;
  
  
    //
    // Constructors
    //
    public Tarjeta () { };
    
    //
    // Methods
    //
  

    //
    // Accessor methods
    //
    public Tarjeta (AudioClip sonido, int pareja) {
        this.sonido = sonido;
        this.pareja = pareja;
      
        boton = new Button ("?");
      
        boton.setStyle("-fx-pref-width: 100px; -fx-pref-height: 100px; -fx-font-size: 36px; -fx-border-radius: 50%;");
    }
  
    public Button getBoton() {
        return boton;
    }

  
    public AudioClip getSonido() {
        return sonido;
    }
  
  
    public void hide() {
        boton.setText("?");
    }

    // Definir el método que comprueba si la tarjeta está volteada
    public boolean isShown() {
        return boton.getText().equals("✔");
    }
    /**
    * Set the value of tema
    * @param tema the new value of tema
    */
    public void setTema (int tema) {
        tema = tema;
    }

    /**
    * Get the value of tema
    * @return the value of tema
    */
    public int getTema () {
        return tema;
    }
  
    public int getPareja() {
        return pareja;
    }

    /**
    * Set the value of imagen
    * @param imagen the new value of imagen
    */
    public void setImagen (String imagen) {
        imagen = imagen;
    }

    /**
    * Get the value of imagen
    * @return the value of imagen
    */
    public String getImagen () {
        return imagen;
    }

    /**
    * Set the value of estadoDeTarjeta
    * @param oculta visible acertada the new value of estadoDeTarjeta
    */
    public void setEstadoDeTarjeta (int oculta, int visible, int acertada) {
    /**
    * @autor: Wílmer E. León
    * Comentario: poner código de estados
   */
        estadoDeTarjeta = visible;
    }

    /**
    * Get the value of estadoDeTarjeta
    * @return the value of estadoDeTarjeta
    */
    public int getEstadoDeTarjeta () {
        return estadoDeTarjeta;
    }

    //
    // Other methods
    //

    /**
    * @param estadoDeTarjeta
    * @param imagen
    */
    public void Tarjeta (int estadoDeTarjeta, String imagen) {
    /**
    * @autor: Wílmer E. León
    * Comentario: poner código de Tarjeta
    */
    }


    /**
    * @return int
    */
    public int getTema (int tema) {
        return tema;
    }


    /**
    * @return       String
    */
    public String getImagen (String imagen) {
        return imagen;
    }


    /**
    * @return int
    */
    public int getEstadoDeTarjeta (int tema) {
        return tema;
    }


    /**
    * @param tema
    */
    public void setEstadoDeTarjeta (int tema) {
    
    } 
}
