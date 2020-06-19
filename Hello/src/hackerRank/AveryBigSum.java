package hackerRank;

import java.util.Scanner;

public class AveryBigSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		long sum=0;
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			sum=sum+a[i];
			
		}
		
		System.out.println(sum);
		
		

	}

}
