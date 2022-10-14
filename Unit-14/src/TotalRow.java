//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	List<Integer> rowt = new ArrayList<Integer>();
    	for (int i = 0, counter = 0; i < m.length; i++, counter = 0) {
    		for(int a = 0; a < m[i].length; a++) {
    			counter += m[i][a];
    		}
    		rowt.add(counter);
    	}
		return rowt;
    }
}
