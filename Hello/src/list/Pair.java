package list;

public class Pair<X,Y> {
	
	X x;
	Y y;
	
	public Pair(X x,Y y) {
		this.x=x;
		this.y=y;
	}
	public void getDes() {
		System.out.println(x+" and "+y);
	}

}
