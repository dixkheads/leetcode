package Solution;

import java.util.ArrayList;
import java.util.List;

public class M_maximumRemovals 
{
	public static void printInit(ArrayList<Integer> input)
	{
		for(int i = 0; i < input.size(); i++)
		{
			System.out.print(input.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static ArrayList<Integer> scan(String s, String p)
	{
		System.out.println("Values been scanned are: " + s + " " + p);
		ArrayList<Integer> StIndx= new ArrayList<Integer>();
		boolean sexist = true;
		while(sexist == true)
		{
			int temp = s.lastIndexOf(p);
			//System.out.println(temp);
			if(temp != -1)
			{
				StIndx.add(temp);
				s = s.substring(temp + 1);
			}
			else
			{
				sexist = false;
			}
		}
		System.out.println("The scan result for the case is: ");
		printInit(StIndx);
		System.out.println("Initial Screening finished");
		return StIndx;
	}
	
	public static ArrayList<Integer> delSeq(int[] input)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < input.length; i++)
		{
			int tempi = input[i];
			for(int j = 0; j < i; j++)
			{
				if(input[j] < input[i])
				{
					tempi--;
				}
			}
			result.add(tempi);
		}
		return result;
	}
	
	public static int maximumRemovals(String s, String p, int[] removable) 
	{
		int lastKnown = 0;
		ArrayList<Integer> StIndx= new ArrayList<Integer>();
		StIndx = scan(s, p);
		ArrayList<Integer> Seq = delSeq(removable);
		for(int i = 0; i < removable.length; i++)
		{
			for(int j = 0; j < StIndx.size(); j++)
			{
				if(StIndx.get(j) <= removable[i] && StIndx.get(j) + p.length() >= removable[i])
				{
					System.out.println("because of a set of: " + StIndx.get(j) + " " + i + " " + p.length() + ", jack is removed");
					StIndx.remove(j);
				}
			}
			s = s.substring(0, Seq.get(i)) + s.substring(Seq.get(i) + 1);
			System.out.println("The current string is: " + s);
			String focus = s.substring(Math.max(0, removable[i] - p.length()), Math.min(s.length(), removable[i] + p.length()));
			ArrayList<Integer> tempres = scan(focus, p);
			for(int k = 0; k < tempres.size(); k++)
			{
				StIndx.add(tempres.get(i));
			}
			System.out.println("Current StIndx is: ");
			printInit(StIndx);
			if(StIndx.isEmpty() == false)
			{
				System.out.println("success!");
				lastKnown = i;
			}
		}
		return lastKnown + 1;
    }
	
	public static void main(String[] args)
	{
		String s = "abcacb";
		String p = "ab";
		int[] removable = {3, 1, 0};
		System.out.println(maximumRemovals(s, p, removable));
	}
}

/*
ArrayList<Integer> StIndx= new ArrayList<Integer>();
		StIndx = scan(s, p);
		for(int i = 0; i < removable.length; i++)
		{
			for(int j = 0; j < StIndx.size(); j++)
			{
				if(StIndx.get(j) <= removable[i] && StIndx.get(j) + p.length() >= removable[i])
				{
					System.out.println("because of a set of: " + StIndx.get(j) + " " + i + " " + p.length() + ", jack is removed");
					StIndx.remove(j);
				}
			}
			s = s.substring(0, removable[i]) + s.substring(removable[i] + 1);
			System.out.println("The current string is: " + s);
			if(StIndx.isEmpty() == true)
			{
				StIndx = scan(s, p);
				if(StIndx.isEmpty() == true)
				{
					return i;
				}
			}
		}
		return -50;
*/