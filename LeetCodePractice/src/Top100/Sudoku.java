
package Top100;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean sudoku2(char[][] grid) {
		
	    if (grid == null || grid.length != 9 || grid[0].length != 9)
			return false;
	    for(int i=0;i<9;i++)
	    {
	    	for(int j=0;j<9;j++)
	    	{
	    		if(grid[i][j]=='.')
	    		{
	    			for(int k =1;k<=9;i++)
	    			{
	    				grid[i][j]=(char) k;
	    				if(isValid(grid, i ,j, k))
	    				{
	    					return true;
	    				}
	    				grid[i][j]='.';
	    			}
	    			return false;
	    		}
	    	}
	    }
	    return true;
	}
	private boolean isValid(char[][] grid, int i, int j, int k) {
		// TODO Auto-generated method stub
		return false;
	}

}
