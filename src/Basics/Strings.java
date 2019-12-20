package Basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book title contains the word: "+ wordChoice + ".");
		}
		
		String browser = "Chrome";
		if ( browser.equalsIgnoreCase("Chrome")) { // if(browser == "chrome")  -> case sensitive
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Jackie";
		String lastName = "Ignacio";
		String SSN = "215486760";
		
		
		System.out.println("Ther are " + SSN.length() + " digits in your SSN.");
	
		//String the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.print(SSN.substring(5));
		
	}
}
