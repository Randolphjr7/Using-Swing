import javax.swing.*;
import java.awt.*;

public class Button4 {
    public static void main(String[] args) {
        Button4 gui = new Button4();
        gui.go();
    }

    void go() {
        JFrame frame   = new JFrame();
        JButton button = new JButton("winter is coming");
        // a bigger font will force the frame to allocate more space for the button height
        Font bigFont   = new Font("serif", Font.BOLD, 28);
        button.setFont(bigFont);
        // BorderLayout manager divides background component into 5 regions
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
