package learning;

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
	int a;
	int num;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter First Number");
	a=sc.nextInt();
	
	System.out.println("Enter Seconfd Number");
		int	b=sc.nextInt();
		
		num=sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("Result"+(a+b));
			break;
		case 2:
			System.out.println("Result"+(a-b));
			break;
		case  3:
			System.out.println("Result"+(a*b));
			break;
		case 4:
			System.out.println("Result"+(a/b));
			break;
			
			
		}
	}

}
