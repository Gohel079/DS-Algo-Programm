package Mathematics;

import java.util.Scanner;

public class mean 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Mean(n);
		median(n);
		
		
	}


public static void Mean(int j)
{
	Scanner sc=new Scanner(System.in);
	int h;
	int ans=0;
	for(int i=1;i<=j;i++)
	{
		h=sc.nextInt();
		ans=ans+h;
	}
	int m=ans/j;
	
	System.out.println(m);
}
public static void median(int p)
{
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=p;i++)
	{
		int s=sc.nextInt();
	}
	if(p%2==0)
	{
		int z=p/2;
		System.out.println(z);
	}
	else
	{
		int x=p+1/2;
		System.out.println(x+" ODD");
	}
	
}
}
