package day22.Swing;

import javax.swing.*;
import java.awt.*;

public class MenuTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Menu");
        JMenuBar menuBar=new JMenuBar();

        JMenu menu1 = new JMenu(" File ");
        JMenu menu2 = new JMenu(" Edit ");
        JMenu menu3 = new JMenu(" Nevigate ");
        JMenu menu4 = new JMenu(" Code ");

        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("Hello");
        JMenuItem item3 = new JMenuItem("world");
        JMenuItem item4 = new JMenuItem("welcom");

        jFrame.setJMenuBar(menuBar);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);


        menu1.add(item1);
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setSize(new Dimension(200, 300));
        jFrame.setVisible(true);



    }
}
