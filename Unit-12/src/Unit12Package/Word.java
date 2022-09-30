package Unit12Package;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		setWord(s);
	}
	public void setWord(String s) {
		word = s;
	}

	public int compareTo( Word rhs )
	{	
		if(rhs.toString().length() == toString().length()) return toString().compareTo(rhs.toString());
		return rhs.toString().length() > toString().length() ? -1: 1;
	}

	public String toString()
	{
		return word;
	}
}