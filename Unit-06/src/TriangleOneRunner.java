//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		TriangleOne test = new TriangleOne("hippo");
		out.println(test);
		test.setWord("abcd");
		out.println(test);
		test.setWord("it");
		out.println(test);
		test.setWord("a");
		out.println(test);
		test.setWord("chicken");
		out.println(test);
	}
}