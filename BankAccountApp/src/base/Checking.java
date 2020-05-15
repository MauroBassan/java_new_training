package base;

public class Checking extends Account {
	
	// list properties spec to Checkings account
	private int debitCardNumber;
	private int debitCardPin;
	
	// construct to initialize our checking acc properties
	public Checking (String name, String ssn, double initDeposit) {
		super (name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
		
	}
	// list any method specific to the cecking account
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
		
	}
	
	private void setDebitCard () {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		
	}
	public void showInfo () {
		super.showInfo();
		System.out.println (" Your Checking account features: " + 
				"\n Debit Card Number: " + debitCardNumber + 
				"\n Debit Card Pin: " + debitCardPin
				);	
	}
}
