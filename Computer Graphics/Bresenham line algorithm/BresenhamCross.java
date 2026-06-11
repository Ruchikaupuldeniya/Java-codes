import javax.swing.JFrame;
import java.awt.Graphics;

public class BresenhamCross extends JFrame {
    public BresenhamCross() {
        setTitle("Bresenham's Line Drawing Algorithm - Cross");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        int centerX = 200, centerY = 200, length = 100;
        drawLineBresenham(g, centerX - length / 2, centerY, centerX + length / 2, centerY);
        drawLineBresenham(g, centerX, centerY - length / 2, centerX, centerY + length / 2);
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
        new BresenhamCross().setVisible(true);
    }
}
