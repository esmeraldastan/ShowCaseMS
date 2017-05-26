import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cell implements ActionListener {
	 //Variables you need to work with
    int value;
    private boolean notChecked;
    GuiMs board;
    
    //Variables you don't need to worry about or care about.
    private JButton button;
    /**
     * This constructor is complete and does not need modification
     */
    public Cell(GuiMs board){
        button = new JButton();
        button.addActionListener(this);
        button.setPreferredSize(new Dimension(20,20));
        button.setMargin(new Insets(0,0,0,0));
        value = 0;
        this.board = board;
        notChecked = true;
    }
    /** This Method tells me if the cell is a bomb.
     * 
     * @return True if it is a bomb, otherwise false.
     */
    boolean isBomb(){
        if(value == -1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isClear(){
        if(value == -1){
            return false;
        }
        else{
            return true;
        }
    }
    //Additional Methods may be required. Please make them yourself.
    
    public int getValue(){
        return value;
    }
    
    public void changeValue(int x){
        value = x;
    }
    
    public void incValue(){
        value++;
    }
    
    //The following methods are used for the User Inferface. These methods are fully functional and do not need to be modified.
    public void checkCell(){
    	button.setEnabled(false);
        displayValue();
        notChecked = false;
        if(value == 0) board.scanForEmptyCells();
        if(value == -1) board.fail();
    }
    public void displayValue(){
        if(this.isBomb()){
            button.setText("\u2600");
            button.setBackground(Color.RED);
        }else if(value!=0){
            button.setText(String.valueOf(value));
        }
    }
    public JButton getButton() {
        return button;
    }
    public boolean isNotChecked(){
        return notChecked;
    }
    public boolean isEmpty(){
        return isNotChecked() && value==0;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        checkCell();
    }
}


