package stack;

import linkedList.NodeCreate.*;
public class StackImp {
	
	Node head;
	public void push(int data)
	{
		
		Node toAdd =new Node(data);
		 
		 if(head ==null) {
			 head=toAdd;
			 return;
		 }
		 
		 Node temp=head;
		 while(temp.next != null) {
			 temp=temp.next;
		 }
		 temp.next=toAdd;
		
		
	}
	
	public int peek()
	{
		Node temp=head;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		return temp.data;
	}
	
	public int  pop()
	{
		Node temp=head;
		while(temp.next.next != null)
		{
			temp=temp.next;
		}
		Node toRemove=temp.next;
		temp.next=null;
		return temp.data;
		
	}
	
	public void print()
	{
		
		Node temp=head;
		if(head==null)
		{
			System.out.print(temp.data+" ");
		}
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

}
