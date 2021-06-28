package Solution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	static void printArrList(ArrayList<Integer> arr)
	{
		arr.forEach((e) -> {System.out.print(e + " ");});
		System.out.print("\n");
	}
	
	static int backtrack_old(ArrayList<Integer> subset, int[][] prim, int m, int n, int Currm, int Currn)
	{
		System.out.println("Working with: ");
		printArrList(subset);
		int last = subset.get(subset.size() - 1);
		System.out.println("The last rank of subset is: " + last);
		System.out.println("The current num of the set is 0s of " + Currm + " and 1s of " + Currn);
		if(Currm > m || Currn > n)
		{
			System.out.println("The limit has been reached with 0s of " + Currm + " and 1s of " + Currn);
			return subset.size() - 1;
		}
		else
		{
			int max = subset.size();
			int least0 = 101;
			int least1 = 101;
			for(int i = last + 1; i < prim.length; i++)
			{
				if(prim[i][0] < least0 || prim[i][1] < least1)
				{
					//System.out.println("Number " + i + " is accepted since " + prim[i][0] + prim[i][1] + " is smaller than " + least0 + least1);
					if(prim[i][0] < least0)
					{
						least0 = prim[i][0];
					}
					if(prim[i][1] < least1)
					{
						least1 = prim[i][1];
					}
					//ArrayList<Integer> tempset = subset;
					//tempset.add(i);
					subset.add(i);
					//printIntArr(prim);
					//System.out.println("Currently Attempting on " + i + " and 0s should be " + Currm + prim[i][0] + " and 1s should be " + Currn + prim[i][1]);
					//int backres = backtrack(subset, prim, m, n, Currm + prim[i][0], Currn + prim[i][1]);
					if(backres > max)
					{
						max = backres;
					}
					subset.remove(subset.size() - 1);
				}
			}
			return max;
		}
	}
    
	static void printIntArr(int[][] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + ", ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
    public static int findMaxForm_old(String[] strs, int m, int n) {
        int[][] num = new int[strs.length + 1][2];
        //num[0][0] = 101;
        //num[0][1] = 101;
        for(int[] temp : num)
        {
        	Arrays.fill(temp, 101);
        }
        for(int i = 0; i < strs.length; i++)
        {
            int num0 = 0;
            int num1 = 0;
            for(int j = 0; j < strs[i].length(); j++)
            {
                if(strs[i].charAt(j) == '0')
                {
                    num0++;
                }
                else if(strs[i].charAt(j) == '1')
                {
                    num1++;
                }
            }
            int k = 0;
            for(; num0 + num1 > num[k][0] + num[k][1]; k++)
            {
            	
            }
            for(int j = num.length - 2; j >= k; j--)
            {
            	num[j + 1] = num[j];
            }
            num[k] = new int[] {num0, num1};
        }
        //printIntArr(num);
        int[][] fnum = new int[num.length][2];
        for(int i = 0; i < fnum.length - 1; i++)
        {
        	fnum[i + 1] = num[i];
        }
        printIntArr(fnum);
        ArrayList<Integer> start = new ArrayList<Integer>();
        start.add(0);
        //System.out.print(backtrack(start, fnum, m, n, fnum[0][0], fnum[0][1]));
        //return backtrack(start, fnum, m, n, fnum[0][0], fnum[0][1]);//TB del
    }
    
    public static void PrintInt3Res(int[][][] in)
    {
    	for(int i = 0; i < 2; i++)
    	{
    		System.out.print("The " + i + "th result is: \n");
    		for(int j = 0; j < in[0].length; j++)
    		{
    			System.out.print(j + ": ");
    			for(int k = 0; k < in[0][0].length; k++)
    			{
    				System.out.print(in[i][j][k] + " ");
    			}
    			System.out.print("\n");
    		}
    		System.out.print("\n");System.out.print("\n");
    	}
    }
    
    public static void PrintInt2Res(int[][] in)
    {
    	for(int i = 0; i < in.length; i++)
    	{
    		System.out.print(i + ": ");
    		for(int j = 0; j < in[0].length; j++)
    		{
    			System.out.print(in[i][j] + " ");
    		}
    		System.out.print("\n");
    	}
    }
    
    public static void main(String[] args)
    {
    	/*
    	String[] strs = {"10","0001","111001","1","0"};
    	int t = findMaxForm(strs, 3, 4);
    	System.out.println(t);
    	*/
    	int n = 5;
    	boolean[][] newmap = new boolean[n][n];
    	for(int i = 0; i < newmap.length; i++)
    	{
    		for(int j = 0; j < newmap[0].length; j++)
    		{
    			newmap[i][j] = true;
    		}
    	}
    	int[][][] newseq = new int[200][n][2];
    	int[][][] result = BackTrack(newmap, newseq);
    	System.out.println("-------------------------------------------------------------------------");
    	PrintInt3Res(result);
    }

	private static int findMaxForm(String[] strs, int m, int n) 
	{
		int[][] dp = new int[m + 1][n + 1];
		int t0s = 0;
		int t1s = 0;
		for(String i : strs)
		{
			int num0 = 0;
			int num1 = 0;
			for(char j : i.toCharArray())
			{
				if(j == '0') {num0++; t0s++;} else {num1++; t1s++;}
			}
			for(int k = Math.min(t0s, m); k >= num0; k--)
			{
				for(int l = Math.min(t1s, n); l >= num1; l--)
				{
					dp[k][l] = Math.max(dp[k][l], dp[k - num0][l - num1] + 1);
					//dp[k][l]
					//dp[k - num0][l - num1] + 1
				}
			}
			printIntArr(dp);
		}
		//System.out.print(dp[m][n]);
		return dp[m][n];
	}
	
	static int NumTry = 0;
	static int NumQ = 0;
	
	static void printMap(boolean[][] map)
	{
		System.out.println("Printin map...");
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map.length; j++)
			{
				if(map[i][j] == true)
				{
					System.out.print("O ");
				}
				else
				{
					System.out.print("X ");
				}
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	static int[][][] BackTrack(boolean[][] map, int[][][] seq)
	{
		for(int i = 0; i < map.length; i++)
		{
			for (int j = 0; j < map.length; j++)
			{
				if(map[i][j] == true)
				{
					if(NumQ == map.length - 1)
					{
						seq[NumTry][NumQ][0] = i;
						seq[NumTry][NumQ][1] = j;
						NumTry++;
						NumQ = 0;
						PrintInt3Res(seq);
						System.out.println("Try finished!\n");
						return seq;
					}
					else
					{
						boolean[][] nextmap = map;
						int[][] nextseq = seq[NumTry];
						nextseq[NumQ][0] = i;
						nextseq[NumQ][1] = j;
						NumQ++;
						PrintInt2Res(nextseq);
						for(int k = 0; k < map.length; k++)
						{
							for(int l = 0; l < map.length; l++)
							{
								if(k == i || l == j || k + l == i + j || k - i == l - j)
								{
									nextmap[k][l] = false;
								}
							}
						}
						printMap(nextmap);
						seq[NumTry] = nextseq;
						PrintInt3Res(seq);
						seq = BackTrack(nextmap, seq);
					}
				}
			}
		}
		//seq[NumTry][NumQ]
		NumQ--;
		System.out.println("Reaching dead end!\n");
		return seq;
	}
	
	public List<List<String>> solveNQueens(int n) 
	{
		boolean[][] newmap = new boolean[n][n];
    	int[][][] newseq = new int[200][n][2];
        List<List<String>> result = new ArrayList<List<String>>();
        int[][][] intres = BackTrack(newmap, newseq);
        for(int i = 0; i < NumTry; i++)
        {
        	for(int x = 0; x < n; x++)
        	{
        		int tempy = 0;
    			for(int a = 0; a < n; a++)
    			{
    				if(intres[i][a][0] == x);
    				{
    					tempy = intres[i][a][1];
    				}
    			}
        		for(int y = 0; y < n; y++)
        		{
        			if(y != tempy)
        			{
        				result.get(i).get(x).concat(".");
        			}
        			else
        			{
        				result.get(i).get(x).concat("Q");
        			}
        		}
        	}
        }
        return result;
    }
}