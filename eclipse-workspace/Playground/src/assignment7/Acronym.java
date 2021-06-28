package assignment7;

public class Acronym 
{
	public static String createAcronym(String userPhrase)
	{
		//System.out.println("received: " + userPhrase);
		String result = "";
		if(userPhrase.charAt(0) >= 'A' && userPhrase.charAt(0) <= 'Z')
		{
			result = String.valueOf(userPhrase.charAt(0));
		}
		for (int i = 0; i < userPhrase.length() - 1; i++)
		{
			if(userPhrase.charAt(i) == ' ' && userPhrase.charAt(i + 1) >= 'A' && userPhrase.charAt(i + 1) <= 'Z')
			{
				//System.out.println("Correct condition get: " + userPhrase.charAt(i + 1));
				result = result.concat(String.valueOf(userPhrase.charAt(i + 1)));
			}
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.print(createAcronym("Association for Computing Machinery"));
	}
}
