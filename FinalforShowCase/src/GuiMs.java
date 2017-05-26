import java.lang.Math;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


//new code
//Mr. Wiebe's Base Code

public class GuiMs{
	Cell[][] board;
	int row;
	int column;
	public GuiMS(){
		this(10,10,50);
	}
	public GuiMs(int rows, int columns, int bombs){
		this.row = rows;
		this.column = columns;
		grid = new Cell[row][column];
		
		//frame set up
		JFrame frame = new JFrame();
		frame.add(addCells());
		
		try{
			this.addBombs(bombs);
		}catch (Exception e);
			System.out.println("An Exception was thrown:" = e);
	}
	this.addNums();
	this.printBoard();
	
	frame.pack();

	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	public void addBombs(int bombs)throw Excepion{
		if bombs > rows* columns || bombs < 0{
			throw new Exception("Can not set that number of bombs.");
		}
		while(bombs > 0){
			int ranRow = (int)(Math.random()*rows);
			int ranCol = (int)(Math.random()*colums);
			if(board[ranRow][ranCol].getValue()==0){
				board[ranRow][ranCol].changeValue(-1);
				bombs = -1;
			}
		}
	}
	public void addNums(){
		for( int r = 0; r < rows; r++){
			for( int c = 0; c < columns; c++){
				if (board[r][c].getValue() == -1){
                    //Left side
                    if(c-1 >= 0 && board[r][c-1].isClear()){
                        board[r][c-1].incValue();
                    }
                    //Right
                    if(c+1 < columns && board[r][c+1].isClear()){
                        board[r][c+1].incValue();
                    }
                    //Top
                    if(r-1 >= 0 && board[r-1][c].isClear()){
                        board[r-1][c].incValue();
                    }
                    //Bottom
                    if((r+1) < rows && board[r+1][c].isClear()){
                        board[r+1][c].incValue();
                    }
                    //Top Right
                    if(r-1 >= 0 && c+1 < columns && board[r-1][c+1].isClear() && c != (columns-1)){
                        board[r-1][c+1].incValue();
                    }
                    //Top Left
                    if(r-1 >= 0 && c-1 >= 0 && board[r-1][c-1].isClear() && c != 0){
                        board[r-1][c-1].incValue();
                    }
                    //Bottom Left
                    if((r+1) < rows && c-1 >= 0 && board[r+1][c-1].isClear() && c != 0){
                        board[r+1][c-1].incValue();
                    }
                    //Bottom Right
                    if((r+1) < rows && c+1 < columns && board[r+1][c+1].isClear() && c != (columns-1)){
                        board[r+1][c+1].incValue();
                    }
                }
            }
        }
    }	
	 public void scanForEmptyCells(){
	        for(int i = 0; i<rows; i++){
	            for(int j = 0; j<columns; j++){
	                if(!board[i][j].isNotChecked()){
	                    if(j>=1 && board[i][j-1].isEmpty()){
	                    	board[i][j-1].checkCell();
	                    }
	                    if(j<columns && board[i][j+1].isEmpty()){
	                    	board[i][j+1].checkCell();
	                    }
	                    if(i>=1 && board[i-1][j].isEmpty()){
	                    	board[i-1][j].checkCell();
	                    }
	                    if(i< rows && board[i+1][j].isEmpty()){
	                    	board[i+1][j].checkCell();
	                    }
	                    if(i>=1 && j>= 1 && board[i-1][j-1].isEmpty()){
	                    	board[i-1][j-1].checkCell();
	                    }
	                    if(i+1< rows && j+1< columns && board[i+1][j+1].isEmpty()){
	                    	board[i+1][j+1].checkCell();
	                    }
	                    if(i>=1 && j+1< columns && board[i-1][j+1].isEmpty()){
	                    	board[i-1][j+1].checkCell();
	                    }
	                    if(i+1< rows && j>= 1 && board[i+1][j-1].isEmpty()){
	                    	board[i+1][j-1].checkCell();
	                    }
	                }
	            }
	        }
	    }
	    /**This method is used for testing and will be deleted if using the GUI.
	     *  It is still required for all students.
	     */
	    public void printBoard(){
	        System.out.println();
	        System.out.println("<<<<<<<<<<WELCOME TO MINESWEEPER>>>>>>>>>>");
	        System.out.println();
	        for(int row = 0; row < rows; row++){
	            for(int col = 0; col < columns; col++) {
	                if (board[row][col].getValue() == -1){
	                    System.out.print("X ");
	                }
	                else{
	                    System.out.print(board[row][col].getValue() + " ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    public JPanel addCells(){
	        JPanel panel = new JPanel(new GridLayout(rows,columns));
	        for(int i = 0; i < rows; i++){
	            for(int j = 0; j < columns; j++){
	                board[i][j]= new Cell(this);
	                panel.add(board[i][j].getButton());
	            }
	        }
	        return panel;
	    }
	    public void fail(){
	        for(Cell[] a : board){
	            for(Cell b : a){
	                b.displayValue();
	            }
	        }
	    }
	    public static void main(String[] args){
	    	}


