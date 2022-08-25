//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
//		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
//		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a whole number :: ");
		int input = keyboard.nextInt();
		System.out.println(input + " is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input + " is even :: " + NumberVerify.isEven(input) + "\n");
		
		System.out.print("Enter a whole number :: ");
		input = keyboard.nextInt();
		System.out.println(input + " is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input + " is even :: " + NumberVerify.isEven(input) + "\n");
		
		System.out.print("Enter a whole number :: ");
		input = keyboard.nextInt();
		System.out.println(input + " is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input + " is even :: " + NumberVerify.isEven(input) + "\n");
		
		System.out.print("Enter a whole number :: ");
		input = keyboard.nextInt();
		System.out.println(input + " is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input + " is even :: " + NumberVerify.isEven(input) + "\n");
		
		System.out.print("Enter a whole number :: ");
		input = keyboard.nextInt();
		System.out.println(input + " is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input + " is even :: " + NumberVerify.isEven(input) + "\n");

		
		//add in more test cases
	}
}