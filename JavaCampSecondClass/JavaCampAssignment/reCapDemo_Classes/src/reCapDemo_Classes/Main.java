package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int add = calculator.addition(15, 30);
		int subs = calculator.subtraction(30, 40);
		int mult = calculator.multiplication(20, 45);
		double div = calculator.division(30, 17);

		System.out.println(
				"Addition: " + add + "\nSubstraction: " + subs + "\nMultiplication: " + mult + "\nDivision: " + div);

	}

}
