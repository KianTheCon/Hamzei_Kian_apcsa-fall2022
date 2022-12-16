//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private List<String> dir;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		dir = new ArrayList<String>(size);
		for(int i = 0; i < size; i++) add(new Alien((40 * i) + 1, 0));
	}

	public void add(Alien al)
	{
		aliens.add(al);
		dir.add("RIGHT");
	}

	public void drawEmAll( Graphics window )
	{
		for(Alien alien: aliens) {
			alien.draw(window);
		}
	}

	public void moveEmAll()
	{
		
		for(Alien alien: aliens) {
			if(alien.getX() == 800) { dir.set(aliens.indexOf(alien), "LEFT"); alien.setY(alien.getY() + 30);}
			else if(alien.getX() == 0) {dir.set(aliens.indexOf(alien), "RIGHT"); alien.setY(alien.getY() + 30);}
			
			alien.move(dir.get(aliens.indexOf(alien)));
//			alien.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(Ammo shot: shots) {
			for(Alien alien: aliens) {
				if(alien.getX() >= shot.getX() - alien.getWidth() && alien.getX() <= shot.getX() && alien.getY() >= shot.getY() && alien.getY() <= shot.getY()+alien.getHeight()) {
//				if(shot.getY() < alien.getY() + alien.getHeight() &&
//						shot.getY() + shot.getHeight()  > alien.getY() &&
//						shot.getX() < alien.getX() + alien.getWidth() &&
//						shot.getX() + shot.getX() > alien.getX()) {
					aliens.remove(alien);
					shots.remove(shot);
				}
			}
		}
	}
	
	public boolean isTouching(Ship ship) {
		for(Alien alien: aliens) {
			if(alien.getX() >= ship.getX() - alien.getWidth() && alien.getX() <= ship.getX() + ship.getWidth() && alien.getY() >= ship.getY() -alien.getHeight()&& ship.getY() <= ship.getY()+alien.getHeight()) {
				return true;
			}
		}
		return false;
	}
	
	public List<Alien> getList(){
		return aliens;
	}

	public String toString()
	{
		return aliens.toString();
	}
}
