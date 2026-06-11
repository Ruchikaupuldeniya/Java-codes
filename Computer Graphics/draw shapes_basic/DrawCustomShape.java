import javax.swing.*;
import java.awt.*;

public class DrawCustomShape extends JFrame {
    public DrawCustomShape() {
        setTitle("Draw Custom Shape");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.ORANGE);
        int[] xPoints = {50, 150, 250, 150};
        int[] yPoints = {150, 50, 150, 250};
        g.drawPolygon(xPoints, yPoints, xPoints.length);
        //g.drawPolygon(xPoints, yPoints, The number of points);
    }

    public static void main(String[] args) {
        DrawCustomShape frame = new DrawCustomShape();
        //frame.setVisible(true);
    }
}
