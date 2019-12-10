package day21;

import javafx.scene.layout.Pane;

import java.awt.*;

public class ExGui3 {

    private Frame frame;
    private Panel panel;

    private Button b1,b2,b3,b4;

    public void go() {
        frame = new Frame("Complex layout");
        b1 = new Button("West");
        b2 = new Button("hello");

        frame.add(b1, BorderLayout.WEST);
        frame.add(b2, BorderLayout.CENTER);

        panel = new Panel();
        b3 = new Button("world");
        b4 = new Button("welcome");

        panel.add(b3);
        panel.add(b4);
        frame.add(panel, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        ExGui3 exGui3=new ExGui3();
        exGui3.go();
    }
}
