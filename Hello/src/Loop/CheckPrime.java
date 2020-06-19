package Loop;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int p=sc.nextInt();
		boolean isPrime=true;
		for(int i=2;i*i<=p;i++)
		{
			if(p%i==0)
			{
				isPrime=false;
				
				break; 
			}
			
			if(p<2)
			{
				isPrime=false;
			}
		}
		System.out.println("isPrime :"+isPrime);
}
}
		


