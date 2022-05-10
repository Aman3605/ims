package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		try {
			Writer w=new FileWriter("c:/demo/data.txt");
			
			String content="She Sells Sea Sheels In the sea";
			
			w.write(content); //write contents into file
			w.close();
			System.out.println("Data Writen to file");
		}
		catch(IOException e)
		{
			System.err.println("Error Occured");
			e.printStackTrace();
		}
	}

}
