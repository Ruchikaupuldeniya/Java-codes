import javax.swing.*;
import java.awt.*;

class FloodFillingObject extends JFrame {

    Graphics g;
    Color[][] pixels = new Color[600][600];

    public FloodFillingObject() {
        setTitle("Flood Filling Algorithm");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Initialize drawing directly
        initializeDrawing();
    }

    private void initializeDrawing() {
        g = getGraphics();
        clearScreen();  // Clear the screen before drawing

        // Define fixed coordinates for drawing
        int x1 = 300;  // Center X coordinate
        int y1 = 300;  // Center Y coordinate

        // Ensure that the drawing is within bounds
        if (x1 - 40 >= 0 && y1 - 40 >= 0 && x1 + 40 <= 600 && y1 + 40 <= 600) {
            drawObject(x1, y1 - 20, 20); // Draw object at different positions
            drawObject(x1, y1 + 60, 20);
            drawObject(x1 - 40, y1 + 20, 20);
            drawObject(x1 + 40, y1 + 20, 20);

            // Start flood fill algorithm
            FloodFillAlgo(x1, y1, Color.GREEN, Color.RED);
        } else {
            System.out.println("Drawing coordinates out of bounds.");
        }
    }

    private void clearScreen() {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

    private void drawObject(int x1, int y1, int d) {
        for (int x = x1 - d; x <= x1 + d; x++) {
            for (int y = y1 - d; y <= y1 + d; y++) {
                if (x >= 0 && x < 600 && y >= 0 && y < 600) {
                    setPixel(x, y, Color.GREEN);
                }
            }
        }
    }

    private void setPixel(int x, int y, Color c) {
        g.setColor(c);
        pixels[x][y] = g.getColor();
        g.drawLine(x, y, x, y);  // Drawing a pixel
    }

    private Color getPixel(int x, int y) {
        // Ensure coordinates are within bounds
        if (x >= 0 && x < 600 && y >= 0 && y < 600) {
            return pixels[x][y];
        }
        return Color.WHITE; // Return a default color if out of bounds
    }

    private void FloodFillAlgo(int x, int y, Color oc, Color nc) {
        Color pc = getPixel(x, y);
        if (pc != null && pc.equals(oc)) {
            setPixel(x, y, nc);
            FloodFillAlgo(x, y - 1, oc, nc);
            FloodFillAlgo(x, y + 1, oc, nc);
            FloodFillAlgo(x - 1, y, oc, nc);
            FloodFillAlgo(x + 1, y, oc, nc);
        }
    }

    public static void main(String[] args) {
        // Create an instance of FloodFillingObject directly
        new FloodFillingObject();
    }
}
