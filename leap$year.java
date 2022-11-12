/* gerald manyasa @ 2105029
 * java programmer
 * the user enters the year and the prgram checks and determine if it is a leapyear or not
*/
package Name;

import java.util.Scanner;

public class leap$year 
{
	
	public static void main(String[]args)
	{
	int number_entered;
	Scanner input =new Scanner(System.in);
	System.out.print("hey kid,kindly enter the year to be tested");
	number_entered=input.nextInt();
//we use modulus because when we divide by 4 it should  be divisible by 4 for it to be a leap year
	System.out.print("\n");
if (number_entered  %4==0) 
{
	System.out.println(" we have entered into a leap year"+number_entered+"is not a leap year");//outputs leap year if true
}


else {
	System.out.println( "we have not yet reached the leap year");//outputs have not yet reached if false
}}


}
