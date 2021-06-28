package assignment5;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Craps 
{
	static Random re = new Random();
	static Date date = new Date();
	
	public static int roll()
	{
		return (int)Math.ceil(re.nextDouble() * 12.0);
	}
	
	public static void main(String[] args)
	{
		re.setSeed(date.getTime());
		Scanner sc = new Scanner(System.in);
		char player = 'A';
		while(true)
		{
			int roll1 = roll();
			if (roll1 == 7 || roll1 == 11)
			{
				System.out.println("On the first roll, Player " + player + " rolls a 11.  Player " + player + " wins!");
			}
			else if (roll1 == 2 || roll1 == 3 || roll1 == 12)
			{
				System.out.println("On the first roll, Player " + player + " rolls a 2.  Sadly, Player " + player + " loses.");
			}
			else
			{
				System.out.println("On the first roll, Player " + player + " rolls an " + roll1 + " .  This becomes the point, and player " + player + " must roll an " + roll1 + " again before rolling a 7 to win.");
				while(true)
				{
					int rolln = roll();
					int num = 2;
					if (rolln == roll1)
					{
						System.out.println("On the " + num + " roll, player " + player + " rolls a " + rolln + " .  Player " + player + " wins!");
						break;
					}
					else if (rolln == 7)
					{
						System.out.println("On the " + num + " roll, Player " + player + " rolls a 7.  Player " + player + " loses!");
						break;
					}
					else
					{
						System.out.println("On the " + num + " roll, Player " + player + " rolls a " + rolln + ". ");
						num++;
					}
				}
			}
			String x = sc.next();
			player = (char) (player + 1);
		}
	}
}
