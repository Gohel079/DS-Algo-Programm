package tcs_codeVita;

import java.util.Scanner;

public class SimilarChar {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String m=sc.next();
		char c;
		String s=" ";
		for(int i=11;i<m.length();i++)
		{
			c=m.charAt(i);
			 s = fillString(c, n);
			
		}
		System.out.println(s);
		
		 
	        
	        //s = ">" + fillString(' ', 25) + "<";
	       // System.out.println(s);
			
	   
	   
	        // Print the read value 

		

}
	public static String fillString(String fillChar, int count){
	    // creates a string of 'x' repeating characters
	    char[] chars = new char[count];
	    while (count>0)
	    	chars[--count] = fillChar;
	    return new String(chars);
	}
}

