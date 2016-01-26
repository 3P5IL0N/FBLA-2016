import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public abstract class AbstractObject {
	private double myX;   // x and y coordinates of center
    private double myY;
    private double myDeltaX;
    private double myDeltaY;
    private double mySize;
    private Color myColor; 
    
    public AbstractObject()     //default constructor
    {
       myX = 200;
       myY = 200;
       myDeltaX=0;
       myDeltaY=0;
       mySize = 25;
       myColor = Color.RED;
    }
    
    public AbstractObject(double x, double y, double s, Color c)
    {
       myX = x;
       myY = y;
       mySize = s;
       myColor = c;
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
    public Color getColor() 
    { 
       return myColor;
    }
    
    public double getSize()
    {
    	return mySize;
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

	public void setColor(Color c)
    {
       myColor = c;
    }
    public void setSize(double s)
    {
    	mySize = s;
    }
    public void move()
    {    	
    	myX+=myDeltaX;
    	myY+=myDeltaY;    		
    }
    
    public abstract void draw(Graphics myBuffer);
    
}
