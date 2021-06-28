package assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class checkPassword 
{
	//static ArrayList<Character> s = new ArrayList<Character>(Arrays.asList('H', 'e', 'l', 'l', 'o'));
	static char[] s = {'H', 'e', 'l', 'l', 'o'};
	
	public static void main(String[] args)
	{
		int tLength = 0;
		boolean hasUpcase = false;
		boolean hasLowcase = false;
		boolean hasNumber = false;
		boolean hasSpecial = false;
		for (char i : s)
		{
			tLength++;
			if (i >= 'A' && i <= 'Z')
			{
				hasUpcase = true;
			}
			if (i >= 'a' && i <= 'z')
			{
				hasLowcase = true;
			}
			if (i >= '0' && i <= '9')
			{
				hasNumber = true;
			}
			if (i >= '!' && i <= '/')
			{
				hasSpecial = true;
			}
			if (i >= ':' && i <= '@')
			{
				hasSpecial = true;
			}
			if (i >= '[' && i <= '`')
			{
				hasSpecial = true;
			}
			if (i >= '{' && i <= '~')
			{
				hasSpecial = true;
			}			
		}
		if (tLength < 8)
		{
			System.out.print("Too Short ");
		}
		if (!hasUpcase)
		{
			System.out.print("Missing uppercase letter ");
		}
		if (!hasLowcase)
		{
			System.out.print("Missing lowercase letter ");
		}
		if (!hasNumber)
		{
			System.out.print("Missing number ");
		}
		if (!hasSpecial)
		{
			System.out.print("Missing special");
		}
	}
}
