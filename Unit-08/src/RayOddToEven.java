//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		boolean counton = ray[0] % 2 == 1;
		int count = 0;
		for (int i = 0; i < ray.length; i++) {
			if (counton && ray[i] % 2 == 0) {
				counton = false;
				i = ray.length;
			}
			else if (!counton && ray[i] % 2 == 1)
				counton = true;
			if (i == ray.length - 1) {
				count = -1;
				i = ray.length;
			}
			count += counton ? 1: 0;
		}
		return count > 0 ? count : -1;
	}
}