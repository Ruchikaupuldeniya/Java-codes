import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CSClipping extends JFrame implements MouseListener       //Implements MouseListener to handle mouse events for interactive input.
{
	int Xmin=100,Ymin=100,Xmax=400,Ymax=400; //  Define the clipping rectangle boundaries.
	int x1,y1,x2,y2;
	
	boolean oc1[]=new boolean[4]; 
	boolean oc2[]=new boolean[4];
	
	// Outcodes for the endpoints. 
	//Each outcode is a 4-bit boolean array representing whether the point is outside the clipping region.
	

	Graphics g;
	
	CSClipping()
	{
		super("Cohen Sutherland Clipping");
		setSize(500,500);
		addMouseListener(this);  // allows the window to respond to mouse events, such as clicks, presses, and releases. 
		setVisible(true); // Store the endpoints of the line segment.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void paint(Graphics g)
	{
		g=getGraphics();
		g.setColor(Color.red);
		g.drawRect(Xmin,Ymin,(Xmax-Xmin),(Ymax-Ymin)); //  Draws the clipping rectangle in the window.
	}
	
	
	public void mouseClicked(MouseEvent me)	{}
	
	public void mousePressed(MouseEvent me)  // Captures the first endpoint of the line segment when the mouse is pressed.
	{
		x1=me.getX();
		y1=me.getY();		
	}
	public void mouseReleased(MouseEvent me)
	{
		x2=me.getX();
		y2=me.getY();
		Clip(); // Captures the second endpoint of the line when the mouse is released and starts the clipping process by calling  Clip ()
	}
	
	public void mouseEntered(MouseEvent me)	{}	// hange the cursor or highlight a component when the mouse enters or exits the JFrame.
	public void mouseExited(MouseEvent me)	{}
	public void mouseDragged(MouseEvent me)	{}  // Could be used to allow the user to draw lines dynamically while dragging the mouse.
	public void mouseMoved(MouseEvent me)	{}  // Useful for displaying real-time coordinates or performing hover effects.

// mousePressed and mouseReleased for handling the line drawing and clipping functionality.



	public void Clip()  // Implements the Cohen-Sutherland logic to clip the line
	{
		g=getGraphics();
		boolean accept,reject,done;
		accept=false;
		reject=false;
		done=false;
		
		while(!done)
		{
			oc1=getoutcode(x1,y1);	
			oc2=getoutcode(x2,y2);
			reject=rejectCheck(oc1,oc2); 
			accept=acceptCheck(oc1,oc2);
			if(reject)
				done=true;
			else if(accept)
			{
				done=true;
				g.drawLine(x1,y1,x2,y2);
			}
			else 
			{
				if(!(oc1[0]||oc1[1]||oc1[2]||oc1[3]))
				swap();
				if(oc1[0])
				{
					x1+=(x2-x1)*(Ymax-y1)/(y2-y1);
					y1=Ymax;
				}
				else if(oc1[1])
				{
					
					x1+=(x2-x1)*(Ymin-y1)/(y2-y1);
					y1=Ymin;
				}
				else if(oc1[2])
				{
					y1+=(y2-y1)*(Xmax-x1)/(x2-x1);
					x1=Xmax;
				}
				else if(oc1[3])
				{
					y1+=(y2-y1)*(Xmin-x1)/(x2-x1);
					x1=Xmin;
				}
			}
		}
	}
	
	public boolean[] getoutcode(int x,int y) // // Get the outcodes for both endpoints using getoutcode method
	{
		boolean oc[]=new boolean[4];
		if(y>Ymax) oc[0]=true;
		if(y<Ymin) oc[1]=true;
		if(x>Xmax) oc[2]=true;
		if(x<Xmin) oc[3]=true;
		
		
		return oc;
	}
	
	public boolean rejectCheck(boolean[] oc1,boolean[] oc2)   // Check if the line is completely outside using rejectCheck method
	{
		boolean rej=false;
		for(int i=0;i<4;i++)
		{
			if(oc1[i] && oc2[i]) 
				rej=true;
		}
		return rej;
	}
	
	public boolean acceptCheck(boolean[] oc1,boolean[] oc2) // Check if the line is completely or partically inside using 
	{
		boolean acc=true;
		for(int i=0;i<4;i++)
		{
			if(oc1[i]||oc2[i]) 
				acc=false;
		}
		return acc;
	}
	
	public void swap()
	{
		int temp;
		temp=x1;x1=x2;x2=temp;
		temp=y1;y1=y2;y2=temp;
		boolean[] tempoc=new boolean[4];
		for(int i=0;i<4;i++)
		{
			tempoc[i]=oc1[i];
			oc1[i]=oc2[i];
			oc2[i]=tempoc[i];
		}
	}
	
	public static void main(String [] args)
	{
		CSClipping a=new CSClipping();	
	}
	
}