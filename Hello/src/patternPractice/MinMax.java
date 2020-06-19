package patternPractice;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i;j<5;j++)
			{
				sum+=a[j];	
			}
				
		}
		

	}

}
