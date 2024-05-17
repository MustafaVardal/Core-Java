package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Today have good day living outside.";
		String newMessage = message.substring(0, 2);
		String newMessage2 = giveCity().substring(0,3);
		int collect = collect(5, 11);
		int collective = collect2(2,3,4,5,6,7);
		// --- if you did not assign anywhere it is not showing us.
		// --- substring will return something not showing something.

		System.out.println(newMessage);
		System.out.println(newMessage2);
		System.out.println(collect);
		System.out.println(collective);
	}

	public static void add() { // void --- > Order or command.
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");

	}

	public static void update() {
		System.out.println("Updated.");
	}
	
	public static int collect(int a,  int b) {
		return a + b;
	}
	
	// Variable args
	
	public static int collect2(int... numbers) { ///... means it will works like integer array
		int collect = 0;
		for (int number : numbers) {
			collect += number;
		}
		return collect;
	}
	
	
	public static String giveCity() {
		return "Columbus";
	}
}
