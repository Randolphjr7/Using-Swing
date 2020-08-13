import javax.swing.*;
import java.awt.*;

public class Panel2 {

    public static void main(String[] args) {
        Panel2 gui = new Panel2();
        gui.go();
    }

    void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // make panel grey so we can see where it is on the frame
        panel.setBackground(Color.darkGray);

        // create and add button
        JButton button = new JButton("shock me");
        panel.add(button);

        // the panel's layout manager (flow) controls the button, and the frame's
        // layout manager (border) controls the panel
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
