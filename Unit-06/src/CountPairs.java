//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 1; i < str.length(); i++) {
			if (ch[i - 1] == ch[i]) {
				count++;
			}
		}
		return count;
	}
}