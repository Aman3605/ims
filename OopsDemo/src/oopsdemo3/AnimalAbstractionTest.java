package oopsdemo3;

abstract class Animal
{
	public void eat()
	{
		System.out.println("I can eat");
	}
	abstract void makeSound();  //abstracty method-without body
	{
		
	}
}
class Dog extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Bow Bow");
		
	}
	
}

class Cat extends Animal
{

	@Override
	void makeSound() {
		System.out.println("Mew Mew");
		
	}
	
}
public class AnimalAbstractionTest {

	public static void main(String[] args) {
		
		//Animal a=new Animal();   // cannot create instance of abstract class
		Dog d1=new Dog();
		
		d1.makeSound();
		d1.eat();
		
		Cat c1=new Cat();
		
		c1.makeSound();
		c1.eat();
	}

}
