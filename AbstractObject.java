import java.awt.Graphics;
import java.awt.Rectangle;


public abstract class AbstractObject {
	protected double myX;   // x and y coordinates of center
    protected double myY;
    protected double myDeltaX;
    protected double myDeltaY;
    
    public AbstractObject()     //default constructor
    {
       myX = 200;
       myY = 200;
       myDeltaX=0;
       myDeltaY=0;
    }
    
    public AbstractObject(double x, double y)
    {
       myX = x;
       myY = y;
    }
    
    public double getX() 
    { 
       return myX;
    }
    public double getY()      
    { 
  	  return myY;
    }

    
    public void setX(double x)
    {
       myX = x;
    } 
    public void setY(double y)
    {
       myY = y;
    } 
    public double getMyDeltaX() {
		return myDeltaX;
	}

	public void setMyDeltaX(double myDeltaX) {
		this.myDeltaX = myDeltaX;
	}

	public double getMyDeltaY() {
		return myDeltaY;
	}

	public void setMyDeltaY(double myDeltaY) {
		this.myDeltaY = myDeltaY;
	}

    public void move()
    {    	
    	myX+=myDeltaX;
    	myY+=myDeltaY;    		
    }
    
    public abstract Rectangle getBounds();
    
    public abstract void draw(Graphics myBuffer);
    
}
