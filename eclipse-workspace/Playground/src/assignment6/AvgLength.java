package assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class AvgLength 
{
	//static ArrayList<String> s = new ArrayList<String>(Arrays.asList("Hello", "Goodbye"));
	static String s[] = {"Hello", "Goodbye"};
	
	public static void main(String[] args)
	{
		double num = 0;
		for (String i : s)
		{
			num += i.length();
		}
		System.out.println(num/s.length);
	}
}
