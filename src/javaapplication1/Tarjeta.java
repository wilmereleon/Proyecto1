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
    * Obtiene el valor de tema.
    * @param tema , el nuevo valor de tema.
    */
    public void setTema (int tema) {
        tema = tema;
    }

    /**
    * Establece el valor de tema.
    * @return el valor de tema.
    */
    public int getTema () {
        return tema;
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
    
    /**
    *
    * @param imagen
    * COmentario: el nuevo valor de imagen. Obtiene el valor de imagen.
    */
    public void setImagen (String imagen) {
        imagen = imagen;
    }

    /**
    * Establece el valor de imagen.
    * @return el valor de i.magen
    */
    public String getImagen () {
        return imagen;
    }

    /**
    * Obtiene el valor de estadoDeTarjeta
    * @param oculta
    * @param visible
    * @param acertada , los nuevos posoibles estados de estadoDeTarjeta.
    */
    public void setEstadoDeTarjeta (int oculta, int visible, int acertada) {
    /**
    * @autor: Wílmer E. León.
    * Comentario: poner código de estados
    */
        
        estadoDeTarjeta = visible;
    }

    /**
    * Establece el valor de estadoDeTarjeta.
    * @return el valor de estadoDeTarjeta.
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
    * Poner código de Tarjeta
    */
    }


    /**
    * @return int
    */
    public int getTema (int tema) {
        return tema;
    }


    /**
    * @return imagen String.
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
