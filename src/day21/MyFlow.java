package day21;

import java.awt.*;

public class MyFlow {
    private Frame frame;
    private Button button1,button2,button3;

    public void go() {
        frame = new Frame("Flow Layout");
        frame.setLayout(new FlowLayout());
        button1 = new Button("hello");
        button2 = new Button("world");
        button3 = new Button("welcom");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyFlow myFlow=new MyFlow();
        myFlow.go();
    }
}
