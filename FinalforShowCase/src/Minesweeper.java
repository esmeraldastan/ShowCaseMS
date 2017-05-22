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
	public static void main(String[] args){
		System.out.println("New Game");
	}
}

	
	


