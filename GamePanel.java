import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GamePanel extends JPanel implements KeyListener, MouseListener {
	private static final long serialVersionUID = 4798445055965105091L;
	
	private BufferedImage myImage;
	private Graphics2D myBuffer;
	private Timer t;
	
	 static ArrayList<Wall> walls = new ArrayList<Wall>(); 
	 static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	 static ArrayList<CollectableObject> objects = new ArrayList<CollectableObject>();
	 
	 static Player p; 
	private CollectableObject c;
	private Enemy en;
	private Wall w;
	
	private static final int FRAME = 800;
	private static final Color BACKGROUND = new Color(255, 255, 255);
	
	private static boolean [] keysPressed = new boolean[525];
	
	public GamePanel()
	{
		myImage = new BufferedImage(FRAME,FRAME, BufferedImage.TYPE_INT_RGB);
		myBuffer = (Graphics2D) myImage.getGraphics();
		myBuffer.setColor(BACKGROUND);
		myBuffer.fillRect(0,0,FRAME,FRAME);
		
		this.addMouseListener(this);
		Driver.frame.addKeyListener(this);
		Arrays.fill(keysPressed, false);
		
		p = new Player();
		en = new Enemy(600,200,20,20);
		w = new Wall(400,200,50,50,new Color(100,0,0));
		c = new CollectableObject(300,300, new ImageIcon("Ladder.png").getImage());
		
		walls.add(w);
		enemies.add(en);
		objects.add(c);
		
		t = new Timer(16, new Listener());
		t.start();
	}
	
	public void paintComponent(Graphics g)
	{
		
		g.drawImage(myImage,0,0, getWidth(), getHeight(),null);
	}
	
	private class Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
		
			myBuffer.setBackground(BACKGROUND);
			myBuffer.clearRect(0, 0, FRAME, FRAME);
			
			p.move();
			p.draw(myBuffer);
			w.draw(myBuffer);	
			c.draw(myBuffer);	
			en.draw(myBuffer);
			
			repaint();
		}
	}
	

	public static boolean isPressed(int key) {
		return keysPressed[key];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		keysPressed[e.getKeyCode()] = true;		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keysPressed[e.getKeyCode()] = false;		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
