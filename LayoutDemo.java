
import java.awt.*;
import javax.swing.*;

public class LayoutDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Swing Layout Demo");

        f.setLayout(new FlowLayout());

        f.add(new JButton("Button 1"));
        f.add(new JButton("Button 2"));
        f.add(new JButton("Button 3"));
        f.add(new JButton("Button 4"));

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
