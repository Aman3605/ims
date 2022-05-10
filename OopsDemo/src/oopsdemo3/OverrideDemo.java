package oopsdemo3;

class  SoftwareEngineer{
	protected String name,tech;
	double salary;
	
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void display()
	{
		System.out.println(name+" "+tech+" "+salary);
	}
	
	void work()
	{
		System.out.println("Coding & Testing");
	}
}
class Developer extends SoftwareEngineer{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);
	}
		void work() //overrideen method
		{
			System.out.println("Coding using :"+tech);
		}
	
}

class Tester extends SoftwareEngineer
{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
		
	}
	void work() //overrideen method
	{
		System.out.println("Testing using :"+tech);
	}

}

public class OverrideDemo {

	public static void main(String[] args) {
		
		SoftwareEngineer S1=new SoftwareEngineer("Navin","javadeveloper",3500);
		Developer D1=new Developer("tyson","java",5000);
		Tester T1=new Tester("bravo","jmeter",9000);
		
		 S1.display();
		 S1.work();
		 
		 D1.display();//invokes base class method
		 D1.work(); // invokes derived class overriden method
		 
		 T1.display();
		 T1.work();// invokes derived class overriden method
	}

}
