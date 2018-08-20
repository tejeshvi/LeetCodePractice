package Top100;

public class FlippingAnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= new int[][] {{1,1,0},{1,0,1},{0,0,0}};
	}
	public static int[][] flipAndInvertImage(int[][] A) {
		int n =A.length;
		for(int[] row : A)
		{
			for(int i=0;i<n/2;i++)
			{
				if(row[i]==row[n-i-1])
					row[i]=row[n-1-i]^1;
			}
		}
        return A;
    }
}
