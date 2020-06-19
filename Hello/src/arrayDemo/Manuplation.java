package arrayDemo;

import java.util.*;

public class Manuplation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			String s=sc.next();
			
			if(s.equals("Insert"))
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				
				for(int j=n-1;j>=x-1;j--)
				{
					a[j+1]=a[j];
				}
				a[x-1]=y;
			}
			
		}
		for(Integer si:a)
		{
			System.out.print(si+" ");
		}
			
		
		}

	}


