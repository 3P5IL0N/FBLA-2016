
import java.awt.*;
public class CollectableObject extends AbstractObject
{
	private Image img;
	
	 public CollectableObject(double x, double y)
	{
		super(x, y);
		myX = x;
		myY = y;
	}
	 
	 public CollectableObject(double x, double y, Image img)
	{
		super(x, y);
		myX = x;
		myY = y;
		this.img = img;
		
	}
	
	
	public void draw(Graphics myBuffer)
	{

		myBuffer.drawImage(img,(int)myX,(int)myY,null);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle((int)myX,(int)myY,img.getWidth(null),img.getHeight(null));
	}
	

}
