import javax.swing.JFrame;

//new code
//Mr. Wiebe's Base Code

public class GuiMs{
	Cell[][] grid;
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
				
	}
}




