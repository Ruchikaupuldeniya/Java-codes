import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class BresenhamOlympicRings extends JFrame {

    public BresenhamOlympicRings() {
        setTitle("Olympic Rings using Bresenham's Algorithm");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int radius = 50; // Radius of each ring
        int startX = 100, startY = 150; // Starting point for the first ring

        // Colors for the Olympic rings in order
        Color[] colors = {Color.BLUE, Color.YELLOW, Color.BLACK, Color.GREEN, Color.RED};
        int colorIndex = 0;

        // Draw top 3 rings closer together
        int topRingSpacing = 80; // Decreased spacing between top rings
        for (int i = 0; i < 3; i++) {
            g.setColor(colors[colorIndex++]);
            drawBresenhamCircle(g, startX + i * topRingSpacing, startY, radius);
        }

        // Draw bottom 2 rings with adjusted spacing
        int bottomRingSpacing = 80; // Adjust spacing for bottom rings
        int bottomRingYOffset = 70; // Vertical offset for bottom rings
        for (int i = 0; i < 2; i++) {
            g.setColor(colors[colorIndex++]);
            drawBresenhamCircle(g, startX + i * bottomRingSpacing + 40, startY + bottomRingYOffset, radius);
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
        // Draw circles instead of lines for a better visual representation
        g.fillOval(xc + x - 1, yc + y - 1, 2, 2); // Octant 1
        g.fillOval(xc - x - 1, yc + y - 1, 2, 2); // Octant 2
        g.fillOval(xc + x - 1, yc - y - 1, 2, 2); // Octant 3
        g.fillOval(xc - x - 1, yc - y - 1, 2, 2); // Octant 4
        g.fillOval(xc + y - 1, yc + x - 1, 2, 2); // Octant 5
        g.fillOval(xc - y - 1, yc + x - 1, 2, 2); // Octant 6
        g.fillOval(xc + y - 1, yc - x - 1, 2, 2); // Octant 7
        g.fillOval(xc - y - 1, yc - x - 1, 2, 2); // Octant 8
    }

    public static void main(String[] args) {
        new BresenhamOlympicRings().setVisible(true);
    }
}
