package Top100;

public class ProjectionAreaOf3DShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= new int[][] {{3,2},{3,4}};
		System.out.println(projectionArea(grid));
		
	}
	public static int projectionArea(int[][] grid) {
		int z = 0, x = 0, y = 0;
		System.out.println(grid.length);
		for(int i=0;i<grid.length; i++)
		{
			int mx = 0, my = 0;
			for(int j=0;j<grid.length;j++)
			{
				System.out.println("i:"+i+"j:"+j);
				mx=Math.max(mx, grid[j][i]);
				System.out.println("grid[j][i]:"+grid[j][i]+" mx:"+mx);
				my=Math.max(my, grid[i][j]);
				System.out.println("grid[i][j]:"+grid[i][j]+" my:"+my);
				if (grid[i][j] > 0) { 
						++z; }
			}
			x += mx; y += my;
		}
		System.out.println("x:"+x+" y:"+y+" z:"+z);
        return x + y + z;        
    }
}
