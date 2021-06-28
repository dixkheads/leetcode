package assignment7;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class TTT 
{
	public static int num;
	
	public static void printTable(char[][] input)
	{
		for(int y = 0; y < num; y++)
		{
			for (int x = 0; x < num; x++)
			{
				System.out.print(input[x][y]);
			}
			System.out.print("\n");
		}
	}
	
	public static char[][] generateTTT(int n)
	{
		num = n;
		Random re = new Random();
		char[][] result = new char[n][n];
		int actX = 0;
		int actO = 0;
		//int act = 0;
		/*while (act < Math.pow(n, 2))
		{
			int x = (int)Math.floor(re.nextDouble() * n);
			int y = (int)Math.floor(re.nextDouble() * n);
			while(result[x][y] == 'X' || result[x][y] == 'O')
			{
				x = (int)Math.floor(re.nextDouble() * n);
				y = (int)Math.floor(re.nextDouble() * n);
			}
			result[x][y] = 'X';
			while(result[x][y] == 'X' || result[x][y] == 'O')
			{
				x = (int)Math.floor(re.nextDouble() * n);
				y = (int)Math.floor(re.nextDouble() * n);
			}
			result[x][y] = 'O';
			act++;
		}*/
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (re.nextBoolean() == true && actX <= ((double)n * n)/2.0 + 0.5)
				{
					result[i][j] = 'X';
					actX++;
				}
				else if(actO <= ((double)n * n)/2.0 + 0.5)
				{
					result[i][j] = 'O';
					actO++;
				}
				else
				{
					result[i][j] = 'X';
					actX++;
				}
			}
		}
		//printTable(result); //$$$$$uncomment this for easy check$$$$$
		return result;
	}
	
	public static boolean checkTTT(char[][] TTTboard)
	{
		boolean Xwin = false;
		boolean Owin = false;
		int AdiaX = 0;
		int AdiaO = 0;
		int BdiaX = 0;
		int BdiaO = 0;
		for(int i = 0; i < num; i++)
		{
			int numX = 0;
			int numO = 0;
			for(int j = 0; j < num; j++)
			{
				if(TTTboard[i][j] == 'X')
				{
					numX++;
					if (i == j)
					{
						AdiaX++;
					}
					if (i + j == num - 1)
					{
						BdiaX++;
					}
				}
				if(TTTboard[i][j] == 'O')
				{
					numO++;
					if (i == j)
					{
						AdiaO++;
					}
					if (i + j == num - 1)
					{
						BdiaO++;
					}
				}
			}
			if (numX == num)
			{
				Xwin = true;
			}
			if (numO == num)
			{
				Owin = true;
			}
			numX = 0;
			numO = 0;
			for(int j = 0; j < num; j++)
			{
				if(TTTboard[j][i] == 'X')
				{
					numX++;
				}
				if(TTTboard[j][i] == 'O')
				{
					numO++;
				}
			}
			if (numX == num)
			{
				Xwin = true;
			}
			if (numO == num)
			{
				Owin = true;
			}
		}
		if (AdiaX == num || BdiaX == num)
		{
			Xwin = true;
		}
		if (AdiaO == num || BdiaO == num)
		{
			Owin = true;
		}
		if ((Xwin == true && Owin == true) || (Xwin == false) && (Owin == false))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print(checkTTT(generateTTT(5)));
	}
}
