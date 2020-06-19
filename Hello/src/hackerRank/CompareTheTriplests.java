package hackerRank;

import java.util.Scanner;

public class CompareTheTriplests {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int alice=0;
		int bob=0;
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<3;j++)
		{
			b[j]=sc.nextInt();
					
		}
		for(int i=0;i<3;i++)
		{
			if(a[i]>b[i])
				alice+=1;
			if(a[i]<b[i])
				bob+=1;
				
		}
		System.out.println(alice+" "+bob);
	}

}
/*
a[0]>b[0] , so Alice receives  point.
a[1]=b[1], so nobody receives a point.
a[2]<b[2], so Bob receives  point.
**/
