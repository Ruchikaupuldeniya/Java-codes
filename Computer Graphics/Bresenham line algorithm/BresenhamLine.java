import javax.swing.JFrame;
import java.awt.Graphics;

public class BresenhamLine extends JFrame {

    public BresenhamLine() {
        setTitle("Bresenham's Line Drawing Algorithm");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);

        // Starting and ending points of the line
        int x1 = 50, y1 = 50;
        int x2 = 300, y2 = 200;

        // Draw line using Bresenham's algorithm
        drawLineBresenham(g, x1, y1, x2, y2);
    }

    private void drawLineBresenham(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int x = x1;
        int y = y1;

        int p = 2 * dy - dx; // Initial decision parameter

        // Choose the direction of the line
        int incrementX = (x1 < x2) ? 1 : -1;
        int incrementY = (y1 < y2) ? 1 : -1;

        // Plot the initial point
		//g.drawLine(x, y, x, y);
		g.fillOval((int)x,(int)y,5,5);

        // Bresenham's algorithm loop
        //for (int i = 0; i < Math.abs(dx); i++) {
		while(x < x2){
            x += incrementX;

            if (p < 0) {
                p += 2 * Math.abs(dy);
            } else {
                y += incrementY;
                p += 2 * (Math.abs(dy) - Math.abs(dx));
            }

            // Plot the point
            //g.drawLine(x, y, x, y);
			g.fillOval((int)x,(int)y,5,5);
        }
    }

    public static void main(String[] args) {
        new BresenhamLine().setVisible(true);
    }
}
