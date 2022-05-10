package Assignments;

public class Rectangle {

	private float length, breadth;
	float area;
	public Rectangle(float length, float breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void Area()
	{
		area = length*breadth;
		System.out.println("The are of the rectangle is : "+area);
		System.out.println("Its length is : "+length);
		System.out.println("Its breadt is : "+breadth);
	}
}


