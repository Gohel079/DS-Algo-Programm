package hackerRank;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];

		int s1=0;
		int s2=0;

		System.out.println("Enter a Number");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					s1+=a[i][j];	
				}
				if(i==n-j-1)
				{
					s2+=a[i][j];
				}
				//s1=a[0][0]+a[1][1]+a[2][2];
				//s2=a[0][2]+a[1][1]+a[2][0];
				
			}
		}
		System.out.println(s1+" "+s2);
		

		int ans=s1-s2;
		System.out.println(ans);
	}

}
