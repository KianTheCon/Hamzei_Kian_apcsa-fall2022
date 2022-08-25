//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		StringOddOrEven test = new StringOddOrEven();
		for (int i = 0; i < 8; i++) {
			out.print("Enter a word :: ");
			test.setString(keyboard.next());
			out.println(test);
		}
	}
}