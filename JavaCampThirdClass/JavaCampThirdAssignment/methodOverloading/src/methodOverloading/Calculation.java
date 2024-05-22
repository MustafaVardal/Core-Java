package methodOverloading;

public class Calculation {
	public double add(double number1, double number2) {
		return number1 + number2;
	}
	
	public double add(double number1, double number2, double number3) {
		return number1 + number2 + number3;
	}
	
	public double sub(double number1, double number2, double number3) {
		return number1 - number2 - number3;
	}
	
	public double mult(double number1, double number2,  double number3) {
		return number1* number2* number3;
	}
}
