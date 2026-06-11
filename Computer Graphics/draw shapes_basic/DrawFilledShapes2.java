import javax.swing.*;
import java.awt.*;

public class DrawFilledShapes2 extends JFrame {
    
    // Paint method to draw shapes
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set background color
        this.setBackground(Color.WHITE);

        // Draw a filled rectangle
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 50, 150, 100); // x, y, width, height

        // Draw a filled oval
        g2d.setColor(Color.BLUE);
        g2d.fillOval(250, 50, 150, 100); // x, y, width, height

        // Draw a filled polygon (triangle)
        g2d.setColor(Color.GREEN);
        int[] xPoints = {150, 200, 100}; // x-coordinates of vertices
        int[] yPoints = {200, 300, 300}; // y-coordinates of vertices
        int nPoints = 3; // Number of vertices
        g2d.fillPolygon(xPoints, yPoints, nPoints);
    }

    // Main method to create a window and display the shapes
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw Filled Shapes2");
        DrawFilledShapes2 panel = new DrawFilledShapes2();

        frame.add(panel);
        frame.setSize(500, 400); // Width and height of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
