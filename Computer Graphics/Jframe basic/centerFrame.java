import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class CenterFrame {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Center Frame on Screen");
        
        // Set size of the frame
        frame.setSize(400, 300); // Width: 400, Height: 300

        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate center position
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;

        // Set the frame location to center
        frame.setLocation(x, y);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
