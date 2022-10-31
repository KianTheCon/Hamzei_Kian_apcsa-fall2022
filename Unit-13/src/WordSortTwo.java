

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for(int i = 0, b = 0; i < wordRay.length*2; i++, b = i % wordRay.length) {
			for (int a = 0; a < wordRay.length; a++) {
				if (wordRay[b].charAt(0) <= wordRay[a].charAt(0)) {
					String temp = wordRay[a];
					wordRay[a] = wordRay[b];
					wordRay[b] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(String word: wordRay) {
			output += word + " \n";
		}
		return output+"\n\n";
	}
}