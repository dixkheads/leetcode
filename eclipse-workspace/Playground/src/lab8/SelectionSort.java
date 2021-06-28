package lab8;

public class SelectionSort 
{
	public static int[] selectionSort(int[] a)
	{
		int mk = -1;
		int seg = 0;
		boolean isSeg = false;
		int val = 9999;
		for(int i = 1; i < a.length; i++)
		{
			if(a[i - 1] > a[i])
			{
				isSeg = true;
			}
			if(a[i] < val && isSeg == true)
			{
				mk = i;
				val = a[i];
			}
		}
		if(isSeg == false)
		{
			return a;
		}
		for(int j = mk - 1; j >= 0; j--)
		{
			a[j + 1] = a[j];
		}
		a[0] = val;
		return selectionSort(a);
	}
	
	public static void main(String[] args)
	{
		int[] s = selectionSort(new int[] {4, 9, 7, 4, 1, 2, 2, 3, 7, 4, 5, 8, 7, 6});
		for(int i : s)
		{
			System.out.print(i);
		}
	}
}
