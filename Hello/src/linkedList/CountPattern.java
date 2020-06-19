package linkedList;

import java.util.Scanner;

public class CountPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)//1<4//2<4
		{
			for(int j=1;j<=i;j++)//1<=1//2<=2
			{
				System.out.print(j+" ");//1 
										//1 2
			}
			System.out.println();
		}

	}

}
