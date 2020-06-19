package Loop;

import java.util.*;
public class Series2 {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		float res=0;
		
		for(float i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				res=res-1/i;
			}
			else
			{
				res=res+1/i;
			}
		}
		System.out.println("Result :"+res);

	}

}
