/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake;

import java.util.Random;

/**
 *
 * @author Al Hadi
 */
public class Dice {
    private Random random = new Random();

    public int roll() {
        return random.nextInt(6) + 1;
        //return 6;
    }
    
}
