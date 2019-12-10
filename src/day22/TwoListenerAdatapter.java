package day22;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TwoListenerAdatapter {

    private Frame frame;
    private TextField textField;

    private void go() {
        Frame frame = new Frame("Two Listener");
        frame.add(new Label("click"), BorderLayout.NORTH);
        textField = new TextField(30);
        frame.add(textField, BorderLayout.SOUTH);
        frame.addMouseListener(new MyMouseAdapter());

        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        TwoListenerAdatapter twoListenerAdatapter=new TwoListenerAdatapter();
        twoListenerAdatapter.go();
    }
}

class MyMouseAdapter extends MouseAdapter {
    @Override
    public void mouseEntered(MouseEvent e) {
        String str = "The mouse  has enter the Frame";
        System.out.println(str);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String str = "The mouse  has left the Frame";
        System.out.println(str);
    }
}