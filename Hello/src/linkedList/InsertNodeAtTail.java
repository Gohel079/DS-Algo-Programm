package linkedList;

import java.util.Scanner;
import java.util.Stack;

import myQueue.MyQueue;

public class InsertNodeAtTail {

	public static void main(String[] args) throws Exception {
		
//		Scanner sc=new Scanner(System.in);
//		
//		int n=sc.nextInt();
		
		NodeCreate head=new NodeCreate();
		NodeCreate head1=new NodeCreate();
		
		MyQueue q=new MyQueue();
		
		q.enQueue(10);
		
	
		Stack s=new Stack();
		
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		//s.pop();
		System.out.println("Stack in Peek"+s.peek());
		head.add(10);
		head.add(20);
		head.add(30);
		head.add(40);
		
		head1.add(50);
		head1.add(770);
		head1.add(30);
		head1.add(40);
		
		//head.toRemove();
		head.print();
		System.out.println("DEmo"+head.toRemove());
		System.out.println("Peek "+head.peek());
		//head.InsertNodeHead(10);
		//head.InsertNodeHead(15);
		//head.specificPositionAdd(21,0);
		//head.delNode(2);
		//head.printReverse();
		//head.compare(head,head1);
		head.print();
		
		
		

	}
		

}
