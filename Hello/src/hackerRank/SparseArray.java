package hackerRank;

import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
		int s=sc.nextInt();
		
		String str[]=new String[s];
		//int q;
		//String qu[]=new String[q];
		
		for(int i=0;i<s;i++) {
			str[i]=sc.next();
		}
		int q=sc.nextInt();
		String qur[]=new String[q];
		for(int j=0;j<q;j++) {
			qur[j]=sc.next();
		}
			
		int c[]=new int[q];
		for(int i=0;i<s;i++) {
			for(int j=0;j<q;j++) {
				if(qur[j].equals(str[i])) {
					c[j]=c[j]+1;
				}
			}
		}
		for(int i=0;i<q;i++) {
			System.out.println(c[i]);
		}
		
	}

}
