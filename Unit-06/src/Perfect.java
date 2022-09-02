//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	 setNum(0);  
   }
   public Perfect(int n) {
	   setNum(n);
   }
	//add a set method
   	public void setNum(int n){
   		number = n;
   	}
   	
	public boolean isPerfect()
	{
		int total = 0;
		for (int i = 1; i<number; i++) {
			if (number % i == 0)
			{
				total += i;
			}
		}
		return (total == number);
	}

	//add a toString	
	public String toString() {
		return number + " is " + (!isPerfect() ? "not " : "") + "perfect";
	}
	
}