package Loop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int a=sc.nextInt();
		System.out.println("Enter B Number");
		int b=sc.nextInt();
		int s=1;
		for(int i=0;i<b;i++)
		{
			 s=s*a;
			
		}
		System.out.println("Value"+s);
	}

}
