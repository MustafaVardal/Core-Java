package methods;

public class Main {

	public static void main(String[] args) {
		searchNumber();
		searchNumber(); // Assume that these are on the different page screen.
		searchNumber();
		searchNumber();

	}

	public static void searchNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int search = 5;
		boolean isTrue = false;

		for (int number : numbers) {
			if (number == search) {
				isTrue = true;
				break;
			}
		}

		if (isTrue) {
			System.out.println("Number is valid in our list: " + search);

		} else {
			System.out.println("Number is not valid in our list: " + search);

		}

	}

	public static void getMessage(int search) {
		System.out.println("Number is valid in our list: " + search);
	}

}
