package assignment6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Date;
import java.math.*;

public class RumorSpreading 
{
	static ArrayList<Integer> Know = new ArrayList<Integer>(Arrays.asList());
	static ArrayList<Integer> nKnow = new ArrayList<Integer>(Arrays.asList());
	static ArrayList<Integer> nSpread = new ArrayList<Integer>(Arrays.asList());
	static Random re = new Random();
	
	static void roll()
	{
		int choice = (int)Math.ceil(re.nextDouble() * 999);
		while (choice == Know.get(0))
		{
			choice = (int)Math.ceil(re.nextDouble() * 999);
		}
		if(Know.contains(choice))
		{
			System.out.println("Person " + Know.get(0) + " tells person " + choice + " the rumor, but he has already knew it.");
			nSpread.add(Know.get(0));
			nSpread.add(choice);
			Know.remove(0);
			Know.remove(Know.lastIndexOf(choice));
		}
		else if(nKnow.contains(choice))
		{
			System.out.println("Person " + Know.get(0) + " tells person " + choice + " the rumor, and he now knows it.");
			nKnow.remove(nKnow.lastIndexOf(choice));
			Know.add(choice);
		}
		else
		{
			System.out.println("Person " + Know.get(0) + " tells person " + choice + " the rumor, but he has already promised not to spread it.");
			nSpread.add(Know.get(0));
			Know.remove(0);
		}
		
	}
	
	static void init()
	{
		Date date = new Date();
		re.setSeed(date.getTime());
		Know.add(1);
		for(int i = 2; i < 1000; i++)
		{
			nKnow.add(i);
		}
	}
	
	public static void main(String[] args)
	{
		init();
		while(Know.size() > 0)
		{
			roll();
		}
		System.out.println(((double)nSpread.size())/999.0);
	}
}
