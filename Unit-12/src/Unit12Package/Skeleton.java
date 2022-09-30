package Unit12Package;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;
	
	//add a constructor
	public Skeleton() {
		this("default", 1);
	}
	public Skeleton(String n, int s) {
		setMonster(n, s);
	}
	public void setMonster(String n, int s) {
		setName(n);
		setHowBig(s);
	}
	public void setName(String n) {
		name = n;
	}
	public void setHowBig(int s) {
		size = s;
	}
	
	//add code to implement the Monster interface
	public int getHowBig() {
		return size;
	}
	public String getName() {
		return name;
	}
	public boolean isBigger(Monster other){
		return getHowBig() > other.getHowBig();
	}
	public boolean isSmaller(Monster other) {
		return getHowBig() < other.getHowBig();
		
	}
	public boolean namesTheSame(Monster other) {
		return other.getName().equals(getName());
	}
	
	//add a toString
	public String toString() {
		return getName() + " " + getHowBig();
	}
	
}