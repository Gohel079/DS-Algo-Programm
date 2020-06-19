package Loop;

import java.util.Scanner;

public class PatternGap {

	public static void main(String[] args) {
		
		for(;;)
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("*");
		
		for(int i=2;i<=n-1;i++)
		{
			System.out.print("* ");
			for(int j=1;j<=i-2;j++)
			{
				System.out.print("  ");
			}
			System.out.print("* ");
			
			System.out.println();
		}
		
		if(n>1)
		{
		
		for(int j=1;j<=n;j++)
		{
			System.out.print("* ");
		}
		}
	}

}
}
