

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		int[] a = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(a));
		NumberShifter.shiftEm(a);
		System.out.println(Arrays.toString(a) + "\n");
		
		a = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(a));
		NumberShifter.shiftEm(a);
		System.out.println(Arrays.toString(a) + "\n");
		
		a = NumberShifter.makeLucky7Array(20);
		System.out.println(Arrays.toString(a));
		NumberShifter.shiftEm(a);
		System.out.println(Arrays.toString(a) + "\n");
		
	}
}



