import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DDALinee extends JFrame implements MouseListener
{
	int x1,x2,y1,y2;
	Graphics g;
	
	
	public DDALinee()
	{
		setTitle("DDA LINE");
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		g=getGraphics();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int[] x= {200, 250, 225, 175, 150};
        int[] y= {100, 150, 200, 200, 150};
		
		for(int i=0;i<x.length;i++)
		{
			DDA(g,x[i],y[i],x[(i+1)%x.length],y[(i+1)%y.length]);
		}
	}
	
	public void DDA(Graphics g,int x1,int y1,int x2,int y2)
	{
		int dx,dy;
		double steps,xinc,yinc,x,y;
		
		dx=x2-x1;
		dy=y2-y1;
		
		if(Math.abs(dx)>Math.abs(dy))
		{
			steps=Math.abs(dx);
		}else
		{
			steps=Math.abs(dy);
		}
		
		xinc=dx/steps;
		yinc=dy/steps;
		
		x=x1;
		y=y1;
		
		g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y));
		
		for(int i=0;i<steps;i++)
		{
			x=x+xinc;
			y=y+yinc;
			g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(x),(int)Math.round(y));
		}
	}
	public void mouseEntered(MouseEvent m){}
	public void mousePressed(MouseEvent m)
	{
		x1=m.getX();
		y1=m.getY();
		
		
	}
	public void mouseClicked(MouseEvent m){}
	public void mouseReleased(MouseEvent m)
	{
		x2=m.getX();
		y2=m.getY();
		
	}
	public void mouseExited(MouseEvent m){}
	
	public static void main(String[]args)
	{
		DDALine d=new DDALine();
	}
}