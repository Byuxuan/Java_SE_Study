package day21;

import java.awt.*;

public class GridEx {

    public void go() {
        Frame frame = new Frame("Grid ");
        frame.setLayout(new GridLayout(3,2));

        frame.add(new Button("B1"));
        frame.add(new Button("B2"));
        frame.add(new Button("B3"));
        frame.add(new Button("B4"));
        frame.add(new Button("B5"));
        frame.add(new Button("B6"));
        //frame.add(new Button("B7"));
        frame.pack();
        frame.setSize(200, 200);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        GridEx gridEx=new GridEx();
        gridEx.go();
    }


}
