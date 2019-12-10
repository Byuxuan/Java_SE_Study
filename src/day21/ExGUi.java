package day21;

import day20.ExceptionTest;

import javax.swing.border.Border;
import java.awt.*;

public class ExGUi  {
    private Frame frame;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4,button5;

    public void go() {
        frame = new Frame("gui example");
        //frame.setLayout(new FlowLayout());
        button1 = new Button("B1");
        button2 = new Button("B2");
        button3= new Button("B3");
        button4 = new Button("B4");
        button5 = new Button("B5");


        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.WEST);
        frame.add(button4, BorderLayout.EAST);
        frame.add(button5, BorderLayout.CENTER);

        frame.setSize(200,200);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ExGUi exGUi=new ExGUi();
        exGUi.go();
    }
}
