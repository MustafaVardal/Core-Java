package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		System.out.println(calculation.add(2, 4, 6));
		System.out.println(calculation.sub(2,3,4));
		System.out.println(calculation.add(2,4));
		System.out.println(calculation.mult(2, 2, 2));

	}

}
