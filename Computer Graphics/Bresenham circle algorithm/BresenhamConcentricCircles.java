import javax.swing.JFrame;
import java.awt.Graphics;

public class BresenhamConcentricCircles extends JFrame {

    public BresenhamConcentricCircles() {
        setTitle("Concentric Circles using Bresenham's Algorithm");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int xc = 250, yc = 250; // Center of the circles
        int radius = 20; // Starting radius

        // Draw 5 concentric circles
        for (int i = 0; i < 5; i++) {
            drawBresenhamCircle(g, xc, yc, radius + i * 30); // Increase radius by 30 each time
        }
    }

    private void drawBresenhamCircle(Graphics g, int xCenter, int yCenter, int r) {
        int x = 0;
        int y = r;
        int d = 3 - (2 * r); // Initial decision parameter

        plotCirclePoints(g, xCenter, yCenter, x, y);

        while (x <= y) {
            x++;

            if (d < 0) {
                d += 4 * x + 6;
            } else {
                y--;
                d += 4 * (x - y) + 10;
            }

            plotCirclePoints(g, xCenter, yCenter, x, y);
        }
    }

    // Plotting points in all octants based on symmetry
    private void plotCirclePoints(Graphics g, int xc, int yc, int x, int y) {
        g.drawLine(xc + x, yc + y, xc + x, yc + y); // Octant 1
        g.drawLine(xc - x, yc + y, xc - x, yc + y); // Octant 2
        g.drawLine(xc + x, yc - y, xc + x, yc - y); // Octant 3
        g.drawLine(xc - x, yc - y, xc - x, yc - y); // Octant 4
        g.drawLine(xc + y, yc + x, xc + y, yc + x); // Octant 5
        g.drawLine(xc - y, yc + x, xc - y, yc + x); // Octant 6
        g.drawLine(xc + y, yc - x, xc + y, yc - x); // Octant 7
        g.drawLine(xc - y, yc - x, xc - y, yc - x); // Octant 8
    }

    public static void main(String[] args) {
        new BresenhamConcentricCircles().setVisible(true);
    }
}
