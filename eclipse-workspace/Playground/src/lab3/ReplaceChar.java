package lab3;

import java.util.Scanner;

public class ReplaceChar 
{
	public static void main(String[] args)
	{
		//replace function would search for the value of the char, not the index of the char
		Scanner defScan = new Scanner(System.in);
		String S = "CS170 0 or 1";
		System.out.print("int Index = ");
		int num = defScan.nextInt();
		System.out.print("char ch = ");
		char chg = defScan.next().charAt(0);
		System.out.print(S.substring(0, num) + chg + S.substring(num + 1));
	}
}
