package Top100;

import java.util.HashSet;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
		String[] letters= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		HashSet<String> wordHash = new HashSet<>();
		for(String word: words)
		{
			String code="";
			for(char c : word.toCharArray())
			{
				code+=letters[c-'a'];
			}
			wordHash.add(code);
		}
        return wordHash.size();
    }

}
