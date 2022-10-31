

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for(;count < number && (number / (int)(Math.pow(10, count)) != 0); count++) {
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
//		for(int i = 1, past = 0, p = 1; i <= sorted.length; i++, p = (int)(Math.pow(10, i))) {
//			sorted[i-1] = number % p - (past * i);
//			past = number % p;
//		}
		
		for(int i = 0; i <sorted.length; i++) {
			sorted[i] = number % 10;
			number = (number/10);
		}
		for(int i = 0; i <sorted.length; i++) {
			for(int a = 0; a <sorted.length; a++) {
				if(sorted[i] < sorted[a]) {
					int temp = sorted[a];
					sorted[a] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		return sorted;
	}
}