package arrayDemo;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int  i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int j=0;j<n;j++)
		{
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				count++;
			}
		}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Totaol swap:"+count);
		System.out.println("First element:"+a[0]);
		System.out.println("Last elemnt:"+a[n-1]);

	}

}
