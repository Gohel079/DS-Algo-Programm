package linkedList;

import linkedList.InsertDataIntoSortedList.Node;

public class ReverseDoublyLinkedList {
	
	Node head;
	Node tail;
	Node s=head;
	public void add(int data) 
	{
		 
		 Node toAdd =new Node(data);
		 
		   if (head == null) 
		   {
               head = toAdd;
           } 
		   else 
           {
               tail.next = toAdd;
               toAdd.prev = tail;
           }

           this.tail = toAdd;
	}	 
	
	
	public Node reverse()
	{
		Node cur=head;
		while(cur != null)
		{
			Node temp=cur.next;
			cur.next=cur.prev;
			cur.prev=temp.next;
			
			temp=cur;
			cur=cur.prev;
			
			
		}
		
		
		return head;
		
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

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReverseDoublyLinkedList l=new ReverseDoublyLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(50);
		l.add(80);
		System.out.println("Data Added");
		l.reverse();
		l.print();
		

	}
	
	public static class Node
	{
		int data; 	
		public Node next;
		public Node prev;
		public  Node(int data)
		{
			this.data=data;
			Node next=null;
			Node prev=null;
		}
	}

}

