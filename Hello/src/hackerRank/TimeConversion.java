package hackerRank;

import java.util.Scanner;



public class TimeConversion {
	static String timeConversion(String s)
	{
		
		String[] str=s.split(":");
		int houre=Integer.parseInt(str[0]);
		String min=str[1];
		
		String secPeriod=str[2];
		String sec=str[2].substring(0,secPeriod.length()-2);
		String period=str[2].substring(secPeriod.length()-2,secPeriod.length());
		
		String newTime="";
		
		if((0 <= houre && houre<12) && (period.equalsIgnoreCase("AM")))
		{
			newTime=String.format("%02d",houre)+":"+min+":"+sec;
		}
		else if((0<=houre && 12>=houre) && (period.equalsIgnoreCase("PM"))) 
		{
			newTime=(12 + houre)+":"+min+":"+sec;
		}
		else if((houre==12) && (period.equalsIgnoreCase("PM")))
		{
			newTime ="00"+":"+min+":"+sec;
		}
		else if((houre==12) && (period.equalsIgnoreCase("AM")))
		{
			newTime=houre+":"+min+":"+sec;
			
		}
		
		return newTime;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String time=sc.nextLine();
		
		String res=timeConversion(time);
		
		System.out.println("Result :"+res);
		

	}

}
