
/**
 * Write a description of class NewMinesweeper here.
 * 
 * @author Esmeralda Lopez
 * @version version2 1/11/17
 */
//
import java.lang.Math;
public class Minesweeper{
   //2D array
   int [][] board;
   int row;
   int column;
   //positions x,y
   int XPos;
   int YPos;
   public Minesweeper(int rows, int columns){
        this.row = rows;
        this.column= columns;
        board = new int [row][column];
    }
   public Minesweeper(){
        this(10,10);
    }
    //board print
   public void printBoard2(){
       System.out.println("     >>>>>>>>>>Welcome To Minesweeper<<<<<<<<");
       System.out.println();
       // no use of i
       //instead row and column 
        for (int rows= 0; rows < row; rows++){
            for (int columns = 0; columns <column ; columns++){
          if (board[rows][columns] == -1) {
                // * represent bombs
                System.out.print("* " );
          }
          else { 
                System.out.print(board[rows][columns] + " " ) ;
          }
        }
        System.out.println( " ");
       }
    }
   //bomb adding
   public void addBombs(int bombs)throws Exception{
        if ( bombs < 1){
            throw new Exception(" Trying to cheat I see.... Not happening sucker!");
        }
        else if (bombs >= 101 ){
            throw new Exception( "Trying to kill your self?! That's great!");
        }
        int bombsplace = 0 ;
         while (bombsplace < bombs){
         XPos= (int)(Math.random() * row);
         YPos= (int)(Math.random() * column);
         //x,y
         if (board[XPos][YPos]== 0){
            board[XPos][YPos] = -1;
            bombsplace++;
          }
        }
    }
   // number adding
   public void numbsAdded(){
    // location of bombs/numbers on board 
        for (int rows = 0; rows < row; rows++){
            for (int columns = 0; columns < column; columns++){
            if (board[rows][columns]== -1){
            //right
            if ( columns +1 < column  && board[rows][columns + 1] != -1){
                    board[rows][columns + 1]++;
             }
            //left
            if ( columns - 1 >= 0 && board[rows][columns - 1] != -1){
                   board[rows][columns-1]++;
             }
            //up
            if (rows - 1 >= 0 && board[rows - 1][columns] != -1){
                 board[rows - 1][columns]++;
                }
            //down
            if ( rows + 1 < row && board[rows + 1][columns]!= -1){
                board[rows + 1][columns]++;
            }
            //up right 
            if (rows - 1 >= 0 && columns + 1 < column && board[rows - 1][columns + 1] != -1){
                board[rows-1][columns + 1]++; 
            }
            // up left 
            if (rows - 1 >= 0 && columns - 1 >= 0 && board[rows - 1][columns - 1] != -1) {
                board[rows -1][columns- 1]++; 
            }
            //down right 
            if (rows + 1 < row && columns + 1 < column && board[rows + 1][columns + 1] != -1) {
                board[ rows +1][columns+ 1]++; 
            }
            // down left
             if (rows + 1 < row && columns - 1 >= 0 && board[rows + 1][columns - 1] != -1){
                board[rows + 1][columns- 1]++; 
            }
          }
       }
    }
   }
   
}

	
	
	


