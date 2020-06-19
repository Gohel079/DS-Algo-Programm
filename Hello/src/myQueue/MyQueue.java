package myQueue;

import linkedList.NodeCreate.*;



public class MyQueue {
	
	Node head,rear;
	public int  enQueue(int data)
	{
	
		Node toAdd=new Node(data);
	
		if(head==null)
		{
			head=rear=toAdd;
		}
		
		rear.next=toAdd;
		rear=rear.next;
		return rear.data;
		
		
		
	}
	public int deQueue()
	{
		Node temp=head;
		
		if(head==null)
		{
			return 0;
		}
		head=head.next;
		if(head == null)
		{
			rear=null;
		}
		return temp.data;
		
	}
	
	public int peek()
	{
		Node temp=head;
		
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


