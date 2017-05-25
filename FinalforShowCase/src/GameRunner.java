
public class GameRunner {
	//test runner
    public static void main(String[] args){
        try {
        Minesweeper game = new Minesweeper();
        game.addBombs(10);
        game.numbsAdded();
        game.printBoard2();
    }catch (Exception errorName){
        System.out.println();
        System.out.println("Error: " + errorName);
     }
  }
  //second game runner 
  public static void main2(int bombs, int row, int column){
    try {
        Minesweeper game = new Minesweeper(row, column);
        game.addBombs(bombs);
        game.numbsAdded();
        game.printBoard2();
    }catch (Exception errorName){
        System.out.println();
        System.out.println("Error: " + errorName);
     
    }
   }

}
