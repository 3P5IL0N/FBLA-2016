import java.awt.Graphics;

public class Enemy extends AbstractObject {

	public Enemy() {
		 myX = 200;
	     myY = 200;
	     myDeltaX=0;
	     myDeltaY=0;
	}
	
	public Enemy(int myX, int myY, int myDeltaX, int myDeltaY)
	{
		super.myX = myX;
		super.myY = myY;
		super.myDeltaX = myDeltaX;
		super.myDeltaY = myDeltaY;
	}
	
	

	@Override
	public void draw(Graphics myBuffer) {
		// TODO Auto-generated method stub
		
	}

}
