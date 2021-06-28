package assignment5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PascalsTriangle 
{
	static ArrayList<Integer> currln = new ArrayList<Integer>(Arrays.asList(0, 1, 0));
	static ArrayList<Integer> nextln = new ArrayList<Integer>(Arrays.asList(0, 1, 0));
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(1);
		for (int i = 2; i <= num; i++)
		{
			currln = (ArrayList<Integer>)nextln.clone();
			nextln.clear();
			nextln.add(0);
			for(int j = 0; j < currln.size() - 1; j++)
			{
				nextln.add(currln.get(j) + currln.get(j + 1));
				System.out.print(currln.get(j) + currln.get(j + 1) + " ");
			}
			nextln.add(0);
			System.out.print("\n");
		}
	}
	
}
