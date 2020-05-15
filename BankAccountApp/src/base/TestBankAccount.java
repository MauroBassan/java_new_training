package base;

import java.util.LinkedList;
import java.util.List;

public class TestBankAccount {

	public static void main(String[] args) {

		List<Account> accounts = new LinkedList<Account>();

		// read csv file then create new acc based on that data
		String file = "C:\\Users\\Utente\\Downloads\\NewBankAccounts.csv";
		/*
		Checking ckacc1 = new Checking ("Mauro Bassan", "345678995", 1500);

		Saving svacc1 = new Saving ("Luigi Gabellotti", "23865049", 2500);
		// Read a CSV file then create account base on that data

		svacc1.compound();
		svacc1.showInfo();

		System.out.println("****************");

		ckacc1.showInfo();
		System.out.println("****************");
		svacc1.deposit(5000);
		svacc1.withdraw(200);
		svacc1.transfer("brokerage", 1000);
		 */

		List <String[]> newCustomers = new utilities.CSV().read(file);
		for ( String[] customer: newCustomers) {
			//System.out.println("New Accounts: ");

			String name = customer[0];
			String ssn = customer[1];
			String accountType = customer[2];
			double initDeposit = Double.parseDouble(customer[3]);

			//System.out.println(name + " " + ssn +" "+ accountType + " €" + initDeposit);
			if (accountType.equals("Savings")) {
				//System.out.println("Open a Saving Account");
				accounts.add(new Saving(name, ssn, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				//System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else {
				System.out.println("Error reading Account Type");
			}
		}


		for ( Account acc : accounts) {
			System.out.println("***************");
			acc.showInfo();
		}
	}

}
