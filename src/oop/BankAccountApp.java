package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank accout >> think instantiate a project
		
		BankAccount acc1 = new BankAccount();
		
		
		//acc1.name = "Jack";
		// with Encapsulation : public API methods
		acc1.setName("Jackie Ignacio");
		System.out.println(acc1.getName());
		acc1.setSsn("1234531239");
		System.out.println("SSN: "+ acc1.getSsn());
		
		acc1.accountNumber = "123457890";	
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);

		System.out.println(acc1.toString()); // -> Polymorphism thru overriding
		
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "123457890";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc2.accountNumber = "123457890";
	
		/*
		acc3.checkBalamce();
		
		//Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Jun";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound(); */
		
	//.out.println(acc1.routingNumber);
	//.out.println(acc2.routingNumber);
	//	System.out.println(acc3.routingNumber);
	}

}
