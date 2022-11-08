//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import static java.lang.System.out;

import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;


	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall();
		ball.setXSpeed(2);
//		out.println(ball);
		
		leftPaddle = new Paddle(10,10,10,60, Color.yellow);
		
//		leftPaddle.setSpeed(7);
//		out.println(leftPaddle);
		
		rightPaddle = new Paddle(770,10,10,60, Color.green);
//		rightPaddle = new Paddle(650,10,60,60, Color.green);
//		rightPaddle.setSpeed(7);
//		out.println(rightPaddle);
		
		leftScore = 0;
		rightScore = 0;


		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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

		graphToBack.drawRect(0, 0, 790, 560);
		graphToBack.setColor(getBackground());
		graphToBack.fillRect(340, 0, 100, 20);
		graphToBack.setColor(Color.black);
		graphToBack.drawString("Left: " + leftScore + " Right: " + rightScore, 340, 10);
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);



		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10))
		{
			rightScore++;
			ball.draw(graphToBack, getBackground());
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {};
			
			ball.setPos(170 , 260);
			ball.setYSpeed(2);
			ball.setXSpeed(-2);
		}
		if(!(ball.getX()<=770))
		{
			leftScore++;
			ball.draw(graphToBack, getBackground());
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {};
			
			ball.setPos(510 , 260);
			ball.setYSpeed(2);
			ball.setXSpeed(-2);
		}
		

		if(!(ball.getY()>=10 && ball.getY()<=550))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}
		




		//see if the ball hits the left paddle
		if (ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())&&
				(ball.getY() >= leftPaddle.getY() &&
				ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight() ||
				ball.getY() + ball.getHeight() >= leftPaddle.getY() &&
				ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()
				)) {
			// commented logic doesn't work right, Mr Mauro said to just leave as the set Speed to * -1
//			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed())) {
//				ball.setYSpeed(ball.getYSpeed() * -1);
//			}
//			else {
				ball.setXSpeed(ball.getXSpeed() * -1);
//			}
		}
		
		
		//see if the ball hits the right paddle
		if((ball.getX() + ball.getWidth() >= rightPaddle.getX() - Math.abs(ball.getXSpeed())) &&
				(ball.getY() - ball.getHeight() >= rightPaddle.getY()&&
				ball.getY() - ball.getHeight() <= rightPaddle.getY()+rightPaddle.getHeight()||
				ball.getY() + ball.getHeight()>= rightPaddle.getY()&&
				ball.getY() + ball.getHeight()<= rightPaddle.getY()+rightPaddle.getHeight())
				)
		{
			// commented logic doesn't work right, Mr Mauro said to just leave as the set Speed to * -1
//			if(ball.getX() + ball.getWidth() >= rightPaddle.getX() + Math.abs(ball.getXSpeed())) {
//				ball.setYSpeed(ball.getYSpeed() * -1);
//			}
//			else {
				ball.setXSpeed(ball.getXSpeed() * -1);
//			}
			
		}
		
		


		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			if(leftPaddle.getY()+leftPaddle.getHeight()<=550)
			{
				leftPaddle.moveUpAndDraw(graphToBack);
			}
			
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			if(leftPaddle.getY()>=10)
			{
				leftPaddle.moveDownAndDraw(graphToBack);
			}


		}
		if(keys[2] == true)
		{
			
			if(rightPaddle.getY()+rightPaddle.getHeight()<=550)
			{
				rightPaddle.moveUpAndDraw(graphToBack);
			}

		}
		if(keys[3] == true)
		{
			
			if(rightPaddle.getY()>=10)
			{
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}














		
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}