package arrayDemo;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int temp =a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
			
		}
		}
		for(int i=0;i<n;i++)
		{

				System.out.print(a[i]+" ");
			
		}
		
		

	}

}
