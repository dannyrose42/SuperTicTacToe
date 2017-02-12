package supertictactoe;

import javax.swing.JFrame;

public class Main {
   public static void main(String [] args) {
       JFrame frame = new TicTacToeGame();
       frame . setSize(300, 300);
       frame.setTitle("Tic Tac Toe");
       frame.setLocation(200, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame. setVisible(true);
   }
    
    
}
