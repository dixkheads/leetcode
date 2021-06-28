package assignment8;

public class TripleChar
{
	public static String tripleChar(String s, char c)
	{
		//String ret = new String();
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == c)
			{
				//System.out.println(s.substring(0, i + 1).concat("000"));
				return tripleChar(s.substring(0, i).concat("000").concat(s.substring(i + 1)), c);
			}
		}
		return s.replace('0', c);
	}
	
	public static void main(String[] args)
	{
		System.out.print(tripleChar("applppxppp", 'p'));
	}
}
