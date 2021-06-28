package lab3;

import java.util.Scanner;

public class RandomPoint 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		System.out.print("input for point A: x = ");
		float p1x = defScan.nextFloat();
		System.out.print(", y = ");
		float p1y = defScan.nextFloat();
		System.out.print("\n" + "input for point B: x = ");
		float p2x = defScan.nextFloat();
		System.out.print(", y = ");
		float p2y = defScan.nextFloat();
		System.out.print("\n" + "The random points coordinates: x = " + (Math.random()*(p2x - p1x) + p1x) + ", y = " + (Math.random()*(p2y - p1y) + p1y));
	}
}
