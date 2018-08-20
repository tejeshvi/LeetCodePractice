package Top100;

public class JudgeRouteCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean judgeCircle(String moves) {
		int x=0,y=0;
		for(char ch:moves.toCharArray())
		{
			if(ch=='U') x++;
			else if(ch=='D') x--;
			else if(ch=='L') y++;
			else if(ch=='R') y--;
		}
        return x==0 && y==0;
    }
}
