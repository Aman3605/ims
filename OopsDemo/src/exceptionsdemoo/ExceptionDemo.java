package exceptionsdemoo;

//general exception handling
public class ExceptionDemo {

	public static void main(String[] args) {
		
		String languages[] = { "C", "C++", "Java", "Perl", "Python" };
	       
      try
      {
          for(int i=0;i<=4;i++) //if i<=5 then it throws errors
          {
              System.out.println(languages[i]);
          }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
	}

}

