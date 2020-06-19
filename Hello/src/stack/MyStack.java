package stack;

public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImp s=new StackImp();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		//System.out.println("Pop "+ s.pop());
		System.out.println("Peek "+s.peek());
		
		s.print();

	}

}
