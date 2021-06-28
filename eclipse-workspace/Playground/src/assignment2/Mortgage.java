package assignment2;

import java.util.Scanner;

public class Mortgage 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		int CurP = defScan.nextInt();
		int LastMP = defScan.nextInt();
		System.out.print("This house is $" + CurP + ". The change is $" + (CurP-LastMP) + " since last month.\n" + "The estimated monthly mortgage is $" + ((float)CurP * 0.051 / 12) + ".");
	}
}
