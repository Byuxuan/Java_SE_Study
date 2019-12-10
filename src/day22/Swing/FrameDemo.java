package day22.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FrameDemo");

        JLabel label = new JLabel("hello world");

        jFrame.getContentPane().add(label, BorderLayout.CENTER);

        jFrame.pack();
        jFrame.addWindowListener(new MyHandler());

        jFrame.setVisible(true);

    }
}

class  MyHandler extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
