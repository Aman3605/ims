package exceptionsdemoo;

//User defined Exception class
public class InSufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	//constructor using fields
	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}

	//generate getters
	
	public double getAmount() {
		return amount;
	}

	
	

	
	

}
