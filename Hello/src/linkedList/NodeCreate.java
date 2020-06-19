package linkedList;

import java.util.ArrayList;

import linkedList.MyLinkedList.Node;

public class NodeCreate {
	
	Node head;
	public void add(int data) {
		 
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
	
	public void print()
	{
		Node temp=head;
		while(temp !=null)
		{
			System.out.println(temp.data +" ");
			temp=temp.next;
		}
	}
	
	
	public void InsertNodeHead(int data)
	{
		
		Node add=new Node(data);
		
		//Node temp=head;
		
		add.next=head;
		head=add;
		
	}

	
	public void specificPositionAdd(int data,int pos) {

		

		
		
		Node sp=new Node(data);
		
		if(head==null)
		{
			  sp=head;
		}
		else if(pos==0) {
			sp.next=head;
			
		}
		
			Node temp=head;
			
			for(int i=0;i<pos-1;i++)
			{
				temp=temp.next;
			}
			sp.next=temp.next;
			temp.next=sp;
			
			//return temp;
		
	}

	public void delNode(int pos)
	{
		Node post=head;
		Node pre=head;
		
		
		for(int i=0;i<pos;i++)
		{
			post=post.next;
		}
		for(int j=0;j <pos-1;j++)
		{
			pre=pre.next;
		}
		pre.next=post.next;
		
		
			
	}

	public void printReverse()
	{
		ArrayList a=new ArrayList();
		Node temp=head;
		while(temp !=null)
		{
			a.add(temp.data);
			temp=temp.next;
		}
		int len=a.size()-1;
		for(int i=len;i>=0;i--)
		{
			System.out.println(a.get(i));
		}
		
	}
	
	public int toRemove() throws Exception
	{
		
		
		Node temp=head;
		
		if(head==null)
		{
			throw new Exception("pop data From Empty Linked List");
		}
		if(temp.next == null)
		{
			return head.data;
		}
		while(temp.next.next  != null)
		{
			temp=temp.next;
		}
		Node tore=temp.next;
		temp.next=null;
		 
		
		return tore.data;
	}
	
	public int peek()
	{
		Node temp=head;
		
		if(temp.next != null)
		{
			return temp.data;
		}
		 
		while(temp.next != null)
		{
			temp=temp.next;
		}
		//Node pee=temp.next;
		return temp.data;
		
	}
	
	
//	private char[] get(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public Node compare(Node head1,Node head2)
//	{
//		Node t1=head1;
//		Node t2=head2;
//		
//		while(t1 != null && t2 != null)
//		{
//			if(t1.data != t1.data)
//			{
//				System.out.println("0");
//			}
//			
//			if(t1.next ==null && t2.next ==null) {
//				System.out.println("1");
//			}
//			
//			t1=t1.next;
//			t2=t2.next;
//		}
//		System.out.println("0");
//		
//	}

	public static class Node{
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}

}
