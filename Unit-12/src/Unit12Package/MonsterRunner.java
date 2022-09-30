package Unit12Package;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			//ask for name and size
			out.print("Enter 1st monster's name : ");
			String in1 = keyboard.next();
			out.print("Enter 1st monster's size : ");
			int in2 = keyboard.nextInt();
			out.print("Enter 2nd monster's name : ");
			String in3 = keyboard.next();
			out.print("Enter 2nd monster's size : ");
			int in4 = keyboard.nextInt();
			
			//instantiate monster one
			Monster one = new Skeleton(in1, in2);
			//instantiate monster two
			Monster two = new Skeleton(in3, in4);
			
			out.println("\nMonster 1 - " + one);
			out.println("Monster 2 - " + two);
			
			out.println("\nMonster one is " + (one.isBigger(two) ? "bigger": "smaller") + " than Monster two.");
			out.println("Monster one " + (one.namesTheSame(two) ? "has": "does not have") + " the same name as Monster two.\n\n\n");
		}
	}
}