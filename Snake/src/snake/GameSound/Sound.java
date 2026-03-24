/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake.GameSound;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Al Hadi
 */
public class Sound {
    private static final URL teleports;
    private static final URL footstep;
        private static final URL snakeKing;


    static {
        teleports = Sound.class.getClassLoader().getResource("snake/GameSound/Teleports.wav");
        footstep = Sound.class.getClassLoader().getResource("snake/GameSound/Footstep.wav");
                snakeKing = Sound.class.getClassLoader().getResource("snake/GameSound/Snake.wav");

        

    }

    public static void teleportSystem() {
        play(teleports);
    }
    public static void footstepSystem()
    {
        play(footstep);
    }
    public static void snakeSystem()
    {
        play(snakeKing);
    }

    private static void play(URL url) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP) {
                    clip.close();
                }
            });
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }
}