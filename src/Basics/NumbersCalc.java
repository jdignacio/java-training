package Basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);//System.out.println(multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
	}
	
	static void printName() {
		System.out.println("My name is Jackie");
		
	}
	
	static void addNumbers(int numberA, int numberB) {
		//this function will add two number
		int sum = numberA + numberB;
		System.out.println("The sum of number " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product,product + 50);
		return product;
		

	}
}
