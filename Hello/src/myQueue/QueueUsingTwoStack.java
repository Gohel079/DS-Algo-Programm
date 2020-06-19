package myQueue;
import java.util.*;
public class QueueUsingTwoStack 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		Fun f=new Fun();
		
		int t=sc.nextInt();
		
		while(t>0)
		{
		
						
			
			
			int q=sc.nextInt();
			
			if(q==1)
			{
				int d=sc.nextInt();
				//s1.push(d);
				f.add(d);
			}
			
			else if(q==2)
			{
				f.remove();
				
		  
			}
			else if(q==3)
			{
				f.print();
				 
			}
	
			t--;
		}
		
		

	}
}

class Fun
{
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	public void add(int d)
	{
		s1.push(d);
	}
	
	 public  int remove()
     {

         if(s2.isEmpty())
         {
             while(!s1.isEmpty())
             {
             s2.push(s1.pop());
             }
             if(s2.isEmpty())
             {
                 return -1;
             }
             else

                 return s2.pop();

         }
         else
         {
             return s2.pop();
         }

  
     }
	
	 public  void print()
     {
        // System.out.println(s2.peek());
      if(s2.isEmpty())
             {
                 while(!s1.isEmpty())
                 {
                     s2.push(s1.pop());
                 }
                 System.out.println(s2.peek());
             } 
             else 
             {
                 System.out.println(s2.peek());
             }
         
     }
}

