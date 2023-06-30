/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Wilmer E Leon
 */
public class Jugador {
  //
  // Fields
  //
  /**
   * Estos son los atributos de la clase: el nombre y el puntaje del jugador
   */
    private String nombre;
    private int puntaje;
  
    //
    // Constructors
    //
    public Jugador () {
        
    }
    
    /**
     * 
     * @param nombre 
     */
    public Jugador(String nombre) {
    /**
     * Se asigna el nombre al atributo, pero solo si tiene 3 letras en mayúsculas,
     * sino se lanza una excepción
     */
        if (nombre.length() == 3 && nombre.matches("[A-Z]+")) {
            this.nombre = nombre;
        }
        else {
            throw new IllegalArgumentException("El nombre debe tener 3 letras en minúsculas");
        }
        /**
         * Se inicializa el puntaje en cero.
         */
        this.puntaje = 0;
    }

    /**
     * 
     * @return 
     * Comnetario: este es un método para obtener el nombre del jugador.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * 
     * @return 
     * Comenario: este es un método para obtener el puntaje del jugador
     */
    public int getPuntaje() {
        return this.puntaje;
    }

    /**
     * 
     * @param cantidad 
     * Comentario: Este es un método para incrementar el puntaje del jugador en
     * una cantidad dada
     */
    public void incrementarPuntaje(int cantidad) {
        this.puntaje += cantidad;
    }

    /**
     * Este es un método para almacenar el puntaje del jugador en un archivo de
     * texto llamado puntajes.txt
     */
    public void almacenarPuntaje() {
        try {
        /**
         * Se crea un objeto de la clase FileWriter para escribir en el archivo.
         */
        FileWriter fw = new FileWriter("puntajes.txt", true);
        /**
         * Se crea un objeto de la clase PrintWriter para escribir líneas de
         * texto en el archivo-
         * .
         */
        PrintWriter pw = new PrintWriter(fw);
        /**
         * Se escribe el nombre y el puntaje del jugador separados por una coma
         * en una línea del archivo.
         */
        pw.println(this.nombre + "," + this.puntaje);
        /**
         * Se cierra el PrintWriter.
         */
        pw.close();
        /**
         * Se cierra el FileWriter.
         */
        fw.close();
        }
        catch (IOException e) {
        /**
         * Se imprime el mensaje de error si ocurre una excepción al escribir en
         * el archivo.
         */
        System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}