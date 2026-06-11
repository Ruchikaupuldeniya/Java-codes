import javax.swing.JFrame;

public class createJFrame {
    public static void main(String[] args) {
        // Create a new JFrame instance
        JFrame frame = new JFrame("My First JFrame");
        
        // Set the size of the JFrame
        frame.setSize(400, 300); // Width: 400, Height: 300
        
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
