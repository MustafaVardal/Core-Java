
public class FriendlyNumber {
	public static void main(String[] args) {
		// Minimum two friendly numbers are 220 - 284.
		// Means : The number of friends of 284 is 220
		// Because the divisor is the sum of the numbers starting from 1 to 220.(Not
		// inclusive 220)

		int firstNumber = 220;
		int secondNumber = 224;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < firstNumber; i++) {
			if (firstNumber % i == 0) {
				total1 += i;
			}

		}
		for (int i = 1; i < secondNumber; i++) {
			if (secondNumber % i == 0) {
				total2 += i;
			}
		}
		if (firstNumber == total2 && secondNumber == total1) {
			System.out.println(firstNumber + " & " + secondNumber + " are friendly numbers.");
		} else {
			System.out.println(firstNumber + " & " + secondNumber + " are not friendly numbers.");
		}
	}
}
