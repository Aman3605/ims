package week01ass;

import java.util.Scanner;

public class FareinheitToCelcius {
	  public static void main (String args[])  
	    { 
		  float Fahrenheit, Celsius;  
	         Scanner sc=new Scanner(System.in);
	         sc.close();
	         Fahrenheit=sc.nextFloat();
	          Celsius  = ((Fahrenheit-32)*5)/9;  
	          System.out.println("Temperature in celsius is: "+Celsius); 
}
}