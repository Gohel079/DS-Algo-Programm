package linkedList;

public class MyLinkedList {
	
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
	
		public void print() {
				//Node head;
				
				Node  temp=head;
				while(temp != null) {
					System.out.print( temp.data+" ");	
					temp=temp.next;
				}
			}
		public int CountLength(int k)
		{
			Node temp=head;
			 //Node temp=head;
		     // Node p=head;
		      int count=0;
		      int sum=0;
		      while(temp != null)
		      {
		          count++;
		          temp=temp.next;
		      }
		      int ans=count-k;
		      temp=head;
		      for(int i=1;i<ans;i++)
		      {
		          temp=temp.next;
		      }
		      
		      
		    return temp.data;
		}
		
		
		
		static class Node{
			int data;
			Node next;
			
			public Node(int data) {
				this.data=data;
				next=null;
			}
		}

}
