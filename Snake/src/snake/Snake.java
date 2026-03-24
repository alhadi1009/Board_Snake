/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snake;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Al Hadi
 */
public class Snake extends JFrame {
 private JLabel diceResult;
  private Dice dice = new Dice(); 
  private int CurrentPosition=0;
  private int Player=2;
   Snake ()
   {
      setTitle("Snake");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // important

      setSize(1000,1000);
              setLocationRelativeTo(null);
              getContentPane().setBackground(new Color(128,128,128));
              SetUI();

      setVisible(true);
      
      
      
     
      
   }
   private void SetUI()
   {
      JPanel adder = new JPanel();
        adder.setBackground(new Color(128,128,0));
        adder.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
       JPanel panel = new SnakeBoard(Player);
        adder.add(panel);
        this.add(adder);
        // Dice 
         JPanel dicePanel = new JPanel();
        dicePanel.setLayout(new FlowLayout());
        dicePanel.setBackground(new Color(128,128,0));

        JButton diceBtn = new JButton("Roll Dice");
        diceBtn.setPreferredSize(new Dimension(120, 50));

        diceResult = new JLabel("INF");
        diceResult.setFont(new Font("Arial", Font.BOLD, 30));
        
        // Here Action provoded ; ;
         diceBtn.addActionListener(e -> {
         System.out.println("Hello World!");
         if(Control.ControlSubstance)
         {
            int sizeofarray= SnakeBoard.SizeOfArray();
            System.out.println("this is size of array now "+sizeofarray);
             int values = dice.roll();
                diceResult.setText(String.valueOf(values));
                System.out.println("Dice rolled: " + values);
                SnakeBoard.PawnMove(values,CurrentPosition);
                int tgt=SnakeBoard.Position.get(CurrentPosition);
                if(values!=6)
                {
                    CurrentPosition++;
                    CurrentPosition%=Player;
                }
                if(values==6 && tgt+6>=100 )
                {
                     CurrentPosition++;
                    CurrentPosition%=Player;
                }
                
         }
         });
        
        
         dicePanel.add(diceBtn);
        dicePanel.add(diceResult);

        adder.add(dicePanel);

        add(adder, BorderLayout.CENTER);
   }
    public static void main(String[] args) {
        // TODO code application logic here
     new Snake();
    }
    
}
