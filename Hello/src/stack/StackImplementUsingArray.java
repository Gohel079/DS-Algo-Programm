package stack;

public class StackImplementUsingArray {
	
	
	int top;
	int size;
	int stack[];
	
	StackImplementUsingArray()
	{
		top=-1;
		size=10;
		stack=new int[size];
		
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==size-1;
	}
	public int push(int data)
	{
		if(isFull())
		{
			System.out.println("Stack is OverFlow");
		}
		return stack[++top]=data;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is UnderFlow");
		}
		return stack[top--];
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is UnderFlow");
		}
		return stack[top];
	}
	public void display()
	{
		for(int i:stack)
		{
			System.out.print(i+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplementUsingArray s=new StackImplementUsingArray();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		s.push(101);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		//s.display();
		System.out.println("Peek"+s.peek());
	}

}
