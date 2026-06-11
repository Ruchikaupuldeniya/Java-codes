import javax.swing.*;
import java.awt.*;

public class FirstFrame
{
	public static void main(String[]args)
	{
		JFrame frame=new JFrame();
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First Frame");
		frame.setLocationRelativeTo(null);
	}
}