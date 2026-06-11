import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class FloodFillAlgorithm extends JFrame implements MouseListener
{
	int x1,y1,x2,y2,r; // Coordinates for drawing and handling mouse events.
	Graphics g; // Used to draw shapes and objects on the window.
	Color [][]p=new Color[800][800]; // A 2D array representing the canvas's pixel colors. This is used to store the color of each pixel for flood-filling.
	
	
	FloodFillAlgorithm(){
		setTitle("Flood Fill Algorithm Implementation");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
		g=getGraphics();		
	}
	public void paint(Graphics g){
		drawObject(200,200);
	}
	public Color getPixel(int x,int y){ // Retrieves the color of a specific pixel at (x, y) from the p array.
		return p[x][y];
	}
	
	public void setPixel(int x,int y,Color c){
		g.setColor(c);        // method sets the drawing color to c.
		p[x][y]=g.getColor(); // Sets a pixel's color at (x, y) in the p array and draws a small oval (1x1 pixel size) at that position.
		g.drawOval(x,y,1,1);
	}
	
	public void drawObject(int x1,int y1){
		int x,y;
		for(x=x1;x<x1+40;x++)	// First green rectangle (top-left quadrant)	
			for(y=y1;y<y1+40;y++)			
				setPixel(x,y,Color.green);
		
		for(x=x1+40;x<x1+80;x++)  // Second green rectangle (top-right quadrant)	
			for(y=y1;y>y1-40;y--)			
				setPixel(x,y,Color.green);
			
		for(x=x1;x<x1+40;x++)	 // Third green rectangle (bottom-left quadrant)
			for(y=y1-40;y>y1-80;y--)			
				setPixel(x,y,Color.green);
			
		for(x=x1;x>x1-40;x--)	// Fourth green rectangle (bottom-right quadrant)
			for(y=y1;y>y1-40;y--)			
				setPixel(x,y,Color.green);
		
			
	}
	
	public void floodfill4(int Xi,int Yi,Color OC,Color NC){
		Color pc=getPixel(Xi,Yi);
		if(pc==OC){
			setPixel(Xi,Yi,NC);
			floodfill4(Xi,Yi-1,OC,NC);
			floodfill4(Xi,Yi+1,OC,NC);
			floodfill4(Xi-1,Yi,OC,NC);
			floodfill4(Xi+1,Yi,OC,NC);
		}
	}
	
	public void mouseClicked(MouseEvent me){		
		
		x1=me.getX();
		y1=me.getY();
		floodfill4(x1,y1,Color.green,Color.red);
		
	}
	
/*	
Captures the mouse click coordinates (x1, y1).
Calls the floodfill4 method to fill the clicked area with red (Color.red) starting from the clicked pixel,
replacing green (Color.green).
*/	
	
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	
	public static void main(String args[]){
		FloodFillAlgorithm FFF=new FloodFillAlgorithm();
	}
}


/*

The algorithm starts with a seed pixel (center white pixel in this case).
It checks the pixels 4-connected to the seed (up, down, left, and right).
If the neighboring pixel is the same color as the starting pixel and isn't already filled, it is filled with the specified color (green in this image).
This process continues recursively or iteratively until no more connected pixels meet the conditions.
In 4-connected filling, the algorithm fills pixels only in the four cardinal directions (up, down, left, right).
The diagonal pixels are not considered.

he green pixels around the central white square represent the filled areas.
Only the 4-connected neighbors to the white square have been filled.


*/