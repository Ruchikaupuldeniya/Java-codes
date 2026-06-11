/*
Exercise 2: Creating Patterns
This example uses a loop to create a grid of squares.
*/
import javax.swing.*;
import java.awt.*;

public class GridPattern extends JFrame {

    public GridPattern() {
        // Set up the frame
        setTitle("Grid Pattern");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set color for the squares
        g.setColor(Color.BLUE);

        // Size and spacing of squares
        int size = 30;
        int spacing = 10;
        int x, y;

        // Draw grid pattern
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                x = col * (size + spacing) + 10;
                y = row * (size + spacing) + 10;
                g.fillRect(x, y, size, size);
            }
        }
    }

    public static void main(String[] args) {
        new GridPattern();
    }
}