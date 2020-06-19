package arrayDemo;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number od Student");
		
		int n=sc.nextInt();
		int sum=0;
		
		int marks[]=new int[n];
		
		System.out.println("Enter Subject Marks");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			 sum=sum+marks[i];
		}
		int avg=sum/n;
		
		System.out.println("Total Avg is"+avg);
		System.out.println("Total Avg is"+sum);
		
		
		
		

	}

}
