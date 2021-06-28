package assignment2;

import java.util.Scanner;

public class FaToCe 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		System.out.print(String .format("%.2f", (defScan.nextFloat() - 32) / 1.8));//String .format("%.2f",d)  (defScan.nextFloat() - 32) / 1.8
	}
}
