package lab8;

public class WithoutDuplicates 
{
	public static int[] withoutDuplicates(int[] a)
	{
		int[] res = new int[a.length];
		int currPos = 0;
		for(int i : a)
		{
			boolean hasDigit = false;
			for(int j : res)
			{
				if(i == j)
				{
					hasDigit = true;
					break;
				}
			}
			if(hasDigit == false)
			{
				res[currPos] = i;
				currPos++;
			}
		}
		int tlen = res.length;
		for(int k = res.length - 1; k >= 0 && res[k] ==0; k--)
		{
			tlen--;
		}
		int[] tres = new int[tlen];
		for(int l = 0; l < tlen; l++)
		{
			tres[l] = res[l];
		}
		return tres;
	}
	
	public static void main(String[] args)
	{
		int[] test = withoutDuplicates(new int[]{1, 2, 1, 1, 3, 2, 3});
		for(int i : test)
		{
			System.out.print(i);
		}
	}
}
