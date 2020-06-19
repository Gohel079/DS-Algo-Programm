package deQue;

public class DequeImplement <E>
{

	Node<E> head,tail;
	
	public void insertFirst(E data)
	{
		Node<E> toAdd=new Node<>(data);
		
		if(head==null) {
			head=tail=toAdd;
		}
		head.prev=toAdd;
		toAdd.next=head;
		head=toAdd;
	}
	
	public void insertLast(E data)
	{
		Node<E> toAdd =new Node<>(data);
		
		if(head==null) {
			head=tail=toAdd;
		}
		
		tail.next=toAdd;
		toAdd.prev=tail;
		tail=toAdd;
	}
	
	public E deleteFist() throws Exception {
		
		Node toRemove=head;
		toRemove=head.next;
		toRemove.prev=null;
		head=toRemove;
		
		if(tail==null)
		{
			
			head=null;
		}
		
		return head.data;
		
	}
	
	public E deleteLast() {
		
		Node<E >toRemove=tail;
		
		toRemove=tail.prev;
		toRemove.next=null;
		
		tail=toRemove;
		
		return toRemove.data;
				
		
	}
	
	public E peekFirst()
	{
		return head.data;
	}
	public E peekLast()
	{
		return tail.data;
	}
	public void print()
	{
		Node temp=head;
		
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}
		public static class Node<E>{
			E data;
			Node<E> prev,next;
			
			public Node(E data)
			{
				this.data=data;
				prev=next=null;
			}
			
		}
}
