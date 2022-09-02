//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a, b ,c ,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double big = 0.0;
		big = (one<big) ? big: one;
		big = (two<big) ? big: two;
		big = (three<big) ? big: three;
		big = (four<big) ? big: four;
		return big;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four  + "\nbiggest = " + getBiggest() + "\n";
	}
}