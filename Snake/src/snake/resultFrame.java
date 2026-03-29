/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author Al Hadi
 */
public class resultFrame extends JFrame implements ActionListener{
  JButton Back;
            public resultFrame(ArrayList<String> result,String Lost) {

               Back = new JButton();
        Back.setBounds(0, 0, 50, 50);
        Back.addActionListener(this);
       Back.setText("BACK");
        Back.setFocusable(false);
        Back.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        Back.setBackground(Color.LIGHT_GRAY);
        Back.setBorder(BorderFactory.createEtchedBorder());  
                
                
        setTitle("Game Result");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.cyan);

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Game Over!");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(title);

        // Show ranking
        for (int i = 0; i < result.size(); i++) {
            JLabel player = new JLabel((i + 1) + " : " + result.get(i));
            player.setFont(new Font("Arial", Font.PLAIN, 18));
            player.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(player);
        }
         JLabel player = new JLabel( "LOST  : " + Lost);
            player.setFont(new Font("Arial", Font.PLAIN, 18));
            player.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(player);
 panel.add(Back);
        add(panel);
       
        setVisible(true);
    }
            @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Back) {

          new StartPage();
          this.dispose();
        } 

    }

    
}
