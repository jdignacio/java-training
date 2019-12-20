package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name +" is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		//this is instantiating an object (we create a variable below and point it to the class =person
		Person person1 = new Person();
		// after istantiating we define the properties
		person1.name = "Jackie";
		person1.email= "jackie@email.com";
		person1.phone= "123456789";
		
		//we create abstaraction that might be use this time and later on be not useful
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Marshall";
		person2.email = "m@email.com";
		person2.phone = "123545670";
		person2.sleep();
	
		
		/*	// Person-
		
		// Attributes, variable, adjectives, descriptors
		String name = "Jackie";
		String email = "jackie@email.com";
		String phone = "1234567890";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating.");
		
		//what if we wanted to do same for another person, copy paste, change name
		String name1 = "Marshall";
		String email1 = "Marshall@email.com";
		String phone1 = "1234567000";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking.");
		walking(name1);
		System.out.println(name1 + " is eating.");
		
		// what about binding attributes and properties together?
	}
	//enhance by adding funtions to minimize code
	static void walking(String name) {
		System.out.println(name +" is walking."); */

	} 
}
