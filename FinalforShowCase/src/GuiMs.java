//this code will be use instead
//import 
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class GuiMs implements ActionListener{
	//Top section 
	JFrame frame = new JFrame("Welcome to Minesweeper");
	//Button to restart the game 
	JButton reset = new JButton("Want to reset??"); 
	//10x10
	JButton[][] button = new JButton[10][10];
	int[][] numbs = new int[10][10];
	Container grid = new Container();
	
	
	public GuiMs(){
		frame.setSize(700,700);
		//reset.setSize(10,10);
		frame.setLayout(new BorderLayout());
		
		frame.add(reset,BorderLayout.SOUTH);
		reset.addActionListener(this);
		grid.setLayout(new GridLayout(10,10));
		//frame.setSize(reset, 10, 10);
		for(int row = 0; row < button.length; row++){
			for( int column = 0; column < button.length; column++){
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
}

