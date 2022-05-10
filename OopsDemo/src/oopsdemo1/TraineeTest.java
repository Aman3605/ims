package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee();// invokes implicit constructer
		t1.display();
		
		//invokes parametarized constructor
		Trainee t2=new Trainee(525,"rajesh","engineer",9000);
		t2.display();
		
		Trainee t3=new Trainee(201,"pushpa","builder",65000);
		t3.display();
		
	}

}
