package lab6;

import java.util.Random;
import java.math.*;

public class Deck 
{
	public static void main(String[] args)
	{
		Random ra = new Random();
		int[] deck = new int[51];
		for(int i = 0; i < 4; i++)
		{
			int opt = (int)Math.floor(ra.nextDouble() * 51);
			while(deck[opt] == -1)
			{
				opt = (int)Math.floor(ra.nextDouble() * 51);
			}
			deck[opt] = -1;
			switch(opt / 13)
			{
			case 0:
				System.out.println("Spades " + opt % 13);
				break;
			case 1:
				System.out.println("Hearts " + opt % 13);
				break;
			case 2:
				System.out.println("Diamonds " + opt % 13);
				break;
			case 3:
				System.out.println("Club " + opt % 13);
				break;
			}
		}
	}
}
