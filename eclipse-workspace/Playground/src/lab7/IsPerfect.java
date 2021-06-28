package lab7;

public class IsPerfect 
{
	public static boolean isPerfect(int aPosInt)
	{
		int rem = 0;
		for(int i = 1; i <= aPosInt / 2; i++)
		{
			if(aPosInt % i == 0)
			{
				rem += i;
			}
		}
		//System.out.println(rem);
		if(rem == aPosInt)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print(isPerfect(100));
	}
}
