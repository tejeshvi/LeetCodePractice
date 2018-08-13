package Top100;

import java.util.HashMap;

import org.w3c.dom.css.Counter;

public class FirstNonRepeatingCharacter {
	//O(n)
	static char firstNonRepeating(String s)
	{
		/*char count[] =new char[256];
		int index=-1;
		char result='_';
		for(int j=0;j<str.length();j++)
			count[str.charAt(j)]++;
			
		for(int i=0;i<str.length();i++)
		{
			System.out.println((int)str.charAt(i));
			System.out.println((int)count[str.charAt(i)]);
			if(count[str.charAt(i)]==1)
			{
				index =i;
				 result=str.charAt(index);
				break;
			}
		}
		return result;*/
		
		//smallest solution
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++){
		    if(s.indexOf(c[i])==s.lastIndexOf(c[i]))
		        return c[i];
		}
		    return '_';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
		char index =  firstNonRepeating(str);
        System.out.println(index);
	}
/*	//O(1)
class CountIndex
{
	int count, index;
	public CountIndex(int index)
	{
		this.count=1;
		this.index=index;
	}
	public void incCount()
	{
		this.count++;
	}
}

public class FirstNonRepeatingCharacter {
	
	
	static int firstNonRepeatingO1(String str)
	{
		HashMap<Character, CountIndex> hm = new HashMap<Character, CountIndex>(256);
		for (int i = 0; i < str.length();  i++)
        {
			if(hm.containsKey(str.charAt(i)))
				hm.get(str.charAt(i)).incCount();
			else
				hm.put(str.charAt(i), new CountIndex(i));
        }
		int result = Integer.MAX_VALUE,j;
		for(j=0;j<str.length();j++)
		{
			if(hm.get(str.charAt(j)).count==1 && result>hm.get(str.charAt(j)).index)
				result=hm.get(str.charAt(j)).index;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeeks";
        int index =  firstNonRepeatingO1(str);
        System.out.println(str.charAt(index));
	}*/

}
