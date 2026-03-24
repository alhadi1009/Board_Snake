/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Al Hadi
 */
class CircleLabel extends JLabel {
    private Color color;

    public CircleLabel(Color color) {
        this.color = color;
        setOpaque(false); // background transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(0, 0, getWidth(), getHeight()); // circle
    }
}