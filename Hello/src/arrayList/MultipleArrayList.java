package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList[] s=new ArrayList[n];
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			s[i]=new ArrayList();
			for(int j=0;j<d;j++)
			{
			s[i].add(sc.nextInt());
			
			}
			//System.out.println(s[i]);
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			try
			{
				System.out.println(s[x-1].get(y-1));
			}
			catch(Exception e)
			{
				System.out.println("ERROR!");
			}
		}
		
		
		
	}
	

}
