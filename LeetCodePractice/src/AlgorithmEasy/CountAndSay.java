package AlgorithmEasy;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		String str = "1";
		if (n == 1)
			System.out.println("1");
		else {
			while (n > 0) {
				String newstr = "";
				int counter = 1;
				int strlength = str.length();
				for (int i = 1; i < strlength; i++) {
					if (str.charAt(i) == str.charAt(i - 1)) {
						counter++;
					}
					else
					{
						
					}
					newstr = newstr + counter + str.charAt(i);
				}

				System.out.println(newstr);
				n--;
				str = newstr;
			}
		}

	}

}
