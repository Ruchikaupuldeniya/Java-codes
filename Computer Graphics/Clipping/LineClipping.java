import javax.swing.*;
import java.awt.*;

public class LineClipping extends JPanel {
    private static final int LEFT = 1, RIGHT = 2, BOTTOM = 4, TOP = 8;
    private static final int X_MIN = 100, Y_MIN = 100, X_MAX = 300, Y_MAX = 300;

    private int computeOutCode(int x, int y) {
        int code = 0;
        if (x < X_MIN) code |= LEFT;
        else if (x > X_MAX) code |= RIGHT;
        if (y < Y_MIN) code |= BOTTOM;
        else if (y > Y_MAX) code |= TOP;
        return code;
    }

    private void cohenSutherlandClip(Graphics g, int x0, int y0, int x1, int y1) {
        int outCode0 = computeOutCode(x0, y0);
        int outCode1 = computeOutCode(x1, y1);
        boolean accept = false;

        while (true) {
            if ((outCode0 | outCode1) == 0) {
                accept = true;
                break;
            } else if ((outCode0 & outCode1) != 0) {
                break;
            } else {
                int outCodeOut = (outCode0 != 0) ? outCode0 : outCode1;
                int x = 0, y = 0;
                if ((outCodeOut & TOP) != 0) {
                    x = x0 + (x1 - x0) * (Y_MAX - y0) / (y1 - y0);
                    y = Y_MAX;
                } else if ((outCodeOut & BOTTOM) != 0) {
                    x = x0 + (x1 - x0) * (Y_MIN - y0) / (y1 - y0);
                    y = Y_MIN;
                } else if ((outCodeOut & RIGHT) != 0) {
                    y = y0 + (y1 - y0) * (X_MAX - x0) / (x1 - x0);
                    x = X_MAX;
                } else if ((outCodeOut & LEFT) != 0) {
                    y = y0 + (y1 - y0) * (X_MIN - x0) / (x1 - x0);
                    x = X_MIN;
                }
                if (outCodeOut == outCode0) {
                    x0 = x;
                    y0 = y;
                    outCode0 = computeOutCode(x0, y0);
                } else {
                    x1 = x;
                    y1 = y;
                    outCode1 = computeOutCode(x1, y1);
                }
            }
        }
        if (accept) {
            g.setColor(Color.GREEN);
            g.drawLine(x0, y0, x1, y1);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(X_MIN, Y_MIN, X_MAX - X_MIN, Y_MAX - Y_MIN);

        int[][] lines = {{50, 150, 350, 150}, {150, 50, 150, 350}, {50, 50, 350, 350}};
        g.setColor(Color.RED);
        for (int[] line : lines) {
            g.drawLine(line[0], line[1], line[2], line[3]);
        }
        for (int[] line : lines) {
            cohenSutherlandClip(g, line[0], line[1], line[2], line[3]);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cohen-Sutherland Line Clipping");
        LineClipping panel = new LineClipping();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
