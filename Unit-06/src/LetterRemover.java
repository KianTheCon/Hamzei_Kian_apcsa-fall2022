//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("", ' ');
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = "";
		int prev = 0;
		for (int i = 0; i<sentence.length(); i++) {
			if (sentence.toCharArray()[i] == lookFor){
				cleaned = cleaned.concat(sentence.substring(prev, i));
				prev = i+1;
			}
		}
		return cleaned.concat(sentence.substring(prev));
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}