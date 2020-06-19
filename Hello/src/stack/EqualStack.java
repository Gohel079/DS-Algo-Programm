package stack;

import java.util.*;

public class EqualStack {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		Stack<Integer> s3=new Stack<>();
		int sum1=0;
		int sum2=0;
		int sum3=0;
		System.out.println("Enter n1");
		int n1=sc.nextInt();
		
		System.out.println("Enter n2");
		int n2=sc.nextInt();
		
		System.out.println("Enter n3");
		int n3=sc.nextInt();
		
		int[] h1=new int [n1];
		
		int[] h2=new int [n2];
		
		int[] h3=new int [n3];
		System.out.println("Enter Arraay H1");
		for(int i=0;i<n1;i++)
		{
			h1[i]=sc.nextInt();
		}
		System.out.println("Enter Arraay H2");
		for(int i=0;i<n2;i++)
		{
			h2[i]=sc.nextInt();
		}
		System.out.println("Enter Arraay H3");
		for(int i=0;i<n3;i++)
		{
			h3[i]=sc.nextInt();
		}
		
		for(int i=h1.length-1;i>=0;i--)
		{
			int c=h1[i];
			s1.push(c);
			sum1=sum1+h1[i];
		}
		for(int i=h2.length-1;i>=0;i--)
		{
			int c=h2[i];
			s2.push(c);
			sum2=sum2+h2[i];
		}
		for(int i=h3.length-1;i>=0;i--)
		{
			int c=h3[i];
			s3.push(c);
			sum3=sum3+h3[i];
		}
			
		while(!(sum1==sum2 && sum2==sum3 && sum1==sum3)) {
			
			if(sum1==0 || sum2==0 || sum3==0 ) {
				sum1=0;
				break;
			}
			else if(sum1>=sum2 && sum1>=sum3) {
				
			
			sum1=sum1-s1.peek();
			s1.pop();
			}
			else if(sum2>=sum1 && sum2>=sum3 )
			{
			sum2=sum2-s2.peek();
			s2.pop();
			}
			else if(sum3>=sum2 && sum3==sum1)
				
			{
			sum3=sum3-s3.peek();
			s3.pop();
			}		
		}
		System.out.println("ans-"+sum1);
		System.out.println("ans-"+sum2);
		System.out.println("ans-"+sum3);
		
	
	}

}
