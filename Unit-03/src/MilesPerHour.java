//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		calcMPH();
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		float time = hours + (float)minutes/60;
		mph = distance/time;
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return String.format(distance + " miles in " + hours + " hours and " + minutes + " minutes = %.0f MPH\n", mph);
//		return String.format("%.3f miles in %.3f hour and %.3f minutes = %.3f MPH", distance, hours, minutes, mph);
	}
}