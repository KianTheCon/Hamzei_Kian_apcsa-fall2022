//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x, y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x, y, xSpd, ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, Color.black, xSpd, ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, col, xSpd, ySpd);
   }

   public void setXSpeed( int xSpd )
   {
	   super.setXSpeed(xSpd < 0 ? xSpd- 1 : xSpd == 0 ? xSpd : xSpd + 1);//xSpd + 1);
   }

   public void setYSpeed( int ySpd )
   {
	   super.setYSpeed(ySpd < 0 ? ySpd- 1 : ySpd == 0 ? ySpd : ySpd + 1);//ySpd + 1);
   }
}

