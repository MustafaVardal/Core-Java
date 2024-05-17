package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(21,13));
		System.out.println(calculator.add(21,13,24));
	}

}
