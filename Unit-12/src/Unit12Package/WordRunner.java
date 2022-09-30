package Unit12Package;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/Unit12Package/words.dat"));
		int size = file.nextInt();
		Word[] words = new Word[size];
		for(int i = 0; i < size; i++) {
			words[i] = new Word(file.next());
			file.nextLine();
		}
//		boolean sorted = false;
//		while (!sorted) {
//			sorted = true;
//			for(int i = 0; i < size-1; i++) {
//				if(words[i].compareTo(words[i + 1]) == 1) {
//					Word temp = words[i + 1];
//					words[i+1] = words[i];
//					words[i] = temp;
//					sorted = false;
//				}
//			
//		}
//		
		Arrays.sort(words);
		out.print(Arrays.toString(words).replaceAll("\\[|\\]|(, )", "\n"));











	}
}