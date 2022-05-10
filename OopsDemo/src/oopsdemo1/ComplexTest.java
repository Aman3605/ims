package oopsdemo1;

public class ComplexTest {

	public static void main(String[] args) {
		
		Complex c1=new Complex(10.3,67.4);//invokes Constructor
		Complex c2=new Complex(0.7,3.6); //invokes Constructor
		
		c1.add(c2);  // calls method add() by  passing object c2
		
		// c3=c1+c2
		
		System.out.println("The addition of two complex number is :");
		c1.display();
		
	}

}
