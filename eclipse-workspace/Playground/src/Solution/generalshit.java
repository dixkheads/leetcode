package Solution;

public class generalshit 
{
	public static void say(String words)
	{
		System.out.print(words);
	}
	
	public static void main(String[] args)
	{
		NumArray numArray = new NumArray({1, 3, 5}) ;
		numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
		numArray.update(1, 2);   // nums = [1, 2, 5]
		numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
	}
}
