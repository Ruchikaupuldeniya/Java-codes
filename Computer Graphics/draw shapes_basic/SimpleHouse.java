/*
Exercise 1: Drawing Simple Shapes
This example demonstrates how to draw a simple house using basic shapes (lines, rectangles, and a triangle).
*/
import javax.swing.*;
import java.awt.*;

public class SimpleHouse extends JFrame {

    public SimpleHouse() {
        // Set up the frame
        setTitle("Simple House");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the house base
        g.setColor(Color.green);
        g.fillRect(50, 150, 200, 150);

        // Draw the roof
        g.setColor(Color.RED);
        int[] xPoints = {50, 150, 250};
        int[] yPoints = {150, 50, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw the door
        g.setColor(new Color(165, 42, 42));
        g.fillRect(120, 200, 60, 100);

        // Draw windows
        g.setColor(Color.blue);
        g.fillRect(70, 170, 40, 40);
        g.fillRect(190, 170, 40, 40);
    }

    public static void main(String[] args) {
        new SimpleHouse();
    }
}