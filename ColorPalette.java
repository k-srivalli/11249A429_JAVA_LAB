
import java.awt.*;

public class ColorPalette extends Frame {
    ColorPalette() {
        setTitle("Color Palette");
        setSize(400, 300);
        setLayout(new GridLayout(2, 3));

        Button b1 = new Button("Red");
        Button b2 = new Button("Green");
        Button b3 = new Button("Blue");
        Button b4 = new Button("Yellow");
        Button b5 = new Button("Pink");
        Button b6 = new Button("Orange");

        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.BLUE);
        b4.setBackground(Color.YELLOW);
        b5.setBackground(Color.PINK);
        b6.setBackground(Color.ORANGE);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPalette();
    }
}
