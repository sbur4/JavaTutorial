package src.Swing;

//import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ImageIcon;

/**
 * @author sburch
 * @version jdk-15.0.2.7
 */

public class Frame2 {

    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Hdsfdsfdsfdsfdfi");
        label.setHorizontalTextPosition(JLabel.CENTER);
        // label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);

        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setTitle("Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImageIcon image = new ImageIcon("cropped-FG-SQUARE-192x192.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.RED);
        // frame.getContentPane().setBackground(new Color(474747));
        frame.add(label);
    }
}