package lab6;

import java.util.Scanner;

public class StringSquare 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[][] res = new char[s.length][s.length];
		res[0] = s;
		System.out.println(res[0]);
		for(int i = 1; i < s.length - 1; i++)
		{
			for(int j = 0; j < s.length; j++)
			{
				res[i][j] = '*';
			}
			res[i][0] = s[i];
			res[i][s.length - 1] = s[s.length - i - 1];
			System.out.println(res[i]);
		}
		for(int k = 0; k < s.length; k++)
		{
			res[s.length - 1][k] = s[s.length - k - 1];
		}
		System.out.println(res[s.length - 1]);
	}
}
