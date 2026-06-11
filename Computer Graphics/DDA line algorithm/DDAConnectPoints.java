import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DDAConnectPoints extends JFrame {

    public DDAConnectPoints() {
        setTitle("DDA Line Algorithm - Connect Multiple Points");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);

        int[] xPoints = {50, 150, 200, 100, 75};
        int[] yPoints = {100, 50, 150, 200, 100};

        drawPolylineDDA(g, xPoints, yPoints);
    }

    private void drawPolylineDDA(Graphics g, int[] xPoints, int[] yPoints) {
        for (int i = 0; i < xPoints.length - 1; i++) {
            drawLineDDA(g, xPoints[i], yPoints[i], xPoints[i + 1], yPoints[i + 1]);
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
        new DDAConnectPoints().setVisible(true);
    }
}
