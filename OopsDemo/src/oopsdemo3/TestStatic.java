package oopsdemo3;

public class TestStatic {

	public static void main(String[] args) {
		
		Student.collegeChange();  // invoke static method even before creating obj
	       
        Student s1=new Student(101,"Mike");  //instance method
        Student s2=new Student(102,"John"); //instance method
        Student s3=new Student(103,"Mary"); //instance method
       
        s1.display(); //instance method call
        s2.display(); //instance method call
        s3.display(); //instance method call

	}

}
