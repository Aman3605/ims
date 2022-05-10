package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address ad1=new Address("bangalore","karnataka","india",5000);
		Address ad2=new Address("hyderabad","telangana","india",500054);
		
		Students s1=new Students(101,"kak",ad1);
		Students s2=new Students(102,"hyg",ad2);
		
		s1.display();
		s2.display();
	}

}
