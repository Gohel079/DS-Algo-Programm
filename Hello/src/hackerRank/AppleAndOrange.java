package hackerRank;

import java.util.Scanner;

public class AppleAndOrange {

	static void countAppOra(int s,int t,int a,int b,int[]  apples,int[] orange)
	{
		int app=0;
		int ora=0;
		
		for(int i=0;i<apples.length;i++)
		{
			
			int a1=a+apples[i];
			if(a1>=s && a1<=t)
			{
				app++;
			}
		}
		for(int i=0;i<orange.length;i++)
		{
			int b1=b+orange[i];
			if(b1 >=s && b1<=t)
			{
				ora++;
			}
		}
		System.out.println(app);
		System.out.println(ora);
	}
	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter S & T");
			int s=sc.nextInt();
			int t=sc.nextInt();
			System.out.println("Enter A & B");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Enter M & N");
			int m=sc.nextInt();
			int n=sc.nextInt();
			int apple[]=new int[m];
			int orange[]=new int[n];
			
			for(int i=0;i<m;i++)
			{
				System.out.println("Apple D"+i);
				apple[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				System.out.println("Orange D"+i);
				orange[i]=sc.nextInt();
			}
			countAppOra(s,t,a,b,apple,orange);
			
			                     
			
	}

}
