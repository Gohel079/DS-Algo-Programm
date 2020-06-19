package linkedList;

import java.util.*;

public class ListUsingManipulation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer> l=new LinkedList<>();
		for(int i=0;i<n;i++)
		{
			
			l.add(sc.nextInt());
		}
		int q=sc.nextInt();
		
		
		for(int i=0;i<q;i++)
		{
			String s=sc.next();
			if(s.equals("Insert"))
			{
				int x=sc.nextInt();
				int y=sc.nextInt();
				
				l.add(x,y);
			}
			else
			{
				int z=sc.nextInt();
				
				l.remove(z);
			}
		}
		for(int sp:l)
		{
			System.out.print(sp+" ");
		}
		
		
		

	}

}
