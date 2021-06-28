package assignment5;
import java.math.*;
import java.util.Scanner;

public class HamDist 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print(", y = ");
		int y = sc.nextInt();
		int diff = 0;
		for (int i = 100; i >= 0; i--)
		{
			int temp = 0;
			if (x >= Math.pow(2, i))
			{
				x -= Math.pow(2, i);
				temp++;
			}
			if (y >= Math.pow(2, i))
			{
				y -= Math.pow(2, i);
				temp--;
			}
			if (temp != 0)
			{
				diff++;
			}
		}
		System.out.println(diff);
	}
}
