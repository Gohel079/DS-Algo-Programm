package hackerRank;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[6][6];
		int ans=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				a[i][j]=sc.nextInt();
				}
			}
			
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				
				ans=a[i][j] + a[i][j+1] +a[i][j+2] + 
								a[i+1][j+1] 
						+ a[i+2][j] + a[i+2][j+1] +a[i+2][j+2];
				
				max=Math.max(max,ans);
				
			}
		}
		System.out.println(max);
		System.out.println(a.length-2);
		
	}

}
