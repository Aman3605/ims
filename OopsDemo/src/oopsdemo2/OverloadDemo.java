package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		//invoking add overload method
		a1.add();
		a1.add(20,30);
		a1.add(34.75f,542.67f);  //we are having double in Addition class but, here we are type promtoing (type promotion)
		a1.add(300,500,100);
		a1.add("Hello","World");


	}

}
