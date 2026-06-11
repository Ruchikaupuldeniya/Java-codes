import java.awt.Graphics;
import javax.swing.JFrame;

public class MidpointCircleFrame extends JFrame {

    private int centerX, centerY, radius;

    public MidpointCircleFrame(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        
        // Setup JFrame properties
        setTitle("Midpoint Circle Algorithm");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Clear the screen first
        drawMidpointCircle(g, centerX, centerY, radius);
    }

    public void drawMidpointCircle(Graphics g, int xc, int yc, int r) {
        int x = 0, y = r;
        int p = 1 - r; // Initial decision parameter

        while (x <= y) {
            // Plot the eight symmetric points
            plotPoints(g, xc, yc, x, y);

            x++; // Move to the next point horizontally

            // Update the decision parameter and y coordinate
            if (p < 0) {
                p = p + 2 * x + 3;
            } else {
                y--;
                p = p + 2 * (x - y) + 5;
            }
        }
    }

    public void plotPoints(Graphics g, int xc, int yc, int x, int y) {
        g.drawLine(xc + x, yc + y, xc + x, yc + y); // Point (x, y)
        g.drawLine(xc - x, yc + y, xc - x, yc + y); // Point (-x, y)
        g.drawLine(xc + x, yc - y, xc + x, yc - y); // Point (x, -y)
        g.drawLine(xc - x, yc - y, xc - x, yc - y); // Point (-x, -y)
        g.drawLine(xc + y, yc + x, xc + y, yc + x); // Point (y, x)
        g.drawLine(xc - y, yc + x, xc - y, yc + x); // Point (-y, x)
        g.drawLine(xc + y, yc - x, xc + y, yc - x); // Point (y, -x)
        g.drawLine(xc - y, yc - x, xc - y, yc - x); // Point (-y, -x)
    }

    public static void main(String[] args) {
        new MidpointCircleFrame(200, 200, 100); // Center at (200, 200) with radius 100
    }
}