package stack;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisBalanced {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//sc.next();
		while(t>0)
		{
			String str=sc.next();
			Stack<Character>s=new Stack<>();
			Boolean isBal=true;
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				
				if(c == '(' || c== '{' || c== '[' )
				{
					s.push(c);
					continue;
				}
				
				if(s.isEmpty())
				{
					isBal=false;
					break;
				}
				
				if(c == ')')
				{
					if(s.peek()=='(')
					{
						s.pop();
						//break;
						
					}
				else
				{
					isBal=false;
					break;
				}
				
				}
				if(c == '}')
				{
					if(s.peek()=='{')
					{
						s.pop();
						break;
					}
				else
				{
					isBal=false;
					break;
				}
				}
				
				if(c == ']')
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
			}
			
			if(!s.isEmpty())
			{
				isBal=false;
			}
			if(isBal)
			{
				System.out.println("Balanced");
			}
			else
			{
				System.out.println(" Not Balanced");
			}
			t--;
		}
	}

}


	


