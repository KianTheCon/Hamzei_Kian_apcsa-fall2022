//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x)
	{
		super(x, 150, 10, 10, Color.black);
		speed =5;
	}
	public Paddle(int x,int y)
	{
		super(x, y, 10, 10, Color.black);
		speed =5;
	}
	public Paddle(int x,int y,int w)
	{
		super(x, y, w, 10, Color.black);
		speed =5;
	}
	public Paddle(int x,int y,int w,int h)
	{
		super(x, y, w, h, Color.black);
		speed =5;
	}
	public Paddle(int x,int y,int w,int h, Color c) {
		super(x, y, w, h, c);
		speed =5;
	}
	public Paddle(int x,int y,int w,int h, Color c, int s)
	{
		super(x, y, w, h, c);
		speed = s;
	}







	public void setSpeed(int s) {
		   speed = s;
	}

   public void moveUpAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);


	   setY(getY() + getSpeed());
	   //setY

	   //draw the ball at its new location
	   super.draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   super.draw(window, Color.white);


	   setY(getY() - getSpeed());
	   //setY

	   //draw the ball at its new location
	   super.draw(window);
   }

   //add get methods
   public int getSpeed() {
	   return speed;
   }
   
   
   //add a toString() method
   public String toString() {
	   return super.toString() + " " + speed;
   }
}