//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x, y, 10, 10, 5);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x, y, 10, 10, s);
	}

	public Ship(int x, int y, int w, int h, int s) 
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("images/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do somethingz here
			//no
			System.out.println("ship file error");
			e.printStackTrace();
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		switch(direction) {
			case("LEFT"):setX(getX()-speed); break; 
			case("RIGHT"):setX(getX()+speed); break;
			case("UP"):setY(getY()+speed); break;
			case("DOWN"):setY(getY()-speed); break;
			default: break;
		}
			
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
