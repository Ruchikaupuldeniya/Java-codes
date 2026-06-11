import javax.swing.*;
import java.awt.*;

public class DDALine extends JFrame {

    public DDALine() {
        // Set up the frame
        setTitle("DDA Line Algorithm");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // Set the color for the line
        g.setColor(Color.BLACK);

        // Define start and end points
        int x1 = 50, y1 = 50;
        int x2 = 300, y2 = 250;

        drawDDALine(g, x1, y1, x2, y2);
    }

    private void drawDDALine(Graphics g, int x1, int y1, int x2, int y2) {
        // Calculate delta X and delta Y
        int dx = x2 - x1;
        int dy = y2 - y1;
		int steps;

        // Calculate the number of steps required for generating pixels
        //int steps = Math.max(Math.abs(dx), Math.abs(dy));
		if(Math.abs(dx)>Math.abs(dy)) {
			steps=Math.abs(dx);
		}
		else {
			steps=Math.abs(dy);
		}

        // Calculate the increment in x and y for each step
        float xIncrement = dx / (float) steps;
        float yIncrement = dy / (float) steps;

        // Initialize starting point
        float x = x1;
        float y = y1;

        // Draw the line using DDA algorithm
        for (int i = 0; i <= steps; i++) {
            g.fillOval(Math.round(x), Math.round(y), 1, 1); 
			// Draw pixel at the rounded coordinate
            x += xIncrement; // Increment x
            y += yIncrement; // Increment y
        }
    }

    public static void main(String[] args) {
        new DDALine();
    }
}
