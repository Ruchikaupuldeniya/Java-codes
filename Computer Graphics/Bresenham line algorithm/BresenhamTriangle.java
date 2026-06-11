import javax.swing.JFrame;
import java.awt.Graphics;

public class BresenhamTriangle extends JFrame {
    public BresenhamTriangle() {
        setTitle("Bresenham's Line Drawing Algorithm - Triangle");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int x1 = 150, y1 = 150;
        int x2 = x1 - 50, y2 = y1 + 100;
        int x3 = x1 + 50, y3 = y2;
        drawLineBresenham(g, x1, y1, x2, y2);
        drawLineBresenham(g, x2, y2, x3, y3);
        drawLineBresenham(g, x3, y3, x1, y1);
    }

    private void drawLineBresenham(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
		int dy = Math.abs(y2 - y1);
		int sx = (x1 < x2) ? 1 : -1;
		int sy = (y1 < y2) ? 1 : -1;
		int err = dx - dy;

		while (true) {
			g.fillRect(x1, y1, 1, 1); // Use fillRect to draw individual pixels
			if (x1 == x2 && y1 == y2) break;
			int e2 = 2 * err;
			if (e2 > -dy) {
				err -= dy;
				x1 += sx;
			}
			if (e2 < dx) {
				err += dx;
				y1 += sy;
			}
		}
    }

    public static void main(String[] args) {
        new BresenhamTriangle().setVisible(true);
    }
}
