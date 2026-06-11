import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class LineClipping extends JPanel {
    private int x1, y1, x2, y2, xmin, ymin, xmax, ymax;

    public LineClipping(int x1, int y1, int x2, int y2, int xmin, int ymin, int xmax, int ymax) {
        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
        this.xmin = xmin; this.ymin = ymin; this.xmax = xmax; this.ymax = ymax;
    }

    private int computeCode(int x, int y) {
        return (x < xmin ? 1 : 0) | (x > xmax ? 2 : 0) | (y < ymin ? 4 : 0) | (y > ymax ? 8 : 0);
    }

    public boolean cohenSutherlandClip() {
        int code1 = computeCode(x1, y1), code2 = computeCode(x2, y2);
        while (true) {
            if ((code1 | code2) == 0) return true;
            if ((code1 & code2) != 0) return false;
            int codeOut = (code1 != 0) ? code1 : code2;
            int x = 0, y = 0;
            if ((codeOut & 8) != 0) { y = ymax; x = x1 + (x2 - x1) * (ymax - y1) / (y2 - y1); }
            else if ((codeOut & 4) != 0) { y = ymin; x = x1 + (x2 - x1) * (ymin - y1) / (y2 - y1); }
            else if ((codeOut & 2) != 0) { x = xmax; y = y1 + (y2 - y1) * (xmax - x1) / (x2 - x1); }
            else if ((codeOut & 1) != 0) { x = xmin; y = y1 + (y2 - y1) * (xmin - x1) / (x2 - x1); }
            if (codeOut == code1) { x1 = x; y1 = y; code1 = computeCode(x1, y1); }
            else { x2 = x; y2 = y; code2 = computeCode(x2, y2); }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(xmin, ymin, xmax - xmin, ymax - ymin);
        g.setColor(Color.RED); g.drawLine(x1, y1, x2, y2);
        if (cohenSutherlandClip()) { g.setColor(Color.GREEN); g.drawLine(x1, y1, x2, y2); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 xmin ymin xmax ymax: ");
        JFrame frame = new JFrame("Cohen-Sutherland Clipping");
        frame.add(new LineClipping(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        frame.setSize(800, 600); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
    }
}