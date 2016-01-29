import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Enemy extends AbstractObject {
	
	protected int myWidth;
	protected int myHeight;
	private Color myColor;
	protected int myHealth;
	
	public Enemy(int myX, int myY, int myWidth, int myHeight)
	{
		super.myX = myX;
		super.myY = myY;
		super.myDeltaX = myDeltaX;
		super.myDeltaY = myDeltaY;
		this.myWidth = myWidth;
		this.myHeight = myHeight;
		myColor = Color.BLACK;
		myHealth = 100;
	}
	
	public int getHealth()
	{
		return myHealth;
	}
	
	public void setHealth(int myHealth)
	{
		this.myHealth = myHealth;
	}

	@Override
	public void draw(Graphics myBuffer) {
		
		myBuffer.setColor(myColor);
		
		myBuffer.fillRect((int)myX, (int)myY, myWidth, myHeight);
		
		/*Graphics2D g2d = (Graphics2D) myBuffer.create();
		
		Rectangle thisEnemy = new Rectangle((int)myX, (int)myY, myWidth, myHeight);
		
		g2d.setColor(myColor);
		
		g2d.draw(thisEnemy);
		
		g2d.dispose();*/
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle((int)myX, (int)myY, myWidth, myHeight);
	}

}
