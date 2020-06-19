package Mathematics;

import java.util.Scanner;

public class ArithmeticProgression {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		
		int ans=110;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(ans+" ");
			ans=ans*d;
			
		}
		

	}

}
