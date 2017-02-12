package supertictactoe;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;

class TicTacToeGame extends JFrame {

    public static JButton b1, b2 , b3 ,b4 ,b5 ,b6 ,b7, b8, b9;
    public static JTextField textField;
    public static int turnCount;
    
       
    public TicTacToeGame() {
        
        turnCount = 0;      
        Container pane = getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        
        textField = new JTextField("Play Tic Tac Toe: O plays first");
        ButtonObserver observer = new ButtonObserver();
        
        
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        
     
        
        b1.addActionListener(observer);
        b2.addActionListener(observer);
        b3.addActionListener(observer);
        b4.addActionListener(observer);
        b5.addActionListener(observer);
        b6.addActionListener(observer);
        b7.addActionListener(observer);
        b8.addActionListener(observer);
        b9.addActionListener(observer);
        
        pane.add(textField, "North");
        pane.add(panel, "Center");
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
    }


 
    class ButtonObserver implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            Object source = e.getSource();
            
            
            if (source == b1) {
                if (turnCount % 2 == 0)
                    b1.setText("O");
                else
                    b1.setText("X");
                b1.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b2) {
                if (turnCount % 2 == 0)
                    b2.setText("O");
                else
                    b2.setText("X");
                b2.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b3) {
                if (turnCount % 2 == 0)
                    b3.setText("O");
                else
                    b3.setText("X");
                b3.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b4) {
                if (turnCount % 2 == 0)
                    b4.setText("O");
                else
                    b4.setText("X");
                b4.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b5) {
                if (turnCount % 2 == 0)
                    b5.setText("O");
                else
                    b5.setText("X");
                b5.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b6) {
                if (turnCount % 2 == 0)
                    b6.setText("O");
                else
                    b6.setText("X");
                b6.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b7) {
                if (turnCount % 2 == 0)
                    b7.setText("O");
                else
                    b7.setText("X");
                b7.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b8) {
                if (turnCount % 2 == 0)
                    b8.setText("O");
                else
                    b8.setText("X");
                b8.setEnabled(false);
                turnCount++;
                setText();
            }
            
            if (source == b9) {
                if (turnCount % 2 == 0)
                    b9.setText("O");
                else
                    b9.setText("X");
                b9.setEnabled(false);
                turnCount++;
                setText();
            }
        }  

        public  void setText() {
            //Checks for win
            //Checks which players turn it is
            //Sets text field appropriately 
           
            
            
            if (turnCount == 9)
                textField.setText("Game Over: Tie");
            else System.out.println("turn count is" + turnCount);
            
            if (!"".equals(b1.getText()) & 
                    b1.getText().equals(b2.getText()) & 
                    b2.getText().equals(b3.getText())){ //checks for win in top row
                textField.setText("Game Over! " + b1.getText() + " Wins!");               
                disableButtons();
            }
            
            else if (!"".equals(b4.getText()) & 
                    b4.getText().equals(b5.getText()) & 
                    b5.getText().equals(b6.getText())){ //checks for win in middle row
                textField.setText("Game Over! " + b4.getText() + " Wins!");
                disableButtons();
            }
            
            else if (!"".equals(b7.getText()) & 
                    b7.getText().equals(b8.getText()) & 
                    b8.getText().equals(b9.getText())){ //checks for win in bottom row
                textField.setText("Game Over! " + b7.getText() + " Wins!");
                disableButtons();
            }
            
            else if (!"".equals(b1.getText()) & 
                    b1.getText().equals(b4.getText()) & 
                    b4.getText().equals(b7.getText())){ //checks for win in left column
                textField.setText("Game Over! " + b1.getText() + " Wins!");
                disableButtons();
            }
            
            else if (!"".equals(b2.getText()) & 
                    b2.getText().equals(b5.getText()) & 
                    b5.getText().equals(b8.getText())){ //checks for win in middle column
                textField.setText("Game Over! " + b2.getText() + " Wins!");
                disableButtons();
            }
            
            else if (!"".equals(b3.getText()) & 
                    b3.getText().equals(b6.getText()) & 
                    b6.getText().equals(b9.getText())){ //checks for win in right column
                textField.setText("Game Over! " + b3.getText() + " Wins!");
                disableButtons();
            }
            
            else if (!"".equals(b1.getText()) & 
                    b1.getText().equals(b5.getText()) & 
                    b5.getText().equals(b9.getText())){ //checks for win in top left to bottom right diagonal;
                textField.setText("Game Over! " + b1.getText() + " Wins!");
                disableButtons();
            }
            
            else if (!"".equals(b7.getText()) & 
                    b7.getText().equals(b5.getText()) & 
                    b5.getText().equals(b3.getText())){ //checks for win in bottom left to top right diagonal
                textField.setText("Game Over! " + b7.getText() + " Wins!");
                disableButtons();
            }
           
            else if (turnCount < 9 & turnCount % 2 == 1) //Chekcks if it is X's turn
                textField.setText("X's Turn");
            
           
            else if (turnCount < 9 & turnCount % 2 == 0) // checks if it is Y's turn
                textField.setText("O's Turn");
        }

        private void disableButtons() {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }
    
}
