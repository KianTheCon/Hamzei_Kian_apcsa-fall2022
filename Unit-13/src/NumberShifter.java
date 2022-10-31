

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] basic = new int[size];
		for(int i = 0; i < size; i++) {
			basic[i] = (int)(Math.random() * 9) + 1;
		}
		return basic;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0,c = 0; i< array.length;i++) {
			if(array[i] == 7) {
				array[i] = array[c];
				array[c++] = 7;
			}
		}
	}
}