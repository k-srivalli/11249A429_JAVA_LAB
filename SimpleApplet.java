
import java.awt.Frame;
import java.awt.Graphics;

public class SimpleApplet extends Frame {
    public void paint(Graphics g) {
        g.drawString("Welcome to Java Applet", 50, 100);
    }

    public static void main(String[] args) {
        SimpleApplet f = new SimpleApplet();
        f.setSize(400, 200);
        f.setVisible(true);
    }
}
