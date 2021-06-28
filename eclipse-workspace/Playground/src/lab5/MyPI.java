package lab5;

import java.util.Random;
import java.math.*;

public class MyPI 
{
	static Random ra = new Random();
	
	public static void main(String[] args)
	{
		int n = 100000000;
		int suc = 0;
		for(int i = 0; i < n; i++)
		{
			double x = ra.nextDouble();
			double y = ra.nextDouble();
			if(x * x + y * y < 1)
			{
				suc++;
			}
		}
		System.out.print((double)suc / (double)n * 4);
	}
}
