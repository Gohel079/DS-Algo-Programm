package myQueue;

import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue q=new MyQueue();
		Queue<Integer>m=new LinkedList<>();
		
//		m.add(15);
//		m.add(47);
//		m.add(84);
//		System.out.println(m);
//		m.poll();
//		System.out.println(m);
		
		q.enQueue(20);
		q.enQueue(10);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		//q.peek();
		q.print();
		
		System.out.println("Dequeue "+q.deQueue());
		System.out.println("Dequeue "+q.deQueue());
		
		System.out.println("Peek "+q.peek());
		
	}

}
