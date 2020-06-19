	package learning;

import java.util.*;
public class Factorial {

	public static void main(String[] args) {
	

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter NUmber");
			int n=sc.nextInt();
			int sum=1;
			for(int i=n;i>0;i--)
			{
				sum=sum*i;
				
			}
			System.out.println("Result ="+sum);
			
	}

}