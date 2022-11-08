//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		this(100, 150, 10, 10, Color.black);
	}

	//add other Block constructors - x , y , width, height, color
	public Block(int x)
	{
		this(x, 150, 10, 10, Color.black);
	}
	public Block(int x,int y)
	{
		this(x, y, 10, 10, Color.black);
	}
	public Block(int x,int y,int w)
	{
		this(x, y, w, 10, Color.black);
	}
	public Block(int x,int y,int w,int h)
	{
		this(x, y, w, h, Color.black);
	}
	public Block(int x,int y,int w,int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);
	}
   //add the other set methods
   

   public void setX(int x)
   {
	   xPos = x;
   }
   public void setY(int y)
   {
	   yPos = y;
   }
   public void setPos(int x, int y) {
	   setX(x);
	   setY(y);
   }
   public void setWidth(int w)
   {
	   width = w;
   }
   public void setHeight(int h)
   {
		height = h;
   }
   public void setColor(Color col)
   {
		color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		return this.getClass() == obj.getClass()&& 
				getX() == ((Block) obj).getX() &&
				getY() == ((Block) obj).getY() && 
				getWidth() == ((Block) obj).getWidth() && 
				getHeight() == ((Block) obj).getHeight() && 
				getColor().equals(((Block) obj).getColor()); 
	}   

   //add the other get methods
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}
	

   //add a toString() method  - x , y , width, height, color
	public String toString() {
		return("\n\nx:" + getX() + "\n" + "y:" + getY() + "\n" + "width: " + getWidth() + "\n" + "height: " + getHeight() + "\n" + "color: " + getColor().toString());
	}
}