/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Angie A.
 */
public class Board {
    
    public CellEspacio[][] board = new CellEspacio[4][4];
  
  
  public void populateMatrix(){
      board = new CellEspacio[6][6];
      String[] images = {"luna", "estrellas" ,"sol", "galaxia", "planeta"};
      Random randomGenerator = new Random();
      while(!isBoardFull()){
           int randomImageIndex = randomGenerator.nextInt(images.length);
            String randomImageSelected = images[randomImageIndex];
            
            int randomRow1 = randomGenerator.nextInt(6);
            int randomCol1 = randomGenerator.nextInt(6);
            while(board[randomRow1][randomCol1]!=null){
                randomRow1 = randomGenerator.nextInt(6);
                randomCol1 = randomGenerator.nextInt(6);
            }

            int randomRow2 = randomGenerator.nextInt(6);
            int randomCol2 = randomGenerator.nextInt(6);
            while((randomRow1 ==randomRow2 && randomCol1 == randomCol2)
                    || board[randomRow2][randomCol2]!=null){
                randomRow2 = randomGenerator.nextInt(6);
                randomCol2 = randomGenerator.nextInt(6);
            }

            board[randomRow1][randomCol1] = new CellEspacio(randomImageSelected,randomRow1, randomCol1);
            board[randomRow2][randomCol2] = new CellEspacio(randomImageSelected,randomRow2, randomCol2);

      }
  }
  
  
   private boolean isBoardFull() {
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(board[i][j]==null){
                    return false;
                }
            }
        }
        return true;
    }
    
}
