package Assignments;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee("Robert",1994,"64C- WallsStreet");
		Employee E2=new Employee("Sam",2000,"68D- WallsStreet");
		Employee E3=new Employee("John",1999,"26B- WallsStreet");
		
		System.out.println("Name Year of joining Address");
		E1.display();
		E2.display();
		E3.display();
		
}

}