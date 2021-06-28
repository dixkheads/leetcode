package assignment8;

public class Sum
{
	public static int[] sum(int[] array, int n)
	{
		//System.out.println("Checking ");
		if(array.length < 2)
		{
			return new int[] {-1, -1};
		}
		int[] next = new int[array.length - 1];
		for(int i = 1; i < array.length; i++)
		{
			//System.out.print(array[i]);
			if(array[0] + array[i] == n)
			{
				return new int[] {0, i};
			}
			next[i - 1] = array[i]; 
		}
		int[] tk = sum(next, n);
		if(tk[0] != -1)
		{
			tk[0]++;
			tk[1]++;
		}
		return tk;
	}
	
	public static void main(String[] args)
	{
		int[] res = sum(new int[] {2, 7, 11, 12, 15}, 27);
		System.out.print(res[0] + " " + res[1]);
	}
}
