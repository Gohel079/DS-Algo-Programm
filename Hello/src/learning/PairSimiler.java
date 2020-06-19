package learning;

import java.util.Scanner;

public class PairSimiler {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		

		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		int k=0;
        int count=0;
        for(int i=1;i<n;i++){
            for(int j=2;j<n;j++){
                //1 3 5 7 8 2 5 7
               if(a[i]>a[j])
               {
                   k=a[j]+1;
                   if(a[i]==k){
                       count++;
                   }

               }
            
            }
        }
        System.out.println(count);
	}

}
