package hackerRank;

import java.util.Scanner;

public class BreakingTheRecords 

{
	static int[] funBreakRecords(int[] sco)
	{
		int high=sco[0];
		int low=sco[0];
		int[] res=new int[2];
		
		for(int i=1;i<sco.length;i++)
		{
			if(sco[i] > high)
			{
				high=sco[i];
				res[0]++;
			}
			else if(sco[i] < low)
			{
				low=sco[i];
				res[1]++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sco[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			sco[i]=sc.nextInt();
		}
		int result[] =funBreakRecords(sco);
		for(int i=0;i<=2;i++)
		{
			System.out.println(result[i]);
		}
		
		

	}

}
