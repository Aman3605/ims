package exceptionsdemoo;

import java.util.Scanner;

public class Divison {

	public static void main(String[] args) {
		
		 int a, b, result;
        Scanner sc = new Scanner(System.in);
       
         System.out.println("Input two integers");
         a = sc.nextInt();
         b = sc.nextInt();  // enter 0
        
        result = a / b;  // Throws Arithmetic exception
       
        System.out.println("Result = " + result);
        sc.close();
	}
}
