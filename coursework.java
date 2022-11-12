/* gerald manyasa @ 2105029
 * java programmer
 * the user enters the three marks of the unit and it calculates and compute the marks of math, networking and java programming and later it gives the average 
 * 

*/
package Name;

import java.text.DecimalFormat;// the output of average will be in decimal point
import java.util.Scanner;

public class coursework {
	private static final DecimalFormat df=new DecimalFormat("0.00");
	public static void main(String[]args)
	{// introduction of variables
		int java_programming, networking,maths, sum;
		double average;
		
	Scanner input=new Scanner(System.in);//this requires the user to enter the valuesinto the prgrm
	System.out.println("enter your  java programming marks");
	java_programming=input.nextInt();
	System.out.println("enter your networking");
	networking=input.nextInt();
	System.out.println("enter your maths");
	maths=input.nextInt();
	sum=java_programming+networking+maths;
	average=sum/3;
	//System.out.printf("\n");
	// the program outputs the  values as required
	System.out.printf(" your java_programming is:"+java_programming);
	System.out.printf(" your networking is:"+networking);
	System.out.printf(" your maths is:"+maths);
	System.out.printf(" your average is:"+average);
	//System.out.printf("\n");
	}

}
