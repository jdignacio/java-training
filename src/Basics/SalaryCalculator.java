package Basics;

public class SalaryCalculator {
	
	public static void main (String[] args) {
	
		// Let's create a varibale to define our career	
		String career;
		System.out.println("Program is Starting");
	
		// Defining a variable
		career = "Software Developer";
		System.out.println("My carrer is: " + career);
		
		//Declare and Define
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career= "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of " + rate + " per hour is "+ salary + " per year");

		
		// Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}

}
