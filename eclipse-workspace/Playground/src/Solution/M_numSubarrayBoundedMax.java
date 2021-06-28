package Solution;

public class M_numSubarrayBoundedMax 
{	
	public static int numPos(int length)
	{
		return (int) (length + 1) * length / 2;
	}
	
	public static int numSubarrayBoundedMax(int[] nums, int left, int right) 
    {
		int numYes = 0;
		int numNo = 0;
		int total = 0;
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] > right)
			{
				total += numPos(numNo);
				total -= numPos(numYes);
				numYes = 0;
				numNo = 0;
				System.out.println("Too big: " + total + " " + numNo + " " + numYes);
			}
			else if(nums[i] <= right && nums[i] >= left)
			{
				total -= numPos(numYes);
				numYes = 0;
				numNo++;
				System.out.println("Find match: " + total + " " + numNo + " " + numYes);
			}
			else
			{
				numNo++;
				numYes++;
				System.out.println("No match: " + total + " " + numNo + " " + numYes);
			}
		}
		total += numPos(numNo);
		total -= numPos(numYes);
		return total;
    }
	
	public static void main(String[] args)
	{
		int[] nums = {2,9,2,5,6};
		System.out.print(numSubarrayBoundedMax(nums, 2, 8));
	}
}
