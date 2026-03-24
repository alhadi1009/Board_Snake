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
   Snake ()
   {
      setTitle("Snake");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ✅ এই লাইন important

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
       JPanel panel = new SnakeBoard();
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
