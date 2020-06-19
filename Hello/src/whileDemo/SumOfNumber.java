package whileDemo;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;
		int sum=0;
		
		while(temp>0)
		{
			int last=temp%10;
			temp=temp/10;
			
			sum=sum+last;
		}
		System.out.println("Sum of "+n+" "+sum );

	}

}
