package assignment3;

import java.util.Scanner;

public class CaesarCode 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		System.out.print("Please enter the Caesar String: \n");
		String input = defScan.next();
		System.out.print("Please enter the Caesar number: \n");
		int Cnum = defScan.nextInt();
		String output = "";
		for (int i = 0; i < input.length(); i++)
		{
			output += (char)(input.charAt(i) + Cnum);
		}
		System.out.print("The resulting string is: " + output);
	}
}
