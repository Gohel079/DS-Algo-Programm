package stack;
import java.util.*;
public class DuplicateRemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		Stack<Integer> s=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			s.push(a[i]);
		}
		while(!s.isEmpty())
		{
			if(s.peek()==s.peek()+1)
			{
				s.pop();
				System.out.println(s.pop());
			}
			else
			{
				
				s.pop();
			}
		}
		
		

	}

}
