/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Angie A.
 */
public class CellEspacio {
    
    public String value;
    public int row;
    public int col;
    public boolean wasGuessed;
    
    CellEspacio(String value,int row,int col){
        this.value = value;
        this.row = row;
        this.col = col;
        this.wasGuessed = false;
    }
    
}
