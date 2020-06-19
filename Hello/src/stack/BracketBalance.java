package stack;

import java.util.*;

public class BracketBalance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		Stack<Character>s=new Stack<>();
		boolean isBal=true;
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			if(c=='{' || c=='[' || c=='(')
			{
				s.push(c);
				//System.out.println("Push :"+c);
			}
			
			if(s.isEmpty())
			{
				isBal=false;
				break;
			}
			if(c=='}')
			{
				if(s.peek()=='{')
				{
					s.pop();
					//System.out.println("POP } :"+c);
				}
				else
				{
					isBal=false;
					break;
				}
			}
			
			if(c==']')
			{
				if(s.peek()=='[')
				{
					s.pop();
				}
				else
				{
					isBal=false;
					break;
				}
			}
			
			if(c==')')
			{
				if(s.peek()=='(')
				{
					s.pop();
				}
				else
				{
					isBal=false;
					break;
				}
			}
			System.out.println(i);
			
			
			
			

		
		}
		if(!s.isEmpty())
		{
			isBal=false;
		}
		if(isBal)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
