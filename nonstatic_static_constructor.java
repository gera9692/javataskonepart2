/*21/05029@gerald manayasa
 * java_programmer
 * Static constructor can initialize only static variable but non-static constructor can initialize both static and non-static variable. 
 * Static constructor do not have any access specifier but non-static constructor have access specifier*/
package Name;

public class nonstatic_static_constructor {
	public class Main {
		static int manyasa(int boom,int been){// this is the static method
		return boom*been;
	}
		
			
			public static void main (String[]args)
			
			{
				
			int jibu=nonstatic_static_constructor.product(59,2);//here is the non static constructor
			
			System.out.print(jibu);
			}

			private static int product(int val1, int val2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			}

	public static int product(int val1, int val2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*static void myMethod(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);
    myMethod("Jenny", 8);
    myMethod("Anja", 31);
  }*/
