package Solution;

public class M_makeEqual 
{
    public static boolean makeEqual(String[] words) 
    {
    	int[] numList = new int[26];
        for(String i : words)
        {
        	char[] curr;
        	curr = i.toCharArray();
        	for(char j : curr)
        	{
        		int rec = j;
        		rec-=97;
        		numList[rec]++;
        	}
        }
        boolean finres = true;
        for(int i = 0; i < 26; i++)
        {
        	if(numList[i] % words.length != 0)
        	{
        		finres = false;
        	}
        }
        return finres;
    }
    
    public static void main(String[] args)
    {
    	String[] test = new String[] {"abcz","aabc","bc"};
    	System.out.print(makeEqual(test));
    }
}
