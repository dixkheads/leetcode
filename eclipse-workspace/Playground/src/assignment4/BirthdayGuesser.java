package assignment4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/*If I answer yes to one set, the dates not included in this set are eliminated, and if I answer no to the set, the dates included are eliminated.
 *By choosing five times, the total possibilities are 2^5 = 32, well above 31.
 *Sets are designed to contain each date once, twice ... up to five times, so that each date is accessible through a unique set of five digit binary sequence.
 */

public class BirthdayGuesser 
{
	static ArrayList<Integer> set1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31));
	static ArrayList<Integer> set2 = new ArrayList<Integer>(Arrays.asList(2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31));//2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31
	static ArrayList<Integer> set3 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31));//4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31
	static ArrayList<Integer> set4 = new ArrayList<Integer>(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31));//8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31
	static ArrayList<Integer> set5 = new ArrayList<Integer>(Arrays.asList(16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31));
	static ArrayList<Boolean> retainset = new ArrayList<Boolean>();
	
	public static void init()
	{
		for (int i = 0; i < 32; i++)
		{
			retainset.add(true);
		}
	}
	
	public static void setYES(int opt)
	{
		System.out.println("YES " + opt);
		switch(opt)
		{
		case 1: 
			//set1.forEach((e) -> {retainset.set(e, true);});
			for(int i = 1; i < 32; i++) {if(!set1.contains(i)) {retainset.set(i, false);}}
			break;
		case 2: 
			//set2.forEach((e) -> {retainset.set(e, true);});
			for(int i = 1; i < 32; i++) {if(!set2.contains(i)) {retainset.set(i, false);}}
			break;
		case 3: 
			//set3.forEach((e) -> {retainset.set(e, true);});
			for(int i = 1; i < 32; i++) {if(!set3.contains(i)) {retainset.set(i, false);}}
			break;
		case 4: 
			//set4.forEach((e) -> {retainset.set(e, true);});
			for(int i = 1; i < 32; i++) {if(!set4.contains(i)) {retainset.set(i, false);}}
			break;
		case 5: 
			//set5.forEach((e) -> {retainset.set(e, true);});
			for(int i = 1; i < 32; i++) {if(!set5.contains(i)) {retainset.set(i, false);}}
			break;
		}
	}
	
	public static void setNO(int opt)
	{
		System.out.println("NO " + opt);
		switch(opt)
		{
		case 1: 
			set1.forEach((e) -> {retainset.set(e, false);});
			break;
		case 2: 
			set2.forEach((e) -> {retainset.set(e, false);});
			break;
		case 3: 
			set3.forEach((e) -> {retainset.set(e, false);});
			break;
		case 4: 
			set4.forEach((e) -> {retainset.set(e, false);});
			break;
		case 5: 
			set5.forEach((e) -> {retainset.set(e, false);});
			break;
		}
	}

	public static void resolve()
	{
		System.out.println("Your birthday is " + retainset.lastIndexOf(true));
	}
	
	public static void main(String[] args)
	{
		init();
		Scanner sc = new Scanner(System.in);
		System.out.println("Is the day of your birthday in Set 1 (yes or no)? ");
		String t = sc.next();
		//System.out.println("{" + t + "}");
		if (t.charAt(0) == 'y')
		{
			setYES(1);
		}
		else
		{
			setNO(1);
		}
		System.out.println("Is the day of your birthday in Set 2 (yes or no)? ");
		t = sc.next();
		if (t.charAt(0) == 'y')
		{
			setYES(2);
		}
		else
		{
			setNO(2);
		}
		System.out.println("Is the day of your birthday in Set 3 (yes or no)? ");
		t = sc.next();
		if (t.charAt(0) == 'y')
		{
			setYES(3);
		}
		else
		{
			setNO(3);
		}
		System.out.println("Is the day of your birthday in Set 4 (yes or no)? ");
		t = sc.next();
		if (t.charAt(0) == 'y')
		{
			setYES(4);
		}
		else
		{
			setNO(4);
		}
		System.out.println("Is the day of your birthday in Set 5 (yes or no)? ");
		t = sc.next();
		if (t.charAt(0) == 'y')
		{
			setYES(5);
		}
		else
		{
			setNO(5);
		}
		
		resolve();
		
	}
}
