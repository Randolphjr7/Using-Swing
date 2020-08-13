import javax.swing.*;
import java.awt.*;

public class Panel1 {
/* FlowLayout cares about the flow of the components:
*
* left to right, top to bottom, in the order they were received.
* A JPanel's layout manager is FlowLayout by default
*
* */
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        // make panel grey so we can see where it is on the frame
        panel.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
