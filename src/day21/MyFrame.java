package day21;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("First GUI app");
        myFrame.setSize(500,500);
        myFrame.setBackground(Color.YELLOW);
        myFrame.setVisible(true);

    }
}
