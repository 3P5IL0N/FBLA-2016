import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Wall extends AbstractObject {
	protected double myWidth;
	protected double myHeight;
	protected Color myColor;
	public Wall() {
		myWidth = 10;
		myHeight = 10;
	}

	public Wall(double x, double y) {
		super(x, y);
		myX = x;
		myY = y;
	}
	public Wall(double x, double y, double w, double h, Color c) {
		super(x, y);
		myX = x;
		myY = y;
		myWidth = w;
		myHeight = h;
		myColor = c;
	}

	@Override
	public void draw(Graphics myBuffer) {
		// TODO Auto-generated method stub
		myBuffer.setColor(myColor);
		myBuffer.fillRect((int)myX,(int)myY,(int)myWidth,(int)myHeight);
	}
	
	@Override
	public Rectangle getBounds()
	{
		return new Rectangle((int)myX, (int)myY, (int)myWidth, (int)myHeight);
	}

}
