package oopsdemo1;

public class ThisDemo {
	int age;

	
		//instance method
		//this keyword is used in instance method to access objectwhich invokes the method
		void init(int age)
		{
			this.age=age; // this keyword refers to the current object 
		}
	
		public static void main(String[] args) {
			
			ThisDemo td1=new ThisDemo();
			td1.init(20);
			
		}

}
