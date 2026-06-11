import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bresanham extends JFrame implements MouseListener
{int x1,x2,y1,y2;
	Graphics g;
	
	public Bresanham()
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
		
		
		Bre(50,50,200,200);
	}
	
	public void Bre(int x1,int y1,int x2,int y2)
	{
		int dx,dy,x,y,pk;
		
		dx=x2-x1;
		dy=y2-y1;
		x=x1;
		y=y1;
		
		pk=2*dy-dx;
		
		for(int i=x;i<=x2;i++)
		{
			if(pk<0)
			{
				pk= pk + 2*dy;
				x=x+1;
				y=y;
			}else
			{
				pk=pk+2*dy-dx;
				x=x+1;
				y=y+1;
			}
			g.drawLine(x,y,x,y);
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
		Bresanham b=new Bresanham();
	}

	
}