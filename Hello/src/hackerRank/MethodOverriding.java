package hackerRank;

class Cycle
{
	String def()
	{
		return "Cycle Class<C>";
	}
	
	}
class Motor extends Cycle
{
	String def()
	{
		return " Def Method<M>";
	}
	
	Motor()
	{
		String temp=super.def();
		System.out.println("Motor Class"+def());
		System.out.println("Super Class"+temp);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {

		Motor m=new Motor();

	}

}
