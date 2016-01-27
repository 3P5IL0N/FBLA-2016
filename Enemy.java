import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Enemy extends AbstractObject {
	
	protected int myWidth;
	protected int myHeight;
	protected Color myColor;
	protected int myHealth;
	
	public Enemy(int myX, int myY, int myDeltaX, int myDeltaY)
	{
		super.myX = myX;
		super.myY = myY;
		super.myDeltaX = myDeltaX;
		super.myDeltaY = myDeltaY;
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
		
		Graphics2D g2d = (Graphics2D) myBuffer.create();
		
		Rectangle thisEnemy = new Rectangle((int)myX, (int)myY, myWidth, myHeight);
		
		g2d.draw(thisEnemy);
		
		g2d.dispose();
	}

}
