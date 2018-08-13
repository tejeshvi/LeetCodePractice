package Top100;

public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLowerCase("HeLlo HoRse"));
	}
	public static String toLowerCase(String str) {
		char strArray[] = str.toCharArray();
		for(int i=0;i<strArray.length; i++)
		{
			if(strArray[i]>='A' && strArray[i]<='Z')
			{
				strArray[i]=(char) (strArray[i]-'A'+'a');
			}
		}
        return new String(strArray);
    }
}
