package oopsdemo3;

public class SavingsAccount extends Account {

	double interestRate;
	
	public SavingsAccount(String name, double balance,double i) {
		super(name, balance);
		this.interestRate=i;
		
	}

	
}
