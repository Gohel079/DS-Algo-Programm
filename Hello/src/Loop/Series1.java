package Loop;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		float res=0;
		for(float i=1;i<=n;i++)
		{
			res=res+1/i;
		}
		System.out.println("Result :"+res);
		
	}

}
