package Top100;

public class RotateImageClockWise {

	static int[][] rotateImage(int[][] a) {
	    
		int N = a.length;
		for(int i =0;i<N/2;i++)
		{
			for(int j = i; j < N-i-1; j++){
	            int temp = a[i][j];
	            a[i][j] = a[N-j-1][i];
	            a[N-j-1][i] = a[N-1-i][N-1-j];
	            a[N-1-i][N-1-j] = a[j][N-1-i];
	            a[j][N-1-i] = temp;
	            System.out.println();
	        }
		}
		
	    return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] =
	        {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
	}

}
