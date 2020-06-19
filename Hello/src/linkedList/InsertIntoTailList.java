package linkedList;

import linkedList.MyLinkedList.Node;

public class InsertIntoTailList {
	
	Node head;
	int data;
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

		public Node del()
		{
			
			//Node head;
			Node n=new Node(data);
			
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=n;
			
			return head;
		}
		
		public void printd()
		{
			
			Node temp=head;
			while(temp == null)
			{
				System.out.println(temp+" ");
				temp= temp.next;
			}
		}
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
}
