import javax.swing.JFrame;
import java.awt.Graphics;

public class DDARectangle extends JFrame {

    public DDARectangle() {
        setTitle("DDA Algorithm - Rectangle");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        // Coordinates for rectangle (top-left corner and bottom-right corner)
        int x1 = 100, y1 = 100; // Top-left corner
        int x2 = 200, y2 = 200; // Bottom-right corner

        // Draw rectangle using DDA line algorithm
        drawLineDDA(g, x1, y1, x2, y1); // Top edge
        drawLineDDA(g, x2, y1, x2, y2); // Right edge
        drawLineDDA(g, x2, y2, x1, y2); // Bottom edge
        drawLineDDA(g, x1, y2, x1, y1); // Left edge
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
        new DDARectangle().setVisible(true);
    }
}
