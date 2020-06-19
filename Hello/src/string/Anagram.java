package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		
		String a=sc.next();
		String b=sc.next();
		
		
		int a1=a.length();
		int b1=b.length();
		
		if(a1==b1)
		{
		System.out.println("Same");
		}
		else
		{
			System.out.println("Not Match");
		}
	}

}
