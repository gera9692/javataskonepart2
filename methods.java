/* gerald manyasa @ 2105029
 * java programmer
 * Methods are used to perform certain actions, and they are also known as functions.
 * a method is a lock of code that only run only when its is clled by passing them parametesthroug them
 * this program allows user to enter values and the program checks and determines the numbers that are great and small
 * 

*/
package javamethods;// this is the folder where the source code is
import java.util.Scanner;

public class methods {
public static void number(int num1,int num2,int num3 ) {

	Scanner input=new Scanner(System.in);	
	System.out.print("enter the first number");
	num1=input.nextInt();
	System.out.print("enter the two number");
	num2=input.nextInt();
	System.out.print("enter the three number");
	num3=input.nextInt();
	
	if ((num1>num2)==true) // here we will use the repetition function
	{
		if(num1>num3) {
			System.out.print( "the largest number is:"+num1);
			
		}
		else
		{
			System.out.print("the smallest number is:"+num3);//output once the boolean turns false
		}
	}
	if ((num1>num2)==false)
	{
		if(num2>num3)
		{
			System.out.print( "the largest number is :"+num2);
		}
		else
		{ 
			System.out.print("the smallest number is :"+num2); // outputs this nce the boolean turns true
		}
	}
	System.out.print("\n");
	//this is to display the smallest
	
	
	if ((num1<num2)==false) // here we will use the repetition function
	{
		if(num1<num2) {
			System.out.print( "the largest number is:"+num1);
			
		}
		else
		{
			System.out.print("the smallest number is:"+num3);//output once the boolean turns false
		}
	}
	if ((num1<num2)==true)
	{
		if(num2<num3)
		{
			System.out.print( "the largest number is :"+num2);
		}
		else
		{ 
			System.out.print("the smallest number is :"+num3);
		}	// outputs this nce the boolean turns true
	}

}
	public static void main(String[] args) {
	number(0, 0, 0);
	
	
	
	
		// TODO Auto-generated method stub

	}

}
