package oop;

public class BankAccount implements IRate {
	
	//Define variables
	String accountNumber;
	//Static final variable 
	private static final String routingNumber = "0653"; // static belong to the CLASS not the object instance and final makes it constant 
	//Instance variable
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definition: unique methods
		// 1. They are used to define /setup/ initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon Instantiation
		// 3. The same name as the class itself
		// 4. Has no return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED.");
	}
	
	// oVERLOADING: CALL SAME METHOD NAME WITH DIFFERENT ARGUMENTS
	BankAccount(String accountTupe) {
		System.out.println("NEW ACCOUNT CREATED: " + accountTupe);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg are all local variable
		System.out.println("NEW ACCOUNT : " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
		String Msg = null;
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at $1000";
			System.out.println(Msg);
		} else {
			Msg = "Thanks for your intial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit+ balance;  
	}
	
	// Getter /Setter
	
	
	public void setName(String name) {// Allow the user to define the name
		this.name = "Ms. " +name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setRate() {
		System.out.println("SETING RATE");
	}

	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//define abstraction, METHODS ... objectives
	public void deposit(double amount) {
		balance = balance + amount;	
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $ " + balance);
	}
	
	void checkBalamce() {
		System.out.println("Balance: "+ balance);
	}
	
	void getStatus() {
		
	}
	// @Override
	public String toString() {
		return "[ NAME: " + name + ". " +" ACCOUNT#: "+ accountNumber +". "+" ROUTING#: "+ routingNumber+  "BALANCE: $"+ balance + "]" ;
	}
	
}
