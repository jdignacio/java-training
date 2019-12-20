package Basics;

public class Lab1 {

	public static void main(String[] args) {
		
		//Write a function that takes a value n returns the sum of numbers 1 to n
	//	System.out.println(sum);		
		System.out.println(sum(5));
	//Write a function that computes the factoral "hint:  use recursion, n = n*(n-1)*(n-2)!= n*(n-1)*(n-2)*(n-3)....
		System.out.println("Factorial: " + fact(5));
		
	// write 3 functions that return the min, avg and max of an array
		int[] numbers = {5, -2, 0, 234, -438, 63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Avg: " + findAvg(numbers));
	}
	
	public static int findAvg(int[] arr) {
		int sum = 0;
		for (int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i] <min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int n=0; n<arr.length; n++) {
			if(arr[n] > max) {
				max = arr[n];
			}	
		}
		return max;
	}
		
	public static int sum(int n){
		int sum = 0;
		for (int i =1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i; 
			System.out.println(" * " + sum);
		}
		return sum;
			
		}
	
	//Write a function that computes the factoral value definition: n!=n^(n-1)!, where 0!=1

	public static int fact(int n) {
		if ( n == 0) {
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
	}
	

	//boolean factors{n=10; (0!=1), n! = n*(n-1)!}
		//	where (0! = 1);
/*	boolean factor = (n!, 0!=1);
	
		 for (n=10; n!=n*(n-1)! && 0!= 1; n++);
		 System.out.println("factor: of n: " + n);
		 return factor;*/	
		
}
		
		
					 
					 
		/*		List<Integer> num = List.of(3, 12, 32, 22);
				
				int sum = (0,1)+(2,3);
					
					for(num=5; 
				int sum = (0+1)
				maxValue()
				
				int maxValue(int , int 1) {
					for(int )
					return 0;
		// TODO Auto-generated method stub

	}

}*/
