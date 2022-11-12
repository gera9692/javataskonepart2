/* gerald manyasa @ 2105029
 * java programmer
 * the user enters the base and height and the program calculates the area
 * in the second method the user enters the width and height  and calculate the area*/
package area;//folder name

import java.util.Scanner;//best way to read in a java

public class areatriangle {//class name is area of a triangle
	public static void areaoftriangle(int base,int height,int area) {
		
		//this is the scanner input function which allows the user to input values
		Scanner input =new Scanner(System.in);
	System.out.println("enter the base of the triagle");
	base=input.nextInt();
	System.out.println("enter the height of the triagle");
	height=input.nextInt();
	//area=(base*height)/2
	area=(base*height)/2;
	System.out.println("your area for triangle  is:"+area);
	}
	public static void areaofrectangle(int length, int width,int area) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		length=input.nextInt();
		System.out.println("enter the width of the rectangle");
		width=input.nextInt();
		//area=(base*height)/2
		area=length*width;
		System.out.println("your area for rectangle is:"+area);	
	}
	public static void main(String[]args)
	{
		areaoftriangle(0, 0, 0);
		areaofrectangle(0, 0, 0);
		
		
	
	}

}
