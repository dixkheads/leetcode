package lab4;

import java.util.Scanner;

public class Lottery 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		String lot = String.valueOf((int) Math.floor(Math.random() * 90 + 10));
		//System.out.print(lot + "\n");
		System.out.print("Please enter your lucky two-digit number: ");
		String input = defScan.next();
		if (lot.charAt(0) == input.charAt(0) && lot.charAt(1) == input.charAt(1))
		{
			System.out.print("You've won 10000 dollars");
		}
		else if (lot.charAt(1) == input.charAt(0) && lot.charAt(0) == input.charAt(1))
		{
			System.out.print("You've won 3000 dollars");
		}
		else if (lot.charAt(0) == input.charAt(0) || lot.charAt(1) == input.charAt(1) || lot.charAt(1) == input.charAt(0) || lot.charAt(0) == input.charAt(1))
		{
			System.out.print("You've won 1000 dollars");
		}
		else
		{
			System.out.print("You've won no dollars");
		}
	}
}
