
public class WhileLoop {
	public static void main(String[] args) {
		/*
		 * int i = 0;
		 * 
		 * while (i < 10) { System.out.println(i); }
		 * 
		 * System.out.println("While Loops is over."); } // infinite loop
		 */
		/*
		 * int i = 0; while (i < 10) { System.out.println(i); i++; }
		 * 
		 * System.out.println("While loop is over.");
		 */

		/*
		 * int i = 0; while (i<10) { System.out.println(i); i+=2; }
		 * 
		 * System.out.println("Even Numbers over.");
		 */

		int i = 0;

		while (i < 10) {
			System.out.println(i);
			i += 5;
		}
		System.out.print("5 and its multiples are oven. ");
	}
}
