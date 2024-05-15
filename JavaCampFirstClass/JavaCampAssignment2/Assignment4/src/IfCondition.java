
public class IfCondition {

	public static void main(String[] args) {
		double netProfit = 122000.00;
		String errorMessage = "Not valid conditional";
		if (netProfit > 123000.00) {
			System.out.println("You made loss.");
		} else if (netProfit == 122000.00) {
			System.out.println("You did not lost it.");
		} else if (netProfit < 123000.00) {
			System.out.println("You made more loss.");
		} else {
			System.out.println(errorMessage);
		}

	}

}
