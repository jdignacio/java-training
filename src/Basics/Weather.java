package Basics;

public class Weather {
	
	public static void main( String[] args) {
		// This program will give suggestion of what to wear based on the weather (temperature0=)
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's pleasant to wear shorts and t-shirts");
		}
		else if((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler, perhaps wear a long-sleeve shirst and jeans");
			System.out.println("Wear a hat to block the sun ");
		}
		else if((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater ");
		}
		System.out.println("The program is ending");
	}

}
