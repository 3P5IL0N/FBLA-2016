import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Tile extends AbstractObject {
	
	private Image i;
	
	public Tile(double x, double y, Image i) {
		super.myX = x;//position compared to origin
		super.myY = y;//position compared to origin
		super.myDeltaX = 0;
		super.myDeltaY = 0;
		this.i = i;
		
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}

	@Override
	public void draw(Graphics myBuffer) {
		myBuffer.drawImage(i,(int)myX,(int)myY,null);

	}

}
