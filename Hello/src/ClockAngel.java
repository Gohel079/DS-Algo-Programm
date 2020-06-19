import java.text.DecimalFormat;
import java.util.Scanner;

public class ClockAngel {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int time=sc.nextInt();
		
		double l=sc.nextFloat();
		
		//DecimalFormat numberFormat = new DecimalFormat("00.00");
		//System.out.println(numberFormat.format(number));
		
		//double  ans=(time/360);//*l;
		
		double ans =(time/360.0)*l;
		System.out.println(ans);
		
		double ans1=ans;
		String doubleAsString = String.valueOf(ans1);
		int indexOfDecimal = doubleAsString.indexOf(".");
		
		String  h= doubleAsString.substring(0, indexOfDecimal);
		
		String m=doubleAsString.substring(indexOfDecimal);
		
		double ho = Double.parseDouble(h);
		double mi = Double.parseDouble(m);
		
		
//		
			System.out.println(calcAngle(ho,mi));
	}
	static int calcAngle(double h, double m) 
	{ 
		// validate the input 
		if (h <0 || m < 0 || h >12 || m > 60) 
			System.out.println("Wrong input"); 

		if (h == 12) 
			h = 0; 
		if (m == 60) 
			m = 0; 

		// Calculate the angles moved by hour and minute hands 
		// with reference to 12:00 
		int hour_angle = (int)(0.5 * (h*60 + m)); 
		int minute_angle = (int)(6*m); 

		// Find the difference between two angles 
		int angle = Math.abs(hour_angle - minute_angle); 

		// smaller angle of two possible angles 
		angle = Math.min(360-angle, angle); 

		return angle; 
	} 

}
