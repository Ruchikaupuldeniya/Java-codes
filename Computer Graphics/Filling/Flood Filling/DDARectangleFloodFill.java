import java.awt.*;
import javax.swing.*;

public class DDARectangleFloodFill extends JFrame {

    public Color[][] pixels = new Color[600][600];
    int x1; // Top-left X coordinate
    int y1; // Top-left Y coordinate
    int width; // Width of the rectangle
    int height; // Height of the rectangle

    public DDARectangleFloodFill() {
        setTitle("DDA Rectangle Drawing with Flood Fill");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Rectangle coordinates and dimensions
        x1 = 150; // Top-left X coordinate
        y1 = 150; // Top-left Y coordinate
        width = 300; // Width of the rectangle
        height = 200; // Height of the rectangle
        drawRectangle(g, x1, y1, width, height);

        fillRectangle(g, x1, y1, width, height);

        // Start flood fill from inside the rectangle (e.g., center)
        floodFill(x1 + width / 2, y1 + height / 2, Color.GREEN, Color.RED, g);
    }

    public void drawRectangle(Graphics g, int x1, int y1, int width, int height) {

        drawLineDDA(g, x1, y1, x1 + width, y1);
        drawLineDDA(g, x1, y1 + height, x1 + width, y1 + height);
        drawLineDDA(g, x1, y1, x1, y1 + height);
        drawLineDDA(g, x1 + width, y1, x1 + width, y1 + height);
    }

    public void drawLineDDA(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float xInc = (float) dx / steps;
        float yInc = (float) dy / steps;

        float x = x1;
        float y = y1;

        for (int i = 0; i <= steps; i++) {
            g.drawLine(Math.round(x), Math.round(y), Math.round(x), Math.round(y));
            x += xInc;
            y += yInc;
        }
    }

    public void fillRectangle(Graphics g, int x1, int y1, int width, int height) {
        for (int x = x1 + 1; x < x1 + width; x++) {
            for (int y = y1 + 1; y < y1 + height; y++) {
                setPixelColor(g, x, y, Color.GREEN); 
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

    // Recursive flood fill algorithm for 4-connected regions
    private void floodFill(int x, int y, Color targetColor, Color replacementColor, Graphics g) {
        Color currentColor = getPixelColor(x, y);

        // Base case: return if the current pixel is out of bounds or not the target color
        if (currentColor == null || !currentColor.equals(targetColor)) {
            return;
        }

        // Set the pixel to the replacement color
        g.setColor(replacementColor);
        g.drawLine(x, y, x, y); // Change the pixel to red
        setPixelColor(g, x, y, replacementColor);

        // Recursively fill in all 4 directions (up, down, left, right)
        floodFill(x + 1, y, targetColor, replacementColor, g); // Right
        floodFill(x - 1, y, targetColor, replacementColor, g); // Left
        floodFill(x, y + 1, targetColor, replacementColor, g); // Down
        floodFill(x, y - 1, targetColor, replacementColor, g); // Up
    }

    public static void main(String[] args) {
        new DDARectangleFloodFill();
    }
}
