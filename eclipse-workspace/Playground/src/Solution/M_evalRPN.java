package Solution;
import java.util.ArrayList;

public class M_evalRPN 
{
	public static int evalRPN(String[] tokens) 
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int result = 0;
		for(String item : tokens)
		{
			if(item.equals("+"))
			{
				result = numbers.get(numbers.size() - 2) + numbers.get(numbers.size() - 1);
				numbers.set(numbers.size() - 2, result);
				numbers.remove(numbers.size() - 1);
			}
			else if(item.equals("-"))
			{
				result = numbers.get(numbers.size() - 2) - numbers.get(numbers.size() - 1);
				numbers.set(numbers.size() - 2, result);
				numbers.remove(numbers.size() - 1);
			}
			else if(item.equals("*"))
			{
				result = numbers.get(numbers.size() - 2) * numbers.get(numbers.size() - 1);
				numbers.set(numbers.size() - 2, result);
				numbers.remove(numbers.size() - 1);
			}
			else if(item.equals("/"))
			{
				result = numbers.get(numbers.size() - 2) / numbers.get(numbers.size() - 1);
				numbers.set(numbers.size() - 2, result);
				numbers.remove(numbers.size() - 1);
			}
			else
			{
				numbers.add(Integer.valueOf(item));
			}
		}
		return numbers.get(numbers.size() - 1);
    }
	
	public static void main(String[] args)
	{
		String[] input = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		System.out.print(evalRPN(input));
	}
}
