import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends JFrame implements MouseListener
{
	int x1,x2,y1,y2;
	Graphics g;
	
	public Mouse()
	{
		setSize(500,500);
		setVisible(true);
		setTitle("Mouse event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		g=getGraphics();
	}
	
	public void mouseEntered(MouseEvent m){}
	
	public void mousePressed(MouseEvent m)
	{
		x1=m.getX();
		y1=m.getY();
	}
	
	public void mouseClicked(MouseEvent m)
	{
		g.drawOval(x1,y1,100,100);
	}
	
	public void mouseReleased(MouseEvent m)
	{
		x2=m.getX();
		y2=m.getY();
		g.drawLine(x1,y1,x2,y2);
	}
	
	public void mouseExited(MouseEvent m){}
	
	
	public static void main(String[]args)
	{
		Mouse m=new Mouse();
	}
}