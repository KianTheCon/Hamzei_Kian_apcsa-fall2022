//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player.equals("R") ? "Rock" : player.equals("P") ? "Paper" : player.equals("S") ? "Scissors" : "Unknown";
		int compnum = (int)(Math.random()*3);
		switch (compnum) 
		{
			case 0: compChoice = "Rock"; break;
			case 1: compChoice = "Paper"; break;
			case 2: compChoice = "Scissors"; break;
		}
	}

	public String determineWinner()
	{
		String combo = playChoice.substring(0, 1) + compChoice.substring(0, 1);
		if (combo.equals("PR") || combo.equals("SP") || combo.equals("RS")) {
			return "Player";
		}
		return "Computer";
	}

	public String toString()
	{

		String winChoice = determineWinner().equals("Player")? playChoice : compChoice;
		String loseChoice = determineWinner().equals("Player")? compChoice : playChoice;
		String beat = "";
		switch(winChoice) {
			case("Rock"): beat = " Breaks "; break;
			case("Paper"): beat = " Covers "; break;
			case("Scissors"): beat = " Cuts "; break;
		}
		
		String output="player had " + playChoice.substring(0, 1) + "\n" +
					  "computer had " + compChoice.substring(0, 1) + "\n!" + ((!playChoice.equals(compChoice)) ? (	
					  determineWinner() + " wins <<" + winChoice + beat + loseChoice + ">>!") : "Draw Game!");
		return output;
	}
}