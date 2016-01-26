import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public abstract class AbstractObject {
	private double myX;   // x and y coordinates of center
    private double myY;
    private double myDeltaX;
    private double myDeltaY;
    private double mySize;
    
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
       //_______________
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
    
    public abstract void draw(Graphics myBuffer);
    
}
