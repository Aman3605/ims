package oopsdemo3;

final class Hello
{
	  final void display()
    {
        System.out.println("This is a final Method");
    }
}

 

/*class World extends Hello  // final classes cannot be extended
{
    // final methods cannot be overridden
    final void display()  
    {
        System.out.println("This is a final Method");
    } 
} */

public class FinalDemo {

	public static void main(String[] args) {
		final int AGE=30;
		final float PI=3.14f;
		
		
		//AGE=50; // CANNOT CHANGE THE VALUE
		
	}

}
