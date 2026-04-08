/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import snake.GameSound.Sound;

/**
 *
 * @author Al Hadi
 */
public class Snake extends JFrame {

    public static Snake currentFrame;

    private JLabel diceResult;
    private Dice dice = new Dice();
    private int CurrentPosition = 0;
    private static int Player = -1;
    static ArrayList<Boolean> CheckVector;
    static ArrayList<String> Conclution = new ArrayList<>();

    Snake(int plyr) {
        currentFrame = this;

        Player = plyr;
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // important

        setSize(1000, 1000);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(128, 128, 128));
        CheckVector = new ArrayList<>(Arrays.asList(true, true, true, true));
        SetUI();

        setVisible(true);

    }

    private void SetUI() {
        JPanel adder = new JPanel();
        adder.setBackground(new Color(128, 128, 0));
        adder.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        JPanel panel = new SnakeBoard(Player);
        adder.add(panel);
        this.add(adder);
        // Dice 
        JPanel dicePanel = new JPanel();
        dicePanel.setLayout(new FlowLayout());
        dicePanel.setBackground(new Color(128, 128, 0));

        JButton diceBtn = new JButton("Roll Dice");
        diceBtn.setPreferredSize(new Dimension(120, 50));

        diceResult = new JLabel("INF");
        diceResult.setFont(new Font("Arial", Font.BOLD, 30));

        // Here Action provoded ; ;
        diceBtn.addActionListener(e -> {
            System.out.println("Hello World!");
            if (Control.ControlSubstance) {
                Sound.diceSystem();

                new javax.swing.Timer(5000, ex -> {

                    System.out.println("Continue execution");

                    ((javax.swing.Timer) ex.getSource()).stop();
                }).start();

                int sizeofarray = SnakeBoard.SizeOfArray();
                System.out.println("this is size of array now " + sizeofarray);
                int values = dice.roll();
                diceResult.setText(String.valueOf(values));
                System.out.println("Dice rolled: " + values);
                for (int i = 0; i < 4; i++) {
                    if (SnakeBoard.Position.get(CurrentPosition) >= 100) {
                        CurrentPosition++;
                        CurrentPosition %= Player;
                    }
                }
                SnakeBoard.PawnMove(values, CurrentPosition);
                int tgt = SnakeBoard.Position.get(CurrentPosition);
                if (tgt == 100 && CheckVector.get(CurrentPosition)) {
                    CheckVector.set(CurrentPosition, false);
                    switch (CurrentPosition) {
                        case 0:
                            Conclution.add("RED");
                            break;
                        case 1:
                            Conclution.add("GREEN");
                            break;
                        case 2:
                            Conclution.add("BLUE");
                            break;
                        default:
                            Conclution.add("PINK");
                            break;
                    }

                }diceBtn.setText("Player  "+(CurrentPosition+1));
                if (values != 6) {
                    CurrentPosition++;
                    CurrentPosition %= Player;
                }
                if (values == 6 && tgt + 6 >= 100) {
                    CurrentPosition++;
                    CurrentPosition %= Player;
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

        new StartPage();

    }

    public static void EndGameLogic() {
        if (Conclution.size() == (Player - 1)) {

            String Lost = "";
            for (int i = 0; i < Player; i++) {
                if (CheckVector.get(i)) {
                    switch (i) {
                        case 0:
                            Lost = "RED";
                            break;
                        case 1:
                            Lost = "GREEN";
                            break;
                        case 2:
                            Lost = "BLUE";
                            break;
                        default:
                            Lost = "PINK";
                            break;
                    }
                }
            }

            // Use the passed frame
            currentFrame.dispose();
            new resultFrame(Conclution, Lost);
        }
    }

}
