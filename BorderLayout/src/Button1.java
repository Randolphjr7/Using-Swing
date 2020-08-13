import javax.swing.*;
import java.awt.*;

public class Button1 {

 /*   public static void main(String[] args) {
        Button1 gui = new Button1();
        gui.go();
    }*/

    void go() {
        JFrame frame   = new JFrame();
        JButton button =  new JButton("click me");
        // BorderLayout manager divides background component into 5 regions
        frame.getContentPane().add(BorderLayout.EAST, button);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
