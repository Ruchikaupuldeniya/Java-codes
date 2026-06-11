import javax.swing.JFrame;
import java.awt.Graphics;

public class BresenhamCircleFlowerPattern extends JFrame {

    public BresenhamCircleFlowerPattern() {
        setTitle("Flower Pattern using Bresenham's Circle Algorithm");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int xc = 250, yc = 250; // Center of the pattern
        int mainRadius = 50; // Radius of central circle
        int petalRadius = 50; // Radius of petals

        // Draw 6 petal circles around the center
        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(60 * i); // 60 degrees between each petal
            int petalX = (int) (xc + mainRadius * Math.cos(angle));
            int petalY = (int) (yc + mainRadius * Math.sin(angle));
            drawBresenhamCircle(g, petalX, petalY, petalRadius);
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
        new BresenhamCircleFlowerPattern().setVisible(true);
    }
}

/*
Components:
1. Center and Radius:
		** xc and yc are the coordinates of the center of the pattern (250, 250 in this case).
		** mainRadius is the radius of the central circle (50 units).
		** petalRadius is the radius of each petal circle (30 units).

2. Drawing the Central Circle:
		** drawBresenhamCircle(g, xc, yc, mainRadius); draws the central circle at (250, 250) with a radius of 50 units. The method drawBresenhamCircle is assumed to implement the Bresenham circle drawing algorithm.

3. Drawing Petal Circles:
		** A for loop runs 6 times to draw the petal circles around the central circle.
		** The angle between consecutive petals is 60 degrees (or π/3 radians). This is calculated with Math.toRadians(60 * i).

		** For each iteration:
			** angle determines the position of each petal circle around the central circle.
			** petalX and petalY are calculated using trigonometric functions to determine the position of each petal based on the angle and distance from the center.

==>> Detailed Steps:
1. Central Circle:
		** Draw a circle at the center (xc, yc) with the given mainRadius.

2. Petal Circles:
		** Calculate the position for each petal circle by rotating around the central circle.
		** The angle is incremented by 60 degrees each time (creating 6 petals around the circle). This angle is converted to radians since trigonometric functions in Java use radians.
		** The cos and sin functions are used to determine the x and y coordinates of each petal based on the angle and distance from the center.

Example:
		If i = 0, the petal will be positioned directly to the right of the central circle. For i = 1, it will be positioned at 60 degrees counterclockwise from the previous petal, and so on.

		The result is a pattern with a central circle and six petals arranged in a circular pattern around it
*/