//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.toCharArray()[0];
	}

	public char getLastChar()
	{
		return word.toCharArray()[word.length() - 1];
	}

	public String getBackWards()
	{
		String back= "";
		for(int i = 1; i < word.length() + 1; i++) {
			back += word.toCharArray()[word.length() -i];
		}
		return back;
	}

 	public String toString()
 	{
 		
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}