//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	
	//Titled  countOddDigits but the assignment said Count Even Digits, so I just counted the even digits
	public static int countOddDigits(int num)
	{
		


		return num == 0 ? 0 : (num % 2 == 0) ? 1 + countOddDigits((int)(num/10)): 0+countOddDigits((int)(num/10));
	}
}