package Assignments;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int count = 0;
		for (int i = 0, f = ray.get(0); i < ray.size(); i++) {
			count += ray.get(i) > f ? ray.get(i): 0;
		}
		return count > 0? count: -1;
	}
}