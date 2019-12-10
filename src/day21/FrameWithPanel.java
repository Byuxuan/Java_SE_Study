package day21;

import java.awt.*;

public class FrameWithPanel extends Frame {

    public FrameWithPanel(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        FrameWithPanel frameWithPanel = new FrameWithPanel("Frame with panel");
        frameWithPanel.setSize(500, 500);
        frameWithPanel.setBackground(Color.BLACK);
        frameWithPanel.setLayout(null);

        Panel panel = new Panel();
        panel.setSize(100, 100);
        panel.setBackground(Color.BLUE);

        frameWithPanel.add(panel);

        frameWithPanel.setVisible(true);


    }
}
