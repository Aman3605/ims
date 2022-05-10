package miscellaneous;

/*
 * Java Math class provides several methods to work on math calculations.
 * It is a final class & provides methods for numeric & geometric functions
 */

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 7;
	    int j = -9;
	    double x = 72.3;
	    double y = 0.34;
	  
	    System.out.println("i is " + i);     
	    System.out.println("j is " + j);
	    System.out.println("x is " + x);     
	    System.out.println("y is " + y);
	     
	    // The absolute value of a number is equal to 
	    // the number if the number is positive or 
	    // zero and equal to the negative of the number 
	    // if the number is negative.
	 
	    System.out.println("|" + i + "| is " + Math.abs(i));     
	    System.out.println("|" + j + "| is " + Math.abs(j));
	    System.out.println("|" + x + "| is " + Math.abs(x));     
	    System.out.println("|" + y + "| is " + Math.abs(y));

	    // Truncating and Rounding functions
	 
	    // You can round off a floating point number  
	    // to the nearest integer with round()
	    
	}

}
