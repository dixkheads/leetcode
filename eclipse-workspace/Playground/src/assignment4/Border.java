package assignment4;
import java.util.Scanner;


public class Border 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me the M: ");
		String M = sc.next();
		System.out.println("Give me the n: ");
		int n = sc.nextInt();
		//System.out.println("Give me the father string: ");
		String F = M.substring(0, n);
		if (M.endsWith(F) && n > 0 && !F.equals(M))
		{
			System.out.println(F);
		}
		else
		{
			System.out.println("NoSuchBorder");
		}
	}

}
