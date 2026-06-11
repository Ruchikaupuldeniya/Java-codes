import javax.swing.JFrame;
import java.awt.Graphics;

public class DDAPentagon extends JFrame {

    public DDAPentagon() {
        setTitle("DDA Algorithm - Pentagon");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Coordinates for pentagon vertices
        int[] xPoints = {200, 250, 225, 175, 150};
        int[] yPoints = {100, 150, 200, 200, 150};

        // Draw pentagon using DDA line algorithm
        for (int i = 0; i < xPoints.length; i++) {
            drawLineDDA(g, xPoints[i], yPoints[i], xPoints[(i + 1) % xPoints.length], yPoints[(i + 1) % yPoints.length]);
        }
    }

    private void drawLineDDA(Graphics g, int xa, int ya, int xb, int yb) {
        int dx = xb - xa;
        int dy = yb - ya;

        int steps = Math.abs(dx) > Math.abs(dy) ? Math.abs(dx) : Math.abs(dy);

        float xInc = (float) dx / steps;
        float yInc = (float) dy / steps;

        float x = xa;
        float y = ya;

        g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y)); // Draw the first point

        for (int k = 1; k <= steps; k++) {
            x += xInc;
            y += yInc;
            g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y)); // Draw subsequent points
        }
    }

    public static void main(String[] args) {
        new DDAPentagon().setVisible(true);
    }
}
