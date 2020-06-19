package stack;

import java.util.*;

public class ImmediateSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
	    	int n=sc.nextInt();
	    	int a[]=new int[n];
	    	Stack<Integer>s=new Stack<>();
	    	for(int i=0;i<n;i++)
	    	{
	    	    a[i]=sc.nextInt();
	    	    
	    	}
	       for(int i=n-1;i>=0;i--)
	    	{
	    	    s.push(a[i]);
	    	    
	    	}
	    //	System.out.print(s.peek()+1);
	    	for(int i=1;i<=n-1;i++)
	    	{
	    	   if(s.peek() >a[i])
	    	   {
	    	       System.out.print(a[i]+" ");
	    	       s.pop();
	    	   }
	    	  
	    	   else
	    	   {
	    	       s.pop();
	    	       System.out.print("-1"+" ");
	    	   }
	    	    
	    	}
	    	System.out.print("-1"+" ");
	    	System.out.println();
	    	
	    	
		
		
		t--;
		}
	}

}
