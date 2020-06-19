package hackerRank;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int n=sc.nextInt();
		int pos=0;
		int neg=0;
		int zero=0;
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				pos++;
			}
			if(a[i]<0)
			{
				neg++;
			}
			if(a[i]==0)
			{
				zero++;
		
			}
			
		}
		 double ans=pos/n;
		double ans1=neg/n;
		double ans2=zero/n;
		
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
			
	}

}
