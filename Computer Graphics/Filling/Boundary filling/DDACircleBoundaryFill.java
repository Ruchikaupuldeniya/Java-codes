import java.awt.*;
import javax.swing.*;

public class DDACircleBoundaryFill extends JFrame {

    public Color[][] pixels = new Color[600][600]; // Used to track the colors of individual pixels on the screen
    int centerX; // X coordinate of the circle's center
    int centerY; // Y coordinate of the circle's center
    int radius; // Radius of the circle

    public DDACircleBoundaryFill() {
        setTitle("DDA Circle Drawing with Boundary Fill");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Circle center and radius
        centerX = 300; // X coordinate of the circle's center
        centerY = 300; // Y coordinate of the circle's center
        radius = 100; // Radius of the circle

        drawCircle(g, centerX, centerY, radius);// Draws the outline of the circle

        fillCircle(g, centerX, centerY, radius);//Fills the circle with green pixels

        // Start boundary fill from inside the circle (e.g., center)
        boundaryFill(centerX, centerY, Color.WHITE, Color.GREEN, g);
    }

	//Draws the circle outline
    public void drawCircle(Graphics g, int centerX, int centerY, int radius) {
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }

    public void fillCircle(Graphics g, int centerX, int centerY, int radius) {
        for (int x = centerX - radius; x <= centerX + radius; x++) {
            for (int y = centerY - radius; y <= centerY + radius; y++) {
                if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radius, 2)) {
                    setPixelColor(g, x, y, Color.GREEN);
                }
            }
        }
    }

    // Store the pixel color in an array for tracking
    public void setPixelColor(Graphics g, int x, int y, Color color) {
        g.setColor(color);
        pixels[x][y] = g.getColor();
        g.drawLine(x, y, x, y);
    }

    // Retrieve the color of a specific pixel
    public Color getPixelColor(int x, int y) {
        if (x >= 0 && x < 600 && y >= 0 && y < 600) {
            return pixels[x][y];
        }
        return Color.WHITE;
    }

    // Recursive boundary fill algorithm for 8-connected regions
    private void boundaryFill(int x, int y, Color targetColor, Color replacementColor, Graphics g) {
        // Get the current pixel color at (x, y)
        Color currentColor = getPixelColor(x, y);

        // Check if the current pixel is not out of bounds and its color matches the target color
        if (currentColor != null && currentColor.equals(targetColor)) {
            // Set the current pixel to the replacement color
            g.setColor(replacementColor);
            g.drawLine(x, y, x, y); // Change the pixel color
            setPixelColor(g, x, y, replacementColor); // Update the pixel color in the pixels array

            // Recursively fill in all 8 directions (up, down, left, right, and diagonals)
            boundaryFill(x + 1, y, targetColor, replacementColor, g); // Right
            boundaryFill(x - 1, y, targetColor, replacementColor, g); // Left
            boundaryFill(x, y + 1, targetColor, replacementColor, g); // Down
            boundaryFill(x, y - 1, targetColor, replacementColor, g); // Up

            // Diagonal Directions
            boundaryFill(x + 1, y + 1, targetColor, replacementColor, g); // Down-right
            boundaryFill(x - 1, y + 1, targetColor, replacementColor, g); // Down-left
            boundaryFill(x + 1, y - 1, targetColor, replacementColor, g); // Up-right
            boundaryFill(x - 1, y - 1, targetColor, replacementColor, g); // Up-left
        }
    }

    public static void main(String[] args) {
        new DDACircleBoundaryFill();
    }
}
