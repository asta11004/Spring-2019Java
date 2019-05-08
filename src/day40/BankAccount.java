package day40;

public class BankAccount {

	
	// 2 instance variable/fields 
	// it has default access modifier (there is no access modifier)
	String accountHolder; 
	private double balance ;
	
	
	public void showAccountHolder() {
		System.out.println("Account holder name is " 
					+ accountHolder);	
	}
	
	private void showBalance() {
		System.out.println("Account balance: "
					+balance);
	}
	// adding 100 to balance current value
	void add100Dollar() {
		balance = balance +100;
		//showBalance();
		
	}
	
	// adding <custom > amount dollar to current balance 
	public void addDollar(int amount) {
		balance = balance + amount ; 
	}
	
	// create an instance method(non-static method)
	// called showAccountHolder  accept no parameter and return nothing 
	// --> printOut Account Holder name

	// create an instance method showBalance accept no parameter and return nothing 
	// and print out the balance 
	
	// OPTIONAL 
	// create an instance method called add100Dollar does not accept any paramters 
	// and return no value 
	// increase the balance of the account by 100 ; 
	
	
	// Create another class called BankActivity with main method 
	// create bank account object 
	// set account holder name and balance value 
	// call your showAccountHolder and showBalance method
	
	// OPTIONALLY CALL YOUR add100Dollar 
	// and call your showBalance method again to see whether balance has changed 
	
	
	
	
	
}
