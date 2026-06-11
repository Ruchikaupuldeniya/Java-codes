import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DDALineThickness extends JFrame {

    public DDALineThickness() {
        setTitle("DDA Line Algorithm - Line Thickness");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);

        // Draw line with different thickness
        drawThickLineDDA(g, 50, 50, 200, 200, 5);
    }

    private void drawThickLineDDA(Graphics g, int x1, int y1, int x2, int y2, int thickness) {
        for (int i = -thickness/2; i <= thickness/2; i++) {
            drawLineDDA(g, x1 + i, y1, x2 + i, y2);
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
        new DDALineThickness().setVisible(true);
    }
}
