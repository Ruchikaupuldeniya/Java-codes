import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class DDALineSlopes extends JFrame {

    public DDALineSlopes() {
        setTitle("DDA Line Algorithm - Different Slopes");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        
        // Positive Slope
        g.setColor(Color.RED);
        drawLineDDA(g, 50, 50, 150, 150);
        
        // Negative Slope
        g.setColor(Color.BLUE);
        drawLineDDA(g, 150, 50, 50, 150);
        
        // Horizontal Line
        g.setColor(Color.GREEN);
        drawLineDDA(g, 50, 200, 150, 200);
        
        // Vertical Line
        g.setColor(Color.MAGENTA);
        drawLineDDA(g, 200, 50, 200, 150);
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
        new DDALineSlopes().setVisible(true);
    }
}