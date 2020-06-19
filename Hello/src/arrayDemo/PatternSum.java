package arrayDemo;
import java.util.*;

public class PatternSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		int a[][]=new int[6][6];
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		int max=-900;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				sum=a[i][j]+a[i][j+1]+a[i][j+2]+
							a[i+1][j+1]+
					a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				
				max=Math.max(max,sum);
						
				
			}
		}
		System.out.println(max);
		//int h=Integer.MAX_VALUE;
		//.out.println("Min"+h);
	}

}
