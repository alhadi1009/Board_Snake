/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Al Hadi
 */
public class StartPage extends JFrame implements ActionListener {

    JButton buttonOne, buttonTwo, buttonThree;

    StartPage() {
        buttonOne = new JButton();
        buttonOne.setBounds(200, 100, 200, 50);
        buttonOne.addActionListener(this);
        buttonOne.setText("2 Players");
        buttonOne.setFocusable(false);
        buttonOne.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        buttonOne.setBackground(Color.LIGHT_GRAY);
        buttonOne.setBorder(BorderFactory.createEtchedBorder());

        buttonTwo = new JButton();
        buttonTwo.setBounds(200, 200, 200, 50);
        buttonTwo.addActionListener(this);
        buttonTwo.setText("3 Players");
        buttonTwo.setFocusable(false);
        buttonTwo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        buttonTwo.setBackground(Color.LIGHT_GRAY);
        buttonTwo.setBorder(BorderFactory.createEtchedBorder());
        
         buttonThree = new JButton();
        buttonThree.setBounds(200, 300, 200, 50);
       buttonThree.addActionListener(this);
        buttonThree.setText("4 Players");
      buttonThree.setFocusable(false);
       buttonThree.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        buttonThree.setBackground(Color.LIGHT_GRAY);
       buttonThree.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        this.setLayout(null);
        this.setSize(500, 500);
         setLocationRelativeTo(null);
        this.setVisible(true);
        this.add(buttonOne);
        this.add(buttonTwo);
        this.add(buttonThree);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonOne) {

            new Snake(2);
            this.dispose();
        } else if (e.getSource() == buttonTwo) {
            new Snake(3);
            this.dispose();
        }else 
        {
             new Snake(4);
            this.dispose();
        }

    }

}
