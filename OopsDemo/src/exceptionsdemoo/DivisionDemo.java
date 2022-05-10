package exceptionsdemoo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
		
		 int a, b, result;
        Scanner sc = new Scanner(System.in);
       
         System.out.println("Input two integers");
         a = sc.nextInt();
         b = sc.nextInt();  // enter 0
        
         try //statements to be monitored which may throw arithmetic exception
         {
       	  result = a / b;
       	  System.out.println("Result = " + result);
         }
         
      // Exception thrown is handled in catch block
         catch(ArithmeticException e)
         {
       	  System.out.println("Divide by zero - enter non-zero values");
       	  System.out.println("Exception Description "+e.getMessage());
       	  System.out.println("Exception name and description "+e.toString());
       	  
       // Details abt exception Name, Description, Line number of code which generated Exception
       	  e.printStackTrace();
         }
         finally //cleanup operations
         {
       	  sc.close();
       	  System.out.println("In finally block - program execution ended");
         }
	}

}
