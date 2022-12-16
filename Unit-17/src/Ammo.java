//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
		this(0,0,5);
	}

	public Ammo(int x, int y)
	{
		//add code
		this (x, y, 5);
	}

	public Ammo(int x, int y, int s)
	{
		//add code
		super(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   //add code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		//add code to draw the ammo
//		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
		Color temp = window.getColor();
		window.setColor(Color.yellow);
//		window.drawRect(getX(), getY(), getWidth(), getHeight());
		window.fillRect(getX(), getY(), getWidth(), getHeight());
		window.setColor(temp);
	}
	
	
	public void move(String direction )
	{
		//add code to draw the ammo
//		switch(direction) {
//			case("LEFT"):setX(getX()-speed); break; 
//			case("RIGHT"):setX(getX()+speed); break;
//			case("UP"):setY(getY()+speed); break;
//			case("DOWN"):setY(getY()-speed); break;
//			default: break;
//	   }
		setY(getY()-speed);
	}

	public String toString()
	{
		return "";
	}
}
