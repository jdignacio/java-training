package labs;

public final class BankAccoutApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("436236102", 1000);
		BankAccount acc2 = new BankAccount("520365200", 2000);
		BankAccount acc3 = new BankAccount("4362361021", 2500);
		
		acc1.setName("Jackie");
		System.out.println(acc1.getName());
		acc1.getName();
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);	
		acc1.accrue();
		System.out.println(acc1.toString());
	}
}

class BankAccount implements IInterest{
	// Properties of Bank Account
	private static int iD = 1000; // Internal ID
	private String accountNumber; // ID + random 2-Digit Number + first 2 of SSN
	private static String routingNumber = "005400657";
	private String name;
	private String SSN; 
	private double balance;
	
	// constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random()* 100);
		accountNumber = iD+ "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill: "+ amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making a deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: "+ balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1+ rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ] \n[Account Number: "+ accountNumber + "]\n"+ "[Routimg Number: " +routingNumber + "]\n" +  "[Balance: " + balance +"]";
		
		
	}
	
}
