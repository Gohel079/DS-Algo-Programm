package hackerRank;

import java.util.Scanner;

public class BitWiseAnd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//int t=sc.nextInt();
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		 int fi=0;
         for(int i=1;i<=n;i++) //{1,2,3,4,5}
         {
             for(int j=i+1;j<=n;j++) //{2,....5}
             {
                 int tmp=i&j; //0
                 if(tmp<k && tmp>fi)//(0<2 && 0>0)
                 {
                     fi=tmp;
                 }
             }
         }
         System.out.println(fi);

	}

}
