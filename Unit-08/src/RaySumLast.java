//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	
	public static int go(int[] ray)
	{
		int count = 0;
		for (int i = 0; i<ray.length;i++) count += (ray[i] > ray[ray.length-1]) ? ray[i]: 0;
		return (count > 0)? count: -1;
	}
}