import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HandleClosingEvent {
    public static void main(String[] args) {
        // Create a JFrame instance
        JFrame frame = new JFrame("Handle Closing Events");

        // Set size of the frame
        frame.setSize(400, 300);

        // Add a window listener to handle closing events
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Show a confirmation dialog
                int response = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to close?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION
                );

                // Close frame only if user confirms
                if (response == JOptionPane.YES_OPTION) 
		{
            		System.exit(0); // Exit the application if "Yes" is selected
        	} 
		else
		 {
            // Do nothing, and the window remains open
            frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        	}
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
