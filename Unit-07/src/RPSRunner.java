//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		
		//add in a do while loop after you get the basics up and running
		RockPaperScissors game = new RockPaperScissors();	
		do {
			String player = "";
		
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			response = keyboard.next();
			game.setPlayers(response);
			//read in the player value
			out.println(game);
			out.print("Do you want to play again? ");
		}while (keyboard.next().equals("y"));
	}
}



