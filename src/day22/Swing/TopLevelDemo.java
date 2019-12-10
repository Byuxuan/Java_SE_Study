package day22.Swing;

import javax.swing.*;
import java.awt.*;

public class TopLevelDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Top Level Demo");
        jFrame.addWindowListener(new MyHandler());

        JLabel label = new JLabel("hello");
        label.setBackground(Color.BLACK);
        label.setPreferredSize(new Dimension(200, 180));

        JMenuBar menuBar=new JMenuBar();
        menuBar.setBackground(Color.RED);
        menuBar.setPreferredSize(new Dimension(200, 20));

        jFrame.setJMenuBar(menuBar);
        jFrame.getContentPane().add(label, BorderLayout.CENTER);

        jFrame.pack();
        jFrame.setVisible(true);
    }
}
