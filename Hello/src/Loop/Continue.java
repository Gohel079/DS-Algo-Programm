package Loop;

import java.util.*;
public class Continue {

	public static void main(String[] args) {
		//Scanner sc=new SCanner(System.in);

		for(int i=0;i<=100;i++)
		{
			if(i>=50 && i<=60)
				continue;
			System.out.println(i);
		}
	}

}
