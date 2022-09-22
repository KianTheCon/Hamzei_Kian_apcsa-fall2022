package Assignments;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		boolean counton = ray.get(0) % 2 == 0;
		int countE = 0;
		int countO = 0;
		boolean foundE = false;
		boolean foundO = false;
		for (int i = 0; i < ray.size() && !(foundO && foundE); i++) {
			if(!foundO && ray.get(i) %  2 == 1) {
				countO = (i);
				foundO = true;
			}
			if(!foundE && ray.get(ray.size()-1-i) %  2 == 0) {
				countE = ray.size()-i;
				foundE = true;
			}
		}
		if (foundO) {
			return foundE ? -1 * (countO - countE) -1 : -1;
		}
		else {
			return -1;
		}
	}
}