package src.basic.JavaSound;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Sound {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("Away - Patrick Patrikios.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        while (!response.equals("Q")) {
            System.out.println("P - play, S - stop, R - restart");
            System.out.print("Ener your choic: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setFramePosition(0);
                    break;
                default:
                    System.out.print("Error");
            }
        }
        scanner.close();
    }
}