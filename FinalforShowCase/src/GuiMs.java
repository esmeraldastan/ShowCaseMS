//this code will be use instead
//import 
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiMs implements ActionListener{
	//Top section 
	JFrame frame = new JFrame("Welcome to Minesweeper");
	//Button to restart the game 
	JButton reset = new JButton("Want to reset??"); 
	//10x10
	JButton[][] button = new JButton[10][10];
	int[][] numbs = new int[10][10];
	Container grid = new Container();
	final int mine = 0;
	
	
	public GuiMs(){
		frame.setSize(700,700);
		//reset.setSize(10,10);
		frame.setLayout(new BorderLayout());
		
		frame.add(reset,BorderLayout.SOUTH);
		reset.addActionListener(this);
		grid.setLayout(new GridLayout(10,10));
		//frame.setSize(reset, 10, 10);
		for(int row = 0; row < button.length; row++){
			for( int column = 0; column < button[0].length; column++){
				button[row][column] = new JButton();
				button[row][column].addActionListener(this);
				grid.add(button[row][column]);
				
				
			}
		}
		frame.add(grid, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		}
	public static void main(String[] args){
	new GuiMs();
	}
	//adding of the bombs
	public void addBombs(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for( int x = 0; x< numbs.length; x++){
			for (int y = 0; y< numbs[0].length; y++){
				list.add(x *100+y);
			}
		}
		numbs = new int[10][10];
		for(int i = 0; i < 10; i++){
			int random = (int)(Math.random()* list.size());
			numbs[list.get(random)/100][list.get(numbs) % 100] = mine;
			list.remove(numbs);
		}
		//check surroundings
		for( int x = 0; x< numbs.length; x++){
			for (int y = 0; y< numbs[0].length; y++){
			int surrounding = 0;
			forx>0 && y>0 && numbs[x-1][y-1]== mine){
				
			}
		}
	}
	
	public void actionPreformed(ActionEvent arg0){
		
		
		
		
		\\
		\
	}
	
		
		
	}
}

