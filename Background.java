import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Background extends AbstractObject {
	
	private Image i;
	private Tile[][] tiles;
	private int width; //in # of tiles
	private int height; //in # of tiles

	public Background(int width, int height, Image i) { //width is horizontal, height is vertical
		super.myX = 0;
		super.myY = 0;
		super.myDeltaX = 0;
		super.myDeltaY = 0;
		this.i = i;
		this.width = width;
		this.height = height;
		
		i.getScaledInstance(50, 50,Image.SCALE_DEFAULT);
		
		tiles = new Tile[height][width];
		
		for(Tile[] tileRow: tiles){
			for(Tile t: tileRow)
			{
				
			}
		}
		
	}

	@Override
	public Rectangle getBounds() {
		return null;
	}

	@Override
	public void draw(Graphics myBuffer) {
		for(Tile[] tileRow: tiles){
			for(Tile t: tileRow)
				t.draw(myBuffer);
		}

	}

}
