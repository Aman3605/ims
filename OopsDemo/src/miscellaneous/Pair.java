package miscellaneous;

//Generic class with 2 parameters ; maps--->key and values pair

public class Pair<T,U> {

	private T first;
	private U second;
	
	//generate constructor using superclass
	public Pair() {
		
		this.first=null;
		this.second=null;
	}

	// generate constructor using fields
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	
	//Generate Getters and setters
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public U getSecond() {
		return second;
	}

	public void setSecond(U second) {
		this.second = second;
	}
	
}

