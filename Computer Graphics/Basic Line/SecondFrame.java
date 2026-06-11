import javax.swing.*;
import java.awt.*;

public class SecondFrame extends JFrame
{
	public SecondFrame()
	{
		setSize(600,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Second Frame");
		setLocationRelativeTo(null);
	}
	
	@Override
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawLine(100,100,200,100);
		g.drawLine(200,100,200,200);
		g.drawLine(200,200,100,200);
		g.drawLine(100,200,100,100);
		
		g.drawRect(150,150,200,200);
		//g.fillRect(120,120,100,100);
		g.drawRoundRect(120,120,100,100,50,50);
		g.drawOval(100,100,50,50);
		
	}
	
	public static void main(String []args)
	{
		SecondFrame frame=new SecondFrame();
		
	}
}