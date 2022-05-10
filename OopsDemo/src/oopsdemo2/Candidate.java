package oopsdemo2;

// hierarchial inheritance

public class Candidate {
	
	 int id;
	 String name;
	 double salary;
	
	public Candidate(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("***********Candidates Details***********");
		System.out.println(this.id+" "+this.name+" "+this.salary);
	}
	

}
