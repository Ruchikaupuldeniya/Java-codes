import javax.swing.*;
import java.awt.*;

public class DrawFilledShapes extends JFrame {
    public DrawFilledShapes() {
        setTitle("Draw Filled Shapes");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
		
		/* g.setColor(Color.green);
		g.drawLine(40,5,500,250);	// x1, y1, x2, y2
		
		g.setColor(Color.red);
		g.drawString("Hi",200,100);	// word, x, y
		
		g.setColor(Color.blue);
		g.drawRect(40,40,400,200);	// (x, y, width, height) rectangle with no fill
		g.fillRect(50,50,50,50);	// (x, y, width, height) rectangle with fill
		
		g.setColor(Color.yellow);
		g.drawOval(100,100,70,60);	// (x, y, width, height) oval with no fill
		g.fillOval(200,200,70,70);	// (x, y, width, height) oval with fill */
		
		g.setColor(Color.red);
		//g.drawRect(100,100,400,200);
		g.drawArc(100,100,150,150,0,-180);	
		// (x, y, width, height, start_angle, arc_angle) arc with no fill
		/*
		-- A startAngle of 0º points horizontally to the right (3'o clock in the clock).  
		-- Positive is a counterclockwise rotation starting at 0º.
		*/
		
		
		
		//g.fillArc(40,200,80,90,30,140);	
		// (x, y, width, height, start_angle, arc_angle) arc with fill
		
		g.setColor(Color.cyan);
		g.fillRoundRect(400,200,150,40,15,15);	// (x, y, width, height, start_angle, arc_angle) rounded rectangle with fill
		
        /* g.setColor(Color.MAGENTA);
        g.fillRect(50, 50, 200, 100);
        
        g.setColor(Color.CYAN);
        g.fillOval(100, 200, 150, 100); */
    }

    public static void main(String[] args) {
        DrawFilledShapes frame = new DrawFilledShapes();
        //frame.setVisible(true);
    }
}
