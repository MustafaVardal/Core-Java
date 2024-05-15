
public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] customers = new String[3][3];
		customers[0][0] = "Mike";
		customers[0][1] = "Dia";
		customers[0][2] = "Micheal";
		customers[1][0] = "Mimi";
		customers[1][1] = "Michelleon";
		customers[1][2] = "Aaron";
		customers[2][0] = "David";
		customers[2][1] = "Elizabeth";
		customers[2][2] = "AJ";

		for (int i = 0; i <= 2; i++) {
			System.out.println("---------------"); // for each 3 line will be take it and write between 3 line -----.
			// With this ------- we actually group per 3 customers.!
			for (int j = 0; j <= 2; j++) {
				System.out.println(customers[i][j]);
			}
		}

	}

}
