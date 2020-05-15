package base;

public class Saving extends Account {

	// list properties spec to svaings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	// construct to initialize our checking acc properties
	public Saving (String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}	
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
	
	private void setSafetyDepositBox() {
		
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		//System.out.println(safetyDepositBoxID);
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	// list any method specific to the cecking account
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Saving account features: " + 
		"\n Safety Deposit Box ID: " + safetyDepositBoxID + 
		"\n Safety Deposit Box Key: " + safetyDepositBoxKey);	
	}

}

