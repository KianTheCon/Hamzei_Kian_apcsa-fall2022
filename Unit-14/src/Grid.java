//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int r= 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				grid[r][c] = vals[((int)(Math.random()*vals.length))];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int m = 0;
		int index = 0;
		for (int v= 0, count = 0; v < vals.length; v++, count = 0) {
			count = countVals(vals[v]);
			if(count > m) {
				m = count;
				index = v;
			}
			System.out.println(vals[v] + " count is " + count);
		}
		return vals[index] + " occurs the most";
		
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int r= 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				if (grid[r][c].equals(val))
					count++;
			}
		}
//		System.out.println(val + " count is " + count);
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int r= 0; r < grid.length; r++) {
			for (int c = 0; c < grid[r].length; c++) {
				output += grid[r][c] + " ";
			}
			output += "\n";
		}
		return output;
	}
}