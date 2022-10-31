

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for(int i = 0; i < str.length() && (int)(i/size) < size; i++) {
    		m[(i/size)][i % size] = str.charAt(i) + "";
    	}
    	for(int r = 0; r < m.length; r++) {
    		for(int c = 0; c < m[r].length; c++) {
    			System.out.print(m[r][c] + " ");
    		}
    		System.out.println("");
    	}
    }

    public boolean isFound( String word )
    {
    	for(int r = 0; r < m.length; r++) {
    		for(int c = 0; c < m[r].length; c++) {
    			String now = m[r][c];
    			if (checkRight(word, r, c) || checkLeft(word, r, c) || checkUp(word, r, c) || checkDown(word, r, c) || checkDiagUpRight(word, r, c) || checkDiagUpLeft(word, r, c) || checkDiagDownLeft(word, r, c) || checkDiagDownRight(word, r, c)) {
    				return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		String there = "";
		if(!(c + w.length() >= m.length)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r][c + i];
			}
			return there.equals(w);
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String there = "";
		if(!(c - w.length() < 0)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r][c - i];
			}
			return there.equals(w);
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String there = "";
		if(!(r - w.length() < 0)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r - i][c];
			}
			return there.equals(w);
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String there = "";
		if(!(r + w.length() > m.length)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r + i][c];
			}
			return there.equals(w);
		}
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String there = "";
		if(!(r - w.length() < 0 || c + w.length() > m.length)) {
			for(int i = 0; i < w.length(); i++) {
				there = there + m[r - i][c + i];
			}
			return there.equals(w);
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String there = "";
		if(!(r - w.length() < 0 || c - w.length() < 0)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r - i][c - i];
			}
			return there.equals(w);
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String there = "";
		if(!(r + w.length() > m.length || c + w.length() > m.length)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r + i][c + 1];
			}
			return there.equals(w);
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String there = "";
		if(!(r + w.length() > m.length || c - w.length() < 0)) {
			
			for(int i = 0; i < w.length(); i++) {
				there += m[r + i][c - 1];
			}
			return there.equals(w);
		}
		return false;
	}

    public String toString()
    {
 		return "";
    }
}
