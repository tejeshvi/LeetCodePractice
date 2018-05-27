package AlgorithmEasy;

public class reverseInteger {
/*	public int reverse(int x) {
		if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE) return 0;
		int reverseX = 0;
		int sign=1;
		if(x<0) {
			sign=-1;
		 	x=-x;	
		}
		while(x>0)
		{
			reverseX=reverseX*10+(x%10);
			if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE) return 0;
			x=x/10;
		}
		return reverseX*sign;
	}*/
	public int reverse(int x) {
        long res = 0;
        for (; x != 0; x /= 10)
            res = res * 10 + x % 10;
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
