/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import snake.GameSound.Sound;

/**
 *
 * @author Al Hadi
 */
public class SnakeBoard extends JPanel {

    private static CircleLabel pawn1, pawn2, pawn3, pawn4;
    static ArrayList<Integer> Position = new ArrayList<>();// this is position tracing system 

    // Draw Static board here 
    public SnakeBoard(int Player) {
        setPreferredSize(new Dimension(550, 550));
        setLayout(null);
        if (Player > 0) {
            pawn1 = new CircleLabel(Color.RED);
            pawn1.setBounds(500 + 12, 450 + 12, 25, 25); // circle size
            this.add(pawn1);
            Position.add(-1);
        }
        if (Player > 1) {
            pawn2 = new CircleLabel(Color.GREEN);
            pawn2.setBounds(500 + 12, 400 + 12, 25, 25); // circle size
            this.add(pawn2);
            Position.add(-1);
        }
        if (Player > 2) {
            pawn3 = new CircleLabel(Color.BLUE);
            pawn3.setBounds(500 + 12, 350 + 12, 25, 25); // circle size
            this.add(pawn3);
            Position.add(-1);
        }

        if (Player > 3) {
            pawn4 = new CircleLabel(Color.decode("#F5279C"));
            pawn4.setBounds(500 + 12, 300 + 12, 25, 25); // circle size
            this.add(pawn4);
            Position.add(-1);
        }

        //change(pawn2);
        System.out.println(Position.size());
        this.repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2D = (Graphics2D) g;

        g2D.setColor(Color.decode("#000000"));
        g2D.setStroke(new BasicStroke(3f));
        // Outer border
        g2D.drawRect(0, 0, 500, 500);

        // Grid
        for (int i = 0; i < 500; i += 50) {
            for (int j = 0; j < 500; j += 50) {
                g2D.drawRect(i, j, 50, 50);
            }
        }
        g2D.setColor(Color.decode("#FF0000"));
        g2D.setStroke(new BasicStroke(3f));

        int Number = 100, cnt = 11;
        for (int i = 0; i < 500; i += 50) {
            if (cnt % 2 == 0) {
                Number = cnt * 10;
            } else {
                Number = (cnt - 1) * 10 + 1;
            }
            Number -= 10;
            for (int j = 0; j < 500; j += 50) {

                String text = String.valueOf(Number);
                g2D.setFont(new Font("Arial", Font.BOLD, 14));
                g2D.drawString(text, j + 10, i + 25);

                if (cnt % 2 == 0) {
                    Number--;
                } else {
                    Number++;
                }

            }
            cnt--;

        }
        // Snake 97 to 13;
        g2D.setColor(Color.decode("#F55427"));
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(185, 35, 185, 125);
        g2D.drawArc(185, 130, 5, 5, -20, -180);
        g2D.drawLine(190, 135, 285, 135);
        g2D.drawArc(185, 130, 5, 5, 20, 180);
        g2D.drawLine(285, 135, 285, 235);
        g2D.drawLine(285, 235, 335, 235);
        g2D.drawLine(335, 235, 335, 335);
        g2D.drawLine(335, 335, 385, 335);
        g2D.drawLine(385, 335, 385, 427);
        g2D.drawArc(385, 435, 2, 2, 0, -170);
        g2D.drawOval(165, 30, 20, 5);
        g2D.setColor(Color.decode("#FFF00F"));
        g2D.setStroke(new BasicStroke(5f));
        g2D.drawOval(175, 30, 5, 5);
        // Done (97 to 13);

        //Snake 63 to 3;
        g2D.setColor(Color.decode("#00FFFF"));
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(135, 185, 135, 485);
        g2D.drawArc(135, 485, 2, 2, 0, -170);
        g2D.drawOval(115, 180, 20, 5);
        g2D.setColor(Color.decode("#FFF00F"));
        g2D.setStroke(new BasicStroke(5f));
        g2D.drawOval(125, 180, 5, 5);
        // Done (63 to 03);
        //Snake 60 to 38;
        g2D.setColor(Color.decode("#6B63F8"));
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(35, 235, 35, 280);
        g2D.drawLine(35, 280, 85, 280);
        g2D.drawLine(85, 280, 85, 330);
        g2D.drawLine(85, 330, 105, 330);
        g2D.drawArc(110, 328, 2, 2, 90, -170);
        g2D.drawOval(15, 230, 20, 5);
        g2D.setColor(Color.decode("#FFF00F"));
        g2D.setStroke(new BasicStroke(5f));
        g2D.drawOval(25, 230, 5, 5);
        // Done (60 to 38);
        //Snake 82 to 43;
        g2D.setColor(Color.decode("#00ABAB"));
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(85, 85, 125, 85);
        g2D.drawLine(130, 85, 130, 130);
        g2D.drawLine(90, 135, 130, 135);
        g2D.drawLine(90, 135, 90, 230);
        g2D.drawLine(90, 230, 120, 260);
        g2D.drawOval(60, 82, 20, 5);
        g2D.drawArc(120, 260, 2, 2, 90, -170);
        g2D.setColor(Color.decode("#FFF00F"));
        g2D.setStroke(new BasicStroke(5f));
        g2D.drawOval(70, 82, 5, 5);

        // Done (82 to 43);
        // Snake 70 to 25;
        g2D.setColor(Color.decode("#87CEFA"));
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(385, 185, 485, 185);
        g2D.drawLine(385, 185, 385, 285);
        g2D.drawLine(385, 285, 240, 285);
        g2D.drawLine(240, 285, 240, 360);
        g2D.drawArc(240, 365, 2, 2, 0, -180);
        g2D.drawOval(485, 165, 5, 20);
        g2D.setColor(Color.decode("#FFF00F"));
        g2D.setStroke(new BasicStroke(5f));
        g2D.drawOval(485, 170, 5, 5);
        //Done (70 to 25);
        //Snake 89 to 57;
        g2D.setColor(Color.decode("#FFB6C1"));
        g2D.setStroke(new BasicStroke(10f));
        g2D.drawLine(335, 85, 435, 85);
        g2D.drawLine(335, 85, 335, 185);
        g2D.drawLine(335, 185, 185, 185);
        g2D.drawLine(185, 185, 185, 230);
        g2D.drawArc(185, 235, 2, 2, 0, -180);
        g2D.drawOval(435, 65, 5, 20);
        g2D.setColor(Color.decode("#FFF00F"));
        g2D.setStroke(new BasicStroke(5f));
        g2D.drawOval(435, 70, 5, 5);

        // First Ladder start ;;
        g2D.setColor(Color.decode("#000000"));
        g2D.setStroke(new BasicStroke(2f));
        g2D.drawLine(475 - 12, 375 - 12, 375 - 12, 475 - 12);
        g2D.drawLine(475 + 12, 375 + 12, 375 + 12, 475 + 12);

        g2D.drawLine(450, 375, 475, 400);
        g2D.drawLine(375, 450, 400, 475);
        g2D.drawLine(400, 425, 425, 450);
        g2D.drawLine(425, 400, 450, 425);
// second

        g2D.drawLine(225 - 12, 75 - 12, 275 - 12, 25 - 12);
        g2D.drawLine(225 + 12, 75 + 12, 275 + 12, 25 + 12);

        g2D.drawLine(250, 25, 275, 50);
        g2D.drawLine(225, 50, 250, 75);
//third;
        g2D.drawLine(150 - 12, 475 - 12, 50 - 12, 375 - 12);
        g2D.drawLine(100 + 12, 475 + 12, 12, 375 + 12);

        g2D.drawLine(100, 475, 125, 450);
        g2D.drawLine(50, 375, 25, 400);
        g2D.drawLine(75, 400, 50, 425);
        g2D.drawLine(100, 425, 75, 450);

// Fourth;
        g2D.drawLine(225 + 12, 250 + 12, 75 + 12, 100 + 12);
        g2D.drawLine(225 - 12, 300 - 12, 75 - 12, 125 + 12);

        g2D.drawLine(225, 250, 200, 275);
        g2D.drawLine(200, 225, 175, 250);
        g2D.drawLine(100, 125, 75, 150);
        g2D.drawLine(125, 150, 100, 175);
        g2D.drawLine(150, 175, 125, 200);
        g2D.drawLine(175, 200, 150, 225);

// Fifth
        g2D.drawLine(325 + 12, 225 + 12, 425 + 12, 125 + 12);
        g2D.drawLine(325 - 12, 225 - 12, 425 - 12, 125 - 12);

        g2D.drawLine(325, 200, 350, 225);
        g2D.drawLine(350, 175, 375, 200);
        g2D.drawLine(375, 150, 400, 175);
        g2D.drawLine(400, 125, 425, 150);

// sixth;
        g2D.drawLine(200 + 12, 375 + 12, 100 + 12, 275 + 12);
        g2D.drawLine(250 - 12, 375 - 12, 150 - 12, 275 - 12);

        g2D.drawLine(150, 275, 125, 300);
        g2D.drawLine(175, 300, 150, 325);
        g2D.drawLine(200, 325, 175, 350);
        g2D.drawLine(225, 350, 200, 375);

// start Teleport;
        g2D.fillArc(400, 30, 50, 40, 0, 180);
        g2D.fillArc(450, 100 + 30, 50, 40, 0, 180);
        g2D.fillArc(400, 250 + 30, 50, 40, 0, 180);
        g2D.fillArc(250, 350 + 30, 50, 40, 0, 180);
        g2D.fillArc(0, 300 + 30, 50, 40, 0, 180);

// END teleport;;
        g2D.setColor(Color.decode("#FFFFFF"));
        g2D.setStroke(new BasicStroke(3f));

        g2D.setFont(new Font("Arial", Font.BOLD, 20));
        g2D.drawString("1", 425, 50);
        g2D.drawString("1", 475, 150);
        g2D.drawString("1", 425, 300);
        g2D.drawString("1", 275, 400);
        g2D.drawString("1", 25, 350);

// done showing content;
        g2D.setColor(Color.decode("#FF00FF"));
        g2D.setFont(new Font("Arial", Font.BOLD, 10));
        g2D.setStroke(new BasicStroke(5f));

        g2D.drawString("Teleport", 400, 10);
        g2D.drawString("Teleport", 450, 110);
        g2D.drawString("Teleport", 400, 260);
        g2D.drawString("Teleport", 250, 360);
        g2D.drawString("Teleport", 0, 310);
// Board droaw done && pawn also  ; 

    }

    public void change(JLabel pawn) {
        pawn.setBounds(150 + 12, 100 + 12, 30, 30);
    }

    public static int SizeOfArray() {
        int sizeofarray = 0;
        for (int i = 0; i < Position.size(); i++) {
            if (Position.get(i) != 100) {
                sizeofarray++;
            }
        }
        return sizeofarray;
    }

    public static CircleLabel getPawn(int index) {
        if (index == 0) {
            return pawn1;
        } else if (index == 1) {
            return pawn2;
        } else if (index == 2) {
            return pawn3;
        } else if (index == 3) {
            return pawn4;
        }
        return null;
    }

    public static void PawnMove(int value, int index) {
        Control.ControlSubstance = false;

        CircleLabel pawn = getPawn(index);
        int startPos = Position.get(index);

        if (startPos + value > 100) {
            Control.ControlSubstance = true;

            return;
            // Write something here ;;

        }
        if (startPos == -1) {
            startPos++;
            value--;
            pawn.setLocation(450 + 12, 450 + 12);
            Sound.footstepSystem();
            Position.set(index, startPos);
        }
        Position.set(index, startPos + value);

        moveStep(pawn, index, startPos + 1, startPos + value, new Runnable() {
            @Override
            public void run() {

// Snake move;
                boolean snakeFound = false;
                for (ArrayList<Integer> snake : PointsOfAll.Snakes) {

                    if (snake.get(0) == Position.get(index)) {
                        snakeFound = true;
                        Position.set(index, snake.get(snake.size() - 1));
                        moveSnakeStep(pawn, index, snake, 1);

                    }
                    if (snakeFound) {
                        break;
                    }
                }
// Teleports moves
                if (!snakeFound) {
                    for (int teleportPoint : PointsOfAll.Teleports) {
                        if (Position.get(index) == teleportPoint) {
                            snakeFound = true;
                            Position.set(index, 0);
                            Sound.teleportSystem();
                            pawn.setLocation(PointsOfAll.Paths[0]);
                            break;
                        }
                        if (snakeFound) {
                            break;
                        }
                    }
                }

// Ladder moves
                if (!snakeFound) {
                    for (ArrayList<Integer> lader : PointsOfAll.Ladders) {

                        if (lader.get(0) == Position.get(index)) {
                            snakeFound = true;
                            Position.set(index, lader.get(lader.size() - 1));
                            moveSnakeStep(pawn, index, lader, 1);
                        }
                        if (snakeFound) {
                            break;
                        }
                    }

                }
                Control.ControlSubstance = true;

            }
        });

    }

    private static void moveStep(CircleLabel pawn, int index, int current, int end, Runnable onComplete) {
        if (current > end) {
            // Position.set(index, end); // update final position
            // System.out.println("this is index " + index+ end);
            if (onComplete != null) {
                onComplete.run();
            }
            return;
        }

        Point from = PointsOfAll.Paths[current - 1];
        Point to = PointsOfAll.Paths[current];

        Timer timer = new Timer(10, null);
        timer.addActionListener(new ActionListener() {
            int x = from.x;
            int y = from.y;

            public void actionPerformed(ActionEvent e) {
                if (x < to.x) {
                    x++;
                }
                if (x > to.x) {
                    x--;
                }
                if (y < to.y) {
                    y++;
                }
                if (y > to.y) {
                    y--;
                }

                pawn.setLocation(x, y);

                if (x == to.x && y == to.y) {
                    timer.stop();
                    Sound.footstepSystem();
                    moveStep(pawn, index, current + 1, end, onComplete);

                }
            }
        });

        timer.start();
    }

    private static void moveSnakeStep(CircleLabel pawn, int index, ArrayList<Integer> snake, int i) {

        if (i >= snake.size()) {
            return;
        }

        Point from = PointsOfAll.Paths[snake.get(i - 1)];
        Point to = PointsOfAll.Paths[snake.get(i)];

        Timer timer = new Timer(10, null);
        Sound.snakeSystem();
        timer.addActionListener(new ActionListener() {

            int x = from.x;
            int y = from.y;

            public void actionPerformed(ActionEvent e) {
//Sound.snakeSystem();
                if (x < to.x) {
                    x++;
                }
                if (x > to.x) {
                    x--;
                }
                if (y < to.y) {
                    y++;
                }
                if (y > to.y) {
                    y--;
                }

                pawn.setLocation(x, y);

                if (x == to.x && y == to.y) {
                    timer.stop();

                    moveSnakeStep(pawn, index, snake, i + 1);
                }
            }
        });

        timer.start();
    }

}
