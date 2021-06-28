package lab8;

public class CreatePalindrome 
{
	public static String createPalindrome(String s)
	{
		int len = s.length();
		for(int i = len - 1; i >=0; i--)
		{
			s = s.concat(String.valueOf(s.charAt(i)));
		}
		return s;
	}
	
	public static void main(String[] args)
	{
		System.out.print(createPalindrome("Hello"));
	}
}
