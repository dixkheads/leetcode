package lab5;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String k = new String();
		for(int i = n.length() - 1; i >= 0; i--)
		{
			k = k.concat(String.valueOf(n.charAt(i)));
		}
		//System.out.println(k);
		//System.out.println(n);
		if(k.equals(n))
		{
			System.out.println("Palindrome");
		}
		
	}
}
