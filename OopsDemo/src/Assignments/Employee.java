package Assignments;

public class Employee {

	int year;
    String name,address;
    
	
    
	public Employee(String name,int year,String address) {
		this.name = name;
		this.year = year;
		this.address = address;
	}

	void display()
    {
       
        System.out.println(name+" "+year+" "+address);
    }
	
}
