package assignment8;
import java.math.*;

public class SearchMinIndex
{
	public static int searchMinIndex(int[] A, int m)
	{
		int mk = (int)Math.ceil(A.length / 2);
		int lg = mk;
		while(lg > 1)
		{
			lg = (int)Math.ceil(lg / 2);
			if(A[mk] >= m)
			{
				mk -= lg;
			}
			else
			{
				mk += lg;
			}
		}
		if(A[mk] == m)
		{
			return mk;
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String[] args)
	{
		int[] test = {0, 1, 1, 2, 3, 3, 5, 5, 5, 5, 5};
		System.out.print(searchMinIndex(test, 4));
	}
}
