package oopsdemo1;
//program to demonstrate constructors in java
class Language
{
	private String s;
	private int version;
	
	Language()       //	Implicit constructor
	{
		System.out.println("Iam a implicit constructer");
		s="python";
		System.out.println("Hello from :"+s);
	}
	
	Language(String lang) //parametarized constructer with 1 arguments
	{
		System.out.println("Iam a parametarized constructer");
		this.s=lang;
		System.out.println("Hello from :"+s);
	}
	Language(String lang,int ver) //paramtearized constructor with 2 arguments
	{
		System.out.println("Iam a parametaraized constructer with two arguments");
		this.s=lang;
		this.version=ver;
		System.out.println("Hello from :"+s+"v."+version);
	}
	
}
public class LanguagesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language L1=new Language(); //automatically invokes implicit constructer
		Language L2=new Language("Ruby"); // automatically invokes parametarized constructer
		Language L3=new Language("Scala"); 
		Language L4=new Language(); 
		Language L5=new Language("java",2); // automatically invokes 2 args parametarized constructer
	}
	}


