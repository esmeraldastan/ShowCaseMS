import java.lang.Math;

public class Minesweeper {
	
	int [][] board;
	int row;
	int column;
	int XPos;
	int YPos;
	
	public Minesweeper(int rows, int colums){
		this.row = rows;
		this.column = colums;
		board = new int [row][column];
		
	}
	public Minesweeper(){
		this(10,10);
		
	}
	
	public void printBoard2(){
		System.out.println("******* WELCOME TO MINESWEEPER*******");
		System.out.println();
		
		for(int rows = 0; rows < row; rows++){
			for( int columns = 0; columns < column; columns++){
		if ( board[row][column] == -1){
			System.out.print(" * ");
		
		}
		else {
			System.out.print(board[rows][columns] + " ");
		}
	}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args){
		System.out.println("New Game");
	}
}

	
	


