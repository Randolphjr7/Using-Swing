import javax.swing.*;
import java.awt.*;

public class Button2 {
    public static void main(String[] args) {
        Button2 gui = new Button2();
        gui.go();
    }

    void go() {
        JFrame frame   = new JFrame();
        JButton button = new JButton("click me like you mean it");
        // BorderLayout manager divides background component into 5 regions
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
