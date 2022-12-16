//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
//	private Alien alienOne;
//	private Alien alienTwo;

	/* uncomment once you are ready for this part
	 **/
   private AlienHorde horde;
	private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(400, 325, 30, 30, 2);
//		alienOne = new Alien();
//		alienTwo = new Alien();
		horde = new AlienHorde(20);
		shots = new Bullets();
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		graphToBack.setFont(Font.decode("Arial-BOLD-100"));
		
		if(!(horde.isTouching(ship) || horde.getList().size()==0)) {
			
	
			if(keys[0] == true && ship.getX() > 0)
			{
				ship.move("LEFT");
			}
			else if(keys[1] == true && ship.getX() < 800)
			{
				ship.move("RIGHT");
			}
			if(keys[2] == true && ship.getY() > 0)
			{
				ship.move("DOWN");
			}
			else if(keys[3] == true && ship.getY() < 600)
			{
				ship.move("UP");
			}
			if(keys[4] == true) {
				shots.add(new Ammo(ship.getX() + (ship.getWidth()* 3)/8,ship.getY()));
				keys[4] = false;
			}
	
			//add code to move Ship, Alien, etc.
			horde.moveEmAll();
			shots.moveEmAll();
	
			//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
			horde.removeDeadOnes(shots.getList());
			
			ship.draw(graphToBack);
	//		alienOne.draw(graphToBack);
	//		alienTwo.draw(graphToBack);
			shots.drawEmAll(graphToBack);
			horde.drawEmAll(graphToBack);
		}
		
		else if (horde.getList().size()==0) {
			graphToBack.setColor(Color.BLUE);
			graphToBack.drawString("You Win!", 150, 300);
		}
		else if (horde.isTouching(ship)) {
			graphToBack.setColor(Color.RED);
			graphToBack.drawString("You Lose!", 150, 300);
		}
		graphToBack.setColor(getBackground());
		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

