package array;

import java.util.Scanner;

public class SimplePrintArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t,n,p;
		
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			n=sc.nextInt();
			p=sc.nextInt();
			
			int a[]=new int[n];
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}
			for(int k=0;k<n;k++)
			{
				System.out.println(a[p]);
			}
		}
		

	}

}
