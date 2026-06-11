import javax.swing.*;
import java.awt.*;

public class DrawOval extends JFrame {
    public DrawOval() {
        setTitle("Draw Oval");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
		//g.drawRect(100,100,150,100);
        g.drawOval(100, 100, 150, 100);
		/*
		Bounding Rectangle: Top-left corner at (100, 100), width of 150 pixels, and height of 100 pixels.
		The oval is drawn to fit exactly within this bounding rectangle.
		*/
		// If the width and height are equal {g.drawOval(x, y, 100, 100);} the oval will be??
	}

    public static void main(String[] args) {
        DrawOval frame = new DrawOval();
        //frame.setVisible(true);
    }
}
