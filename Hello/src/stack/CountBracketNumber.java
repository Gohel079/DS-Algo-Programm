package stack;

import java.util.*;

public class CountBracketNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-- >0)
		{
			Stack<Integer> s=new Stack<>();
			
			String str=sc.nextLine();
			int open=0;
			//int close=0;
			
			
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				
				if(c=='(')
				{
					s.push(++open);
					System.out.print(open);
					//close=open;
				}
				else if(c==')')
				{
					
					System.out.print(s.pop());
					//close--;
					
				}
				
			}
		
			
		}

	}

}
