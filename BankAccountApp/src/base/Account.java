package base;

public abstract class Account implements IBaseRate{

	// list common props for sav and check accounts
	private String name;
	private String ssn;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	
	// costructor to set base properties and initialies the account
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		balance = initDeposit;
		
		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	// rendiamoo il metodo abstrac in modo da forzare checking e saving ad implementare quel metodo
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSsn = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random()*Math.pow(10,3));
		return lastTwoOfSsn + uniqueID + randomNumber;
	}
	
	public void compound () {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("accrued interest: " + accruedInterest);
		printBalance();
	}
	
	// list common method - transazioni
	
	public void deposit(double amount) {
		balance =  balance + amount;
		System.out.println("depositing: "  + amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance =  balance - amount;
		System.out.println("withdrawing: "  + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance =  balance - amount;
		System.out.println("transfering: "  + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("your balance is now: " + balance);
	}
	
	public void showInfo() {
		
		System.out.println(
				"Name: " + name + 
				"\nAccount #: " + accountNumber + 
				"\nBalance: " + balance + 
				"\n Rate: " + rate + "%"
				);
	}
}
