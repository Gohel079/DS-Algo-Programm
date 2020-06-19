package learning;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) 
	{
		
	
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int fact=s.nextInt();
		int sum=1;
		
		for(int i=fact;i>0;i--)
		{
			sum=sum*i;
		}
		System.out.println("Result :"+sum);

	}

}
