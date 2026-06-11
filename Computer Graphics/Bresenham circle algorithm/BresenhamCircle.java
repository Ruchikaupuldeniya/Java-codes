import javax.swing.JFrame;
import java.awt.Graphics;

public class BresenhamCircle extends JFrame {

    public BresenhamCircle() {
        setTitle("Bresenham's Circle Algorithm");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Center of the circle
        int xc = 200, yc = 200; 
        int radius = 100; 

        // Draw circle using Bresenham's algorithm
        drawCircleBresenham(g, xc, yc, radius);
    }

    private void drawCircleBresenham(Graphics g, int xc, int yc, int r) {
        int x = 0;
        int y = r;
        int d = 3 - 2 * r; // Initial decision parameter

        while (x <= y) {
            // Plotting all eight octants
            plotCirclePoints(g, xc, yc, x, y);
            x++;

            // Update the decision parameter based on its current value
            if (d < 0) {
                d = d + 4 * x + 6;
            } else {
                y--;
                d = d + 4 * (x - y) + 10;
            }
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
        new BresenhamCircle().setVisible(true);
    }
}
