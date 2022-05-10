package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer d1=new Developer(101,"James Gosling","jdbc"); //invoke derived class constructor
		Developer d2=new Developer(105,"red johnson","spring framework");
		
		d1.display(); //child class object invokes parent class methods
		d1.display1();  //child class object invokes child class methods

		d2.display();
		d2.display1();
	}

}
