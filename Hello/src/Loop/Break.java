package Loop;

import java.util.*;
public class Break {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number");
		
		
		
		for(;;)
		{
			int n=sc.nextInt();
		if(n<1)
		{
			System.out.println("Negative");
			break;
		}
		}
		

	}

}
