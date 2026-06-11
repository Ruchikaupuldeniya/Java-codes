import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DDALinee extends JFrame implements MouseListener
{
	int x[]={400,47,500};
	int y[]={400,350,400};
	
	int[] reflectedXOverX = new int[3];
	int[] reflectedYOverX = new int[3];
	
	int[] reflectedXOverY = new int[3];
	int[] reflectedYOverY = new int[3];
	
	int[] reflectedXOverOrigin = new int[3];
	int[] reflectedYOverOrigin = new int[3];
	
	Graphics g;
	public DDALinee()
	
	
	
	{
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		g=getGraphics();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		DDA(400,400,475,350);
		DDA(475,350,500,400);
		DDA(500,400,400,400);
		
		 g2d.translate(getWidth() / 2, getHeight() / 2);
        g2d.drawLine(-getWidth() / 2, 0, getWidth() / 2, 0); // X-axis
        g2d.drawLine(0, -getHeight() / 2, 0, getHeight() / 2); // Y-axis

        // Draw original triangle
        g.setColor(Color.BLUE);
        g.drawPolygon(xPoints, negateCoordinates(yPoints), 3);

        // Draw reflection over x-axis
        g.setColor(Color.RED);
        g.drawPolygon(reflectedXOverX, negateCoordinates(reflectedYOverX), 3);

        // Draw reflection over y-axis
        g.setColor(Color.GREEN);
        g.drawPolygon(reflectedXOverY, negateCoordinates(reflectedYOverY), 3);

        // Draw reflection over origin
        g.setColor(Color.MAGENTA);
        g.drawPolygon(reflectedXOverOrigin, negateCoordinates(reflectedYOverOrigin), 3);
	}
	
	public void DDA(int x1,int y1,int x2,int y2)
	{
		int dx,dy;
		float steps,xinc,yinc,x,y;
		
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
	
	public void reflection()
	{
		for(int i=0;i<x.Length;i++)
		{
			reflectedXOverX[i]=x[i];
			reflectedYOverX[i]=-y[i];
		}
		
		for(int i=0;i<x.Length;i++)
		{
			reflectedXOverY[i]=-x[i];
			reflectedYOverY[i]=y[i];
		}
		
		for(int i=0;i<x.Length;i++)
		{
			reflectedXOverOrigin[i]=-x[i];
			reflectedYOverOrigin[i]=-y[i];
		}
		
	}
	
	 private int[] negateCoordinates(int[] coords) {
        int[] negated = new int[coords.length];
        for (int i = 0; i < coords.length; i++) {
            negated[i] = -coords[i];
        }
        return negated;
    }

	
	
	
	
	
	public void mouseEntered(MouseEvent m){}
	
	public void mousePressed(MouseEvent m)
	{
	}
	
	public void mouseClicked(MouseEvent m)
	{
	}
	
	public void mouseReleased(MouseEvent m)
	{
	}
	
	public void mouseExited(MouseEvent m){}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String []args)
	{
		DDALinee a=new DDALinee();
	}
}
