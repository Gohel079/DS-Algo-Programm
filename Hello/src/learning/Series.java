package learning;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		float res=0;
		 for(float i=1;i<=a;i++)
		 {
			 if(i%2==0)
			res -=1/i;
			 else
				 res +=1/i;
		 }
		 System.out.println(res);

	}

}
