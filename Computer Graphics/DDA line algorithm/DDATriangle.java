import javax.swing.JFrame;
import java.awt.Graphics;

public class DDATriangle extends JFrame {

    public DDATriangle() {
        setTitle("DDA Algorithm - Triangle");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Coordinates for triangle vertices
        int x1 = 150, y1 = 100; // Vertex 1
        int x2 = 100, y2 = 200; // Vertex 2
        int x3 = 200, y3 = 200; // Vertex 3

        // Draw triangle using DDA line algorithm
        drawLineDDA(g, x1, y1, x2, y2); // Side 1
        drawLineDDA(g, x2, y2, x3, y3); // Side 2
        drawLineDDA(g, x3, y3, x1, y1); // Side 3
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
        new DDATriangle().setVisible(true);
    }
}
