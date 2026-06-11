import javax.swing.*;
import java.awt.*;

public class DrawRectangle extends JFrame {
    public DrawRectangle() {
        setTitle("Draw Rectangle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 200, 100);
        // g.drawRect(x coordinate, y coordinate, width, height);
		// pictorical representation
		/*
		(0, 0) -------------------------------------> X-axis (Width)
	    |                                           
	    |   (50, 50)                                 
	    |      +-------------------------------------+  (250, 50)
	    |      |                                     |
	    |      |                                     |
	    |      |                                     |  
	    |      |                                     |
	    |      |                                     |
	    |      |                                     |
	    |      +-------------------------------------+
	    |   (50, 150)                               (250, 150)
	    |                                           
	    v                                            
		Y-axis (Height)  
		*/
		//g.fillRect(50,50,200,100);
    }

    public static void main(String[] args) {
        DrawRectangle frame = new DrawRectangle();
        //frame.setVisible(true);
    }
}
