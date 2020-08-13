import javax.swing.*;
import java.awt.*;

public class Panel3 {

    public static void main(String[] args) {
        Panel3 gui = new Panel3();
        gui.go();
    }

    void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // make panel grey so we can see where it is on the frame
        panel.setBackground(Color.darkGray);

        // create and add both buttons
        JButton button  = new JButton("no feeling");
        JButton button2 = new JButton("is");
        JButton button3 = new JButton("final");

        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        // the panel's layout manager (flow) controls the button, and the frame's
        // layout manager (border) controls the panel
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
