//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import static java.lang.System.*;
public class SumLastRunner
{
	public static void main( String args[] )
	{											
		RaySumLast test = new RaySumLast();
		int[] array = {-99,1,2,3,4,5,6,7,8,9,10,5};
		out.println(test.go(array));
	
		int[] arraya = {10,9,8,7,6,5,4,3,2,1,-99};
		out.println(test.go(arraya));
		int[] arrayb = {10,20,30,40,50,-11818,40,30,20,10};
		out.println(test.go(arrayb));
		int[] arrayc = {32767};
		out.println(test.go(arrayc));
		int[] arrayd = {255,255};
		out.println(test.go(arrayd));
		int[] arraye = {9,10,-88,100,-555,2};
		out.println(test.go(arraye));
		int[] arrayf = {10,10,10,11,456};
		out.println(test.go(arrayf));
		int[] arrayg = {-111,1,2,3,9,11,20,1};
		out.println(test.go(arrayg));
		int[] arrayh = {9,8,7,6,5,4,3,2,0,-2,6};
		out.println(test.go(arrayh));
		int[] arrayi = {12,15,18,21,23,1000};
		out.println(test.go(arrayi));
		int[] arrayj = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		out.println(test.go(arrayj));
		int[] arrayk = {9,10,-8,10000,-5000,-3000};
		out.println(test.go(arrayk));
		
	}
}