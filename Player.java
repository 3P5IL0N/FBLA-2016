import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


public class Player {
	private double myX;   // x and y coordinates of center
    private double myY;
    private double myDeltaX;
    private double myDeltaY;
    private double mySize;
    private Color myColor;
    private int lives;
    
    public Player()     //default constructor
    {
       myX = 200;
       myY = 200;
       myDeltaX=0;
       myDeltaY=0;
       mySize = 25;
       myColor = Color.RED;
       lives = 3;
    }
    
    public Player(double x, double y, double s, Color c)
    {
       myX = x;
       myY = y;
       mySize = s;
       myColor = c;
       lives = 3;
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
    public void jump(int rightEdge, int bottomEdge)
    {
       // moves location to random (x, y) within the edges
       myX = (Math.random()* (rightEdge-mySize));
       myY = (Math.random()* (bottomEdge-mySize));
    }
    public void move()
    {
    	if(GamePanel.isPressed(KeyEvent.VK_UP) && GamePanel.isPressed(KeyEvent.VK_DOWN))
    		myDeltaY = 0;
    	else if(!GamePanel.isPressed(KeyEvent.VK_UP) && !GamePanel.isPressed(KeyEvent.VK_DOWN))
    		myDeltaY = 0;
    	else if(GamePanel.isPressed(KeyEvent.VK_UP) && !GamePanel.isPressed(KeyEvent.VK_DOWN))
    		myDeltaY = -3;
    	else if(!GamePanel.isPressed(KeyEvent.VK_UP) && GamePanel.isPressed(KeyEvent.VK_DOWN))
    		myDeltaY = 3;  
    	
    	if(GamePanel.isPressed(KeyEvent.VK_RIGHT) && GamePanel.isPressed(KeyEvent.VK_LEFT))
    		myDeltaX = 0;
    	else if(!GamePanel.isPressed(KeyEvent.VK_RIGHT) && !GamePanel.isPressed(KeyEvent.VK_LEFT))
    		myDeltaX = 0;
    	else if(GamePanel.isPressed(KeyEvent.VK_RIGHT) && !GamePanel.isPressed(KeyEvent.VK_LEFT))
    		myDeltaX = 3;
    	else if(!GamePanel.isPressed(KeyEvent.VK_RIGHT) && GamePanel.isPressed(KeyEvent.VK_LEFT))
    		myDeltaX = -3; 
    	
    	myX+=myDeltaX;
    	myY+=myDeltaY; 
    	
    	if(checkCollisions()){
    		myX-=myDeltaX;
    		myY-=myDeltaY;
    	}
    }
    public boolean checkCollisions(){
    	Rectangle playerBounds = GamePanel.p.getBounds();
    	for(Wall wall: GamePanel.walls){
    		Rectangle wallBounds = wall.getBounds();
    		if(wallBounds.intersects(playerBounds)){
    			return true;
    		}
    	}
    	return false;
    }
    private Rectangle getBounds() {
    	return new Rectangle((int)myX, (int)myY, (int)mySize, (int)mySize);
	}

	public void draw(Graphics myBuffer) 
    {
       myBuffer.setColor(myColor);
       myBuffer.fillRect((int)myX,(int)myY,(int)mySize,(int)mySize);
    }
}
