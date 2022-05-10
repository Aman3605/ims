package basics;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		float a,r;
		final float PI=3.14f;
		
		System.out.println("Enter Radius Of Circle :");
		r=s.nextFloat();
		
		a=PI*r*r;
		 
		System.out.print("The Area of Circle is : ");
		System.out.format("%.1f", a);
	}

}
