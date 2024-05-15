
public class MiniProjectPrimeNumbers {

	public static void main(String[] args) {
		// We have bug if we put the number 1, program will return is 1 is not prime number 
		// BUT we want to make sure 1 is not suitable to calculate for prime numbers. 
		// SO we will create other if condition at the bottom getting rid of bugs/..
		int number = 1;
		
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true; // Assume that our number is prime!
		
		if(number == 1) {
			System.out.println("Number is not prime.");
			return; // method will finish with return. 
		}
		
		if(number < 1) {
			System.out.println("Not valid number.");
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println(number + " is prime number." );
		} else {
			System.out.println(number + " is not prime number.");
		}
	}

}
