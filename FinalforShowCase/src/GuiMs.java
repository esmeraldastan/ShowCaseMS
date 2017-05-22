//this code will be use instead
//import 
import javax.swing.JFrame;
import javax.swing.JButton;

public class GuiMs {
	//Top section 
	JFrame frame = new JFrame("Welcome to Minesweeper");
	//Button to restart the game 
	JButton reset = new JButton("Want to reset??"); 
	//10x10
	JButton[][] button = new JButton[10][10];
	int[][] numbs = new int[10][10];
	
	public GuiMs(){
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String[] args){
	new GuiMs();
	}
}

