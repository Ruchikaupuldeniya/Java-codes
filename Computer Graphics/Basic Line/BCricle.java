import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BCircle extends JFrame implements MouseListener
{
	int x1,x2,r;
	Graphics g;
	
	public BCircle()
	{
		setTitle("Bresanham");
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		g=getGraphics();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		
		
	}
	
	public void Bre(int x1,int y1,int r)
	{
		int x=x1;
		int y=y1;
		int d=3-2*r;
		
		while(x<=y)
		{
			plotCirclePoints(g,x1,x2,x,y);
			x++;
			
			if(d<0)
			{
				d=d+4 *x+6;
			}else
			{
				--y;
				d=d+4*(x-y)+10
			}
		}
	}
	
	public void plotCirclePoints(Graphics g,int x1,int y2,int x,int y)
	{
		g.drawLine(x1 + x,y1+ y,x1 + x,y1+ y);
		g.drawLine(x1 - x,y1+ y,x1 - x,y1+ y);
		g.drawLine(x1 + x,y1- y,x1 + x,y1- y);
		g.drawLine(x1 - x,y1- y,x1 - x,y1- y);
		g.drawLine(x1 + x,y1+ y,x1 + x,y1+ y);
		g.drawLine(x1 - x,y1+ y,x1 - x,y1+ y);
		g.drawLine(x1 + x,y1- y,x1 + x,y1- y);
		g.drawLine(x1 - x,y1- y,x1 - x,y1- y);
		
	}
	
	
	public void mouseEntered(MouseEvent m){}
	public void mousePressed(MouseEvent m)
	{
		
		
	}
	public void mouseClicked(MouseEvent m){}
	public void mouseReleased(MouseEvent m)
	{


	}
	public void mouseExited(MouseEvent m){}
	
	public static void main(String[]args)
	{
		BCircle b=new BCircle();
	}

	
}