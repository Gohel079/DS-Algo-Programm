package whileDemo;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int temp=n;
		int r=0;
		while(temp>0)
		{
			int last=temp%10;
			r=r*10+last;
			temp=temp/10;
		}
		
		if(r==n)
		{
			System.out.println(n+"is PalinDrom");
		}
		else
		{
			System.out.println(n+"is Not Palindrom");
		}
	}

}
