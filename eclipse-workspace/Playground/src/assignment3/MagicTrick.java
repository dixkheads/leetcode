package assignment3;

//import java.util.Scanner;

public class MagicTrick 
{
	public static String ranker_s2b(String unranked)
	{
		String result = new String();
		for (int i = 0; i <= unranked.length() + 1; i++)
		{
			result += (char)('9' + 1);
		}
		for (int i = 0; i < unranked.length(); i++)
		{
			int j = 0;
			while (unranked.charAt(i) > result.charAt(j)) {j++;}
			result = result.substring(0, j) + unranked.charAt(i) + result.substring(j);
		}
		int tempk = 0;
		String t_result = new String();
		while (result.charAt(tempk) != (char)('9' + 1))
		{
			t_result += result.charAt(tempk);
			tempk++;
		}
		return t_result;
	}
	
	public static String ranker_b2s(String unranked)
	{
		String result = new String();
		for (int i = 0; i <= unranked.length() + 1; i++)
		{
			result += (char)('0' - 1);
		}
		for (int i = 0; i < unranked.length(); i++)
		{
			int j = 0;
			while (unranked.charAt(i) < result.charAt(j)) {j++;}
			result = result.substring(0, j) + unranked.charAt(i) + result.substring(j);
		}
		int tempk = 0;
		String t_result = new String();
		while (result.charAt(tempk) != (char)('0' - 1))
		{
			t_result += result.charAt(tempk);
			tempk++;
		}
		return t_result;
	}
	
	public static String reverser(String orig)
	{
		String result = new String();
		//int vl = 0;
		for (int i = orig.length() - 1; i >= 0; i--)
		{
			result += orig.charAt(i);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		//String[] args = {"3", "7", "4"};
		String input = new String();
		for (int i = 0; i < args.length; i++)
		{
			input += args[i].charAt(0);
		}
		System.out.print("Number: " + ranker_b2s(input) + "\n");
		System.out.print(ranker_b2s(input) + " - " + ranker_s2b(input) + " = " + (Integer.valueOf(ranker_b2s(input)) - Integer.valueOf(ranker_s2b(input))) + "\n");
		String temp1 = String.valueOf(Integer.valueOf(ranker_b2s(input)) - Integer.valueOf(ranker_s2b(input)));
		String temp2 = reverser(String.valueOf(Integer.valueOf(ranker_b2s(input)) - Integer.valueOf(ranker_s2b(input))));
		System.out.print(temp1 + " + " + temp2 + " = " + (Integer.valueOf(temp1) + Integer.valueOf(temp2)) + "\n");
	}
}
