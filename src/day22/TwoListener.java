package day22;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TwoListener implements MouseListener, MouseMotionListener {

    private Frame frame;
    private TextField textField;

    private void go(){
        Frame frame = new Frame("Two Listener");
        frame.add(new Label("click"), BorderLayout.NORTH);
        textField = new TextField(30);
        frame.add(textField, BorderLayout.SOUTH);
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
        frame.addMouseListener(new MymouseListener());

        frame.setSize(200, 200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        TwoListener twoListener=new TwoListener();
        twoListener.go();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String str = "The mouse  has enter the Frame";
        this.textField.setText(str);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String str = "The mouse  has left the Frame";
        this.textField.setText(str);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String str = "x: " + e.getX() + "y:" + e.getY();
        this.textField.setText(str);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

class MymouseListener implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse has entered the frame");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse has left the frame");
    }
}