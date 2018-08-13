package Top100;

public class JewelsAndStones {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numJewelsInStones("aA",	"aAAbbbb"));
	}
	public static int numJewelsInStones(String J, String S) {
		//uses regex : [^...] :Matches any single character that is not in the class. 
		//For eg: [^/]* matches zero or more occurrences of any character that is not a forward-slash, such as http://. 
		//Similarly, [^0-9xyz] matches any single character that isn't a digit and isn't the letter x, y, or z.
	    return S.replaceAll("[^" + J + "]", "").length();
	}
}
