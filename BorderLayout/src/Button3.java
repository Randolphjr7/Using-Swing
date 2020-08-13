import javax.swing.*;
import java.awt.*;

public class Button3 {
    public static void main(String[] args) {
        Button3 gui = new Button3();
        gui.go();
    }

    void go() {
        JFrame frame   = new JFrame();
        JButton button = new JButton("winter is coming");
        // BorderLayout manager divides background component into 5 regions
        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
