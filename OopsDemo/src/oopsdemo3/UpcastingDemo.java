package oopsdemo3;

class Game {
	public void play() {
		System.out.println("Game is being played");
	}

	public void noOfPlayers() {
		System.out.println("No of players depend upon the game");
	}

	public void winner(String name) {
		System.out.println("Winner is : " + name);
	}
}

class Cricket extends Game {

	@Override
	public void noOfPlayers() {
		System.out.println("22");
	}

	public void teams() {
		System.out.println("2");
	}
}

class Chess extends Game {

	@Override
	public void noOfPlayers() {
		System.out.println("2");
	}
}
// Up casting is used when you want to generalize a function or
//property so that it can be used by any of it’s sub type.

public class UpcastingDemo {

	public static void main(String[] args) {
		Game g = new Cricket();// Up casting -- call overridden & base class methods
		Game g1 = new Chess();

		g.play();
		g.noOfPlayers();
		g.winner("A");

		// g.teams()//throwing error
		Cricket c = new Cricket();

		c.teams();

		g1.play();
		g1.noOfPlayers();
		g1.winner("A");

		System.out.println("**********");

		Game g100;

		g100 = new Cricket(); // up casting

		g100.play();
		g100.noOfPlayers();
		g100.winner("DC");

		g100 = new Chess();
		g100.play();
		g100.noOfPlayers();
		g100.winner("Vishwanthan Anannd");
		System.out.println("**********");

	}

}