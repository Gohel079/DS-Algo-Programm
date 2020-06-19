package arrayDemo;

import java.util.Scanner;

public class Arrays2DumDemo {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row ");
		int row=sc.nextInt();
		System.out.println("Enter Cols");
		int col=sc.nextInt();
		
		int a[][]=new int [row][col];
		int b[][]=new int [row][col];
		int c[][]=new int [row][col];
		
		System.out.println("Enter Array  a");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter Array B");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Array of Sum C");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
