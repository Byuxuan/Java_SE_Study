package day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        JButton button = new JButton("Click me");

        button.addActionListener(new MyListener());


        /**
         * 匿名内部类
         */
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("welcome");
            }
        });

        frame.setSize(new Dimension(200, 300));
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("System exit");
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}

class MyListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello world");
    }
}

