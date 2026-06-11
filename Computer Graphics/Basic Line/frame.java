import javax.swing.*;
import java.awt.*;

public class frame extends JFrame
{
	public frame()
	{
		setSize(600,600);
		setTitle("Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g)
	{
		/*g.setColor(Color.BLUE);
		g.drawLine(100,100,150,100);
		g.drawLine(150,100,150,150);
		g.setColor(Color.RED);
		g.drawLine(150,150,100,150);
		g.drawLine(100,150,100,100);
		
		g.drawRoundRect(250,250,200,200,100,100);
		g.fillRoundRect(250,250,200,200,100,100);
		
		g.setColor(Color.BLUE);
		g.drawOval(300,300,50,50);
		g.fillOval(300,300,50,50);
		*/
		int x[]={200,300,250,150,100};
		int y[]={50,150,300,300,150};
		g.drawPolygon(x,y,5);
		/*
		g.drawArc(100,100,100,100,0,90);
		
		g.drawLine(300,100,500,500);
		g.drawLine(500,500,100,500);
		g.drawLine(100,500,300,100);*/
	}
	
	public static void main(String[]args)
	{
		frame f=new frame();
	}
}