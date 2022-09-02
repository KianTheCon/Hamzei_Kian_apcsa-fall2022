//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		int c = 0;
		int num = 0;
		
		for (int b = amount; b > 0; b--) {
			for (int i = 0; i < b; i++) {
				for (int a = amount - i; a > 0; a--) {
					num = !((int)(letter) + i > 90) ? (int)(letter) + i : (int)(letter) + i - 26;
					output = output.concat((char)(num) + "");
					
				}
				output += " ";
			}
			output += "\n";
		}
		
		return output;
	}
}