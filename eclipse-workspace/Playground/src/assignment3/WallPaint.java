package assignment3;

import java.util.Scanner;

public class WallPaint 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		System.out.print("Enter wall height (feet):\n");
		float area = defScan.nextFloat();
		System.out.print("Enter wall width (feet):\n");
		area *= defScan.nextFloat();
		System.out.print("Wall area: " + area + " square feet\n");
		System.out.print("Paint needed: " + area/350.0f + " gallons\n");
		System.out.print("Cans needed: " + (int)Math.ceil(area/350.0f) + " can(s)");
	}
}
