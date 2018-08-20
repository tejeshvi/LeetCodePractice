package Top100;

public class PeakIndexInAMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {0,2,3,4,1,0}; 
		System.out.println(A.length +" "+peakIndexInMountainArray(A));
	}
	public static int peakIndexInMountainArray(int[] A) {
     
		int l=0, r=A.length, mid;
		while(l<r)
		{
			mid=(l+r)/2;
			System.out.println(A[mid] +" "+A[mid+1]);
			if(A[mid]<A[mid+1])
				l=mid+1;
			else
				r=mid;			
		}
		return A[l];
    }
}
