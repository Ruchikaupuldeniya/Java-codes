import javax.swing.JFrame;
import java.awt.Graphics;

public class DDAHome extends JFrame {

    public DDAHome() {
        setTitle("DDA Algorithm - Home");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
		
		// Base
		drawLineDDA(g, 200,250, 500,250);
		drawLineDDA(g, 200,250, 200,450);
		drawLineDDA(g, 500,250, 500,450);
		drawLineDDA(g, 200,450, 500,450);
		
		// door
		drawLineDDA(g, 300,450, 300,350);
		drawLineDDA(g, 300,350, 350,350);
		drawLineDDA(g, 350,350, 350,450);
		
		// window
		drawLineDDA(g, 400,300, 400,350);
		drawLineDDA(g, 400,300, 475,300);
		drawLineDDA(g, 475,300, 475,350);
		drawLineDDA(g, 400,350, 475,350);
		
		// roof
		drawLineDDA(g, 200,250, 350,100);
		drawLineDDA(g, 350,100, 500,250);
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
        new DDAHome().setVisible(true);
    }
}
