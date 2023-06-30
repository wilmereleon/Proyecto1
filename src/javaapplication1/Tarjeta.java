/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
/**
* @author Wilmer E Leon
*/
public class Tarjeta {
    //
    // Fields
    //
    private Button boton;
    private AudioClip sonido;
    private int pareja;
  
  
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
    /**
     * 
     * @param sonido
     * @param pareja 
     */
    public Tarjeta (AudioClip sonido, int pareja) {
        this.sonido = sonido;
        this.pareja = pareja;
      
        boton = new Button ("?");
      
        boton.setStyle("-fx-pref-width: 100px; -fx-pref-height: 100px; -fx-font-size: 36px; -fx-border-radius: 50%;");
    }
    
    /**
     * 
     * @return boton
     * Comentario: define el método que devuelve el botón de la tarjeta
     */
    public Button getBoton() {
        return boton;
    }

    /**
     * 
     * @return sound
     * Comentario: define el método que devuelve el sonido de la tarjeta
     */
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
     * 
     * @return pareja
     * Comentario: define el método que devuelve el par de la tarjeta
     */
    public int getPareja() {
        return pareja;
    }

    /**
     * Define el método que cambia el texto del botón a «✔»
     */
    public void show (){
        boton.setText("✔");
    }
    


    //
    // Other methods
    //

}
