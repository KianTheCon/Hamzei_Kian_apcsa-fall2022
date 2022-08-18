//� A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
	   //Stars Runner code
	   
	   //must make a new object
	   StarsAndStripes ref = new StarsAndStripes();
	   
	   //example method call
	   ref.printTwentyStars();
	   
	   //add more methods calls
	   ref.printTwentyDashes();
	   
	   ref.printTwoBlankLines();
	   
	   for (int i = 0; i < 5; i++) {
		   ref.printASmallBox();
		   ref.printABigBox();
	   }
	   
	   ref.printTwoBlankLines();
	   ref.printTwentyDashes();
	   ref.printTwentyStars();

   }
}