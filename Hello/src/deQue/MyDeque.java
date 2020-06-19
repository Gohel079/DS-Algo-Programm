package deQue;

public class MyDeque {

	public static void main(String[] args) throws Exception {

		DequeImplement<Integer> d=new DequeImplement<>();
		
		d.insertLast(40);
		d.insertLast(50);
		d.insertLast(60);
		
		d.insertFirst(30);
		d.insertFirst(20);
		d.insertFirst(10);
		
		//System.out.println("Remove "+ d.deleteFist());
		
		
		System.out.println("Last"+d.deleteLast());
		System.out.println("Peek from First "+d.peekFirst());
		System.out.println("Peek from Last "+d.peekLast());
		d.print();
		
	}
	}
