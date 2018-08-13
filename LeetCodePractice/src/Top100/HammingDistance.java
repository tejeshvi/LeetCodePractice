package Top100;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1,2));
	}
	public static int hammingDistance(int x, int y) {
		/*Solution 1:
		int xor = x ^ y, count = 0;
	    for (int i=0;i<32;i++) count += (xor >> i) & 1;
	    return count;*/
		
		//Solution 2:
		return Integer.bitCount(x^y);
    }

}
