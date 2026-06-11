import java.awt.*;
import javax.swing.*;

public class DDALineDrawing extends JFrame {

    private int xa, ya, xb, yb;

    public DDALineDrawing(int xa, int ya, int xb, int yb) {
        this.xa = xa;
        this.ya = ya;
        this.xb = xb;
        this.yb = yb;
        setTitle("DDA Line Drawing Algorithm");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawLineDDA(g, xa, ya, xb, yb);
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
        // Replace with your starting and ending points
        new DDALineDrawing(50, 50, 200, 150);
    }
}
