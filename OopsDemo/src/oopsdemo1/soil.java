package oopsdemo1;

import java.util.Scanner;

public class soil {

	public static void main(String[] args) {

	    Tamagotchi blue = new Tamagotchi();

	    Scanner scanner = new Scanner(System.in);
	    String Input = scanner.nextLine();

	    switch (Input) {
	    case "Sandy":
	        blue.clay();
	        break;

	    case "clayey":
	        blue.sandy();
	        break;


	    default: System.out.println("no valid option");
	        break;
	    }
	}
}
