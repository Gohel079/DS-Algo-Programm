package priorityQueue;

import java.util.PriorityQueue;
import java.util.*;

public class ExampleOfPrioQueue {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		
		
		while(t>0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		PriorityQueue<Integer> p=new PriorityQueue<>();
		for(int i=0;i<n;i++)
		{
			if(i<k)
			{
				p.add(a[i]);
			}
			else
			{
				if(p.peek() < a[i])
				{
					p.poll();
					p.add(a[i]);
				}
			}
		}
		
		int an[]=new int[k];
		for(int i=0;i<k;i++)
		{
			an[i]=p.poll();
		}
		for(int i=k-1;i>0;i--)
		{
			System.out.println(an[i]+" ");//i=3
		}
//		ArrayList<Integer> ans=new ArrayList<>(p);
//		Collections.sort(ans,Collections.reverseOrder());
//		
//		for(int x:ans)
//		{
//			System.out.print(x+" ");
//		}
		System.out.println();
		
		t--;
		}
		
	}

}
