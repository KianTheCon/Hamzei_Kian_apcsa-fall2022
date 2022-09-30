//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		pups[spot] = new Dog(age, name);
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		Arrays.sort(pups, ((x,y) -> x.getAge()-y.getAge()));
		return pups[pups.length-1].getName();
	}

	public String getNameOfYoungest()
	{
		Arrays.sort(pups, ((x,y) -> x.getAge()-y.getAge()));
		return pups[0].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}