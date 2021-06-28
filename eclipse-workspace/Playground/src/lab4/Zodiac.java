package lab4;

import java.util.Scanner;

public class Zodiac 
{
	public static void main(String[] args)
	{
		Scanner defScan = new Scanner(System.in);
		System.out.print("Please enter the year to be examined: ");
		int test = defScan.nextInt() % 12;
		
		switch(test)
		{
		case 0 :
			System.out.print("The year you entered is the year of Monkey");
			break;
		case 1 :
			System.out.print("The year you entered is the year of Rooster");
			break;
		case 2 :
			System.out.print("The year you entered is the year of Dog");
			break;
		case 3 :
			System.out.print("The year you entered is the year of Pig");
			break;
		case 4 :
			System.out.print("The year you entered is the year of Rat");
			break;
		case 5 :
			System.out.print("The year you entered is the year of Ox");
			break;
		case 6 :
			System.out.print("The year you entered is the year of Tiger");
			break;
		case 7 :
			System.out.print("The year you entered is the year of Rabbit");
			break;
		case 8 :
			System.out.print("The year you entered is the year of Dragon");
			break;
		case 9 :
			System.out.print("The year you entered is the year of Snake");
			break;
		case 10 :
			System.out.print("The year you entered is the year of Horse");
			break;
		case 11 :
			System.out.print("The year you entered is the year of Sheep");
			break;
		}
	}
}
